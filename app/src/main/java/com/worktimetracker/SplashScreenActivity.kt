package com.worktimetracker

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler

import com.worktimetracker.R

/**
 * Show a Menu Screen before WorkTime Activity starts
 */
class SplashScreenActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)



        Handler().postDelayed({
            val intent = Intent(this@SplashScreenActivity, WorkTimeActivity::class.java)
            startActivity(intent)
            finish()
        }, 4000)
    }


}
