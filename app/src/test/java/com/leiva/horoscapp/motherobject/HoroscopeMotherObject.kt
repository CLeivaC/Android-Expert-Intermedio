package com.leiva.horoscapp.motherobject

import com.leiva.horoscapp.data.network.response.PredictionResponse
import com.leiva.horoscapp.domain.model.HoroscopeInfo
import com.leiva.horoscapp.domain.model.HoroscopeInfo.*

object HoroscopeMotherObject {
    val anyResponse = PredictionResponse("date","prediction","taurus")

    val horoscopeInfoList = listOf<HoroscopeInfo>(
        Aries, Taurus, Gemini,
        Cancer, Leo, Virgo,
        Libra, Scorpio, Sagittarius,
        Capricorn, Aquarius, Pisces
    )
}