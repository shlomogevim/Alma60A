package com.sg.alma60a

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sg.alma60a.databinding.ActivityAddArticleBinding
import com.sg.alma60a.model.Article

class AddArticleActivity : AppCompatActivity() {
    lateinit var binding: ActivityAddArticleBinding
    val util = Utility()
    var fileName = ""
    var title=""
    var num=0
   var backGroundColor=""
    var textColor=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAddArticleBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        drawArticle11()
//        drawArticle12()
//        drawArticle13()
//        drawArticle21()
//        drawArticle22()
//        drawArticle23()
//      drawArticle24()
//       drawArticle25()
//       drawArticle26()
  //     drawArticle27()
//       drawArticle28()
//       drawArticle29()
       drawArticle30()


    }

    private fun creatArticle(
        index: Int,
        title:String,
        texti: String,
        textColor: String,
        backGroundColor: String
    ) {
        val article = Article()
        with(article) {
            aricleNum = index
            aricleTitle = title
            aricleText = texti
            articleBackground=backGroundColor
            articleTextColor=textColor
        }
        util.sendArticleToStringFirestore(article)

    }


    private fun drawInevidualArtivle(texti: String, textColor: String, backGroundColor: String) {
        binding.mainAddArticle.setBackgroundColor(Color.parseColor(backGroundColor))
        binding.tvAddArticle.setTextColor(Color.parseColor(textColor))
        binding.tvAddArticle.text=texti
    }

    private fun createTextString(fileName : String)=
        applicationContext.assets
            .open(fileName)
            .bufferedReader().use {
                it.readText()
            }


    private fun drawArticle11() {
       num=11
        title=" בראשית "
        fileName = "atoraFile1"
        backGroundColor="#0A174E"
        textColor="#F5D042"
        val text=createTextString(fileName)
        drawInevidualArtivle(text,textColor,backGroundColor)
        creatArticle(num,title, text, textColor, backGroundColor)
    }
    private fun drawArticle12() {
        num=12
        title=" לפני בראשית "
        fileName =  "atoraFile2"
        backGroundColor="#2BAE66"
        textColor="#ffffff"
        val text=createTextString(fileName)
        drawInevidualArtivle(text,textColor,backGroundColor)
        creatArticle(num,title, text, textColor, backGroundColor)
    }
    private fun drawArticle13() {
        num=13
        title=" המבנה הכללי של הקומות "
        fileName = "atoraFile3"
        backGroundColor="#0A174E"
        textColor="#F5D042"
        val text=createTextString(fileName)
        drawInevidualArtivle(text,textColor,backGroundColor)
        creatArticle(num,title, text, textColor, backGroundColor)
    }
    private fun drawArticle21() {
        num=21
        title="יחידה הבסיסית של המודעות"
        fileName =  "myText2"
        backGroundColor="#333D79"
        textColor="#ffffff"
        val text=createTextString(fileName)
        drawInevidualArtivle(text,textColor,backGroundColor)
        creatArticle(num,title, text, textColor, backGroundColor)
    }
    private fun drawArticle22() {
        num=22
        title="שיחות עם נחמן"
        fileName =  "myText3"
        backGroundColor="#333D79"
        textColor="#ffffff"
        val text=createTextString(fileName)
        drawInevidualArtivle(text,textColor,backGroundColor)
        creatArticle(num,title, text, textColor, backGroundColor)
    }
    private fun drawArticle23() {
        num=23
        title="עולמון"
        fileName =  "myText4"
        backGroundColor="#333D79"
        textColor="#ffffff"
        val text=createTextString(fileName)
        drawInevidualArtivle(text,textColor,backGroundColor)
        creatArticle(num,title, text, textColor, backGroundColor)
    }
    private fun drawArticle24() {
        num=24
        title="זה ש..."
        fileName =  "myText5"
        backGroundColor="#333D79"
        textColor="#ffffff"
        val text=createTextString(fileName)
        drawInevidualArtivle(text,textColor,backGroundColor)
        creatArticle(num,title, text, textColor, backGroundColor)
    }
    private fun drawArticle25() {
        num=25
        title="נקודת היווצרות החיים"
        fileName =  "myText6"
        backGroundColor="#333D79"
        textColor="#ffffff"
        val text=createTextString(fileName)
        drawInevidualArtivle(text,textColor,backGroundColor)
        creatArticle(num,title, text, textColor, backGroundColor)
    }
    private fun drawArticle26() {
        num=26
        title="המגבלה"
        fileName =  "myText7"
        backGroundColor="#333D79"
        textColor="#ffffff"
        val text=createTextString(fileName)
        drawInevidualArtivle(text,textColor,backGroundColor)
        creatArticle(num,title, text, textColor, backGroundColor)
    }
    private fun drawArticle27() {
        num=27
        title="  לשחות את החיים  "
        fileName =  "myText8"
        backGroundColor="#333D79"
        textColor="#ffffff"
        val text=createTextString(fileName)
        drawInevidualArtivle(text,textColor,backGroundColor)
        creatArticle(num,title, text, textColor, backGroundColor)
    }
    private fun drawArticle28() {
        num=28
        title="  חיים סופיים בעולם אינסופי  "
        fileName =  "myText9"
        backGroundColor="#333D79"
        textColor="#ffffff"
        val text=createTextString(fileName)
        drawInevidualArtivle(text,textColor,backGroundColor)
        creatArticle(num,title, text, textColor, backGroundColor)
    }
    private fun drawArticle29() {
        num=29
        title="  חיים טובים  "
        fileName =  "myText10"
        backGroundColor="#333D79"
        textColor="#ffffff"
        val text=createTextString(fileName)
        drawInevidualArtivle(text,textColor,backGroundColor)
        creatArticle(num,title, text, textColor, backGroundColor)
    }
    private fun drawArticle30() {
        num=29
        title="  על מבנה האדם  "
        fileName =  "myText11"
        backGroundColor="#333D79"
        textColor="#ffffff"
        val text=createTextString(fileName)
        drawInevidualArtivle(text,textColor,backGroundColor)
        creatArticle(num,title, text, textColor, backGroundColor)
    }
}


















/* drawGeneralAricle(11)
        drawGeneralAricle(12)
        drawGeneralAricle(13)
        drawGeneralAricle(21)
        drawGeneralAricle(22)
        drawGeneralAricle(23)
        drawGeneralAricle(24)*/

/* private fun drawGeneralAricle(index : Int) {
        var fileName = ""
        var backGroundColor = ""
         var textColor = ""
    when (index){
        11->{
            title="   המאמר הראשון  11"
             fileName = "atoraFile1"
            backGroundColor="#0A174E"
            textColor="#F5D042"
        }
        12 -> {
            title="המאמר שני  12"
            fileName =  "atoraFile2"
            backGroundColor="#2BAE66"
            textColor="#ffffff"
        }
        13 -> {
            title="המאמר שלישי 13"
            fileName = "atoraFile3"
            backGroundColor="#0A174E"
            textColor="#F5D042"
        }
        21 -> {
            title="יחידה הבסיסית של המודעות"
            fileName =  "myText2"
            backGroundColor="#333D79"
            textColor="#ffffff"
        }
        22 -> {
            title="נחמן - פרק ראשון"
            fileName =  "myText3"
            backGroundColor="#333D79"
            textColor="#ffffff"
        }
        23 -> {
            title="עולמון"
            fileName =  "myText4"
            backGroundColor="#333D79"
            textColor="#ffffff"
        }


        else -> {
            title="     000000המאמר הראשון"
            fileName = "atoraFile1"
            backGroundColor="#0A174E"
            textColor="#F5D042"
        }

    }
        val texti= applicationContext.assets
            .open(fileName)
            .bufferedReader().use {
                it.readText()
            }
        drawInevidualArtivle(texti,textColor,backGroundColor)
        creatArticle(index,title, texti, textColor, backGroundColor)
    }*/





/* override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
       binding = ActivityAddArticleBinding.inflate(layoutInflater)
       setContentView(binding.root)

   }
   fun loadArticles10() {
       aticleNum=10
       title = " זה המאמר הראשון "
       fileName = "atoraFile1"
       backGroundColor = "#0A174E"
       textColor = "#F5D042"
       val currentA=createArtice(aticleNum,title,fileName,backGroundColor,textColor)
       drawAricle(currentA)
   }

  private fun createArtice(articulN:Int,title: String, fileName: String, backGroundColor: String, textColor: String):Article {
       val article = Article()
       val article1=makeA(article,articulN,title, fileName, backGroundColor, textColor)
      *//* with(article) {
            aricleNum = articulN
            aricleTitle =title
            aricleText = applicationContext.assets
                .open(fileName)
                .bufferedReader().use {
                    it.readText()
                }
            articleBackground=backGroundColor
            articleTextColor=textColor
        }*//*
       return article1
    }

    private fun makeA(article: Article, articulN: Int, title: String, fileName: String, backGroundColor: String, textColor: String): Article {
        with(article) {
            aricleNum = articulN
            aricleTitle =title
            aricleText = applicationContext.assets
                .open(fileName)
                .bufferedReader().use {
                    it.readText()
                }
            articleBackground=backGroundColor
            articleTextColor=textColor
        }
        return article
    }

    private fun drawAricle(article: Article) {
        val backC=article.articleBackground
        val textC=article.articleTextColor
        val textT=article.aricleText
        binding.mainAddArticle.setBackgroundColor(Color.parseColor(backGroundColor))
        binding.tvAddArticle.setTextColor(Color.parseColor(textColor))
        binding.tvAddArticle.text=textT

    }


}*/

   /* fun loadArticles10() {
        val article = Article()
        with(article) {
            aricleNum = 10
            aricleTitle = " זה המאמר הראשון "
            aricleText = applicationContext.assets
                .open("myText2")
                .bufferedReader().use {
                    it.readText()
                }
            articleBackground="#0A174E"
            articleTextColor="#F5D042"
        }
          drawAricle(article)
    }*/

    /*private fun drawAricle(article: Article) {
        textColor=article.articleTextColor
        backGroundColor=article.articleBackground

         binding.mainAddArticle.setBackgroundColor(Color.parseColor(backGroundColor))
        binding.tvAddArticle.setTextColor(Color.parseColor(textColor))
        binding.tvAddArticle.text=article.aricleText

    }*/

/*    when (atoraIndex) {
            1 -> {
                fileName = "atoraFile1"
                backGroundColor="#0A174E"
                textColor="#F5D042"
            }
           2 -> {
                fileName =  "atoraFile2"
                backGroundColor="#2BAE66"
                textColor="#ffffff"
            }
            3 -> {
                  fileName = "atoraFile3"
                  backGroundColor="#0A174E"
                  textColor="#F5D042"
              }
            /*    4 -> {
                 fileName = "myText4"
                 backGroundColor="#333D79"
                 textColor="#ffffff"
             }
 */

            else -> {
                "v591"
                backGroundColor="#0A174E"
                textColor="#F5D042"
            }
        }
        binding.mainAtoraBackground           .setBackgroundColor(Color.parseColor(backGroundColor))
        binding.tvAtoraArticle.setTextColor(Color.parseColor(textColor))
        activateText()
    }

    private fun activateText() {
        binding.tvAtoraArticle.text = application.assets.open(fileName).bufferedReader().use {
            it.readText()
        }
    }*/