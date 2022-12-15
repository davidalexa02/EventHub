package com.example.eventhub.commons.data

import android.app.Application

class EventHubApplication: Application() {
    val database: AppDatabase by lazy {
        AppDatabase.getDatabase(this)
    }
}