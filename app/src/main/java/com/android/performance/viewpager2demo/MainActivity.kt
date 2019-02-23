package com.android.performance.viewpager2demo

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setViewPager()
    }

    private fun setViewPager() {

        viewpager.orientation = ViewPager2.ORIENTATION_VERTICAL
        val adapter = SampleAdapter().also {
            it.list = mutableListOf("N", "M", "J")
        }
        viewpager.adapter = adapter
        viewpager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                Toast.makeText(this@MainActivity, "position=$position", Toast.LENGTH_LONG).show()
            }
        })


    }
}
