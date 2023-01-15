package com.walletline

import android.app.Application
import com.walletline.di.databaseModule
import com.walletline.di.networkModule
import com.walletline.di.repositoryModule
import com.walletline.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class WalletlineApp : Application() {
    override fun onCreate() {
        super.onCreate()
        setupKoin()
    }

    /**
     * Setup koin
     *
     * Koin setup and configurations
     */
    private fun setupKoin() {
        // Add koin modules in here
        val modules = listOf(
            databaseModule,
            networkModule,
            repositoryModule,
            viewModelModule
        )
        startKoin {
            androidLogger(level = Level.DEBUG)
            // Accessing app context in modules
            androidContext(this@WalletlineApp)
            modules(modules)
        }
    }
}