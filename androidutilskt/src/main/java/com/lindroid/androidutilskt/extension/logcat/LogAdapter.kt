package com.lindroid.androidutilskt.extension.logcat

/**
 * @author Lin
 * @date 2019/3/19
 * @function
 * @Description
 */
interface LogAdapter {

    /**
     * 设置是否打印日志
     */
    fun isLoggable(@LogLevel level: Int, tag: String?): Boolean

    /**
     * 所有日志的打印通道
     */
    fun log(@LogLevel level: Int, tag: String?, message: String)
}