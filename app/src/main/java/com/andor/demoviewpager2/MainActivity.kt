package com.andor.demoviewpager2

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val pageList = arrayListOf(
            ViewPageData("Hello"),
            ViewPageData("Page 1"),
            ViewPageData("Page 2"),
            ViewPageData("Page 3"),
            ViewPageData("Page 4")
        )
        val viewPager2Adapter = ViewPager2Adapter(this)
        viewPager2Adapter.pageList = pageList

        view_pager.adapter = viewPager2Adapter
        view_pager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageScrollStateChanged(state: Int) {
                super.onPageScrollStateChanged(state)
//                Toast.makeText(
//                    applicationContext,
//                    "Page Scroll state Changed to $state",
//                    Toast.LENGTH_SHORT
//                ).show()
            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels)
//                Toast.makeText(
//                    applicationContext,
//                    "Page Scroll started",
//                    Toast.LENGTH_SHORT
//                ).show()
            }

            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                Toast.makeText(
                    applicationContext,
                    "Page selected $position",
                    Toast.LENGTH_SHORT
                ).show()
            }
        })

    }
}
