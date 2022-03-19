package com.example.`daggerhilt_kotlin-new`

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.daggerhilt_kotlin.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    @Named("String2")
    lateinit var testString:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity","this is string from main activity :$testString")
    }
}