package com.example.msharma.blogproject

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleOwner
import android.arch.lifecycle.LifecycleRegistry
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity(), LifecycleOwner {
    companion object {
        const val TAG = "MainActivity"
    }

    val lifecycleRegistry by lazy {
        LifecycleRegistry(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lifecycle.addObserver(MyLifecycleObserver())
    }

    override fun getLifecycle(): Lifecycle {
        return lifecycleRegistry
    }

}
