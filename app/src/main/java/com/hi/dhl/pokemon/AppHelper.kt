package com.hi.dhl.pokemon

import android.annotation.SuppressLint
import android.content.Context

/**
 * <pre>
 *     author: dhl
 *     date  : 2020/7/11
 *     desc  :
 * </pre>
 */
@SuppressLint("StaticFieldLeak")
object AppHelper {
    lateinit var mContext: Context

    fun init(context: Context) {
        this.mContext = context
    }
}