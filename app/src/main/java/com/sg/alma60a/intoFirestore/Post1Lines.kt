package com.sg.alma60a

import android.app.Activity
import android.content.Context
import androidx.constraintlayout.widget.ConstraintLayout
import com.sg.alma60a.model.Post


class Post1Lines(val context: Context) {

    private val layout: ConstraintLayout = (context as Activity).findViewById(R.id.itemLayoutFire)
   // val drawPost = DrawPostCenter(context)
    val drawPost = DrawPostCenter(context)
    private val util = Utility()


    fun loadPost100() {
        val post = Post()
        with(post) {
            postNum = 100
            lineNum = 1
            imageUri =
                "https://cdn.pixabay.com/photo/2015/08/26/11/06/people-talking-908342_1280.jpg"

            postText = arrayListOf(
                "כל אחד מדבר את מה שהוא."
            )
            postId= 86
            textLocation = arrayListOf(10,-1, 35,5,0, 0, 0, 0)
            postTransparency =0
            postTextSize = arrayListOf(0, 33)
            val backgroundColor = "263238"
            val textColor = "#f6ff03"
            postFontFamily = 200
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15
            lineSpacing=0.9f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost101() {  //I
        val post = Post()
        with(post) {
            with(post) {
                postNum = 101
                lineNum = 1
                imageUri = "https://cdn.pixabay.com/photo/2018/02/13/23/41/nature-3151869_1280.jpg"
                postText = arrayListOf(
                    "אתה הוא האור שבו אתה חי."
                )
                postId= 95
                textLocation = arrayListOf(10,-1, 35,5,0, 0, 0, 0)
                postTransparency = 0
                postTextSize = arrayListOf(0, 30)
                val backgroundColor = "263238"
                val textColor = "#f6ff03"
                postFontFamily = 200

                postBackground = util.improveColorString(backgroundColor)
                val textcolo = util.improveColorString(textColor)
                val col = "#$textcolo"
                postTextColor = arrayListOf(CONSTANT, col)
                postPadding = arrayListOf(10, 0, 10, 0)
                postRadiuas = 15
                lineSpacing=0.9f
            }
            drawPost.drawPostFire(post, layout)
//            util.sendPostToStringFirestore(post)
        }
    }
        fun loadPost102() {//I
            val post = Post()
            with(post) {
                with(post) {
                    postNum = 102
                    lineNum = 1
                    imageUri =
                        "https://cdn.pixabay.com/photo/2013/07/18/15/09/death-164761_1280.jpg"
                    postText = arrayListOf(
                        "גם מחיים שלווים לגמרי מתים בסוף."
                    )
                    postId= 85
                    textLocation = arrayListOf(10,-1, 35,200,0, 0, 0, 0)
                    postTransparency = 1
                    postTextSize = arrayListOf(0, 28)
                    val backgroundColor = "263238"
                    val textColor = "#f6ff03"
                    postFontFamily = 200

                    postBackground = util.improveColorString(backgroundColor)
                    val textcolo = util.improveColorString(textColor)
                    val col = "#$textcolo"
                    postTextColor = arrayListOf(CONSTANT, col)
                    postPadding = arrayListOf(0, 0, 0, 0)
                    postRadiuas = 15
                    lineSpacing=0.9f
                }
                drawPost.drawPostFire(post, layout)
//                util.sendPostToStringFirestore(post)
            }

        }
    }





