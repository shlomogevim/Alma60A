package com.sg.alma60a

import android.content.Context
import com.sg.alma60a.model.Article


class Articles(val context: Context) {

//    private val layout: ConstraintLayout = (context as Activity).findViewById(R.id.mainArticleDetail)
    //val pref = context.getSharedPreferences(SHARPREF_ALMA, Context.MODE_PRIVATE)
    //val drawArticle=DrawArticle()

    private val util = Utility()


    /* fun loadPost4956() {
         val post = Post()
         with(post) {
             postNum = 4956
             lineNum = 4
             imageUri = "https://cdn.pixabay.com/photo/2016/10/18/05/16/woman-1749355_1280.jpg"
             postText = arrayListOf(
                 " ביקורת ",
                 " זה חוסר השלמות שבחוסר השלמות, ",
                 " אומנות ",
                 " זה השלמות שבחוסר השלמות.  "
             )
             postId = 84
             textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
             postPadding = arrayListOf(0, 0, 0, 0)
             postTransparency = 3
             postTextSize = arrayListOf(0, 15)
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

     }*/
    fun loadArticles10() {
        //pref.edit().putString(ARTICAL_MODE, TRUE).apply()
        val article = Article()
        with(article) {
            aricleNum = 10
            aricleTitle = " זה המאמר הראשון "
            aricleText = context.applicationContext.assets
                .open("myText2")
                .bufferedReader().use {
                    it.readText()
                }
            articleBackground="#0A174E"
            articleTextColor="#F5D042"
        }
//      util.logi("Articles 59")
      //  util.logi("Articles 59   article=$article")
       DrawArticle2(article)
//        util.logi("Articles 62")


    }
}





