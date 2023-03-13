package com.sg.alma60a

import android.app.Activity
import android.content.Context
import androidx.constraintlayout.widget.ConstraintLayout
import com.sg.alma60a.model.Post


class Post12Lines(val context: Context) {

    private val layout: ConstraintLayout = (context as Activity).findViewById(R.id.itemLayoutFire)
    val drawPost = DrawPostCenter(context)
    val pref = context.getSharedPreferences(SHARPREF_ALMA, Context.MODE_PRIVATE)
    private val util = Utility()
    private val util1 = Utility1(context)

    fun loadPost1200() { //I
        val post = Post()
        with(post) {
            postNum = 1200
            lineNum = 12
            postId = 87
            imageUri = "https://cdn.pixabay.com/photo/2018/01/31/03/47/water-3120184_960_720.jpg"
            postText = arrayListOf(
                " מה שאתה ברגע הזה  ",
                " זה מה שאתה. ",
                " זה כל כך פשוט  ",
                " עד שאי אפשר לתפוס את זה,  ",
                " זה כל כך זמין ",
                " עד שאי אפשר לחפש את זה, ",
                " זה כל כך מוכר ",
                " עד שאי אפשר לזהות את זה, ",
                "  זה כל כך קרוב  ",
                " עד שאי אפשר לגעת בזה, ",
                " זה כל כך קיים ",
                " שאי אפשר לשלול את זה. "
            )
            postTransparency = 8
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#00539C"
            val textColor = "#FFD662"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            textLocation = arrayListOf(10, 100, 30, -1, 0, 0, 0, 0)
            postPadding = arrayListOf(0, 0, 0, 0)
            lineSpacing = 1.3f
            videoUrl="DSTLjD2DYTw"
            videoText = util1.getPostExplanation(postNum, postText)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }


}