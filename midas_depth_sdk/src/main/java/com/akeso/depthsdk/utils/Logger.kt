package com.akeso.depthsdk.utils

import android.util.Log

// Utility class to log messages
class Logger {

    companion object {

        private val APP_LOG_TAG = "Depth_Estimation_Sdk"

        fun logError(message: String) {
            Log.e(APP_LOG_TAG, message)
        }

        fun logInfo(message: String) {
            Log.i(APP_LOG_TAG, message)
        }

    }

}