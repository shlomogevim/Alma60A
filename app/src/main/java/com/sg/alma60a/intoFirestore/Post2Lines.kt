package com.sg.alma60a

import android.app.Activity
import android.content.Context
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout



class Post2Lines(val context: Context) {

    private val layout: ConstraintLayout = (context as Activity).findViewById(R.id.itemLayoutFire)
    val drawPost= DrawPostCenter(context)
    val pref = context.getSharedPreferences(SHARPREF_ALMA, Context.MODE_PRIVATE)
    private val util= Utility()



    fun loadPost200() {
       val post = Post()
        with(post) {
            postNum = 200
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2014/09/16/01/19/girl-447701_1280.jpg"
            postText = arrayListOf(
                "אין בעיות בעולם",
                "חוץ מאלה שאצלך בראש."
            )
            val di =0
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, -1+du, 0, 32+di),
                arrayListOf(0, -1+du, 0, 0+di)
            )
            postBackground = "000000"
            postTransparency = 6
            val size1=24
            val size2=0
            postTextSize = arrayListOf(0, size1,size2)
            postPadding = arrayListOf(0, 0, 0, 0)
            val col =  "#ffffff"
            postTextColor = arrayListOf(CONSTANT, col)
            postFontFamily =200
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
       util.sendPostToStringFirestore(post)
    }

   fun loadPost201() {
        val post = Post()
     // util.logi("Post2Line   ========> /n 201A ")
        with(post) {
            postNum =201
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2017/11/04/14/25/pinocchio-2917652_1280.jpg"
            postText = arrayListOf(
                "  לאמת פנים רבות  ",
                "  אחד מהם הוא השקר."
            )
            val di = 0
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, 10+du, 0, -1+di),
                arrayListOf(0, 50+du, 0, -1+di)
            )
            postBackground = "263238"
            postTransparency = 2
            val size1=26
            postTextSize = arrayListOf(0, size1)
            postPadding = arrayListOf(0, 0, 0, 0)
            val col = "#a7aba8"
            postTextColor = arrayListOf(CONSTANT, col)
            postFontFamily =100
            postRadiuas = 5
        }
      //util.logi("Post2Line   ========> /n 201B  post=$post ")
        drawPost.drawPostFire(post,layout)
      util.sendPostToStringFirestore(post)
    }

     fun loadPost202() {
           val post = Post()
          with(post) {
              postNum = 202
              lineNum = 2
              imageUri = "https://cdn.pixabay.com/photo/2017/12/16/22/22/bora-bora-3023437_1280.jpg"
              postText = arrayListOf(
                  "כל חלום מפסיק להיות כזה",
                  "ברגע שהוא הופך לשגרה."
              )
              val di = 0
              val du=0
              postMargin =  arrayListOf(
                  arrayListOf(0, -1+du, 0, 45+di),
                  arrayListOf(0, -1+du, 0, 10+di)
              )
              postTransparency =3
              postTextSize = arrayListOf(0, 28)
              val  backgroundColor = "#0A174E"
              val textColor = "#F5D042"
              postFontFamily =110

              postBackground =util. improveColorString(backgroundColor)
              val textcolo=util.improveColorString(textColor)
              val col = "#$textcolo"
              postTextColor = arrayListOf(CONSTANT, col)
              postPadding = arrayListOf(5, 0, 5, 0)
              postRadiuas = 15

          }
     //  util.logi("Post2Line   ========> /n 201B  post=$post ")
        drawPost.drawPostFire(post,layout)
       util.sendPostToStringFirestore(post)
      }
fun loadPost203() {
        val post = Post()
        with(post) {
            postNum = 203
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2018/02/13/22/02/light-3151723_1280.jpg"
            postText = arrayListOf(
                "ונתתי את האור וחושך לפניך",
                "ובחרת באור."
            )
            val di = 0
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, -1+du, 0, 60+di),
                arrayListOf(0, -1+du, 0, 10+di)
            )
            postBackground = "263238"
            postTransparency =4
            val size1=25
            postTextSize = arrayListOf(0, size1)
            postPadding = arrayListOf(0, 0, 0, 0)
            val col ="#f6ff03"
            postTextColor = arrayListOf(CONSTANT, col)
            postFontFamily =501
            postRadiuas = 15
        }
    drawPost.drawPostFire(post,layout)
    util.sendPostToStringFirestore(post)
    }

  fun loadPost204() {
     val post = Post()
     with(post) {
         postNum = 204
         lineNum = 2
         imageUri = "https://cdn.pixabay.com/photo/2021/01/09/21/09/antelope-5903514_1280.jpg"
         postText = arrayListOf(
             "אם אתה לא יכול להטיב את המצב",
             "אז על תתערב."
         )
         val di = 20
         postMargin = arrayListOf(
             arrayListOf(0, 0 + di, 0, -1),
             arrayListOf(0, 35 + di, 0, -1)
         )
         postBackground = "07553B"
         postTransparency =9
         postTextSize = arrayListOf(0, 18)
         postPadding = arrayListOf(10, 7, 10, 7)
         val col = "#CED46A"
         val col1 = "#CED46A"
         postTextColor = arrayListOf(CONSTANT, col, col1, col1)
         postFontFamily = 600
         postRadiuas = 15
     }
      drawPost.drawPostFire(post,layout)
      util.sendPostToStringFirestore(post)
 }
    fun loadPost205() {
     val post = Post()
     with(post) {
         postNum = 205
         lineNum = 2
         imageUri = "https://cdn.pixabay.com/photo/2020/01/06/10/16/theravada-buddhism-4745053_1280.jpg"
         postText =  arrayListOf(
             "אי עשייה גוררת  אי עשייה ,",
             "עשייה גוררת  עשייה."
         )
         val di = 20
         postMargin = arrayListOf(
             arrayListOf(0, 0+di, 0, -1),
             arrayListOf(0, 45+di, 0, -1)
         )
         postBackground = "000000"
         postTransparency = 6
         postTextSize =  arrayListOf(0, 26)
         postPadding = arrayListOf(10, 0, 10, 0)
         val col = "#ffffff"
         val col1 = "#ffffff"
         postTextColor = arrayListOf(CONSTANT, col, col1, col1)
         postFontFamily = 4
         postRadiuas = 15
     }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
 }
    fun loadPost206() {
        val post = Post()
        with(post) {
            postNum = 206
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2020/06/26/08/28/soil-5342049_1280.jpg"
            postText =  arrayListOf(
                "ככל  שהחיים נעשים שבירים יותר,",
                " כך הם  מובנים יותר. "
            )
            val di = 0
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, -1+du, 0, 50+di),
                arrayListOf(0, -1+du, 0, 10+di)
            )
            postBackground = "101820"
            postTransparency = 8
            postTextSize =  arrayListOf(0, 26)
            postPadding = arrayListOf(0, 5, 0, 5)
            val col = "#fcc729"
            val col1 = "#143d59"
            postTextColor = arrayListOf(CONSTANT, col, col1, col1)
            postFontFamily =200
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }
    fun loadPost207() {
        val post = Post()
        with(post) {
            postNum = 207
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2020/01/14/19/09/crayon-4766037_1280.jpg"
            postText =  arrayListOf(
                " האלוהים ברא את היצירה ",
                " האדם  את  הביקורת. "
            )
            val di = 0
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, -1+du, 0, 45+di),
                arrayListOf(0, -1+du, 0, 10+di)
            )
            postBackground = "337def"
            postTransparency = 4
            postTextSize =  arrayListOf(0, 26)
            postPadding = arrayListOf(0, 0, 0, 0)
            val col = "#fcc729"
            val col1 = "#143d59"
            postTextColor = arrayListOf(CONSTANT, col, col1, col1)
            postFontFamily =200
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }
    fun loadPost208() {
        val post = Post()
        with(post) {
            postNum = 208
            lineNum = 2
            imageUri  ="https://cdn.pixabay.com/photo/2020/05/25/17/03/travel-5219496_1280.jpg"
            postText =  arrayListOf(
                "אתה בוחר מן הסתם להגיע למקומות מסוימים,",
                "אבל החיים בוחרים לך את סוג החוויה שם."
            )
            val di = 0
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, 10+du, 0, -1+di),
                arrayListOf(0, -1+du, 0, 10+di)
            )
            postTransparency =5
            postTextSize = arrayListOf(0, 18)
            val  backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily =300

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5, 5, 5, 5)
            postRadiuas = 15




        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }
    fun loadPost209() {
        val post = Post()
        with(post) {
            postNum = 209
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2016/06/23/21/04/fool-1476189_1280.jpg"
            postText =  arrayListOf(
                "זה שאתה באמת מאמין בהבלים,",
                "זה לא עושה אותם פחות הבלים."     )
            val di = 0
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, -1+du, 0, 85+di),
                arrayListOf(0, -1+du, 0, 0+di)
            )
            postTextSize =  arrayListOf(0, 30)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =6
            postBackground = "#030e4f"
            val textColor = "f49f1c"
            postTextColor = arrayListOf(CONSTANT, "$textColor")
            postFontFamily =200
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }
    fun loadPost210() {
        val post = Post()
        with(post) {
            postNum = 210
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2015/08/09/19/29/people-882078_1280.jpg"
            postText =  arrayListOf(
                " חכם לא עושה דברים ",
                " שטיפש סובל מהם על בסיס קבוע. "    )
            val di = 30
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, -1+du, 0, 40+di),
                arrayListOf(0, -1+du, 0, 0+di)
            )
            postTextSize =  arrayListOf(0, 16)
            postPadding = arrayListOf(0, 5, 0, 0)
            postTransparency = 8
            postBackground = "000000"
            val textColor = "ffffff"
            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postFontFamily =103
            postRadiuas = 15
            lineSpacing=1.2f
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }
    fun loadPost211() {
        val post = Post()
        with(post) {
            postNum = 211
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2017/08/16/03/04/chimp-2646308_1280.jpg"
            postText =  arrayListOf(
                " הטיפש בטוח בחכמתו ",
                " החכם בטוח בטיפשוטו. "  )
            val di = 0
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, -1+du, 0, 55+di),
                arrayListOf(0, -1+du, 0, 10+di)
            )
            postTextSize =  arrayListOf(0, 22)
            postPadding = arrayListOf(0, 0, 0, 0)
            postTransparency = 0
            postBackground = "#616247"
            val textColor = "#DAA03D"
            postTextColor = arrayListOf(CONSTANT, "$textColor")
            postFontFamily =103
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }
    fun loadPost212() {
        val post = Post()
        with(post) {
            postNum = 212
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2018/02/21/16/59/human-3170876_1280.jpg"
            postText =  arrayListOf(
                "   להיתפס כטמבל בעיני עצמך   ",
                " זה הרבה יותר גרוע מלהיות טמבל. "  )
            val di = 0
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, 0+du, 0, -1+di),
                arrayListOf(0, -1+du, 0, 0+di)
            )
            postTextSize =  arrayListOf(0, 22)
            postTransparency =7
            postBackground = "#2C5F2D"
            val textColor = "#FFE77A"
            postFontFamily =300

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(0, 5, 0, 5)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }
    fun loadPost213() {
        val post = Post()
        with(post) {
            postNum = 213
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2016/09/21/04/46/barley-field-1684052_1280.jpg"
            postText =  arrayListOf(
                "אתה לא יכול להרוויח משהו אמיתי בחיים האלה,",
                "פרט לזכות הזאת לחיות את הרגע הזה." )
            val di =10
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, 0+di, 0, -1),
                arrayListOf(0, 90+di, 0, -1)
            )
            postTextSize =  arrayListOf(0, 18)
            postTransparency = 0
            postBackground = "bdfff6"
            val textColor = "#2C5F2D"
            postFontFamily =410

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }
    fun loadPost214() {
        val post = Post()
        with(post) {
            postNum = 214
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2020/02/19/09/34/health-4861815_1280.jpg"
            postText =  arrayListOf(
                " אתה לא מספיק טוב ",
                " כדי להבין כמה טוב. "
            )
            val di =5
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, -1+du, 0, 45+di),
                arrayListOf(0, -1+du, 0, 10+di)
            )
            postTextSize =  arrayListOf(0, 22)
            postTransparency =0
            postBackground = "bdfff6"
            val textColor = "ffffff"
            postFontFamily =300

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

     fun loadPost215() {
        val post = Post()
        with(post) {
            postNum = 215
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2015/05/02/18/15/church-750251_1280.jpg"
            postText =  arrayListOf(
                " הימים הנוראים לא כל כך נוראיים, ",
                " סתם יצא להם שם שכזה. "
            )
            val di =5
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, -1+du, 0, 35+di),
                arrayListOf(0, -1+du, 0, 10+di)
            )
            postTextSize =  arrayListOf(0, 18)
            postTransparency =5
            postBackground = "000000"
            val textColor = "ffffff"
            postFontFamily =300

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }
    fun loadPost216() {
        val post = Post()
        with(post) {
            postNum = 216
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2016/08/21/18/43/smilies-1610505_1280.jpg"
            postText =  arrayListOf(
                "החיים טובים",
                "למי שטוב לעצמו"
            )
            val di =20
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, -1+du, 0, 55+di),
                arrayListOf(0, -1+du, 0, 10+di)
            )
            postTextSize =  arrayListOf(0, 30)
            postTransparency =0
            postBackground = "bdfff6"
            val textColor = "ffffff"
            postFontFamily =300

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost217() {
        val post = Post()
        with(post) {
            postNum = 217
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2015/06/28/12/20/happiness-824419_1280.jpg"
            postText =  arrayListOf(
                "החיים לא שווים הרבה",
                "אם לא חיים אותם."
            )
            val di =20
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, 0+di, 0, -1),
                arrayListOf(0, 35+di, 0, -1)
            )
            postTextSize =  arrayListOf(0, 24)
            postTransparency =0
            postBackground = "#FDDB27"
            val textColor = "#00B1D2"
            postFontFamily =300

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(5, 0, 5, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

     fun loadPost218() {
        val post = Post()
        with(post) {
            postNum = 218
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2018/05/28/02/08/diary-3435095_1280.jpg"
            postText =  arrayListOf(
                "מילים יכולות לפתוח לך עולמות",
                "התחכמויות סוגרות לך עולמות."
            )
            val di =10
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, 0+di, 0, -1),
                arrayListOf(0, 70+di, 0, -1)
            )
            postTextSize =  arrayListOf(0, 24)
            postTransparency =10
            postBackground = "#9FC131"
            val textColor = "#eedfe2"
            postFontFamily =300

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(0, 5, 0,5)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }
     fun loadPost219() {
        val post = Post()
        with(post) {
            postNum = 219
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2020/09/29/12/51/man-5612736_1280.jpg"
            postText =  arrayListOf(
                "משתדל שלא להילחם עם החיים",
                "למרות שאני תמיד צודק."
            )
            val di =20
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, -1+du, 0, 45+di),
                arrayListOf(0, -1+du, 0, 10+di)
            )
            postTextSize =  arrayListOf(0, 16)
            postTransparency =5
            postBackground = "0D47A1"
            val textColor = "ffffff"
            postFontFamily =300

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(5, 5, 5, 5)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost220() {
        val post = Post()
        with(post) {
            postNum = 220
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2020/01/01/14/59/person-4733756_1280.jpg"
            postText =  arrayListOf(
                "האדם",
                "הוא מה שהוא חושב שהוא."
            )
            val di =0
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, -1+du, 0, 70+di),
                arrayListOf(0, -1+du, 0, 0+di)
            )
            postTextSize =  arrayListOf(0, 22)
            postTransparency =0
            postBackground = "0D47A1"
            val textColor = "ffffff"
            postFontFamily =300

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost221() {
        val post = Post()
        with(post) {
            postNum = 221
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2016/11/18/19/15/animal-1836482_1280.jpg"
            postText =  arrayListOf(
                "זה שהחילזון רואה את השמים",
                "זה לא עושה אותו פחות חילזון."
            )
            val di =0
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, 10+du, 0, -1+di),
                arrayListOf(0, -1+du, 0, 10+di)
            )
            postTextSize =  arrayListOf(0, 22)
            postTransparency =0
            postBackground = "0D47A1"
            val textColor = "ffffff"
            postFontFamily =300

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost222() {
        val post = Post()
        with(post) {
            postNum = 222
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2017/05/09/16/06/windsurfing-2298647_1280.jpg"
            postText =  arrayListOf(
                "אם זה נכון בשבילך",
                "כל טרחה שווה."
            )
            val di =0
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, 20+du, 0, -1+di),
                arrayListOf(0, 50+du, 0, -1+di)
            )

            postTransparency =2
            postTextSize = arrayListOf(0, 24)
            postBackground = "1E4174"
            val textColor = "DDA94B"
            postFontFamily =110

            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15
               }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost223() {
        val post = Post()
        with(post) {
            postNum = 223
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2020/08/23/16/11/abstract-5511271_1280.jpg"
            postText =  arrayListOf(
                "החיים זה מרחב אינסופי",
                "שבו גם אתה קורה."
            )
            val di =0
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, 20+du, 0, -1+di),
                arrayListOf(0, 50+du, 0, -1+di)
            )

            postTransparency =2
            postTextSize = arrayListOf(0, 24)
            postBackground = "1E4174"
            val textColor = "DDA94B"
            postFontFamily =200

            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost224() {
        val post = Post()
        with(post) {
            postNum = 224
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2017/02/15/11/51/forest-2068376_1280.jpg"
            postText =  arrayListOf(
                "החיים הם הרבה יותר",
                "מהסיפור שאתה מספר לעצמך עליהם."
            )
            val di =60
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, -1+du, 0, 80+di),
                arrayListOf(0, -1+du, 0, 10+di)
            )

            postTransparency =0
            postTextSize = arrayListOf(0, 24)
            postBackground = "1E4174"
            val textColor = "ffffff"
            postFontFamily =200

            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }


    fun loadPost225() {
        val post = Post()
        with(post) {
            postNum = 225
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2017/04/05/18/04/brick-2205882_1280.jpg"
            postText =  arrayListOf(
                "רגשות אשמה זה המקום,",
                "בו אתה לא מקבל את מה שאתה."
            )
            val di =5
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, -1+du, 0, 65+di),
                arrayListOf(0, -1+du, 0, 10+di)
            )

             postTransparency =10
           postTextSize = arrayListOf(0, 18)
           val  backgroundColor = "#F5D042"
           val textColor = "#0A174E"
           postFontFamily =300

           postBackground =util. improveColorString(backgroundColor)
           val textcolo=util.improveColorString(textColor)
           val col = "#$textcolo"
           postTextColor = arrayListOf(CONSTANT, col)
           postPadding = arrayListOf(5, 5, 5, 5)
           postRadiuas = 15

        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost226() {
        val post = Post()
        with(post) {
            postNum = 226
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2014/08/09/15/45/sky-414199_1280.jpg"
            postText =  arrayListOf(
                "מי שאין לו קצת עננים מעליו מעליו",
                "קרינת השמש שורפת לו את המחשבה."
            )
            val di =20
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, -1+du, 0, 75+di),
                arrayListOf(0, -1+du, 0, 10+di)
            )
            postTransparency =7
            postTextSize = arrayListOf(0, 18)
            val  backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily =300

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5, 5, 5, 5)
            postRadiuas = 15
         }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost227() {
        val post = Post()
        with(post) {
            postNum = 227
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2013/06/26/19/23/intravenous-141551_1280.jpg"
            postText =  arrayListOf(
                "מעדיף תיסכולים דמיוניים של אדם בריא",
                "על תסכולים אמתיים של אדם חולה."
            )
            val di =0
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, -1+du, 0, 75+di),
                arrayListOf(0, -1+du, 0, 10+di)
            )
            postTransparency =7
            postTextSize = arrayListOf(0, 18)
            val  backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily =300

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5, 5, 5, 5)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost228() {
        val post = Post()
        with(post) {
            postNum = 228
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2016/07/01/09/26/texting-1490691_1280.jpg"
            postText =  arrayListOf(
                "במקום שבו כולם חרשים",
                "מי ששומע חריג."
            )
            val di =0
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, -1+du, 0,45  +di),
                arrayListOf(0, -1+du, 0, 10+di)
            )
            postTransparency =2
            postTextSize = arrayListOf(0, 22)
            val  backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily =300

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5, 0,5, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost229() {
        val post = Post()
        with(post) {
            postNum = 229
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2017/03/26/15/41/girl-2175843_1280.jpg"
            postText =  arrayListOf(
                "אחד המכשולים הגדולים של החיים",
                "  הוא חוסר במכשולים.  "
            )
            val di =0
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, 10+du, 0,-1  +di),
                arrayListOf(0, 80+du, 0, -1+di)
            )
            postTransparency =6
            postTextSize = arrayListOf(0, 24)
            val  backgroundColor = "#F0EDCC"
            val textColor = "#02343F"
            postFontFamily =200

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0,0, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost230() {
        val post = Post()
        with(post) {
            postNum = 230
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2013/11/28/10/36/road-220058_1280.jpg"
            postText =  arrayListOf(
                "הדרך לגיהנום",
                "רצופה בחוסר מודעות."
            )
            val di =0
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, 10+du, 0,-1  +di),
                arrayListOf(0, 50+du, 0, -1+di)
            )
            postTransparency =8
            postTextSize = arrayListOf(0, 27)
            val  backgroundColor = "#F0EDCC"
            val textColor = "#02343F"
            postFontFamily =200

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5,0,5, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost231() {
        val post = Post()
        with(post) {
            postNum = 231
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2015/07/14/19/47/hand-845269_1280.jpg"
            postText =  arrayListOf(
                "הדברים שאתה יוצר",
                "יוצרים אותך."
            )
            val di =0
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, 10+du, 0,-1  +di),
                arrayListOf(0, 50+du, 0, -1+di)
            )
            postTransparency =0
            postTextSize = arrayListOf(0, 27)
            val  backgroundColor = "#80634C"
            val textColor = "#1AAFBC"
            postFontFamily =200

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5,0,5, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost232() {
        val post = Post()
        with(post) {
            postNum = 232
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2020/11/25/09/30/girls-5775077_1280.jpg"
            postText =  arrayListOf(
                "הכישרון הכי כיפי שאני מכיר",
                "זה היכולת להינות גם מקלישאות."
            )
            val di =0
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, 10+du, 0,-1  +di),
                arrayListOf(0, 40+du, 0, -1+di)
            )
            postTransparency =10
            postTextSize = arrayListOf(0, 22)
            val  backgroundColor = "#EEA47F"
            val textColor = "#00539C"
            postFontFamily =200

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5,0,5, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost233() {
        val post = Post()
        with(post) {
            postNum = 233
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2016/11/23/17/31/boy-1853960_1280.jpg"
            postText =  arrayListOf(
                "מה שאתה עושה מהחיים",
                "זה מה שהם בשבילך."
            )
            val di =0
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, 10+du, 0,-1  +di),
                arrayListOf(0, 45+du, 0, -1+di)
            )
            postTransparency =8
            postTextSize = arrayListOf(0, 25)
            val  backgroundColor = "#EEA47F"
            val textColor = "#00539C"
            postFontFamily =200

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5,0,5, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost234() {
        val post = Post()
        with(post) {
            postNum = 234
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2020/10/14/22/32/buildings-5655593_1280.jpg"
            postText =  arrayListOf(
                "הבעיה המרכזית של בני האדם",
                "היא בהיותם בני אדם."
            )
            val di =0
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, 10+du, 0,-1  +di),
                arrayListOf(0, 45+du, 0, -1+di)
            )
            postTransparency =7
            postTextSize = arrayListOf(0, 23)
            val  backgroundColor = "#EEA47F"
            val textColor = "#00539C"
            postFontFamily =110

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5,0,5, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost235() {
        val post = Post()
        with(post) {
            postNum = 235
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2017/10/09/02/06/hands-2832239_1280.jpg"
            postText =  arrayListOf(
                "שתיצור בחיים",
                "יותר מאשר החיים יצרו אותך."
            )
            val di =0
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, 10+du, 0,-1  +di),
                arrayListOf(0, 55+du, 0, -1+di)
            )
            postTransparency =7
            postTextSize = arrayListOf(0, 23)
            val  backgroundColor = "#ADEFD1"
            val textColor = "#00203F"
            postFontFamily =100

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5,0,5, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost236() {
        val post = Post()
        with(post) {
            postNum = 236
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2019/12/05/20/55/woman-4676131_1280.jpg"
            postText =  arrayListOf(
                "אתה לא צריך להיות טיפש",
                "כדי לדבר בטיפשות."
            )
            val di =0
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, 10+du, 0,-1  +di),
                arrayListOf(0, 55+du, 0, -1+di)
            )
            postTransparency =3
            postTextSize = arrayListOf(0, 23)
            val  backgroundColor = "#815854"
            val textColor = "#F9EBDE"
            postFontFamily =100

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5,0,5, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost237() {
        val post = Post()
        with(post) {
            postNum = 237
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2020/04/07/04/17/desperate-5011953_1280.jpg"
            postText =  arrayListOf(
                "אל תעסוק הרבה במחשבות שלך",
                "הם מסתדרות יפה מאוד גם בלעדיך."
            )
            val di =20
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, -1+du, 0,45  +di),
                arrayListOf(0, -1+du, 0, 0+di)
            )
            postTransparency =10
            postTextSize = arrayListOf(0, 23)
            val  backgroundColor = "#F0EDCC"
            val textColor = "#02343F"
            postFontFamily =141

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5,0,5, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost238() {
        val post = Post()
        with(post) {
            postNum = 238
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2017/11/27/07/02/time-2980690_1280.jpg"
            postText =  arrayListOf(
                "  זמן פנוי יכול להיות הרסני  ",
                "  למי שיש לו רק זמן פנוי.  "
            )
            val di =0
            val du=20
            postMargin =  arrayListOf(
                arrayListOf(0, 0+du, 0,-1  +di),
                arrayListOf(0,40+du, 0, -1+di)
            )
            postTransparency =10
            postTextSize = arrayListOf(0, 23)
            val  backgroundColor = "#F0EDCC"
            val textColor = "#02343F"
            postFontFamily =110

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10,5,10, 5)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost239() {
        val post = Post()
        with(post) {
            postNum = 239
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2012/02/22/20/07/book-15584_1280.jpg"
            postText =  arrayListOf(
                " החיים זה דבר משעמם ",
                "  לאנשים שלא מבינים בזה.  "
            )
            val di =0
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, -1+du, 0,55  +di),
                arrayListOf(0, -1+du, 0, 10+di)
            )
            postTransparency =10
            postTextSize = arrayListOf(0, 23)
            val  backgroundColor = "#F0EDCC"
            val textColor = "#02343F"
            postFontFamily =100

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10,5,10, 5)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost240() {
        val post = Post()
        with(post) {
            postNum = 240
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2016/01/26/09/09/merry-1162081_1280.jpg"
            postText =  arrayListOf(
                " גם מחצי כוס ריקה ",
                "  אפשר לשתות לרוויה.  "
            )
            val di =0
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, -1+du, 0,55  +di),
                arrayListOf(0, -1+du, 0, 10+di)
            )
            postTransparency =10
            postTextSize = arrayListOf(0, 26)
            val  backgroundColor = "#343148"
            val textColor = "#D7C49E"
            postFontFamily =110

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10,5,10, 5)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

fun loadPost241() {
    val post = Post()
    with(post) {
        postNum = 241
        lineNum = 2
        imageUri ="https://cdn.pixabay.com/photo/2019/03/17/12/57/phone-4060860_1280.jpg"
        postText =  arrayListOf(
            " אתה לא יכול לשחק משחק ",
            "  שאתה מתנכר לכללים שלו.  "
        )
        val di =0
        val du=0
        postMargin =  arrayListOf(
            arrayListOf(0, -1+du, 0,50  +di),
            arrayListOf(0, -1+du, 0, 0+di)
        )
        postTransparency =6
        postTextSize = arrayListOf(0, 22)
        val  backgroundColor = "#343148"
        val textColor = "#D7C49E"
        postFontFamily =100

        postBackground =util. improveColorString(backgroundColor)
        val textcolo=util.improveColorString(textColor)
        val col = "#$textcolo"
        postTextColor = arrayListOf(CONSTANT, col)
        postPadding = arrayListOf(0,5,0, 5)
        postRadiuas = 15
    }
    drawPost.drawPostFire(post,layout)
    util.sendPostToStringFirestore(post)
}

    fun loadPost242() {
        val post = Post()
        with(post) {
            postNum = 242
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2017/07/31/08/12/dogs-2556820_1280.jpg"
            postText =  arrayListOf(
                " וויכוחים פוליטיים ",
                "  היא הרכילות של אנשים רציניים.  "
            )
            val di =0
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, -1+du, 0,50  +di),
                arrayListOf(0, -1+du, 0, 0+di)
            )
            postTransparency =3
            postTextSize = arrayListOf(0, 22)
            val  backgroundColor = "#343148"
            val textColor = "#D7C49E"
            postFontFamily =100

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,5,0, 5)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost243() {
        val post = Post()
        with(post) {
            postNum = 243
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2016/11/29/05/32/rooster-1867562_1280.jpg"
            postText =  arrayListOf(
                " כל מה שאתה חושב על העולם, ",
                "  זה רק מה שאתה חושב על העולם.  "
            )
            val di =0
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, -1+du, 0,90  +di),
                arrayListOf(0, -1+du, 0, 0+di)
            )
            postTransparency =6
            postTextSize = arrayListOf(0, 24)
            val  backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily =130

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,5,0, 5)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

 fun loadPost244() {
        val post = Post()
        with(post) {
            postNum = 244
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2016/11/18/16/16/teddy-bear-1835598_1280.jpg"
            postText =  arrayListOf(
                " שתתבאס פחות על דברים ",
                " שאתה בכלל לא צריך להתבאס מהם.  "
            )
            val di =0
            val du=20
            postMargin =  arrayListOf(
                arrayListOf(0, 0+du, 0,-1  +di),
                arrayListOf(0,30+du, 0, -1+di)
            )
            postTransparency =6
            postTextSize = arrayListOf(0, 18)
            val  backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily =101

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,5,0, 5)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

fun loadPost245() {
    val post = Post()
    with(post) {
        postNum = 245
        lineNum = 2
        imageUri ="https://cdn.pixabay.com/photo/2021/08/20/17/16/dna-6560897_1280.jpg"
        postText =  arrayListOf(
            " האדם הוא מוטציה ",
            " של יצור הגיוני.  "
        )
        val di =0
        val du=20
        postMargin =  arrayListOf(
            arrayListOf(0, 0+du, 0,-1  +di),
            arrayListOf(0,35+du, 0, -1+di)
        )
        postTransparency =6
        postTextSize = arrayListOf(0, 22)
        val  backgroundColor = "#0A174E"
        val textColor = "#F5D042"
        postFontFamily =101

        postBackground =util. improveColorString(backgroundColor)
        val textcolo=util.improveColorString(textColor)
        val col = "#$textcolo"
        postTextColor = arrayListOf(CONSTANT, col)
        postPadding = arrayListOf(0,5,0, 5)
        postRadiuas = 15
    }
    drawPost.drawPostFire(post,layout)
    util.sendPostToStringFirestore(post)
}

    fun loadPost246() {
        val post = Post()
        with(post) {
            postNum = 246
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2014/09/21/17/56/mountaineering-455338_1280.jpg"
            postText =  arrayListOf(
                " למציאות פרשנויות רבות ",
                " לאגו פרשנות אחת.  "
            )
            val di =10
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, -1+du, 0,35  +di),
                arrayListOf(0, -1+du, 0, 0+di)
            )
            postTransparency =4
            postTextSize = arrayListOf(0, 18)
            val  backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily =101

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,5,0, 5)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost247() {
        val post = Post()
        with(post) {
            postNum = 247
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2016/04/14/11/01/jerusalem-1328645_1280.jpg"
            postText =  arrayListOf(
                " הציונות בת יותר ממאה שנים ",
                " והיא באמת נראית ככה.  "
            )
            val di =15
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, -1+du, 0,40  +di),
                arrayListOf(0, -1+du, 0, 0+di)
            )
            postTransparency =7
            postTextSize = arrayListOf(0, 22)
            val  backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily =110

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,5,0, 5)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost248() {
        val post = Post()
        with(post) {
            postNum = 248
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2012/12/19/18/13/waiting-71011_1280.jpg"
            postText =  arrayListOf(
                " יום חדש הוא כמו יום האתמול ",
                " אם אתה נשאר מה שהיית אתמול.  "
            )
            val di =15
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, -1+du, 0,55  +di),
                arrayListOf(0, -1+du, 0, 0+di)
            )
            postTransparency =6
            postTextSize = arrayListOf(0,18)
            val  backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily =101

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0,0, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost249() {
        val post = Post()
        with(post) {
            postNum = 249
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2014/12/15/13/40/smartphone-569076_1280.jpg"
            postText =  arrayListOf(
                " מי שלא רץ אחרי סיפורים ",
                " לא נפגע מבדותות.  "
            )
            val di =15
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, -1+du, 0,40  +di),
                arrayListOf(0, -1+du, 0, 0+di)
            )
            postTransparency =8
            postTextSize = arrayListOf(0,18)
            val  backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily =101

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,5,0, 10)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }
        fun loadPost250() {
        val post = Post()
        with(post) {
            postNum = 250
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2016/07/01/09/26/mobile-phones-1490691_1280.jpg"
            postText =  arrayListOf(
                " שאתה מתייחס להבלים ",
                " אתה עוסק בהבלים. "
            )
            val di =0
            val du=20
            postMargin =  arrayListOf(
                arrayListOf(0, 0+du, 0,-1  +di),
                arrayListOf(0,35+du, 0, -1+di)
            )
            postTransparency =8
            postTextSize = arrayListOf(0,18)
            val  backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily =101

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,5,0, 5)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }
     fun loadPost251() {
        val post = Post()
        with(post) {
            postNum = 251
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2017/01/12/17/30/warm-and-cozy-1975215_1280.jpg"
            postText =  arrayListOf(
                " הנוחות לאורך זמן ",
                " הופכת ללא נוחה. "
            )
            val di =0
            val du=20
            postMargin =  arrayListOf(
                arrayListOf(0, 0+du, 0,-1  +di),
                arrayListOf(0,65+du, 0, -1+di)
            )
            postTransparency =8
            postTextSize = arrayListOf(0,30)
            val  backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily =100

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,5,0, 5)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost252() {
        val post = Post()
        with(post) {
            postNum = 252
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2017/11/19/07/30/girl-2961959_1280.jpg"
            postText =  arrayListOf(
                " שמור אותי מעוגמות הנפש שלי, ",
                " עם החיים עצמם אסתדר כבר בעצמי. "
            )
            val di =0
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, -1+du, 0,75  +di),
                arrayListOf(0, -1+du, 0, 0+di)
            )
            postTransparency =8
            postTextSize = arrayListOf(0,22)
            val  backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily =100

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0,0, 5)
            postRadiuas = 15
            lineSpacing=0.9f
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }
        fun loadPost253() {
        val post = Post()
        with(post) {
            postNum = 253
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2018/02/16/14/38/portrait-3157821_1280.jpg"
            postText =  arrayListOf(
                " אתה לא תמיד הכי מוצלח ",
                " אבל אתה תמיד הכי אתה. "
            )
            val di =0
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, -1+du, 0,45  +di),
                arrayListOf(0, -1+du, 0, 0+di)
            )
            postTransparency =5
            postTextSize = arrayListOf(0,26)
            val  backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily =100

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0,0, 0)
            postRadiuas = 15
            lineSpacing=0.9f
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost254() {
        val post = Post()
        with(post) {
            postNum = 254
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2014/02/24/14/51/lonely-273629_1280.jpg"
            postText =  arrayListOf(
                " השמים הגבוהים לא שימושיים ",
                " למי שחי בתוך המחשבות שלו. "
            )
            val di =20
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, -1+du, 0,45  +di),
                arrayListOf(0, -1+du, 0, 0+di)
            )
            postTransparency =0
            postTextSize = arrayListOf(0,22)
            val  backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily =100

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0,0, 0)
            postRadiuas = 15
            lineSpacing=0.9f
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost255() {
        val post = Post()
        with(post) {
            postNum = 255
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2014/03/22/22/17/phone-292994_1280.jpg"
            postText =  arrayListOf(
                " הלבד ",
                " זה הביחד החדש. "
            )
            val di =20
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, -1+du, 0,35  +di),
                arrayListOf(0, -1+du, 0, 0+di)
            )
            postTransparency =5
            postTextSize = arrayListOf(0,24)
            val  backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily =100

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0,0, 0)
            postRadiuas = 15
            lineSpacing=0.9f
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost256() {
        val post = Post()
        with(post) {
            postNum = 256
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2016/09/27/02/11/cemetery-1697469_1280.jpg"
            postText =  arrayListOf(
                " שאתה נוכח בשקט",
                " אתה יוצר שקט בך. "
            )
            val di =0
            val du=20
            postMargin =  arrayListOf(
                arrayListOf(0, 0+du, 0,-1  +di),
                arrayListOf(0,45+du, 0, -1+di)
            )
            postTransparency =4
            postTextSize = arrayListOf(0,24)
            val  backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily =100

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0,0, 0)
            postRadiuas = 15
            lineSpacing=0.9f
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost257() {
        val post = Post()
        with(post) {
            postNum = 257
            lineNum = 2
            imageUri ="https://cdn.pixabay.com/photo/2016/06/06/21/53/child-1440526_1280.jpg"
            postText =  arrayListOf(
                " אם תצליח לוותר על שניתן לוותר ",
                " תוכל להתחיל מנקודת ההתחלה. "
            )
            val di =0
            val du=20
            postMargin =  arrayListOf(
                arrayListOf(0, 0+du, 0,-1  +di),
                arrayListOf(0,45+du, 0, -1+di)
            )
            postTransparency =10
            postTextSize = arrayListOf(0,22)
            val  backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily =100

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,5,0,5)
            postRadiuas = 15
            lineSpacing=0.9f
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }
fun loadPost258() {
    val post = Post()
    with(post) {
        postNum = 258
        lineNum = 2
        imageUri ="https://cdn.pixabay.com/photo/2020/06/18/18/48/highway-5314645_1280.jpg"
        postText =  arrayListOf(
            " אין חופש אמיתי ",
            " ללא חרדה מהבלתי ידוע. "
        )
        val di =0
        val du=20
        postMargin =  arrayListOf(
            arrayListOf(0, 0+du, 0,-1  +di),
            arrayListOf(0,50+du, 0, -1+di)
        )
        postTransparency =0
        postTextSize = arrayListOf(0,22)
        val  backgroundColor = "#ACC7B4"
        val textColor = "#331B3F"
        postFontFamily =100

        postBackground =util. improveColorString(backgroundColor)
        val textcolo=util.improveColorString(textColor)
        val col = "#$textcolo"
        postTextColor = arrayListOf(CONSTANT, col)
        postPadding = arrayListOf(0,5,0,5)
        postRadiuas = 15
        lineSpacing=0.9f
    }
    drawPost.drawPostFire(post,layout)
    util.sendPostToStringFirestore(post)
}

    fun loadPost259() {
        val post = Post()
        with(post) {
            postNum = 259
            lineNum = 2
            postId= 90
            imageUri ="https://cdn.pixabay.com/photo/2015/01/16/22/55/road-601871_1280.jpg"
            postText =  arrayListOf(
                " הגוף חי בעולם הזה ",
                "  הנשמה קובעת איך. "
            )
            val di =20
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, -1+du, 0,40  +di),
                arrayListOf(0, -1+du, 0, 0+di)
            )
            postTransparency =0
            postTextSize = arrayListOf(0,20)
            val  backgroundColor = "#ACC7B4"
            val textColor = "#ffffff"
            postFontFamily =103

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,5,0,5)
            postRadiuas = 15
            lineSpacing=0.9f
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost260() {
        val post = Post()
        with(post) {
            postNum = 260
            lineNum = 2
            postId= 87
            imageUri ="https://cdn.pixabay.com/photo/2018/11/05/14/29/trees-sunrise-3796183_1280.jpg"
            postText =  arrayListOf(
                " מי שמסתייג מהצל שלו ",
                "  שלא יצא לשמש. "
            )
            val di =20
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, -1+du, 0,45  +di),
                arrayListOf(0, -1+du, 0, 0+di)
            )
            postTransparency =8
            postTextSize = arrayListOf(0,20)
            val  backgroundColor = "#ff9967"
            val textColor = "#558600"
            postFontFamily =103

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0,0,5)
            postRadiuas = 15
            lineSpacing=0.9f
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost261() {
        val post = Post()
        with(post) {
            postNum = 261
            lineNum = 2
            postId= 91
            imageUri ="https://cdn.pixabay.com/photo/2018/02/11/21/39/weightlifter-3146825_1280.jpg"
            postText =  arrayListOf(
                " אל תהיה מטומטם ",
                "  כדי שלא תרגיש מטומטם. "
            )
            val di =20
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, -1+du, 0,45  +di),
                arrayListOf(0, -1+du, 0, 0+di)
            )
            postTransparency =6
            postTextSize = arrayListOf(0,20)
            val  backgroundColor = "#A4193D"
            val textColor = "#FFDFB9"
            postFontFamily =103

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0,0,5)
            postRadiuas = 15
            lineSpacing=0.9f
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

      fun loadPost262() {
        val post = Post()
        with(post) {
            postNum = 262
            lineNum = 2
            postId= 89
            imageUri ="https://cdn.pixabay.com/photo/2018/01/26/18/40/baby-3109433_1280.jpg"
            postText =  arrayListOf(
                " אם אתה לא מתחדש ",
                "  אתה מתיישן. "
            )
            val di =10
            val du=0
            postMargin =  arrayListOf(
                arrayListOf(0, -1+du, 0,45  +di),
                arrayListOf(0, -1+du, 0, 0+di)
            )
            postTransparency =0
            postTextSize = arrayListOf(0,20)
            val  backgroundColor = "#A4193D"
            val textColor = "#FFDFB9"
            postFontFamily =103

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0,0,5)
            postRadiuas = 15
            lineSpacing=0.9f
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost263() {
        val post = Post()
        with(post) {
            postNum = 263
            lineNum = 2
            postId= 86
            imageUri ="https://cdn.pixabay.com/photo/2016/02/13/16/14/water-1198130_1280.jpg"
            postText =  arrayListOf(
                " אל תתבאס מהמקומות הלא נחמדים  ",
                "  אפשר ששם מונחת בשבילך התשובה. "
            )
            val di =0
            val du=30
            postMargin =  arrayListOf(
                arrayListOf(0, 0+du, 0,-1  +di),
                arrayListOf(0,30+du, 0, -1+di)
            )
            postTransparency =6
            postTextSize = arrayListOf(0,14)
            val  backgroundColor = "000000"
            val textColor = "#ffffff"
            postFontFamily =103

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0,0,5)
            postRadiuas = 15
            lineSpacing=0.9f
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost264() {
        val post = Post()
        with(post) {
            postNum = 264
            lineNum = 2
            postId= 86
            imageUri ="https://cdn.pixabay.com/photo/2014/10/16/20/00/woman-491623_1280.jpg"
            postText =  arrayListOf(
                " אם החלומות שלך מזדקנים איתך  ",
                "  סימן שלא בחרת את החלומות הנכונים. "
            )
            postTransparency =3
            postTextSize = arrayListOf(0,14)
            val  backgroundColor = "000000"
            val textColor = "#ffffff"
            postFontFamily =103

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(100,20,35,-1)
            postRadiuas = 15
            lineSpacing=0.9f
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
    }
}
