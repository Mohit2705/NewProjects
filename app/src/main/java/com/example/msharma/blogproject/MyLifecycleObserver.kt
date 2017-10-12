package com.example.msharma.blogproject

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.OnLifecycleEvent
import android.util.Log

class MyLifecycleObserver : LifecycleObserver {

    companion object {
        const val TAG = "MyLifecycleObserver"
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResume() {
        Log.v(TAG, "On resume called")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPause() {
        Log.v(TAG, "On pause called")
    }

}