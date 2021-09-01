package com.example.arouter.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.arouter.R
import com.example.arouter.route.RouteFlag
import com.example.arouter.route.RoutePath

@Route(path = RoutePath.PATH_PROFILE,extras = RouteFlag.FLAG_LOGIN)
class ProfileDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_detail)
    }

}