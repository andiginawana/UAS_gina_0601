package uas.pcs_gina.livescore.ui.detail


import uas.pcs_gina.livescore.data.model.EventDetail

interface EventDetailView{
    fun showLoading()
    fun hideLoading()
    fun showEventDetail(data: List<EventDetail>)
}