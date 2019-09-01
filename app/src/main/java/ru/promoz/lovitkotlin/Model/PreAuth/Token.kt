package ru.promoz.lovitkotlin.Model.PreAuth

import com.google.gson.annotations.SerializedName

data class Token(
    @SerializedName("access_token")
    val accessToken : String,
    @SerializedName("token_type")
    val tokenType : String,
    @SerializedName("expires_in")
    val expiresIn : Int
)