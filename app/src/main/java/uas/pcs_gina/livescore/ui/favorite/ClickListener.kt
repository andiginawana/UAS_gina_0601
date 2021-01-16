package uas.pcs_gina.livescore.ui.favorite

import uas.pcs_gina.livescore.data.db.entities.EventFavorite

interface ClickListener {
    fun onClickListener(eventFavorite: EventFavorite)
}