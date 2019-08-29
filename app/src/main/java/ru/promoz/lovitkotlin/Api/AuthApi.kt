package ru.promoz.lovitkotlin.Api

import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import ru.promoz.lovitkotlin.Api.ApiModel.AuthApiModel

interface AuthApi {

    @GET("/api/preauth?username={login}&pass={password}'")
    fun authUser (@Path("login") loginContractNumber: String, @Path("password") loginPassword: String ): Call<AuthApiModel>
}