package uas.pcs_gina.livescore.ui.event

import com.google.gson.Gson
import uas.pcs_gina.livescore.data.api.ApiRepository
import uas.pcs_gina.livescore.data.api.TheSportDBApi
import uas.pcs_gina.livescore.data.model.EventResponse
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class EventPresenter(private val view: EventView,
                     private val apiRepository: ApiRepository,
                     private val gson: Gson){
    fun getEventList(league: String?, event: String?){
        view.showLoading()
        doAsync {
            val data = gson.fromJson(apiRepository
                    .doRequest(TheSportDBApi.getEvent(league, event)),
                    EventResponse::class.java
            )

            uiThread {
                view.hideLoading()
                view.showEventList(data.events)
            }
        }
    }
}
