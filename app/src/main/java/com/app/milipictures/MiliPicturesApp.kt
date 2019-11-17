package com.app.milipictures

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.dsl.module
import timber.log.Timber

class MiliPicturesApp : Application() {
    private val appModule = module {
//        single {
//            return@single AppDatabase(get())
//        }
//        viewModel<ContactViewModel>()
    }

    override fun onCreate() {
        super.onCreate()

        if(BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

        startKoin {
            androidContext(this@MiliPicturesApp)
            modules(appModule)
        }

        Timber.d("app started")
    }
}