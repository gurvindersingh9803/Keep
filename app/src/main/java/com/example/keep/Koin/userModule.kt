package com.example.keep.Koin

import com.example.keep.Repository.UserRepository
import org.koin.dsl.module

val userModule = module {

    single {
        UserRepository()
    }
}