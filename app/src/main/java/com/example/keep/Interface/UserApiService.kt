package com.example.keep.Interface

import com.example.keep.Model.UserLoginRequest
import com.example.keep.Model.UserResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface UserApiService {

    @POST("/auth/login")
    fun loginUser(@Body userLoginRequest: UserLoginRequest): Response<UserResponse>

}