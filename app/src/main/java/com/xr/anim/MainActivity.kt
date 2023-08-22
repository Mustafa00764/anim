package com.xr.anim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import com.airbnb.lottie.LottieAnimationView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        val b_facebook = findViewById<Button>(R.id.b_facebook)
        val b_twitter = findViewById<Button>(R.id.b_twitter)
        val lav_animation = findViewById<LottieAnimationView>(R.id.lav_animation)
        val b_youtube = findViewById<Button>(R.id.b_youtube)


        b_facebook.setOnClickListener {
            lav_animation.setAnimation("anim1.json")
            lav_animation.playAnimation()
        }
        b_twitter.setOnClickListener {
            lav_animation.setAnimation("anim2.json")
            lav_animation.playAnimation()
        }
        b_youtube.setOnClickListener {
            lav_animation.setAnimation("anim3.json")
            lav_animation.playAnimation()
        }
        lav_animation.setOnClickListener {
            lav_animation.pauseAnimation()
        }




    }


}