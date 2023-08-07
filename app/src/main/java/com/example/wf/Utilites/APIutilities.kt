package com.example.wf.Utilites

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object APIutilities {
    private var retrofit:Retrofit?=null
    var Base_URL="https://api.openweathermap.org/data/2.5/"

fun getApiInterface():APIInterface?{
    if (retrofit==null)
        {
            retrofit=Retrofit.Builder().baseUrl(Base_URL).addConverterFactory(GsonConverterFactory.create()).build()
        }
    return retrofit?.create(APIInterface::class.java)
}
}