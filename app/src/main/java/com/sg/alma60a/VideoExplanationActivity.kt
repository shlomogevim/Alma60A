package com.sg.alma60a

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sg.alma60a.databinding.ActivityVideoExplanationBinding

class VideoExplanationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityVideoExplanationBinding
    var textVideo=""
    val utit=Utility()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityVideoExplanationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        textVideo= intent.getStringExtra(VIDEO_TEXT).toString()

        drawCurrentVideoComment()
    }
    private fun drawCurrentVideoComment() {
        val backGroundColor = "#0A174E"
        val textColor = "#F5D042"

        binding.mainBackground.setBackgroundColor(Color.parseColor(backGroundColor))
        binding.tvArticleVideo.setTextColor(Color.parseColor(textColor))
//        binding.tvTitle.setTextColor(Color.parseColor(textColor))
//        binding.tvTitle.text = setTextTitle()
        binding.tvArticleVideo.text = textVideo
//        utit.logi("gg","VideoExplanationActivity 30 textVideo=$textVideo")
    }






//    private fun setTextTitle(): String =
//        "---------------------------------\n" +
//                "הערות על קטע השיר הזה\n" +
//                "--------------------------------- "

}