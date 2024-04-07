package com.leiva.horoscapp.data

import android.util.Log
import com.leiva.horoscapp.data.network.HoroscopeApiService
import com.leiva.horoscapp.domain.Repository
import com.leiva.horoscapp.domain.model.PredictionModel
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService:HoroscopeApiService): Repository {
    override suspend fun getPrediction(sign: String):PredictionModel? {
        //PeticiónRetrofit
       val response = runCatching { apiService.getHoroscope(sign) }
           .onSuccess { return it.toDomain() }
           .onFailure { Log.i("aris","Ha ocurrido un error ${it.message}") }
        return null
    }

}