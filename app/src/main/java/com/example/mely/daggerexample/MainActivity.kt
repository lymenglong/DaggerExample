package com.example.mely.daggerexample

import android.os.Bundle
import com.example.mely.daggerexample.mvp.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject
import javax.inject.Named

class MainActivity : BaseActivity() {

    @Inject
    @field:Named("tag_hello")
    lateinit var strHello : String

    @Inject
    @field:Named("tag_hi")
    lateinit var strHi : String

    @Inject
    @field:Named("base_url")
    lateinit var strBaseURL : String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_hello.text = strHello + "Test String: " + strBaseURL
        showToastMessage(strHi)

    }

}
