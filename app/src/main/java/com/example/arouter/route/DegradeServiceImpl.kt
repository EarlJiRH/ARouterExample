package com.example.arouter.route

import android.content.Context
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.facade.service.DegradeService
import com.alibaba.android.arouter.launcher.ARouter

/**
 * ================================================
 * 类名：com.example.arouter.route
 * 时间：2021/9/1 15:23
 * 描述：全局降级服务，当路由不存在时，此时重定向到统一的错误页
 * 修改人：
 * 修改时间：
 * 修改备注：
 * ================================================
 * @author Admin
 */
@Route(path = RoutePath.PATH_GLOBAL_SERVICE)
class DegradeServiceImpl : DegradeService {
    override fun init(context: Context?) {

    }

    override fun onLost(context: Context?, postcard: Postcard?) {
        //页面路由不存在时触发 中转
        ARouter.getInstance().build(RoutePath.PATH_GLOBAL_ACTIVITY).greenChannel().navigation()
    }
}