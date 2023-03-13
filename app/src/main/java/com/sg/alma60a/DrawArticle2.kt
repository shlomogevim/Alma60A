package com.sg.alma60a

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sg.alma60a.databinding.ActivityDrawArticle2Binding
import com.sg.alma60a.model.Article

class DrawArticle2(currentA: Article) : AppCompatActivity() {
    lateinit var binding: ActivityDrawArticle2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDrawArticle2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvArticle2.text="מה קורה מלך"
    }
}