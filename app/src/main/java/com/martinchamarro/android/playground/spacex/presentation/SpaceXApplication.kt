package com.martinchamarro.android.playground.spacex.presentation

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class SpaceXApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        // Empty
    }

}
