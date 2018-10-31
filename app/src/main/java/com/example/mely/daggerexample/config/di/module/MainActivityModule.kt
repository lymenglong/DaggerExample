package com.example.mely.daggerexample.config.di.module

import com.example.mely.daggerexample.config.di.module.scope.MainScope
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class MainActivityModule {
    @Provides
    @MainScope
    @Named("base_url")
    fun provideBaseURL() : String = "https://solar.gl-f.com:8443"

    @Provides
    @Named("tag_hello")
    fun provideStringHello () : String = "Hello"

    @Named("tag_hi")
    @Provides
    fun provideStringHi (): String = "Hi"
}