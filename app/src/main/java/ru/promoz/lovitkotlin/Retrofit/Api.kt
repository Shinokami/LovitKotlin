package ru.promoz.lovitkotlin.Retrofit

import retrofit2.Call
import retrofit2.http.*
import ru.promoz.lovitkotlin.Model.PreAuth.Token
import ru.promoz.lovitkotlin.Response.ClientInfoResponse
import ru.promoz.lovitkotlin.Response.LoginResponse

interface Api {

    @Headers("Accept: application/json")
    @GET("/api/preauth")
    fun authUser (
        @Query("username") loginContractNumber: String,
        @Query("pass") loginPassword: String )
            : Call<LoginResponse>

    @FormUrlEncoded
    @Headers("Accept: application/x-www-form-urlencoded")
    @POST("/token")
    fun accessToken(
        @Field("username") loginContractNumber: String,
        @Field("password") loginPassword: String,
        @Field("grant_type") grantType: String)
            :Call<Token>

    @GET("/api/data/clientinfo")
    fun clientInfo (@Header("Authorization") auth: String)
            : Call<ClientInfoResponse>
}