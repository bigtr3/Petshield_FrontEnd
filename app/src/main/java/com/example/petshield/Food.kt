package com.example.petshield
import org.w3c.dom.Text
import java.io.Serializable

data class Food(
    var id: Int = 0,
    var food_name: String = "",
    var price: Int = 0,
    var variety : String = "전체",
    var size : String = "전체",
    var age : String = "전체",
    var weight : String = "전체",
    var brand : String = "전체",
    var origin : String = "전체",
    var image: String? = null,
    var extra: String = "",
    var url: String = "",
): Serializable
