package com.sg.alma60a

import android.app.Activity
import android.content.Context
import androidx.constraintlayout.widget.ConstraintLayout
import com.sg.alma60a.model.Post


class Post10Lines(val context: Context) {

    private val layout: ConstraintLayout = (context as Activity).findViewById(R.id.itemLayoutFire)
    val drawPost = DrawPostCenter(context)
    val pref = context.getSharedPreferences(SHARPREF_ALMA, Context.MODE_PRIVATE)
    private val util = Utility()
    private val util1 = Utility1(context)


    fun loadPost1000() {
        val post = Post()
        with(post) {
            postNum = 1000
            lineNum = 10
            postId = 85
            imageUri =
                "https://cdn.pixabay.com/photo/2018/02/15/19/42/sunset-3156176_1280.jpghttps://cdn.pixabay.com/photo/2018/02/15/19/42/sunset-3156176_1280.jpg"
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
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
//            textLocation = arrayListOf(10, 10, 35,-1, 0, 0,0, 0)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.3f
             }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost1001() { //I  //nv
        val post = Post()
        with(post) {
            postNum = 1001
            lineNum = 10
            postId = 85
            imageUri = "https://cdn.pixabay.com/photo/2013/04/23/09/39/costume-106595_1280.jpg"
            postText = arrayListOf(
                " אישה יפה הולכת בחוף, ",
                " הגוף התנועה החצי מבט ",
                " עושים לך את זה, אתה כבר במקום אחר. ",
                " קח את אותה אישה ",
                " שים אותה על שולחן הניתוחים לאופרציה שיגרתית של הוצאת איבר חולה, ",
                " מחריד, היית מתעלף תוך שניה מהמראות. ",
                " מסקנה: ",
                " האדם לא בנוי להתמודד ביומיום שלו עם האמת  זה גדול עליו,  ",
                " הוא מעדיף ווריאציה נוחה של האמת ",
                " ורצוי עם בגד ים מינימלי. "
            )
            textLocation = arrayListOf(10, -1, 23,5, 0, 0,0,0)
            postId = 85
            postTransparency = 8
            postTextSize = arrayListOf(0, 11)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            videoUrl="c5QfXjsoNe4"
            videoText=util1.getVideoText(postNum)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

 
  fun loadPost1003() {
        val post = Post()
        with(post) {
            postNum = 1003
            lineNum = 10
            postId = 85
            imageUri = "https://cdn.pixabay.com/photo/2016/05/11/16/32/bridge-1385938_960_720.jpg"
            postText = arrayListOf(
                " הרבי אמר: ",
                " \"העולם כולו גשר צר מאוד והעיקר לא לפחד כלל\" ",
                " ולבריאותך הנפשית אפשר להוסיף: ",
                "יש בעולם גשרים צרים מאוד, ",
                " אבל רצוי לך לדעת ",
                " מתי הגשר מתחיל ",
                " וטוב לך לנהוג שם באומץ וזהירות, ",
                " ומתי הגשר נגמר  ",
                " ואפשר לך לנשום לרווחה ",
                " ולהרפות. "
            )
            textLocation = arrayListOf(10, -1, 23,10, 0,0,0,0)
            postId = 86
            postTransparency = 9
            postTextSize = arrayListOf(0, 11)
            val backgroundColor = "#990011"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

fun loadPost1004() {
    val post = Post()
    with(post) {
        postNum = 1004
        lineNum = 10
        postId = 85
        imageUri = "https://cdn.pixabay.com/photo/2016/03/04/17/51/brick-1236403_960_720.jpg"
        postText = arrayListOf(
            " אני חושב שכבישים ללא מוצא ",
            " לא צריכים להרגיש אשמים ",
            " על זה שאין להם מוצא ",
            " בגלל שככה הם נוצרו, ",
            " ------- ",
            " אני חושב שאנשים ",
            " לא צרכים להרגיש אשמים ",
            " שהם בני אדם ",
            " זה נכון שיש להם מוגבלות אנושית ",
            " אבל ככה הם נוצרו. "
        )
        textLocation = arrayListOf(10, -1, 30,10, 0,0,0,0)
        postId = 86
        postTransparency = 9
        postTextSize = arrayListOf(0, 14)
        val backgroundColor = "#990011"
        val textColor = "#ffffff"
        postFontFamily = 103
        postBackground = util.improveColorString(backgroundColor)
        val textcolo = util.improveColorString(textColor)
        val col = "#$textcolo"
        postTextColor = arrayListOf(CONSTANT, col)
        postPadding = arrayListOf(0, 0, 0, 0)
        videoUrl="93aXrAW0y10"
        videoText = util1.getPostExplanation(postNum, postText)
    }
    drawPost.drawPostFire(post, layout)
    util.sendPostToStringFirestore(post)
}
}