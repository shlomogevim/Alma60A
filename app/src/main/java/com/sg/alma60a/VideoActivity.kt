package com.sg.alma60a

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.VideoView
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.sg.alma60a.databinding.ActivityVideo1Binding

class VideoActivity : AppCompatActivity() {

    val util=Utility()
    private lateinit var binding: ActivityVideo1Binding

    var urlVideo=""
    var textVideo=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityVideo1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE)

        lifecycle.addObserver(binding.youtubePlayerView)
        urlVideo= intent.getStringExtra(VIDEO_URL).toString()
        textVideo= intent.getStringExtra(VIDEO_TEXT).toString()

        util.logi("gg"," VideoActivity 37 => textVideo=$textVideo")

        if (textVideo=="[0.9]") {
            binding.youtubePlayerView.scaleX = 0.90f
            binding.youtubePlayerView.scaleY = 0.90f
        }
        if (textVideo=="[0.8]") {
            binding.youtubePlayerView.scaleX = 0.80f
            binding.youtubePlayerView.scaleY = 0.80f
        }
        binding.youtubePlayerView.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
            override fun onReady(youTubePlayer: YouTubePlayer) {
                val videoId = urlVideo
                 youTubePlayer.loadVideo(videoId, 0f)
//                videoView.setScaleType(VideoView.SCALE_TO_FIT_WITH_SMALLER_DIMENSIONS);
            }
        })

        binding.videoExplenationBtn.setOnClickListener {
            val intent=Intent(this,VideoExplanationActivity::class.java)
            intent.putExtra(VIDEO_TEXT,textVideo)
            startActivity(intent)
            finish()
        }


    }
}