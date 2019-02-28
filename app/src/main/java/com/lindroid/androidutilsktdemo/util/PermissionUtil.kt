package com.lindroid.androidutilsktdemo.util

import android.Manifest
import android.annotation.SuppressLint
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity
import com.tbruyelle.rxpermissions2.RxPermissions

/**
 * @author Lin
 * @date 2019/2/21
 * @function 动态权限申请工具类
 * @Description
 */

@SuppressLint("CheckResult")
private fun RxPermissions.checkPermission(listener: (granted: Boolean) -> Unit, vararg permissions: String) {
    this.request(*permissions)
        .subscribe {
            listener.invoke(it)
        }
}

/**
 * 获取拨打电话权限
 */
fun FragmentActivity.pmCallPhone(listener: (granted: Boolean) -> Unit) {
    RxPermissions(this).checkPermission(listener, Manifest.permission.CALL_PHONE)
}

/**
 * 获取拨打电话权限
 */
fun Fragment.pmCallPhone(listener: (granted: Boolean) -> Unit) {
    RxPermissions(this).checkPermission(listener, Manifest.permission.CALL_PHONE)
}

/**
 * 获取读取存储权限
 */
fun FragmentActivity.pmStorage(listener: (granted: Boolean) -> Unit) {
    RxPermissions(this).checkPermission(
        listener,
        Manifest.permission.WRITE_EXTERNAL_STORAGE,
        Manifest.permission.READ_EXTERNAL_STORAGE
    )
}

/**
 * 获取读取存储权限
 */
fun Fragment.pmStorage(listener: (granted: Boolean) -> Unit) {
    RxPermissions(this).checkPermission(
        listener,
        Manifest.permission.WRITE_EXTERNAL_STORAGE,
        Manifest.permission.READ_EXTERNAL_STORAGE
    )
}

/**
 * 获取拍照权限
 */
fun FragmentActivity.pmCamera(listener: (granted: Boolean) -> Unit) {
    RxPermissions(this).checkPermission(
        listener,
        Manifest.permission.WRITE_EXTERNAL_STORAGE,
        Manifest.permission.CAMERA
    )
}

/**
 * 获取拍照权限
 */
fun Fragment.pmCamera(listener: (granted: Boolean) -> Unit) {
    RxPermissions(this).checkPermission(
        listener,
        Manifest.permission.WRITE_EXTERNAL_STORAGE,
        Manifest.permission.CAMERA
    )
}

/**
 * 获取读取通讯录权限
 */
fun FragmentActivity.pmReadContacts(listener: (granted: Boolean) -> Unit) {
    RxPermissions(this).checkPermission(
        listener,
        Manifest.permission.WRITE_EXTERNAL_STORAGE,
        Manifest.permission.READ_CONTACTS
    )
}

/**
 * 获取读取通讯录权限
 */
fun Fragment.pmReadContacts(listener: (granted: Boolean) -> Unit) {
    RxPermissions(this).checkPermission(
        listener,
        Manifest.permission.WRITE_EXTERNAL_STORAGE,
        Manifest.permission.READ_CONTACTS
    )
}

fun FragmentActivity.pmSendSMS(listener: (granted: Boolean) -> Unit) {
    RxPermissions(this).checkPermission(listener, Manifest.permission.SEND_SMS, Manifest.permission.READ_CONTACTS)
}



