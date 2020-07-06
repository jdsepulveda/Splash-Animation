package com.splashanimation

import android.content.Context
import android.view.View
import androidx.viewpager.widget.PagerAdapter

class SliderAdapter(context: Context): PagerAdapter() {

    val images = listOf(
        R.drawable.search_place,
        R.drawable.make_a_call,
        R.drawable.add_missing_place,
        R.drawable.sit_back_and_relax
    )

    val headings = listOf(
        R.string.first_slide_title,
        R.string.second_slide_title,
        R.string.third_slide_title,
        R.string.fourth_slide_title
    )

    val descriptions = listOf(
        R.string.first_slide_desc,
        R.string.second_slide_desc,
        R.string.third_slide_desc,
        R.string.fourth_slide_desc
    )

    override fun getCount(): Int {
        return headings.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        TODO("Not yet implemented")
    }
}