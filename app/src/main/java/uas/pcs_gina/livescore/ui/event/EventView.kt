package uas.pcs_gina.livescore.ui.event

import uas.pcs_gina.livescore.data.model.Event

interface EventView{
    fun showLoading()
    fun hideLoading()
    fun showEventList(data: List<Event>)
}