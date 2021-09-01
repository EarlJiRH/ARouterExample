package com.example.arouter.route

/**
 * ================================================
 * 类名：com.example.arouter
 * 时间：2021/9/1 14:58
 * 描述：
 * 修改人：
 * 修改时间：
 * 修改备注：
 * ================================================
 *
 * @author Admin
 */
interface RouteFlag {
    companion object {
        //是否需要登录
        const val FLAG_LOGIN = 0x01
        //是否需要实名认证
        const val FLAG_AUTHENTICATION = FLAG_LOGIN shl 1
        //是否需要会员
        const val FLAG_VIP = FLAG_AUTHENTICATION shl 1
    }
}