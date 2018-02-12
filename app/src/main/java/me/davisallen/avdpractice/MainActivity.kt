package me.davisallen.avdpractice

import android.animation.ValueAnimator
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.animation.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun doYourDance(view: View) {
        // Fade checkmark out over 3 seconds.
        val mCheckImageView = ic_check_imageview
        val checkFadeOutAnimation = ValueAnimator.ofFloat(1f, 0f)
        checkFadeOutAnimation.addUpdateListener { animation -> mCheckImageView.alpha = animation.animatedValue as Float }
        checkFadeOutAnimation.duration = 750
        checkFadeOutAnimation.repeatCount = 0
        checkFadeOutAnimation.start()

        // Expand the circle.
        val mCircleImageView = ic_circle_imageview
        val circleExpandAnimation = ScaleAnimation(1f, 1.3f, 1f, 1.3f, mCircleImageView.width/2f, mCircleImageView.height/2f)
        circleExpandAnimation.interpolator = OvershootInterpolator()
        circleExpandAnimation.startOffset = 750
        circleExpandAnimation.repeatCount = 0
        circleExpandAnimation.fillAfter = true
        circleExpandAnimation.duration = 2000
        mCircleImageView.startAnimation(circleExpandAnimation)

        // Fade in dot.
        val mDotImageView = ic_dot_imageview
        val dotFadeInAnimator = ValueAnimator.ofFloat(0f, 1f)
        dotFadeInAnimator.addUpdateListener { animation -> mDotImageView.alpha = animation.animatedValue as Float }
        dotFadeInAnimator.duration = 2000
        dotFadeInAnimator.repeatCount = 0
        dotFadeInAnimator.start()

        // Rotate dot.
        val dotRotateAnimation = RotateAnimation(0f, 360*45f, mDotImageView.width/2f, mDotImageView.height/2f)
        dotRotateAnimation.interpolator = AccelerateDecelerateInterpolator()
        dotRotateAnimation.duration = 7000
        dotRotateAnimation.startOffset = 4000
        mDotImageView.startAnimation(dotRotateAnimation)

        // Shrink circle.
        val circleShrinkAnimation = ScaleAnimation(1f, 0.7f, 1f, 0.7f, mCircleImageView.width/2f, mCircleImageView.height/2f)
        circleShrinkAnimation.interpolator = LinearInterpolator()
        circleShrinkAnimation.startOffset = 11000
        circleShrinkAnimation.repeatCount = 0
        circleShrinkAnimation.fillAfter = true
        circleShrinkAnimation.duration = 200
        mCircleImageView.startAnimation(circleShrinkAnimation)

    }

}
