package com.example.arouter.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.arouter.R
import com.example.arouter.route.RouteFlag
import com.example.arouter.route.RoutePath


@Route(path = RoutePath.PATH_AUTHENTICATION, extras = RouteFlag.FLAG_AUTHENTICATION)
class AuthenticationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authentication)
    }
}