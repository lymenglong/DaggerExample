package com.example.mely.daggerexample.mvp.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.mely.daggerexample.R
import com.example.mely.daggerexample.mvp.view.BaseView
import dagger.android.AndroidInjection
import org.jetbrains.anko.toast

open class BaseActivity : AppCompatActivity(), BaseView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
    }

    override fun showToastMessage(message: String?){
        if ( message == null){
            toast(getString(R.string.sth_err))
        } else {
            toast(message)
        }
    }
}