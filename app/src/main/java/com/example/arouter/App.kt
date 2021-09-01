package com.example.arouter

import android.app.Application
import android.content.Context
import com.alibaba.android.arouter.BuildConfig
import com.alibaba.android.arouter.launcher.ARouter

/**
 * ================================================
 * 类名：com.example.arouter
 * 时间：2021/9/1 13:55
 * 描述：
 * 修改人：
 * 修改时间：
 * 修改备注：
 * ================================================
 * @author Admin
 */
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
        instance = this
        initARouter()
    }

    private fun initARouter() {
        if (BuildConfig.DEBUG) {
            // 这两行必须写在init之前，否则这些配置在init过程中将无效
            ARouter.openLog()     // 打印日志
            ARouter.openDebug()   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        }
        ARouter.init(instance) // 尽可能早，推荐在Application中初始化
    }

    companion object {
        lateinit var context: Context
        lateinit var instance: Application
    }
}