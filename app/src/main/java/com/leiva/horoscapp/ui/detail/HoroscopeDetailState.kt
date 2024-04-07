package com.leiva.horoscapp.ui.detail

import com.leiva.horoscapp.domain.model.HoroscopeModel

sealed class HoroscopeDetailState {
    data object Loading:HoroscopeDetailState()
    data class Error(val Error:String): HoroscopeDetailState()
    data class Success(val prediction:String,val sign:String,val horoscopeModel: HoroscopeModel):HoroscopeDetailState()

}