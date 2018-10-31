package com.example.mely.daggerexample.config.di.provider

import com.example.mely.daggerexample.MainActivity
import com.example.mely.daggerexample.config.di.module.MainActivityModule
import com.example.mely.daggerexample.config.di.module.scope.MainScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityProvider {

    @MainScope
    @ContributesAndroidInjector (modules = [MainActivityModule::class])
    abstract fun provideMainActivity() : MainActivity




}