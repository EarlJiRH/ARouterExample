package com.example.arouter.route

/**
 * ================================================
 * 类名：com.example.arouter.config
 * 时间：2021/9/1 15:00
 * 描述：
 * 修改人：
 * 修改时间：
 * 修改备注：
 * ================================================
 * @author Admin
 */
interface RoutePath {

    companion object {
        const val NAME_BIZ_INTERCEPTOR = "biz_interceptor"

        private const val GROUP_PROFILE = "/profile"
        const val PATH_PROFILE = "${GROUP_PROFILE}/detail"
        const val PATH_AUTHENTICATION = "${GROUP_PROFILE}/authentication"
        const val PATH_VIP = "${GROUP_PROFILE}/vip"
        const val PATH_UN_KNOW = "${GROUP_PROFILE}/unknowns"

        private const val GROUP_DEGRADE = "/degrade"
        const val PATH_GLOBAL_ACTIVITY = "${GROUP_DEGRADE}/global/activity"
        const val PATH_GLOBAL_SERVICE = "${GROUP_DEGRADE}/global/service"
    }
}