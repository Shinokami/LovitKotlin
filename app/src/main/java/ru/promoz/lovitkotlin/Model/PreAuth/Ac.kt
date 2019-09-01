package ru.promoz.lovitkotlin.Model.PreAuth

import com.google.gson.annotations.SerializedName

data class Ac (
    @SerializedName("id")
    val id : Int,
    @SerializedName("brand_id")
    val brandId : Int
)