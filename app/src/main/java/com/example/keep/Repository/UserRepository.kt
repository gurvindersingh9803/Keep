package com.example.keep.Repository

import com.example.keep.Interface.UerApiService
import com.example.keep.Model.UserLoginRequest
import com.example.keep.Model.UserResponse
import retrofit2.Response

class UserRepository(private val uerApiService: UerApiService) {
    fun login(){
        //uerApiService.loginUser();
    }
}