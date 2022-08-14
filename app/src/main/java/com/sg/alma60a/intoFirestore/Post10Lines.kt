package com.sg.alma60a

import android.app.Activity
import android.content.Context
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout


class Post10Lines(val context: Context) {

    private val layout: ConstraintLayout = (context as Activity).findViewById(R.id.itemLayoutFire)
    val drawPost = DrawPostCenter(context)
    val pref = context.getSharedPreferences(SHARPREF_ALMA, Context.MODE_PRIVATE)
    private val util = Utility()


    fun loadPost1000() {
        val post = Post()
        with(post) {
            postNum = 1000
            lineNum = 10
            postId = 85
            imageUri = "https://cdn.pixabay.com/photo/2018/02/15/19/42/sunset-3156176_1280.jpghttps://cdn.pixabay.com/photo/2018/02/15/19/42/sunset-3156176_1280.jpg"
             postText = arrayListOf(
                " יש לך טעות בסיסית, ",
                " כדי שהכל יסתדר ",
                " לא צריך שכל העולם יהיה בסדר ",
                " שיהיה שלום עולמי ",
                " ויגמרו כל הרשע הצער והכאב ",
                " ממש לא, ",
                " כדי שהכל יסתדר ",
                "  מספיק שאתה אישית  ",
                " תרגיש בסדר עם עצמך לרגע, ",
                " זה הכול. "
            )
             postTransparency = 5
            postTextSize = arrayListOf(0, 17)
            val backgroundColor = "#00539C"
            val textColor = "#FFD662"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            //        post.textLocation = arrayListOf(102,   -1,       35,            10,               0,        60,         1,            -30)            // locate in the bottom
            //      post.textLocation = arrayListOf(102,  10,       35,            -1,               0,         0,          0,              0)            //locate in the top
            textLocation = arrayListOf(10, -1, 35,10, 0, 0,0, 0)
//            textLocation = arrayListOf(10, 10, 35,-1, 0, 0,0, 0)
            postPadding =  arrayListOf(0, 0,0, 0)
            postRadiuas = 16
            lineSpacing = 1.3f
            }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }


}