package com.example.keep.Repository

import com.example.keep.Interface.UserApiService

class UserRepository(private val userApiService: UserApiService) {
    fun login(){
        //userApiService.loginUser();
    }
}