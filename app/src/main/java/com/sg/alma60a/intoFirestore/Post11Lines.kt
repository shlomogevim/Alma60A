package com.sg.alma60a

import android.app.Activity
import android.content.Context
import androidx.constraintlayout.widget.ConstraintLayout
import com.sg.alma60a.model.Post


class Post11Lines(val context: Context) {

    private val layout: ConstraintLayout = (context as Activity).findViewById(R.id.itemLayoutFire)
    val drawPost = DrawPostCenter(context)
    val pref = context.getSharedPreferences(SHARPREF_ALMA, Context.MODE_PRIVATE)
    private val util = Utility()
    private val util1 = Utility1(context)


    fun loadPost1100() { //I
        val post = Post()
        with(post) {
            postNum = 1100
            lineNum = 11
            postId = 87
            imageUri = "https://cdn.pixabay.com/photo/2015/07/14/19/47/hand-845269_960_720.jpg"
            postText = arrayListOf(
                " אפשר להשתמש בחיים בתור פסיכולוג  ",
                " ולספר להם כמה רע לך וכמה אתה מסכן, ",
                " אפשר להשתמש בחיים בתור סידור עבודה ",
                " ולסדר בהם לעצמך סידרת מטלות אינסופית, ",
                " אפשר להשתמש בחיים בתור מצפן ",
                " ולחפש בהם את עצמך בכל הכיוונים, ",
                " אפשר להשתמש בחיים כתפקיד בהצגה ",
                "  ולעשות בהם תמיד את כל מה שמצפים ממך,  ",
                " אפשר להשתמש בחיים בתור מוסיקה ",
                " ולחפש בהם את המילים המתאימות למראות, ",
                " אבל הכי כדאי לחיות אותם. "
            )
            postTransparency = 10
            postTextSize = arrayListOf(0, 12)
            val backgroundColor = "#00539C"
            val textColor = "#FFD662"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            textLocation = arrayListOf(10, -1, 26, 10, 0, 0, 0, 0)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 14
            lineSpacing = 1.3f
            videoUrl="WSiDvGpwbUY"
            videoText=util1.getVideoText(postNum)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }


}