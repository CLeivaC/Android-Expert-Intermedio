package com.leiva.horoscapp.ui.providers

import org.junit.Assert.*
import org.junit.Test

class RandomCardProviderTest{
    @Test
    fun `getRandomCard should return a random card`(){
        //Given
        val randomCard = RandomCardProvider()

        //When
        val card = randomCard.getLucky()

        //then
        assertNotNull(card)
    }
}