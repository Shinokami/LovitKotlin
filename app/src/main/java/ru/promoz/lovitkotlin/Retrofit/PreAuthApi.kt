package ru.promoz.lovitkotlin.Retrofit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query
import ru.promoz.lovitkotlin.Model.LoginResponse

interface PreAuthApi {

    /*@get:GET("/api/preauth?username=145455&pass=123123")
    val preAuth:Observable<PreAuthModel>*/
    @Headers("Accept: Application/xml")
    @GET("/api/preauth")
    fun authUser (
        @Query("username") loginContractNumber: String,
        @Query("pass") loginPassword: String )
            : Call<LoginResponse>
}