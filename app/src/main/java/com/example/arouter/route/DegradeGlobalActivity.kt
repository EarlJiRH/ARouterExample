package com.example.arouter.route

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.arouter.R
import kotlinx.android.synthetic.main.activity_degrade_global.*

@Route(path = RoutePath.PATH_GLOBAL_ACTIVITY)
class DegradeGlobalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_degrade_global)

        emptyView.setIcon(R.drawable.ic_computer)
        emptyView.setTitle(getString(R.string.degrade_tips))
    }
}