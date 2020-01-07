package com.example.recycleviewdemo

import com.github.kittinunf.fuel.core.ResponseDeserializable
import com.google.gson.Gson

data class SWChar(var name: String, var height: Int, var mass: Int) {
    class Deserializer : ResponseDeserializable<SWChar> {
        override fun deserialize(content: String): SWChar
            = Gson().fromJson(content, SWChar::class.java)
    }
}