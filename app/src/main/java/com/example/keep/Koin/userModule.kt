package com.example.keep.Koin

import com.example.keep.Interface.UserApiService
import com.example.keep.Repository.UserRepository
import com.example.keep.ViewModel.UserViewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val userModule = module {

    single {Retrofit.Builder()
        .baseUrl("https://dummyjson.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(UserApiService::class.java)

    }

    single {
        UserRepository(get())
    }

    single{
        UserViewModel()
    }
}