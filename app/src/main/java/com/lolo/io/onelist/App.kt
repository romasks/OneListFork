package com.lolo.io.onelist

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application() {

    override fun onCreate() {
        super.onCreate()
//        startKoin {
//            androidContext(this@App)
//            fragmentFactory()
//            modules(appModule, listsModule, settingsModule)
//        }
    }
}