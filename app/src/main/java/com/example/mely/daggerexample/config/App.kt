package com.example.mely.daggerexample.config

import android.app.Activity
import android.app.Application
import com.example.mely.daggerexample.config.di.component.DaggerAppComponent
import com.example.mely.daggerexample.config.di.module.AppModule
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class App : Application(), HasActivityInjector {
    override fun activityInjector(): AndroidInjector<Activity> = activityInjector

    @Inject lateinit var activityInjector: DispatchingAndroidInjector <Activity>

    override fun onCreate() {
        super.onCreate()

        val appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()

        appComponent.inject(this)

    }

}