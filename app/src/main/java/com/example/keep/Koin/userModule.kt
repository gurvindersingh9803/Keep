package com.example.keep.Koin

import com.example.keep.Interface.UerApiService
import com.example.keep.Interface.UserImplemtation
import com.example.keep.Repository.UserRepository
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

val userModule = module {

    single {Retrofit.Builder()
        .baseUrl("https://dummyjson.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(UerApiService::class.java)

    }

    single {
        UserRepository()
    }
}