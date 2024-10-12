package com.manish.androidhandson

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        Timber.plant(Timber.DebugTree())
        setContentView(R.layout.activity_main)
        Timber.d("onCreate called!")
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        Timber.d("onAttachedToWindow called!")
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        Timber.d("onDetachedFromWindow called!")
    }

    override fun onStart() {
        super.onStart()
        Timber.d("onStart called!")
    }

    override fun onStop() {
        super.onStop()
        Timber.d("onStop called!")
    }

    override fun onResume() {
        super.onResume()
        Timber.d("onResume called!")
    }

    override fun onRestart() {
        super.onRestart()
        Timber.d("onRestart called!")
    }

    override fun onPostResume() {
        super.onPostResume()
        Timber.d("onPostResume called!")
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        Timber.d("onPostCreate called!")
    }

    override fun onPostCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onPostCreate(savedInstanceState, persistentState)
        Timber.d("onPostCreate called!")
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.d("onDestroy called!")
    }
}