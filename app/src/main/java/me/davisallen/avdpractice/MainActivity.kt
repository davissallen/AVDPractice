package me.davisallen.avdpractice

import android.graphics.drawable.Animatable
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
        val mIcDownloadAnimator = ic_download_iv
        val drawable = mIcDownloadAnimator.drawable
        if (drawable is Animatable) drawable.start()
    }

}
