package me.davisallen.avdpractice

import android.animation.ValueAnimator
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun doYourDance(view: View) {
        val mCheckImageView = ic_check_imageview

        val animator = ValueAnimator.ofFloat(1f, 0f)
        animator.addUpdateListener { animation -> mCheckImageView.alpha = animation.animatedValue as Float }

        animator.duration = 3000
        animator.repeatMode = ValueAnimator.REVERSE
        animator.repeatCount = -1
        animator.start()
    }

}
