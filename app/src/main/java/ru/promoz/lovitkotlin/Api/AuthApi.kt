package ru.promoz.lovitkotlin.Api

import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface AuthApi {

    @GET("/api/preauth?username={login}&pass={pass}'")
    fun getPreAuth(@Path("login" int loginContractNumber ))
}