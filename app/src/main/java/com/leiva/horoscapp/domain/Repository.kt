package com.leiva.horoscapp.domain

import com.leiva.horoscapp.domain.model.PredictionModel

interface Repository  {
    suspend fun getPrediction(sign:String) : PredictionModel?

}