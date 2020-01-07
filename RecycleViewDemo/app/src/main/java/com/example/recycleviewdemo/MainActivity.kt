package com.example.recycleviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.kittinunf.fuel.Fuel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Fuel.get("https://swapi.co/api/people/1")
            .responseObject(SWChar.Deserializer()) { _, _, result ->
                println(result)
                val (swChar, _) = result
                println(swChar)
                println(swChar?.name)
                println(swChar?.height)
                println(swChar?.mass)
            }
    }
}
