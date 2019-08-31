package ru.promoz.lovitkotlin.Retrofit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query
import ru.promoz.lovitkotlin.Model.PreAuth.PreAuthModel
import ru.promoz.lovitkotlin.Response.LoginResponse

interface PreAuthApi {

    @Headers("Accept: application/json")
    @GET("/api/preauth")
    fun authUser (
        @Query("username") loginContractNumber: String,
        @Query("pass") loginPassword: String )
            : Call<LoginResponse>
}