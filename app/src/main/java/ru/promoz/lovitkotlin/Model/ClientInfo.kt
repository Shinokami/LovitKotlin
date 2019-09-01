package ru.promoz.lovitkotlin.Model

import com.google.gson.annotations.SerializedName

data class ClientInfo (
    @SerializedName("fio")
    val fio : String,
    @SerializedName("balance")
    val balance : Float,
    @SerializedName("tarif")
    val tarif : String,
    @SerializedName("address")
    val address : String,
    @SerializedName("contact_phone")
    val contactPhone : String,
    @SerializedName("freeze")
    val freeze : String,
    @SerializedName("ac_id")
    val acId : String
)