package com.sg.alma60a

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sg.alma60a.databinding.ActivityDrawArticleBinding
import com.sg.alma60a.model.Article

class DrawArticle(val currentA: Article) : AppCompatActivity() {
    lateinit var binding: ActivityDrawArticleBinding
    val util=Utility()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDrawArticleBinding.inflate(layoutInflater)
        setContentView(binding.root)

       // draw_it()


//        util.logi("DrawArticle  21   ")
/*
        binding.mainArticleDetail.setBackgroundColor(Color.parseColor(currentA.articleBackground.toString()))
        binding.tvArticle.setTextColor(Color.parseColor(currentA.articleTextColor.toString()))
        binding.tvArticle.text = currentA.aricleText*/

    }

 fun draw_it() {
//        util.logi("DrawArticle  30   ")

//   binding.mainArticleDetail.setBackgroundColor(Color.parseColor(currentA.articleBackground.toString()))
    // binding.tvArticle.setTextColor(Color.parseColor(currentA.articleTextColor.toString()))
    binding.tvArticle.text = currentA.aricleText

    }
}