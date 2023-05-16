package com.example.hw8_5.db.remote

import android.telecom.Call

interface LoveApi {
    @GET("getPercentage")
    fun percentageName(
        @Query("fname") firstName: String,
        @Query("sname") secondName: String,
        @Header("content-type") type: String = "application/octet-stream",
        @Header("X-RapidAPI-Key") key: String = "158156b433msh482908a6bd72323p179207jsncce529ebdcb9",
        @Header("X-RapidAPI-Host") host: String = "love-calculator.p.rapidapi.com"

    ): Call<LoveModel>
}
