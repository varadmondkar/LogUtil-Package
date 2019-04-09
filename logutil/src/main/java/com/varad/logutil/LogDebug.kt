package com.varad.logutil

import android.util.Log

/**
 * Created by varad on 10/04/19.
 */
class LogDebug {

    fun d(message: String) {
        Log.d(LogDebug::class.java.simpleName, message)
    }
}