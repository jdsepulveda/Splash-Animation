package com.splashanimation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.splash_screen.*

class SplashScreen : AppCompatActivity() {

    private val SPLASH_TIMER = 5000L

    lateinit var sideAnim: Animation
    lateinit var bottomAnim: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.splash_screen)

        sideAnim = AnimationUtils.loadAnimation(this, R.anim.side_anim)
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_anim)

        backgroundImage.animation = sideAnim
        poweredByLine.animation = bottomAnim

        Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }, SPLASH_TIMER)
    }
}