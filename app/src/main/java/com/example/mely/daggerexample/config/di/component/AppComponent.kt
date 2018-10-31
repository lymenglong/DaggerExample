package com.example.mely.daggerexample.config.di.component

import com.example.mely.daggerexample.config.App
import com.example.mely.daggerexample.config.di.module.AppModule
import com.example.mely.daggerexample.config.di.module.MainActivityModule
import com.example.mely.daggerexample.config.di.provider.ActivityProvider
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidSupportInjectionModule :: class,
    AppModule :: class,
    MainActivityModule :: class,
    ActivityProvider :: class
])
interface AppComponent {
     fun inject (application: App)
}