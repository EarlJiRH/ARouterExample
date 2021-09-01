package com.example.arouter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.launcher.ARouter
import com.example.arouter.route.RoutePath
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        actionUser.setOnClickListener {
            navigation(RoutePath.PATH_PROFILE)
        }
        actionVip.setOnClickListener {
            navigation(RoutePath.PATH_VIP)
        }
        actionAuthentication.setOnClickListener {
            navigation(RoutePath.PATH_AUTHENTICATION)
        }
        actionDegrade.setOnClickListener {
            navigation(RoutePath.PATH_UN_KNOW)
        }
    }


    private fun navigation(path: String) {
        ARouter.getInstance().build(path).navigation()
    }
}