package com.sg.alma60a

import android.app.Activity
import android.content.Context
import androidx.constraintlayout.widget.ConstraintLayout
import com.sg.alma60a.model.Post


class Post9Lines(val context: Context) {

    private val layout: ConstraintLayout = (context as Activity).findViewById(R.id.itemLayoutFire)
    val drawPost= DrawPostCenter(context)
    val pref = context.getSharedPreferences(SHARPREF_ALMA, Context.MODE_PRIVATE)
    private val util= Utility()

    fun loadPost900() {
        val post = Post()
        with(post) {
            postNum = 900
            lineNum = 9
            postId=70
            imageUri = "https://cdn.pixabay.com/photo/2013/04/07/21/29/hotel-hall-101634_1280.jpg"
            postText = arrayListOf(
                "לפעמים החיים מרגישים לך כמו מסדרון",
                " של מחשבות תחושות וחוסר משמעות,  ",
                " אתה יודע שאם לא תהיה בתנועה ",
                " תהיה תקוע במסדרון הזה כל היום, ",
                " הכוזבים מכחישים שיש בכלל מסדרון ",
                " הדיכאוניים מכחישים שאפשר ללכת ",
                " הפסימיים לא מאמינים שיש סוף לזה ",
                "רודפי הנחמה  גוררים רגלים, ",
                "  אבל תמיד בסוף המסדרון יש חדר גדול.  "
            )
            postTransparency =8
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#1E4174"
            val textColor = "#DDA94B"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            //        post.textLocation = arrayListOf(102,   -1,       35,            10,               0,        60,         1,            -30)            // locate in the bottom
            //      post.textLocation = arrayListOf(102,  10,       35,            -1,               0,         0,          0,              0)            //locate in the top
            /* textLocation = arrayListOf(10, -1, 35,10, 0, 0,0, 0)
//            textLocation = arrayListOf(10, 10, 35,-1, 0, 0,0, 0)*/

            textLocation = arrayListOf(10, -1, 30,10, 0, 0,0, 0)
//            textLocation = arrayListOf(10, 10, 30,-1, 0, 0,0, 0)
            postPadding =  arrayListOf(5, 0,5, 0)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post,layout)
//        util.sendPostToStringFirestore(post)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }



    fun loadPost901() {
        val post = Post()
        with(post) {
            postNum = 901
            postId = 85
            lineNum =9
            imageUri = "https://cdn.pixabay.com/photo/2016/04/02/17/58/service-1303313_1280.jpg"
            postText = arrayListOf(
                " שאתה הולך למסעדה ",
                " מה שמעניין אותך יותר ",
                " שהאוכל יהיה טעים ",
                " פחות מה קורה במטבח, ",
                "ובדומה לזה",
                " מה שאתה יוצר ",
                " זה מה שמעניין, ",
                "התחשבנויות האישיות שלך",
                " זה מה שקורה במטבח."
            )

            postId = 86
            textLocation = arrayListOf(10, -1, 30,5, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =6
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }



    fun loadPost902() {
        val post = Post()
        with(post) {
            postNum = 902
            postId = 85
            lineNum =9
            imageUri = "https://cdn.pixabay.com/photo/2012/03/01/01/45/baby-20374_1280.jpg"
            postText = arrayListOf(
                " לדעתי בזמן הלידה ",
                " יש ברדק גדול בשמי מרום, ",
                " והרבה תינוקות לא מקבלים ",
                " את החיים שלהם בצורה מסודרת, ",
                "התינוקות האלה גדלים",
                " ונעשים לאנשים בוגרים ",
                " שאומנם מתפקדים בסדר גמור, ",
                "אבל נראה שהחיים שלהם נשארו",
                " אי שם במחסני מרום."
            )
            postId = 86
            textLocation = arrayListOf(10, -1, 30,5, 0, 0, 0, 0)
            postPadding = arrayListOf(5, 0, 5, 0)
            postTransparency =6
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

}
