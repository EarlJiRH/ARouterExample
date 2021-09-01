package com.example.arouter.route

import android.content.Context
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.annotation.Interceptor
import com.alibaba.android.arouter.facade.callback.InterceptorCallback
import com.alibaba.android.arouter.facade.template.IInterceptor

/**
 * ================================================
 * 类名：com.example.arouter.route
 * 时间：2021/9/1 15:05
 * 描述：
 * 修改人：
 * 修改时间：
 * 修改备注：
 * ================================================
 * @author Admin
 */
@Interceptor(name = RoutePath.NAME_BIZ_INTERCEPTOR, priority = 9)
class BizInterceptor : IInterceptor {
    private var context: Context? = null

    override fun init(context: Context?) {
        //初始化时触发
        this.context = context
    }

    override fun process(postcard: Postcard?, callback: InterceptorCallback?) {
        showToast("进入自定义页面拦截器中")
        val flag = postcard!!.extra
        //对flag与RouteFlag中的值进行与操作判断
        when {
            flag and (RouteFlag.FLAG_LOGIN) != 0 -> {
                //login
                callback!!.onInterrupt(RuntimeException("need login"))
                showToast("请先登录")
            }
            flag and (RouteFlag.FLAG_AUTHENTICATION) != 0 -> {
                //authentication
                callback!!.onInterrupt(RuntimeException("need authentication"))
                showToast("请先实名认证")
            }
            flag and (RouteFlag.FLAG_VIP) != 0 -> {
                //vip
                callback!!.onInterrupt(RuntimeException("need become vip"))
                showToast("请先加入VIP会员")
            }
            else -> {

                callback!!.onContinue(postcard)
            }
        }

    }


    private fun showToast(message: String) {
        Handler(Looper.getMainLooper()).post {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }
}