package com.example.eventhub.commons.utils

import android.app.Application

class MyApplication : Application() {
    lateinit var myContainer: MyContainer
    override fun onCreate() {
        super.onCreate()
        myContainer = MyContainer()
    }
}