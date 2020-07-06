package com.splashanimation

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import android.util.Pair

class MainActivity : AppCompatActivity() {

    lateinit var topAnim: Animation
    lateinit var bottomAnim: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_main)

        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation)
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation)

        image.animation = topAnim
        logo.animation = bottomAnim
        slogan.animation = bottomAnim

        image.setOnClickListener {
            val intent = Intent(this, Login::class.java)

            val p1 = Pair.create<View, String>(image, "logo_image")
            val p2 = Pair.create<View, String>(logo, "logo_text")

            val options = ActivityOptions.makeSceneTransitionAnimation(this, p1, p2)

            startActivity(intent, options.toBundle())
            finish()
        }
    }
}