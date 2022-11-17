package com.sg.alma60a

import android.app.Activity
import android.content.Context
import androidx.constraintlayout.widget.ConstraintLayout
import com.sg.alma60a.model.Post


class Post3Lines(val context: Context) {

    private val layout: ConstraintLayout = (context as Activity).findViewById(R.id.itemLayoutFire)
    val drawPost = DrawPostCenter(context)
    val pref = context.getSharedPreferences(SHARPREF_ALMA, Context.MODE_PRIVATE)
    private val util = Utility()
    private val util1 = Utility1(context)


    fun loadPost300() {
               val post = Post()
        with(post) {
            postNum = 300
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2015/10/30/12/23/sport-1014035_1280.jpg"
            postText = arrayListOf(
                " יש כמה המצאות אנושיות ",
                " שלא עובדות כל כך במציאות, ",
                " אחת מהם היא ההגינות. ",
            )
            postId=81
            textLocation = arrayListOf(10,-1, 35,20,0, 0, 0, 0)
            postPadding = arrayListOf(0, 0, 0,0)
            postTransparency =3
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#000000"
             postBackground = util.improveColorString(backgroundColor)
             val col = "#ffffff"
            postTextColor = arrayListOf(CONSTANT, col)
            postFontFamily = 103
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
       util.sendPostToStringFirestore(post)
    }

    fun loadPost301() {
        val post = Post()
        with(post) {
            postNum = 301
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2016/03/04/08/35/despair-1235583_1280.jpg"
            postText = arrayListOf(
                " החיים לא כל כך מבאסים," ,
                        " אבל אתה  ",
                " יצור שנוטה להתבאס מהחיים. ",
            )
            postId=79
            textLocation = arrayListOf(10,-1, 35,20,0, 0, 0, 0)
            postBackground = "000000"
            postTransparency = 4
            postTextSize = arrayListOf(0, 16)
            postPadding = arrayListOf(10, 0, 10, 0)
            val col = "#ffffff"
            postTextColor = arrayListOf(CONSTANT, col)
            postFontFamily = 103
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }
    fun loadPost302() {
        val post = Post()
        with(post) {
            postNum = 302
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2018/08/21/23/29/forest-3622519_1280.jpg"
            val str="\""
            postText = arrayListOf(
             str+"הרחק מההמון הסואן"+str ,
                " זה לא מקום ",
                " זה מצב נפשי. ",
            )
            postId=75
            textLocation = arrayListOf(10,20, 35,-1,0, 0, 0, 0)
            postBackground = "f4b41a"
            postTransparency = 0
            val size1 = 16
            val size2 = 0
            postTextSize = arrayListOf(0, size1, size2)
            postPadding = arrayListOf(10, 0, 10, 0)
            val col = "#0A174E"
            postTextColor = arrayListOf(CONSTANT, col)
            postFontFamily = 103
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
    fun loadPost303() {
        var post= Post()
        with(post) {
            postNum = 303
            lineNum =3
            imageUri ="https://cdn.pixabay.com/photo/2016/07/29/08/51/target-1551492_1280.jpg"
            postText =  arrayListOf(
                " ההצלחה שלך נמדדת ",
                " רק לפי האמונה שבך ",
                " שאתה מצליח. "

            )
            postId=81
            textLocation = arrayListOf(10,10, 35,-1,0, 0, 0, 0)
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
    fun loadPost304() {
        var post= Post()
        with(post) {
            postNum = 304
            lineNum =3
            imageUri ="https://cdn.pixabay.com/photo/2016/10/03/23/23/puzzle-1713170_1280.jpg"
            postText =  arrayListOf(
                "החיים האלה דורשים ממך להתנהל בהיגיון,",
                " למרות שהם עצמם ",
                " ממש לא הגיוניים. "
            )
            postId=81
            textLocation = arrayListOf(10,-1, 35,20,0, 0, 0, 0)
            postTextSize =  arrayListOf(0, 20)
            postTransparency =5
            postBackground = "000000"
            val textColor = "ffffff"
            postFontFamily =509

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15
            lineSpacing=1.0f
        }
        drawPost.drawPostFire(post,layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost305() {
        var post= Post()
        with(post) {
            postNum = 305
            lineNum =3
            imageUri ="https://cdn.pixabay.com/photo/2017/03/29/15/18/tianjin-2185510_1280.jpg"
            postText =  arrayListOf(
                " יש לך את הכל, ",
                "גם את אותה המחשבה ",
                " שחסר לך משהו. "
            )
            postId=82
            textLocation = arrayListOf(10,10, 35,-1,0, 0, 0, 0)
            postTextSize =  arrayListOf(0, 22)
            postTransparency =10
            postBackground = "efc8b1"
            val textColor = "8a6626"
            postFontFamily =320
            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(5,5, 5, 5)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
//        util.sendPostToStringFirestore(post)
    }


   fun loadPost306() {
        val post = Post()
        with(post) {
            postNum = 306
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2021/01/08/17/02/old-man-5900410_1280.jpg"
            postText = arrayListOf(
                " המתכון הבטוח שלא  להזדקן ",
                "הוא פשוט",
                " להישאר צעיר. ",
            )
            postId=86
            textLocation = arrayListOf(10,-1, 40,10,0, 0, 0, 0)
            postBackground = "a3842c"
            postTransparency = 7
            val size1 = 22
            val size2 = 0
            postTextSize = arrayListOf(0, size1, size2)
            postPadding = arrayListOf(20, 0, 20, 0)
            val col = "#ffffff"
            postTextColor = arrayListOf(CONSTANT, col)
            postFontFamily = 4
            postRadiuas = 15
            lineSpacing=1.0f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost307() {
        val post = Post()
        with(post) {
            postNum = 307
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2020/10/09/13/12/man-5640540__340.jpg"
            postText = arrayListOf(
                "האדם הוא יצור שכחן,",
                "הוא בדרך כלל נזכר לחיות",
                "רק כמה רגעים לפני המוות שלו.",
            )
            postId=85
            textLocation = arrayListOf(10,-1, 35,20,0, 0, 0, 0)
            postBackground = "a3842c"
            postTransparency =2
            val size1 = 16
            val size2 = 0
            postTextSize = arrayListOf(0, size1, size2)
            postPadding = arrayListOf(10, 0, 10, 0)
            val col = "#ffffff"
            postTextColor = arrayListOf(CONSTANT, col)
            postFontFamily =103
            postRadiuas = 15
        }
        //  util.logi("Post3Lines  106    post=$post")
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }
      fun loadPost308() {
        val post = Post()
        with(post) {
            postNum = 308
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2016/07/28/19/38/lost-places-1549096_1280.jpg"
            postText = arrayListOf(
                "אתה יוצר את עולמך משני חומרים,",
                "מהדברים שיש לך בקיומם",
                "והדברים שאין לך בחסרונם.",
            )
            postId=78
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postBackground = "000000"
            postTransparency =4
            val size1 = 16
            val size2 = 0
            postTextSize = arrayListOf(0, size1, size2)
            postPadding = arrayListOf(10, 0, 10, 0)
            val col = "#ffffff"
            postTextColor = arrayListOf(CONSTANT, col)
            postFontFamily =103
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost309() {
        val post = Post()
        with(post) {
            postNum = 309
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2016/11/18/16/16/teddy-bear-1835598_1280.jpg"
            postText = arrayListOf(
                "כל אחד נדפק בחיים פה ושם,",
                "אבל לא כל אחד",
                "מחשיב את עצמו לדפוק.",
            )
            postId=83
            textLocation = arrayListOf(10,10, 35,-1,0, 0, 0, 0)
            postBackground = "000000"
            postTransparency =2
            val size1 = 20
            val size2 = 0
            postTextSize = arrayListOf(0, size1, size2)
            postPadding = arrayListOf(0, 0, 0, 0)
            val col = "#ffffff"
            postTextColor = arrayListOf(CONSTANT, col)
            postFontFamily =520
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost310() {
        val post = Post()
        with(post) {
            postNum = 310
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2021/12/21/10/16/barbed-wire-6884984_1280.jpg"
            postText = arrayListOf(
                "בדיקטטורה האכזרית שבעולמך,",
                "אתה יוצר בכל בוקר",
                "את השליטים שלך.",
            )
            postId=79
            textLocation = arrayListOf(10,-1, 35,20,0, 0, 0, 0)
            postBackground = "000000"
            postTransparency =2
            val size1 = 22
            val size2 = 0
            postTextSize = arrayListOf(0, size1, size2)
            postPadding = arrayListOf(10, 0, 10, 0)
            val col = "#ffffff"
            postTextColor = arrayListOf(CONSTANT, col)
            postFontFamily =110
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost311() {
        val post = Post()
        with(post) {
            postNum = 311
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2017/10/25/16/54/african-lion-2888519_1280.jpg"
            postText = arrayListOf(
                "העולם הזה לא משוגע,",
                "הוא מתנהל לפי כללים ברורים",
                "שרק משוגע לא מבין אותם.",
            )
            postId=83
            textLocation = arrayListOf(10,-1, 35,20,0, 0, 0, 0)
            postBackground = "000000"
            postTransparency =2
            val size1 = 22
            val size2 = 0
            postTextSize = arrayListOf(0, size1, size2)
            postPadding = arrayListOf(10, 0, 10, 0)
            val col = "#ffffff"
            postTextColor = arrayListOf(CONSTANT, col)
            postFontFamily =110
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost312() {
        val post = Post()
        with(post) {
            postNum = 312
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2017/04/25/06/15/father-and-son-2258681_1280.jpg"
            postText = arrayListOf(
                "עם השנים אתה לא נעשה בוגר יותר,",
                "אתה רק לומד להסתיר יותר",
                "את הילדותיות שלך.",
            )
            postId=86
            textLocation = arrayListOf(10,10, 35,-1,1, 30, 0, 0)
            postBackground = "000000"
            postTransparency =2
            val size1 = 24
            val size2 = 0
            postTextSize = arrayListOf(0, size1, size2)
            postPadding = arrayListOf(10, 0, 10, 0)
            val col = "#ffffff"
            postTextColor = arrayListOf(CONSTANT, col)
            postFontFamily =110
            postRadiuas = 15
            lineSpacing=0.8f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }
      fun loadPost313() {
        val post = Post()
        with(post) {
            postNum = 313
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2013/11/28/10/36/road-220058_1280.jpg"
            postText = arrayListOf(
                "יש אנשים בחיים שלך,",
                "שלא יעזור לך גם אם תתרחק מהם אל מעבר לאופק,",
                "החוויה איתם נשארת איתך קרוב.",
            )
            postId=83
            textLocation = arrayListOf(10,10, 35,-1,2, 35, 0, 0)
            postBackground = "#0A174E"
            postTransparency =4
            val size1 = 16
            val size2 = 0
            postTextSize = arrayListOf(0, size1, size2)
            postPadding = arrayListOf(5, 0, 5, 5)
            val col = "#F5D042"
            postTextColor = arrayListOf(CONSTANT, col)
            postFontFamily =103
            postRadiuas = 15
            lineSpacing=1.5f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost314() {
        val post = Post()
        with(post) {
            postNum = 314
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2014/02/22/20/51/rivers-272352_1280.jpg"
            postText = arrayListOf(
                "כל הנחלים זורמים לים",
                "גם אם זה צודק",
                "וגם אם לא.",
            )
            postId=87
            textLocation = arrayListOf(10,10, 40,-1,0, 0, 0, 0)
            postTransparency =8
            postTextSize = arrayListOf(0, 24)
            postBackground = "1E4174"
            val textColor = "DDA94B"
            postFontFamily =570
            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }
   fun loadPost315() {
        val post = Post()
        with(post) {
            postNum = 315
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2018/11/11/10/46/opposites-3808487_1280.jpg"
            postText = arrayListOf(
                "אתה בסדר",
                "ברגע שאין בך צורך שמישהו אחר יגיד לך",
                "שאתה בסדר.",
            )
            postId=82
            textLocation = arrayListOf(10,10, 30,-1,2, 30, 0, 0)
            postTransparency =8
            postTextSize = arrayListOf(0, 16)
            postBackground = "1E4174"
            val textColor = "DDA94B"
            postFontFamily =103
            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10,0, 10, 0)
            lineSpacing=1.3f
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost316() {
        val post = Post()
        with(post) {
            postNum = 316
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2016/11/08/05/22/buddhist-1807526_1280.jpg"
            postText = arrayListOf(
                "הצורך להתבטא",
                "בדרך כלל חזק יותר",
                "מהצורך להגיד משהוא אמיתי.",
            )
            postId=86
            textLocation = arrayListOf(10,-1, 40,10,0, 0, 0, 0)
            postTransparency =10
            postTextSize = arrayListOf(0, 21)
            postBackground = "1E4174"
            val textColor = "DDA94B"
            postFontFamily =100

            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost317() {
        val post = Post()
        with(post) {
            postNum = 317
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2018/06/07/12/21/hands-3460021_1280.jpg"
            postText = arrayListOf(
                " העבדות להבלים היא עבדות מרצון, ",
                " אומנם היא די נוחה  ",
                "  אבל זה לא עושה אותה פחות עבדות.  ",
            )
            postId=84
            textLocation = arrayListOf(10,20, 35,-1,1, 30, 0, 0)
            postTransparency =0
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#815854"
            val textColor = "#ffffff"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5, 0, 5, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }
    fun loadPost318() {
        val post = Post()
        with(post) {
            postNum = 318
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2020/07/26/07/18/man-5438612_1280.jpg"
            postText = arrayListOf(
                "(התנצלות לכולם וגם לעצמי)",
                "אני רק בן אדם",
                "ואין לי הרבה מה לעשות בנושא זה.",
            )
            postId=86
            textLocation = arrayListOf(10,-1, 40,10,0, 0, 0, 0)
            postTransparency =9
            postTextSize = arrayListOf(0, 20)
            val  backgroundColor = "#F0EDCC"
            val textColor = "#02343F"
            postFontFamily =100
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5, 0, 5, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost319() {
        val post = Post()
        with(post) {
            postNum = 319
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2012/02/27/17/00/ape-17474_1280.jpg"
            postText = arrayListOf(
                "השפיות של האדם נבחנת ביכולת שלו",
                "  לחיות בשלום יחסי  ",
                "עם החלקים הפחות שפויים שבו.",
            )
            postId=86
            textLocation = arrayListOf(10,-1, 30,10,0, 0, 0, 0)
            postTransparency =8
            postTextSize = arrayListOf(0, 14)
            val  backgroundColor = "000000"
            val textColor = "#FFFFFF"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5, 0, 5, 0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

fun loadPost320() {
    val post = Post()
    with(post) {
        postNum = 320
        lineNum = 3
        imageUri = "https://cdn.pixabay.com/photo/2016/11/28/21/20/happiness-1866081_1280.jpg"
        postText = arrayListOf(
            "צריך להיות מונשם ימים ארוכים מאוד",
            "כדי לתפוס את הפלא הזה",
            "של נשימה חופשית.",
        )
        postId=87
        textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
        postTransparency =8
        postTextSize = arrayListOf(0, 20)
        val  backgroundColor = "000000"
        val textColor = "#FFFFFF"
        postFontFamily =100
        postBackground =util. improveColorString(backgroundColor)
        val textcolo=util.improveColorString(textColor)
        val col = "#$textcolo"
        postTextColor = arrayListOf(CONSTANT, col)
        postPadding = arrayListOf(5, 0, 5, 0)
        postRadiuas = 15

    }
    drawPost.drawPostFire(post, layout)
//    util.sendPostToStringFirestore(post)
}

    fun loadPost321() {
        val post = Post()
        with(post) {
            postNum = 321
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2016/04/17/20/19/woman-1335487_1280.jpg"
            postText = arrayListOf(
                "כל האנשים בנויים אותו דבר,",
                "רק שכל אחד",
                "מחביא את זה בצורה אחרת.",
            )
            postId=86
            textLocation = arrayListOf(10,-1, 40,10,0, 0, 0, 0)
            postTransparency =8
            postTextSize = arrayListOf(0, 20)
            val  backgroundColor = "000000"
            val textColor = "#FFFFFF"
            postFontFamily =100
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(15, 0, 15, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost322() {
        val post = Post()
        with(post) {
            postNum = 322
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2013/10/09/02/26/lake-192979__480.jpg"
            postText = arrayListOf(
                " שמפלס ",
                "הים שבפנים יורד",
                "אפשר לראות את הסלעים.",
            )
            postId=82
            textLocation = arrayListOf(10,10, 35,-1,0, 0, 0, 0)
            postTransparency =0
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "000000"
            val textColor = "#FFFFFF"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 5, 10, 5)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost323() {
        val post = Post()
        with(post) {
            postNum = 323
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2018/07/10/10/29/girl-3528292_1280.jpg"
            postText = arrayListOf(
                " האדם ",
                "מכיר היטב את עלילת חייו לפרטים",
                "אבל לא מבין את הסיפור כולו.",
            )
            postId=80
            textLocation = arrayListOf(10,-1, 40,10,0, 0, 0, 0)
            postTransparency =7
            postTextSize = arrayListOf(0, 15)
            val  backgroundColor = "#07553B"
            val textColor = "#CED46A"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 5, 10, 5)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost324() {
        val post = Post()
        with(post) {
            postNum = 324
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2020/02/27/06/58/couple-4883585_1280.jpg"
            postText = arrayListOf(
                " לפעמים מילים ",
                "באות לגלות דברים",
                "ולפעמים להסתיר.",
            )
            postId=86
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postTransparency =9
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#ffffff"
            val textColor = "#000000"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost325() {
        val post = Post()
        with(post) {
            postNum = 325
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2016/08/12/20/14/river-1589616_1280.jpg"
            postText = arrayListOf(
                " הכעסים באים מהעבר ",
                "החרדות מהעתיד",
                "והחיים עצמם מהרגע הזה .",
            )
            postId=84
            textLocation = arrayListOf(10,20, 35,-1,0, 0, 0, 0)
            postTransparency =0
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 5, 10, 5)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost326() {
        val post = Post()
        with(post) {
            postNum = 326
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2022/01/16/15/55/people-6942460_1280.jpg"
            postText = arrayListOf(
                " כולם מדברים, ",
                "רק מעטים",
                " ממש אומרים משהו.",
            )
            postId=81
            textLocation = arrayListOf(10,-1, 50,10,0, 0, 0, 0)

            postTransparency =7
            postTextSize = arrayListOf(0, 20)
            val  backgroundColor = "#CED46A"
            val textColor = "#07553B"
            postFontFamily =100

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 5, 10, 5)
            postRadiuas = 15

        }
        //  util.logi("Post3Lines  106    post=$post")
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost327() {
        val post = Post()
        with(post) {
            postNum = 327
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2014/02/23/09/17/man-272676_1280.jpg"
            postText = arrayListOf(
                " כשאתה סולד מדברים מסוימים, ",
                "זה אומר משהו לגביך",
                " לא על טיבם של הדברים עצמם. ",
            )
            postId=80
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postTransparency =7
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#ADEFD1"
            val textColor = "#00203F"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost328() {
        val post = Post()
        with(post) {
            postNum = 328
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2014/09/19/17/18/rag-doll-452774_1280.jpg"
            postText = arrayListOf(
                " שני דברים צריך האדם בחייו, ",
                "אישור שלא להיות מושלם",
                " ורצון שלא להיות סמרטוט. ",
            )
            postId=86
            textLocation = arrayListOf(10,-1, 40,10,0, 0, 0, 0)
            postTransparency =8
            postTextSize = arrayListOf(0, 22)
            val  backgroundColor = "#ADEFD1"
            val textColor = "#00203F"
            postFontFamily =100
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15
        }
        //  util.logi("Post3Lines  106    post=$post")
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost329() {
        val post = Post()
        with(post) {
            postNum = 329
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2017/06/09/14/18/you-2386968_1280.png"
            postText = arrayListOf(
                "תהיה אתה,",
                "ביננו, יש  לך סיכוי לא רע",
                " שאפילו תצליח בזה. ",
            )
            postId=83
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postTransparency =10
            postTextSize = arrayListOf(0, 27)
            val  backgroundColor = "#1E4174"
            val textColor = "#DDA94B"
            postFontFamily =110
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15
        }
         drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost330() {
        val post = Post()
        with(post) {
            postNum = 330
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2019/12/01/10/06/people-4665095_1280.jpg"
            postText = arrayListOf(
                " חביבי, ",
                " אתה אורח בעולם הזה ",
                " אז תתנהג בהתאם. ",
            )
            postId=81
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postTransparency =7
            postTextSize = arrayListOf(0, 27)
            val  backgroundColor = "#1E4174"
            val textColor = "#DDA94B"
            postFontFamily =110
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost331() {
        val post = Post()
        with(post) {
            postNum = 331
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2015/07/15/06/42/womman-845710_1280.jpg"
            postText = arrayListOf(
                " האדם מסכן, ",
                " ולא בגלל שהוא באמת מסכן ",
                " כמו שהוא חושב את עצמו למסכן. ",
            )
            postId=80
            textLocation = arrayListOf(10,-1, 35,10,1, 35, 0, 0)
            postTransparency =7
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#1E4174"
            val textColor = "#DDA94B"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 5)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost332() {
        val post = Post()
        with(post) {
            postNum = 332
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2017/08/24/03/41/starry-sky-2675322_1280.jpg"
            postText = arrayListOf(
                " החיים שלך, ",
                " זה פיסה קטנה של אינסוף ",
                " המוגבלת בזמן. ",
            )
            postId=83
            textLocation = arrayListOf(10,-1, 35,-1,0, 0, 0, 0)
            postTransparency =0
            postTextSize = arrayListOf(0, 17)
            val  backgroundColor = "#1E4174"
            val textColor = "#DDA94B"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost333() {
        val post = Post()
        with(post) {
            postNum = 333
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2021/10/25/17/16/nature-6741602_1280.jpg"
            postText = arrayListOf(
                " החיים שלך בנויים  ",
                " ממה שקורה לך, ",
                " ומהקסם שאתה מצליח להפיק מזה. ",
            )
            postId=85
            textLocation = arrayListOf(10,10, 35,-1,3, 35, 0, 0)
            postTransparency =0
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#606060"
            val textColor = "#D6ED17"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5, 5, 5, 5)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }
    fun loadPost334() {
        val post = Post()
        with(post) {
            postNum = 334
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2020/02/25/22/59/grimace-4880273_1280.jpg"
            postText = arrayListOf(
                " אתה נמחץ  ",
                " ממה שאתה נותן לו את הסמכות ",
                " למחוץ אותך. ",
            )
            postId=82
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postTransparency =6
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#101820"
            val textColor = "#F2AA4C"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5, 0, 5, 5)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost335() {
        val post = Post()
        with(post) {
            postNum = 335
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2016/10/18/08/13/travel-1749508_1280.jpg"
            postText = arrayListOf(
                " שאתה לא שם, ",
                " גם חיים טובים ",
                " לא יעשו לך טוב. ",
            )
            postId=79
            textLocation = arrayListOf(10,20, 35,-1,0, 0, 0, 0)
            postTransparency =4
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#101820"
            val textColor = "#F2AA4C"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5, 0, 5, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost336() {
        val post = Post()
        with(post) {
            postNum = 336
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2015/05/31/10/51/technology-791029_1280.jpg"
            postText = arrayListOf(
                " חיים משומשים ",
                " בדרך כלל יותר בטוחים ",
                " אבל הריח שלהם לא משהו. ",
            )
            postId=79
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postTransparency =4
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#101820"
            val textColor = "#F2AA4C"
            postFontFamily =103

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    };

    fun loadPost337() {
        val post = Post()
        with(post) {
            postNum = 337
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2015/04/01/08/03/plastic-flowers-702011_1280.jpg"
            postText = arrayListOf(
                " שהאמת והשקר ",
                " הופכים לשאלות פוליטיות, ",
                " הצדק הוא זיוף. ",
            )
            postId=77
            textLocation = arrayListOf(10,20, 35,-1,0, 0, 0, 0)

            postTransparency =4
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#101820"
            val textColor = "#F2AA4C"
            postFontFamily =103

            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost338() {
        val post = Post()
        with(post) {
            postNum = 338
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2016/10/12/01/08/mouse-1733265_1280.jpg"
            postText = arrayListOf(
                " ישנם הרבה חורים ומחילות בעולם ",
                " אתה רק צריך להחליט ",
                " אם אתה עכבר. ",
            )
            postId=88
            textLocation = arrayListOf(10,20, 35,-1,0, 0, 0, 0)
            postTransparency =5
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#101820"
            val textColor = "#F2AA4C"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost339() {
        val post = Post()
        with(post) {
            postNum = 339
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2019/08/08/11/23/butterfly-4392735_1280.jpg"
            postText = arrayListOf(
                " הבלי עולם הזה ",
                " זו המציאות הרגילה ",
                " שאין בה קורטוב של קדושה. ",
            )
            postId=86
            textLocation = arrayListOf(10,20, 35,-1,0, 0, 0, 0)
            postTransparency =0
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#101820"
            val textColor = "#F2AA4C"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 5, 0, 5)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

//
    fun loadPost340() {
        val post = Post()
        with(post) {
            postNum = 340
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2015/01/07/20/53/hat-591973_1280.jpg"
            postText = arrayListOf(
                " נורמליות מקובלת ",
                " זו היכולת של האדם ",
                " להחביא את השיגעון שבו . ",
            )
            postId=71
            textLocation = arrayListOf(10,20, 35,-1,0, 0, 0, 0)
            postTransparency =10
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#101820"
            val textColor = "#F2AA4C"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 5, 0, 5)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost341() {
        val post = Post()
        with(post) {
            postNum = 341
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2018/12/15/23/26/glass-3877768_1280.jpg"
            postText = arrayListOf(
                "האדם הוא יצור פלאי",
                " הוא יכול להטביע את עצמו ",
                " אפילו בחצי הכוס הריקה . ",
            )
            postId=83
            textLocation = arrayListOf(10,10, 30,-1,0, 0, 0, 0)
            postTransparency =5
            postTextSize = arrayListOf(0, 14)
            val  backgroundColor = "#101820"
            val textColor = "#F2AA4C"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5, 0,5, 0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost342() {
        val post = Post()
        with(post) {
            postNum = 342
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2015/07/15/07/13/homeless-845752_1280.jpg"
            postText = arrayListOf(
                " המסכנות ",
                " זאת תחושה עוברת ",
                " חוץ מלאותם שהפכו אותה למקצוע. ",
            )
            postId=79
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postTransparency =0
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#101820"
            val textColor = "#F2AA4C"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 5, 0, 5)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost343() {
        val post = Post()
        with(post) {
            postNum = 343
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2016/11/29/05/35/new-york-1867570_1280.jpg"
            postText = arrayListOf(
                " כולם רואים את אותו עולם ",
                " ויש שרואים אותו מקומת קרקע ",
                " ויש מקומה חמישית. ",
            )
            postId=79
            textLocation = arrayListOf(10,20, 35,-1,0, 0, 0, 0)
            postTransparency =3
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#101820"
            val textColor = "#F2AA4C"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost344() {
        val post = Post()
        with(post) {
            postNum = 344
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2016/07/15/23/36/kid-1520706_1280.jpg"
            postText = arrayListOf(
                " הייה מה שאתה ",
                " ושתצליח להתמודד איכשהוא ",
                " עם מה שאחרים חושבים על זה. ",
            )
            postId=84
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#00B1D2"
            val textColor = "#FDDB27"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 5, 0, 5)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost345() {
        val post = Post()
        with(post) {
            postNum = 345
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2016/06/27/22/14/man-1483479_1280.jpg"
            postText = arrayListOf(
                " כשלא נתת לעצמך להיות צודק, ",
                " במרחק הזמן ",
                " היית הכי צודק. ",
            )
            postId=83
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postTransparency =8
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#ff9967"
            val textColor = "#558600"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost346() {
        val post = Post()
        with(post) {
            postNum = 346
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2016/02/22/12/37/waves-1215449__480.jpg"
            postText = arrayListOf(
                " כולם מתרסקים פה ושם ",
                " אבל לא כולם יודעים להתאושש מזה ",
                " בצורה טובה. ",
            )
            postId=82
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postTransparency =8
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#02343F"
            val textColor = "#F0EDCC"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost347() {
        val post = Post()
        with(post) {
            postNum = 347
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2017/02/19/17/17/winter-2080327_1280.jpg"
            postText = arrayListOf(
                " אין לי מושג אם אלוהים קיים או לא ",
                " אבל אם לוקחים אותו במינון נכון ",
                " זה טוב יותר מפרוזק. ",
            )
            postId=84
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postTransparency =0
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#02343F"
            val textColor = "#F0EDCC"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost348() {
        val post = Post()
        with(post) {
            postNum = 348
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2018/03/07/17/15/balloon-3206530_1280.jpg"
            postText = arrayListOf(
                " הקסם צומח מהעכשיו, ",
                " משאר הזמנים ",
                " צומחות אמיתות נדושות. ",
            )
            postId=82
            textLocation = arrayListOf(10,20, 35,-1,0, 0, 0, 0)
            postTransparency =0
            postTextSize = arrayListOf(0, 17)
            val  backgroundColor = "#101820"
            val textColor = "#7b9acc"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost349() {
        val post = Post()
        with(post) {
            postNum = 349
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2013/05/11/08/28/sunset-110305_1280.jpg"
            postText = arrayListOf(
                " הדבר הכי חשוב בחיים ",
                " זה להכיר בזה ",
                " שאתה עדיין לא מת. ",
            )
            postId=86
            textLocation = arrayListOf(10,20, 35,-1,0, 0, 0, 0)
            postTransparency =0
            postTextSize = arrayListOf(0, 26)
            val  backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily =110
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost350() {
        val post = Post()
        with(post) {
            postNum = 350
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2020/11/12/16/58/worker-5736096__480.jpg"
            postText = arrayListOf(
                " כשאתה ",
                " לא מייצר לך חיים, ",
                " אין לך חיים. ",
            )
            postId=85
            textLocation = arrayListOf(10,20, 35,-1,0, 0, 0, 0)
            postTransparency =0
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost351() {
        val post = Post()
        with(post) {
            postNum = 351
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2016/05/07/21/07/cat-1378203_1280.jpg"
            postText = arrayListOf(
                " אדם ניכר ",
                " בדברים שמעליבים אותו, ",
                " ובתגובה שלו אליהם. ",
            )
            postId=83
            textLocation = arrayListOf(10,20, 40,-1,0, 0, 0, 0)
            postTransparency =10
            postTextSize = arrayListOf(0, 20)
            val  backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily =100
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 5)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost352() {
        val post = Post()
        with(post) {
            postNum = 352
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2019/11/27/12/24/meme-4656855_1280.jpg"
            postText = arrayListOf(
                " אם אתה מספיק טמבל ",
                " כדי להיות טמבל, ",
                " מי אני שאפריע לך ... ",
            )
            postId=84
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postTransparency =8
            postTextSize = arrayListOf(0, 24)
            val  backgroundColor = "#00203F"
            val textColor = "#ADEFD1"
            postFontFamily =200
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 5, 10, 5)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

fun loadPost353() {
    val post = Post()
    with(post) {
        postNum = 353
        lineNum = 3
        imageUri = "https://cdn.pixabay.com/photo/2019/07/10/09/09/animal-world-4328243_1280.jpg"
        postText = arrayListOf(
            " אם היית יודע מה אתה, ",
            " היית מרגיש פחות אשם ",
            " שאתה כזה. ",
        )
        postId=82
        textLocation = arrayListOf(10,-1, 30,10,0, 0, 0, 0)
        postTransparency =0
        postTextSize = arrayListOf(0, 24)
        val  backgroundColor = "#00203F"
        val textColor = "#ACC7B4"
        postFontFamily =200
        postBackground =util. improveColorString(backgroundColor)
        val textcolo=util.improveColorString(textColor)
        val col = "#$textcolo"
        postTextColor = arrayListOf(CONSTANT, col)
        postPadding = arrayListOf(10, 5, 10, 5)
        postRadiuas = 15

    }
    drawPost.drawPostFire(post, layout)
    util.sendPostToStringFirestore(post)
}

    fun loadPost354() {
        val post = Post()
        with(post) {
            postNum = 354
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2016/07/04/19/40/glass-1497232_1280.jpg"
            postText = arrayListOf(
                " להרגיש שלם ",
                " זה לקבל את חוסר השלמות ",
                " בעולם סביב ובך. ",
            )
            postId=82
            textLocation = arrayListOf(10,20, 45,-1,0, 0, 0, 0)
            postTransparency =8
            postTextSize = arrayListOf(0, 18)
            val  backgroundColor = "#ACC7B4"
            val textColor = "#331B3F"
            postFontFamily =100
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 5, 10, 5)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost355() {  //I
        val post = Post()
        with(post) {
            postNum = 355
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2015/09/25/17/19/brick-957823_1280.jpg"
            postText = arrayListOf(
                " אופטימיות ",
                " זה לראות את המשך הדרך ",
                " גם אחרי הקיר. ",
            )
            postId=82
            textLocation = arrayListOf(10,20, 40,-1,0, 0, 0, 0)
            postTransparency =10
            postTextSize = arrayListOf(0, 20)
            val  backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily =100
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 5, 10, 5)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }
      fun loadPost356() {
        val post = Post()
        with(post) {
            postNum = 356
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2020/05/23/04/28/boy-5207984_1280.jpg"
            postText = arrayListOf(
                " הרשתות החברתיות ",
                " לא פותרות את הבדידות  ",
                " אבל עושות אותה יותר נוחה. ",
            )
            postId=79
            textLocation = arrayListOf(10,20, 45,-1,0, 0, 0, 0)
            postTransparency =6
            postTextSize = arrayListOf(0, 20)
            val  backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily =100
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 5, 10, 5)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost357() {
        val post = Post()
        with(post) {
            postNum = 357
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2016/05/03/20/01/hand-1370026_1280.jpg"
            postText = arrayListOf(
                " אומנם כולם מתעסקים בבוץ ",
                " אבל בשבילך  ",
                " רק הידיים שלך מתלכלכות. ",
            )
            postId=81
            textLocation = arrayListOf(10,20, 45,-1,0, 0, 0, 0)
            postTransparency =10
            postTextSize = arrayListOf(0, 18)
            val  backgroundColor = "#FFE77A"
            val textColor = "#2C5F2D"
            postFontFamily =100
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 5, 10, 5)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost358() {
        val post = Post()
        with(post) {
            postNum = 358
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2017/04/01/21/06/portrait-2194457_1280.jpg"
            postText = arrayListOf(
                " עשה את מה שמתאים לך ברגע זה ",
                " ורק בתנאי  ",
                " שאתה יודע את עצמך היטב. ",
            )
            postId=79
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postTransparency =6
            postTextSize = arrayListOf(0, 18)
            val  backgroundColor = "#00B1D2"
            val textColor = "#FDDB27"
            postFontFamily =100
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost359() {
        val post = Post()
        with(post) {
            postNum = 359
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2016/11/23/18/42/boy-1854308_1280.jpg"
            postText = arrayListOf(
                " הרשעות והציניות הרבה יותר נפוצות ",
                " מהאהבה  ",
                " כי הן הרבה יותר בטוחות לשימוש. ",
            )
            postId=83
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postTransparency =3
            postTextSize = arrayListOf(0, 14)
            val  backgroundColor = "#000000"
            val textColor = "#FFFFFF"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 5, 10, 0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost360() {
        val post = Post()
        with(post) {
            postNum = 360
            lineNum = 3
            imageUri = "https://images.unsplash.com/photo-1527212986666-4d2d47a80d5f?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=435&q=80"
            postText = arrayListOf(
                " ברכה שבאה מתוך אילוץ ",
                " וחיים שבאים מתוך הכרח  ",
                " אינם שווים הרבה. ",
            )
            postId=84
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postTransparency =6
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#07553B"
            val textColor = "#CED46A"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 5, 10, 0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }
  fun loadPost361() {
        val post = Post()
        with(post) {
            postNum = 361
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2016/11/08/05/15/water-buffalo-1807517_1280.jpg"
            postText = arrayListOf(
                " ההנאה שלך בחיים ",
                " תלויה ביכולת שלך להתמודד בהצלחה ",
                " עם רגעי חוסר ההנאה. ",
            )
            postId=85
            textLocation = arrayListOf(10,10, 35,-1,2,32, 0, 0)
            postTransparency =6
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#07553B"
            val textColor = "#CED46A"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10,0, 10, 0)
            postRadiuas = 15
            lineSpacing=1.4f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

fun loadPost362() {
    val post = Post()
    with(post) {
        postNum = 362
        lineNum = 3
        imageUri = "https://cdn.pixabay.com/photo/2016/09/08/21/18/truck-1655592__480.jpg"
        postText = arrayListOf(
            " יום חדש ",
            " הוא מוצר פחות שימושי ",
            " לאנשים משומשים. ",
        )
        postId=86
        textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
        postTransparency =0
        postTextSize = arrayListOf(0, 18)
        val  backgroundColor = "#07553B"
        val textColor = "#CED46A"
        postFontFamily =103
        postBackground =util. improveColorString(backgroundColor)
        val textcolo=util.improveColorString(textColor)
        val col = "#$textcolo"
        postTextColor = arrayListOf(CONSTANT, col)
        postPadding = arrayListOf(10,0, 10, 0)
        postRadiuas = 15
    }
    drawPost.drawPostFire(post, layout)
//    util.sendPostToStringFirestore(post)
 }
    fun loadPost363() {
        val post = Post()
        with(post) {
            postNum = 363
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2016/09/18/14/21/swimmer-1678307_1280.jpg"
            postText = arrayListOf(
                " עם מניפולציות ",
                " אפשר לעבוד על אנשים ",
                " לא על החיים. ",
            )
            postId=83
            textLocation = arrayListOf(10,10, 35,-1,0, 0, 0, 0)
            postTransparency =0
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#07553B"
            val textColor = "#50586C"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10,0, 10, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }
fun loadPost364() {
    val post = Post()
    with(post) {
        postNum = 364
        lineNum = 3
        imageUri = "https://cdn.pixabay.com/photo/2020/03/21/19/27/sea-4955005_1280.jpg"
        postText = arrayListOf(
            " שניתנו לך החיים בחינם",
            " ומאז אתה בודק בוקר וערב ",
            " איפה דפקו אותך עם זה. ",
        )
        postId=81
        textLocation = arrayListOf(10,20, 35,-1,0, 0, 0, 0)
        postTransparency =0
        postTextSize = arrayListOf(0, 16)
        val  backgroundColor = "#0A174E"
        val textColor = "#F5D042"
        postFontFamily =103
        postBackground =util. improveColorString(backgroundColor)
        val textcolo=util.improveColorString(textColor)
        val col = "#$textcolo"
        postTextColor = arrayListOf(CONSTANT, col)
        postPadding = arrayListOf(10,0, 10, 0)
        postRadiuas = 15
    }
    drawPost.drawPostFire(post, layout)
//    util.sendPostToStringFirestore(post)
}
    fun loadPost365() {
        val post = Post()
        with(post) {
            postNum = 365
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2015/02/19/13/15/indians-642075_1280.jpg"
            postText = arrayListOf(
                " היה רצוי ",
                " שתתייחס לחיים שלך ",
                " כאילו הם החיים שלך. ",
            )
            postId=81
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postTransparency =10
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost366() {
        val post = Post()
        with(post) {
            postNum = 366
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2016/02/07/15/42/cordoba-1184992_1280.jpg"
            postText = arrayListOf(
                " הכל נכון, ",
                " השאלה: ",
                " מה מכל זה נכון לך עכשיו. ",
            )
            postId=82
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postTransparency =5
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost367() {
        val post = Post()
        with(post) {
            postNum = 367
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2014/02/02/17/33/photo-256868_1280.jpg"
            postText = arrayListOf(
                " זיכרונות העבר ",
                " הם הדבר היציב ביותר בעולמנו, ",
                " כל היתר אבק ברוח. ",
            )
            postId=85
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postTransparency =4
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0, 5)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost368() {
        val post = Post()
        with(post) {
            postNum = 368
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2019/03/24/15/52/anguish-4077946_1280.jpg"
            postText = arrayListOf(
                " אם אתה מתעסק בפוליטיקה  ",
                " או בכל מיני עוגמות נפש אחרות, ",
                " אז מגיע לך . ",
            )
            postId=83
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postTransparency =5
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0, 5)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost369() {
        val post = Post()
        with(post) {
            postNum = 369
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2016/08/01/20/13/girl-1561989_1280.jpg"
            postText = arrayListOf(
                " אתה צריך מדי פעם להיות  ",
                " בצד הלא בטוח של החיים ",
                " כדי להיות בטוח מהשיממון. ",
            )
            postId=85
            textLocation = arrayListOf(10,20, 35,-1,0, 0, 0, 0)
            postTransparency =0
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0, 5)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost370() {
        val post = Post()
        with(post) {
            postNum = 370
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2016/10/11/15/13/smilies-1731855_1280.jpg"
            postText = arrayListOf(
                "   החיים האלה   ",
                "   לא באו לעשות לך טוב   ",
                " אלא לתת לך הזדמנות לחיות. ",
            )
            postId=83
            textLocation = arrayListOf(10,20, 35,-1,0, 0, 0, 0)
            postTransparency =0
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0, 5)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost371() {
        val post = Post()
        with(post) {
            postNum = 371
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2017/06/25/08/09/sunbeds-2439961_1280.jpg"
            postText = arrayListOf(
                "   כמה שיש לך יותר אפשרויות בחיים  ",
                "   ככה יש לך יותר סיכוי  ",
                " לבזבז אותם בהבלים. ",
            )
            postId=83
            textLocation = arrayListOf(10,-1, 30,10,0, 0, 0, 0)
            postTransparency =5
            postTextSize = arrayListOf(0, 14)
            val  backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0, 5)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost372() {
        val post = Post()
        with(post) {
            postNum = 372
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2015/01/31/18/17/arabs-618749_1280.jpg"
            postText = arrayListOf(
                "   בשני דברים קשה להאשים את האדם:  ",
                "   שבכל חייו הוא מתנהג כמו אדם ",
                " ושבסוף הוא מת. ",
            )
            postId=85
            textLocation = arrayListOf(10,20, 30,-1,1, 0, 0, 0)
            postTransparency =10
            postTextSize = arrayListOf(0, 14)
            val  backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,5, 0, 5)
            postRadiuas = 15
            lineSpacing=1.5f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost373() {
        val post = Post()
        with(post) {
            postNum = 373
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2017/08/06/23/22/people-2597454_1280.jpg"
            postText = arrayListOf(
                "   אנשים רוצים אהבה  ",
                " אבל נוטים להתבאס מאוחר יותר ",
                " ממה שהיא מביאה איתה. ",
            )
            postId=84
            textLocation = arrayListOf(10,20, 35,-1,0, 0, 0, 0)
            postTransparency =5
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0,0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost374() {
        val post = Post()
        with(post) {
            postNum = 374
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2016/08/02/17/02/read-1564105_1280.jpg"
            postText = arrayListOf(
                "   האדם הוא יצור  ",
                " עם פוטנציאל גאונות ",
                " ומנטליות של מפגר. ",
            )
            postId=85
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postTransparency =0
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost375() {
        val post = Post()
        with(post) {
            postNum = 375
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2017/09/19/19/16/angry-2766265_1280.jpg"
            postText = arrayListOf(
                " חבל להתעצבן היום על דברים מסוימים, ",
                " כאלה שיש לך את האפשרות ",
                " להתעצבן עליהם מחר. ",
            )
            postId=81
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postTransparency =0
            postTextSize = arrayListOf(0, 14)
            val  backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost376() {
        val post = Post()
        with(post) {
            postNum = 376
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2019/09/29/14/38/event-4513446_1280.jpg"
            postText = arrayListOf(
                " האלטרנטיבה לחיים ",
                " זה המוות ",
                " או לעסוק בפוליטיקה. ",
            )
            postId=81
            textLocation = arrayListOf(10,10, 35,-1,0, 0, 0, 0)
            postTransparency =0
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }
      fun loadPost377() {
        val post = Post()
        with(post) {
            postNum = 377
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2016/11/14/03/05/surgery-1822458_1280.jpg"
            postText = arrayListOf(
                " אתה לא מודע לחופש שלך ",
                " עד לאותו יום ",
                " בו הוא נלקח ממך. ",
            )
            postId=86
            textLocation = arrayListOf(10,-1, 30,10,0, 0, 0, 0)
            postTransparency =10
            postTextSize = arrayListOf(0, 18)
            val  backgroundColor = "#07553B"
            val textColor = "#CED46A"
            postFontFamily =101
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,5, 0, 5)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost378() {
        val post = Post()
        with(post) {
            postNum = 378
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2015/07/13/14/37/bridge-843217_1280.jpg"
            postText = arrayListOf(
                " למצוא יש מאין ",
                " זו אומנות הוויתור על תפיסות חיים  ",
                " לטובת החיים עצמם. ",
            )
            postId=85
            textLocation = arrayListOf(10,20, 30,-1,0, 0, 0, 0)
            postTransparency =8
            postTextSize = arrayListOf(0, 14)
            val  backgroundColor = "#07553B"
            val textColor = "#CED46A"
            postFontFamily =101
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,5, 0, 5)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }
     fun loadPost379() {
        val post = Post()
        with(post) {
            postNum = 379
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2017/01/11/11/33/cake-1971556_1280.jpg"
            postText = arrayListOf(
                " אתה יודע מה מציק לך בחיים ",
                " אבל אין לך מושג  ",
                " מה באמת עושה לך טוב. ",
            )
            postId=83
            textLocation = arrayListOf(10,10, 30,-1,0, 0, 0, 0)
            postTransparency =0
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#F0EDCC"
            val textColor = "#02343F"
            postFontFamily =101
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,5, 0, 5)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }
        fun loadPost380() {
        val post = Post()
        with(post) {
            postNum = 380
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2017/12/17/00/04/sheep-3023520_1280.jpg"
            postText = arrayListOf(
                " למרות שאתה חלק מהעדר ",
                " הצרכים שלך ושל העדר  ",
                " אינם בדיוק אותו דבר.  ",
            )
            postId=83
            textLocation = arrayListOf(10,20, 25,-1,0, 0, 0, 0)
            postTransparency =5
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#606060"
            val textColor = "#D6ED17"
            postFontFamily =101
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }
    fun loadPost381() {
        val post = Post()
        with(post) {
            postNum = 381
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2015/07/17/19/19/person-849632_1280.jpg"
            postText = arrayListOf(
                " הטיפש ",
                " מנסה להיות יותר חכם  ",
                "יותר ממה שהוא באמת.  ",
            )
            postId=79
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postTransparency =3
            postTextSize = arrayListOf(0, 18)
            val  backgroundColor = "#606060"
            val textColor = "#D6ED17"
            postFontFamily =101
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,5, 0, 5)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }
        fun loadPost382() {
        val post = Post()
        with(post) {
            postNum = 382
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2016/10/18/21/22/beach-1751455_1280.jpg"
            postText = arrayListOf(
                " המודעות שלך היא כל העולם בשבילך, ",
                " בלעדיה העולם אומנם נשאר כמו שהוא  ",
                " אבל לגביך הוא איננו.  ",
            )
            postId=82
            textLocation = arrayListOf(10,20, 35,-1,0, 0, 0, 0)
            postTransparency =0
            postTextSize = arrayListOf(0, 14)
            val  backgroundColor = "#606060"
            val textColor = "#D6ED17"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,5, 0, 5)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }
    fun loadPost383() {
        val post = Post()
        with(post) {
            postNum = 383
            postId= 82
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2016/01/28/10/20/old-man-1166066_1280.jpg"
            postText = arrayListOf(
                " החיים האלה אין סופיים ",
                " ההתנסות שלך בהם  ",
                " מוגבלת במודעות ובזמן.  ",
            )
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postTransparency =4
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#606060"
            val textColor = "#D6ED17"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0,0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }
        fun loadPost384() {
        val post = Post()
        with(post) {
            postNum = 384
            postId= 85
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2014/11/29/08/09/forest-549664_1280.jpg"
            postText = arrayListOf(
                " העולם הזה מפחיד ",
                " רק באותם המקומות  ",
                " בהם מקמת פחד.  ",
            )
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postTransparency =0
            postTextSize = arrayListOf(0, 18)
            val  backgroundColor = "#606060"
            val textColor = "#D6ED17"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0,0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost385() {
        val post = Post()
        with(post) {
            postNum = 385
            postId= 85
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2015/07/14/06/13/homeless-844215_1280.jpg"
            postText = arrayListOf(
                " חבל להציק לעצמך כל הזמן, ",
                " אחרים  ",
                " עושים לך את זה טוב יותר.  ",
            )
            textLocation = arrayListOf(10,-1, 30,10,0, 0, 0, 0)
            postTransparency =0
            postTextSize = arrayListOf(0, 18)
            val  backgroundColor = "#606060"
            val textColor = "#D6ED17"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0,0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost386() {
        val post = Post()
        with(post) {
            postNum = 386
            postId= 86
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2016/11/09/07/19/theravada-buddhism-1810156_1280.jpg"
            postText = arrayListOf(
                " גם אמת גדולה ",
                " יכולה להיות קטנה בשבילך ",
                " שאתה נמצא רחוק ממנה. ",
            )
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postTransparency =2
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#DA5A2A"
            val textColor = "#ffffff"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0,0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost387() {
        val post = Post()
        with(post) {
            postNum = 387
            postId= 87
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2016/07/11/15/43/woman-1509956_1280.jpg"
            postText = arrayListOf(
                " המציאות אמיתית, ",
                " מלבדה  ",
                " הכל המצאות שלך. ",
            )
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postTransparency =10
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#DA5A2A"
            val textColor = "#ffffff"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0,0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost388() {
        val post = Post()
        with(post) {
            postNum = 388
            postId= 84
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2018/08/25/07/36/girl-3629520_1280.jpg"
            postText = arrayListOf(
                " אתה אף פעם לא יודע ",
                " אם הסבל שלך אמיתי  ",
                " עד שהוא אמיתי. ",
            )
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postTransparency =8
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#F2AA4C"
            val textColor = "#101820"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0,0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost389() {
        val post = Post()
        with(post) {
            postNum = 389
            postId= 77
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2015/08/12/21/49/play-886343_1280.jpg"
            postText = arrayListOf(
                " הסכנה בעיסוק בפוליטיקה היא ",
                " שהאדם תופס אותה כתחביב  ",
                " ולא כהתמכרות מזיקה. ",
            )
            textLocation = arrayListOf(10,20, 35,-1,0, 0, 0, 0)
            postTransparency =0
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#F2AA4C"
            val textColor = "#ffffff"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0,0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost390() {
        val post = Post()
        with(post) {
            postNum = 390
            postId= 82
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2020/04/16/18/02/old-couple-5051770_1280.jpg"
            postText = arrayListOf(
                " כמה שהחדשות השוטפות ",
                " תופסות חלק גדול מעולמך  ",
                " ככה יש לך פחות מקום לעצמך.  ",
            )
            textLocation = arrayListOf(10,-1, 30,10,0, 0, 0, 0)
            postTransparency =10
            postTextSize = arrayListOf(0, 14)
            val  backgroundColor = "#DCE2F0"
            val textColor = "#50586C"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0,0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost3901() {  //v
        val post = Post()
        with(post) {
            postNum = 3901
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2016/06/06/21/53/child-1440526_1280.jpg"
            postText = arrayListOf(
                " תחייה בכיף ",
                " גם אם כולם יגידו  ",
                " שהחיים האלה לא חיים.  ",
            )
            postId=85
            textLocation = arrayListOf(10,20, 35,-1,0, 0, 0, 0)
            postTransparency =8
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,5, 0,5)
            postRadiuas = 15
            videoUrl="pn_p5_8taxg"
        }
        drawPost.drawPostFire(post, layout)
         util.sendPostToStringFirestore(post)
//        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost3902() {    //v
        val post = Post()
        with(post) {
            postNum = 3902
            postId= 87
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2014/12/08/02/59/benches-560435_1280.jpg"
            postText = arrayListOf(
                " אם תעסיק את המודעות שלך ",
                " בגריפת עלים ",
                " לא יישאר לך זמן לחטוב עצים.  ",
            )
            textLocation = arrayListOf(10,20, 35,-1,0, 0, 0, 0)
            postTransparency =7
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#1E4174"
            val textColor = "#ffffff"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,5, 0,5)
            postRadiuas = 15
            videoUrl="R_s2wiwai_0"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3903() {
        val post = Post()
        with(post) {
            postNum = 3903
            postId= 88
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2020/11/22/16/58/road-5767221_1280.jpg"
            postText = arrayListOf(
                " תנועה נכונה ",
                " תביא ",
                " מחשבה נכונה.  ",
            )
            textLocation = arrayListOf(10,-1, 30,10,0, 0, 0, 0)
            postTransparency =8
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "##000000"
            val textColor = "#ffffff"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0,0)
            postRadiuas = 15
            videoUrl="4fndeDfaWCg"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3904() {
        val post = Post()
        with(post) {
            postNum = 3904
            postId= 87
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2018/02/13/23/41/nature-3151869_1280.jpg"
            postText = arrayListOf(
                " החושך יכול במקסימום ",
                " לדבר על האור, ",
                " האור מאיר.  ",
            )
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postTransparency =10
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "##000000"
            val textColor = "#ffffff"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10,5, 10,5)
            postRadiuas = 15
            videoUrl="te7mXWqqjPI"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)

    }

    fun loadPost3905() { //v
        val post = Post()
        with(post) {
            postNum = 3905
            postId= 85
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2015/02/21/17/04/easter-bunny-644418_1280.jpg"
            postText = arrayListOf(
                " סיפורי העבר ",
                " הם ",
                " מחושי ההווה. ",
            )
            textLocation = arrayListOf(10,-1, 30,10,0, 0, 0, 0)
            postTransparency =10
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0,0)
            postRadiuas = 15
            videoUrl="Y_H9X5Jlw9Y"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3906() {  //v
        val post = Post()
        with(post) {
            postNum = 3906
            postId= 81
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2015/12/03/22/10/man-1075770_1280.jpg"
            postText = arrayListOf(
                " אתה  ",
                " זה המחשבה שלך ",
                "  בגוף שדי דומה לך.  ",
            )
            textLocation = arrayListOf(10,20, 35,-1,0, 0, 0, 0)
            postTransparency =1
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#C7D3D4"
            val textColor = "#603F83"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0,0)
            postRadiuas = 15
            videoUrl="1DQepQaporY"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3907() {   //v
        val post = Post()
        with(post) {
            postNum = 3907
            postId= 86
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2018/10/18/04/56/book-3755514_1280.jpg"
            postText = arrayListOf(
                " הזיכרונות שלך הם נחלת העבר,  ",
                " השדים שאתה עושה מהם  ",
                "  זה מה שאתה שקורה לך עכשיו.  ",
            )
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postTransparency =10
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#C7D3D4"
            val textColor = "#603F83"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0,0)
            postRadiuas = 15
            videoUrl="MWoQW-b6Ph8"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
        fun loadPost3908() { //I //v
        val post = Post()
        with(post) {
            postNum = 3908
            postId= 87
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2017/03/21/20/09/eye-2163237_1280.jpg"
            postText = arrayListOf(
                " אתה רואה את החיים האלה כאלוהים, ",
                " מנתח אותם כחיית השדה  ",
                "  ומגיב כאדם.  ",
            )
            textLocation = arrayListOf(10,-1, 30,10,0, 0, 0, 0)
            postTransparency =10
            postTextSize = arrayListOf(0, 14)
            val  backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,5, 0,5)
            postRadiuas = 15
            videoUrl="sCJh9YcrL3k"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
       fun loadPost3909() {       //v
        val post = Post()
        with(post) {
            postNum = 3909
            postId= 86
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2017/06/12/14/53/watermelon-2395804_1280.jpg"
            postText = arrayListOf(
                " העולם הזה בשבילי הוא כמו אבטיח, ",
                " מעדיף לאכול את החלקים המתוקים שלו  ",
                "  למרות שקניתי את כולו.  ",
            )
            textLocation = arrayListOf(10,-1, 30,10,0, 0, 0, 0)
            postTransparency =10
            postTextSize = arrayListOf(0, 14)
            val  backgroundColor = "#2C5F2D"
            val textColor = "#FFE77A"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,5, 0,5)
            postRadiuas = 15
            videoUrl="51Dn9vbe6GU"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

        fun loadPost3910() {  //v
        val post = Post()
        with(post) {
            postNum = 3910
            postId= 82
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2016/05/18/23/36/standard-1401913_1280.jpg"
            postText = arrayListOf(
                " מעדיף שלא להילחם על האגו שלי ",
                " שיעשה את המלחמות שלו בעצמו  ",
                "  לי אין כוח לזה.  ",
            )
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postTransparency =10
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#2C5F2D"
            val textColor = "#FFE77A"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,5, 0,5)
            postRadiuas = 15
            videoUrl="HGI6aSX4Tx8"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3911() {  //v
        val post = Post()
        with(post) {
            postNum = 3911
            postId= 86
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2019/11/11/10/05/law-4617873_1280.jpg"
            postText = arrayListOf(
                " יש המון אי צדק בעולם ",
                " והסיבה העיקרית לזה  ",
                "  שרוב הצדק מרוכז אצלך.  ",
            )
            textLocation = arrayListOf(10,-1, 30,10,0, 0, 0, 0)
            postTransparency =10
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0,0)
            postRadiuas = 15
            videoUrl="LHcP4MWABGY"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3912() { //v
        val post = Post()
        with(post) {
            postNum = 3912
            postId= 86
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2017/06/23/17/46/desert-2435404_1280.jpg"
            postText = arrayListOf(
                " מבחינת המודעות שבך, ",
                " החיים שלך  אף פעם לא התחילו  ",
                "  והם אף פעם לא יסתיימו.  ",
            )
            textLocation = arrayListOf(10,-1, 35,5,0, 0, 0, 0)
            postTransparency =10
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#EEA47F"
            val textColor = "#00539C"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,5, 0,5)
            lineSpacing= 1.1F
            postRadiuas = 15
            videoUrl="Y30pfWIQfoo"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
      fun loadPost3913() {     //v
        val post = Post()
        with(post) {
            postNum = 3913
            postId= 84
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2018/03/15/02/50/doll-3227004_1280.jpg"
            postText = arrayListOf(
                " הנוחות בלהודות שאתה סמרטוט ",
                " גוברת אצלי על הטרחה  ",
                "  של להיות מישהו מכובד.  ",
            )
            textLocation = arrayListOf(10,-1, 30,0,0, 0, 0, 0)
            postTransparency =10
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#990011"
            val textColor = "#FCF6F5"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0,0)
            lineSpacing= 1.1F
            postRadiuas = 15
            videoUrl="rfgLgC1R2EA"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3914() {
        val post = Post()
        with(post) {
            postNum = 3914
            postId= 87
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2018/04/06/00/25/trees-3294681_1280.jpg"
            postText = arrayListOf(
                " שיהיה לך ",
                " אדמה יציבה מתחת הרגליים  ",
                "  והרבה מסתורין מעל הראש.  ",
            )
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postTransparency =3
            postTextSize = arrayListOf(0, 16)
            val  backgroundColor = "#2BAE66"
            val textColor = "#FCF6F5"
            postFontFamily =103
            postBackground =util. improveColorString(backgroundColor)
            val textcolo=util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,0, 0,0)
            lineSpacing= 1.1F
            postRadiuas = 15
            videoUrl="fPGimPUUiTs"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3915() {  //v
        val post = Post()
        with(post) {
            postNum = 3915
            postId = 84
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2018/01/29/14/08/counting-3116201_1280.jpg"
            postText = arrayListOf(
                " חשבונות הנפש האלה ",
                " גורמים לך להשתפר בחשבון ",
                "  ופחות להתפתח נפשית.  ",
            )
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postTransparency = 10
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#F95700"
            val textColor = "#FCF6F5"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 5, 0, 5)
            postRadiuas = 16
            lineSpacing = 1.3f
            videoUrl="-4HI1_LTWIk"
        }

        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3916() {
        val post = Post()
        with(post) {
            postNum = 3916
            postId = 84
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2017/03/27/12/59/adult-2178560_1280.jpg"
            postText = arrayListOf(
                " תן לי את האומץ ",
                " להודות בפני עצמי לפחות  ",
                "  במה שאני .  ",
            )
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#2BAE66"
            val textColor = "#FCF6F5"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.3f
            videoUrl="vWFKdqvdLO4"
        }

        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3917() {
        val post = Post()
        with(post) {
            postNum = 3917
             lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2018/07/31/11/14/lion-3574819_960_720.jpg"
            postText = arrayListOf(
                " אל תהיה צודק, ",
                " כי אם אתה כבר צודק ",
                " אתה לא צריך גם להיות צודק . ",
            )
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postId = 84
            postTransparency = 0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#2BAE66"
            val textColor = "#FCF6F5"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.3f
            videoUrl="kUJnevqgAK8"
        }

        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3918() {
        val post = Post()
        with(post) {
            postNum = 3918
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2015/09/28/19/20/western-962576_1280.jpg"
            postText = arrayListOf(
                " באזור הנוחות שלך ",
                " אפשר להשמין מנחת או מדיכאון ",
                " אבל קשה יותר להתפתח . ",
            )
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postId = 83
            postTransparency = 10
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#2BAE66"
            val textColor = "#FCF6F5"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.3f
            videoUrl="qNM2YE2OE70"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3919() {
        val post = Post()
        with(post) {
            postNum = 3919
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2016/08/05/09/21/leaf-1571833_1280.jpg"
            postText = arrayListOf(
                " הגוף הולך ונכחד עם השנים, ",
                "היכולת שלך להתחדש בכל יום ",
                " תלויה בקשר שיש לך עם הנצח. ",
            )
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postId = 86
            postTransparency = 2
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3920() {  //v
        val post = Post()
        with(post) {
            postNum = 3920
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2017/09/03/19/06/teddy-2711675_1280.jpg"
            postText = arrayListOf(
                " פוליטיקה היא צורת חשיבה, ",
                "היא גם בית סוהר",
                " אם אין לך צורות חשיבה נוספות. ",
            )
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postId = 84
            postTransparency = 10
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 5, 0, 5)
            videoUrl="THO5WARtcdI"
              }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3921() {  //v
        val post = Post()
        with(post) {
            postNum = 3921
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2015/03/01/22/27/women-655353_1280.jpg"
            postText = arrayListOf(
                " רגשי נחיתות, ",
                "זה שאתה מתחרה עם עצמך",
                "ומגיע למקום האחרון. ",
            )
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postId = 86
            postTransparency = 6
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 5, 10, 0)
            videoUrl="f70Z3cvrQd0"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3922() {  //v==
        val post = Post()
        with(post) {
            postNum = 3922
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2016/02/18/15/07/people-1207310_1280.jpg"
            postText = arrayListOf(
                " הזקנה אינה נמדדת ",
                " לפי כמות השנים העוברות על האדם ",
                " אלא לפי כמות החיות שנותרה בו. ",
            )
            textLocation = arrayListOf(10,-1, 30,10,0, 0, 0, 0)
            postId = 86
            postTransparency = 6
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            videoUrl="ewbGlkf8Ufc"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3923() {
        val post = Post()
        with(post) {
            postNum = 3923
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2019/08/29/18/32/glass-4439673_1280.jpg"
            postText = arrayListOf(
                " החצי הכוס הריקה זו אמת ",
                " אבל קשה לשתות משם ",
                " בעיקר אם אתה ממש צמא. ",
            )
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postId = 88
            postTransparency = 6
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            videoUrl="E0cjs5gWKU4"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3924() {
        val post = Post()
        with(post) {
            postNum = 3924
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2015/06/19/21/24/avenue-815297_1280.jpg"
            postText = arrayListOf(
                " כל אמת בחיים ",
                " יכולה להיראות לך ככזב ",
                " אם היא לא קיימת בך. ",
            )
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postId = 90
            postTransparency = 4
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 5, 0, 5)
            videoUrl="8ixitSb9sJM"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3925() {
        val post = Post()
        with(post) {
            postNum = 3925
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2014/12/03/12/21/monk-555391_1280.jpg"
            postText = arrayListOf(
                " לא מכיר הרבה אנשים ",
                " שהצליחו ממש לסלוח לעצמם  ",
                " שהם רק בני אדם. ",
            )
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postId = 86
            postTransparency = 0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            videoUrl="c3nScN89Klo"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
      fun loadPost3926() {
        val post = Post()
        with(post) {
            postNum = 3926
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2016/05/05/02/37/sunset-1373171_1280.jpg"
            postText = arrayListOf(
                " ישנם שני סוגי דברים בעולם: ",
                " אלה שהם בסדר גמור  ",
                " ואלה שלא הבנת. ",
            )
            textLocation = arrayListOf(10,-1, 30,10,0, 0, 0, 0)
            postId = 88
            postTransparency = 0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            videoUrl="d-diB65scQU"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3927() {
        val post = Post()
        with(post) {
            postNum = 3927
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2017/07/24/19/22/sunset-2535770_1280.jpg"
            postText = arrayListOf(
                " מה שהכי מייחד אותך ",
                " ברגע זה,  ",
                " שאתה אתה. ",
            )
            textLocation = arrayListOf(10,10, 35,-1,0, 0, 0, 0)
            postId = 88
            postTransparency = 0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            videoUrl="WGwVoBZQ2qo"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3928() {
        val post = Post()
        with(post) {
            postNum = 3928
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2019/07/10/09/09/animal-world-4328243_1280.jpg"
            postText = arrayListOf(
                " תפיסת העולם שלך ",
                " אינה מגדירה את העולם  ",
                " אלא מגדירה אותך. ",
            )
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postId = 87
            postTransparency = 3
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            videoUrl="NlwIDxCjL-8"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3929() {
        val post = Post()
        with(post) {
            postNum = 3929
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2022/05/15/11/23/wood-pigeon-7197299_1280.jpg"
            postText = arrayListOf(
                " יונה הומה על אחד העצים, ",
                " לגביה זה סתם מי שהיא  ",
                " לגבי זו המיית העולם. ",
            )
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postId = 84
            postTransparency = 9
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 5, 0, 5)
            videoUrl="C6s2rW-GMTo"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3930() {
        val post = Post()
        with(post) {
            postNum = 3930
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2015/07/31/15/01/man-869215_1280.jpg"
            postText = arrayListOf(
                " אתה טמבל ",
                " רק אם אתה מאמין  ",
                " שאתה טמבל. ",
            )
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postId = 86
            postTransparency = 8
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 5, 0, 5)
            videoUrl="yMYLNN2xYu4"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3931() {
        val post = Post()
        with(post) {
            postNum = 3931
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2018/08/21/23/29/forest-3622519_1280.jpg"
            postText = arrayListOf(
                " אם אתה לא מכניס את האלוהות ",
                " למשוואת הקיום שלך  ",
                " אז יוצא שאתה די לבד בעולם הזה. ",
            )
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postId = 88
            postTransparency = 9
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#FCF6F5"
            val textColor = "#2BAE66"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 5,10, 0)
            videoUrl="Y30pfWIQfoo"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3932() {
        val post = Post()
        with(post) {
            postNum = 3932
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2015/07/27/19/11/beach-863139_1280.jpg"
            postText = arrayListOf(
                " זה שאני מסתדר עם החיים ",
                " זה לא אומר  ",
                " שאני ביחסים טובים איתם. ",
            )
            textLocation = arrayListOf(10,-1, 35,20,0, 0, 0, 0)
            postId = 84
            postTransparency = 8
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#FAEBEF"
            val textColor = "#6A7BA2"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            videoUrl="zGUPvJs76rg"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3933() {
        val post = Post()
        with(post) {
            postNum = 3933
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2019/06/08/11/30/people-4259948_1280.jpg"
            postText = arrayListOf(
                " רוב האנשים יודעים לשרוד, ",
                " מעטים יודעים לחיות  ",
                " ומתי מעט יודעים לחיות בטוב. ",
            )
            textLocation = arrayListOf(10,-1, 33,20,0, 0, 0, 0)
            postId = 88
            postTransparency = 10
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#606060"
            val textColor = "#D6ED17"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            videoUrl="yjJcnqZqciU"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3934() {
        val post = Post()
        with(post) {
            postNum = 3934
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2019/08/26/08/12/street-4431082_1280.jpg"
            postText = arrayListOf(
                " שיהיה בך מספיק שקט, ",
                " כדי לקלוט נכונה  ",
                " את כל הרעש הזה מסביב. ",
            )
            textLocation = arrayListOf(10,-1, 32,20,0, 0, 0, 0)
            postId = 86
            postTransparency = 6
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#606060"
            val textColor = "#D6ED17"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            videoUrl="MY_KmIxfiQA"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3935() {
        val post = Post()
        with(post) {
            postNum = 3935
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2016/01/17/19/52/old-man-1145469_1280.jpg"
            postText = arrayListOf(
                " שני דברים קשים לך בעולם: ",
                " שהוא לא מתנהל בדיוק לפי דעתך  ",
                " ושלא כל האנשים חושבים כמוך. ",
            )
            textLocation = arrayListOf(10,-1, 35,5,0, 0, 0, 0)
            postId = 86
            postTransparency = 6
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#606060"
            val textColor = "#D6ED17"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            videoUrl="nUcFGg9IVZk"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3936() {
        val post = Post()
        with(post) {
            postNum = 3936
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2016/12/28/11/32/namaste-1935938_1280.jpg"
            postText = arrayListOf(
                " שתהיה מספיק מבין ",
                " להבין  ",
                " עד כמה אתה לא מבין. ",
            )
            textLocation = arrayListOf(10,-1, 33,10,0, 0, 0, 0)
            postId = 86
            postTransparency = 8
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#606060"
            val textColor = "#D6ED17"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            videoUrl="xnWE7wlzjjs"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

  fun loadPost3937() {
      val post = Post()
      with(post) {
          postNum = 3937
          lineNum = 3
          imageUri = "https://cdn.pixabay.com/photo/2015/10/30/20/13/sunrise-1014712_960_720.jpg"
          postText = arrayListOf(
              " האומנות לחיות ",
              " זה לראות את כל הקסם ",
              " מבעד לכל הבנאליות הזו. ",
          )
          textLocation = arrayListOf(10,10, 35,-1,0, 0, 0, 0)
          postId = 90
          postTransparency = 0
          postTextSize = arrayListOf(0, 16)
          val backgroundColor = "#606060"
          val textColor = "#D6ED17"
          postFontFamily = 103
          postBackground = util.improveColorString(backgroundColor)
          val textcolo = util.improveColorString(textColor)
          val col = "#$textcolo"
          postTextColor = arrayListOf(CONSTANT, col)
          postPadding = arrayListOf(0, 0, 0, 0)
          videoUrl="tt4cR9szMS8"
      }
      drawPost.drawPostFire(post, layout)
      util.sendPostToStringFirestore(post)
  }

fun loadPost3938() {
    val post = Post()
    with(post) {
        postNum = 3938
        lineNum = 3
        imageUri = "https://cdn.pixabay.com/photo/2015/04/11/12/56/wrench-717684_960_720.jpg"
        postText = arrayListOf(
            " היית פותר את הבעיות שלך תוך שנייה ",
            " אם זה לא היית ",
            " אתה. ",
        )
        textLocation = arrayListOf(10,-1, 30,10,0,0, 0, 0)
        postId = 86
        postTransparency = 8
        postTextSize = arrayListOf(0, 14)
        val backgroundColor = "#0A174E"
        val textColor = "#D6ED17"
        postFontFamily = 103
        postBackground = util.improveColorString(backgroundColor)
        val textcolo = util.improveColorString(textColor)
        val col = "#$textcolo"
        postTextColor = arrayListOf(CONSTANT, col)
        postPadding = arrayListOf(0, 0, 0, 0)
        videoUrl="K-vmoywl_CY"
    }
    drawPost.drawPostFire(post, layout)
    util.sendPostToStringFirestore(post)
}

    fun loadPost3939() {
        val post = Post()
        with(post) {
            postNum = 3939
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2017/05/11/21/19/tee-2305381_960_720.jpg"
            postText = arrayListOf(
                " האדם מתחבט בקונפליקטים ",
                " שהוא יוצר עם עצמו. ",
                " (\"פורפטום מובילה\"). ",
            )
            textLocation = arrayListOf(10,10, 30,-1,0,0, 0, 0)
            postId = 86
            postTransparency = 5
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#0A174E"
            val textColor = "#D6ED17"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            videoUrl="U0THoV7yTeA"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3940() {
        val post = Post()
        with(post) {
            postNum = 3940
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2015/04/24/04/47/buddhist-737275_960_720.jpg"
            postText = arrayListOf(
                " אדם חייב קצת קדושה בחייו ",
                " כי הרציונליזם בונה את גופו ",
                " והקדושה את נשמתו. ",
            )
            textLocation = arrayListOf(10,10, 30,-1,0,0, 0, 0)
            postId = 85
            postTransparency = 5
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#0A174E"
            val textColor = "#D6ED17"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            videoUrl="HqqrOod1fK4"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3941() {
        val post = Post()
        with(post) {
            postNum = 3941
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2022/09/06/18/16/lake-7437204_960_720.jpg"
            postText = arrayListOf(
                " רוב המתים משאירים אחריהם ",
                " תובנה שקטה: ",
                " טוב לחיות. ",
            )
            textLocation = arrayListOf(10,10, 30,-1,0,0, 0, 0)
            postId = 84
            postTransparency = 5
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#0A174E"
            val textColor = "#D6ED17"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            videoUrl="gV6rRTKyq0Y"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

fun loadPost3942() {
    val post = Post()
    with(post) {
        postNum = 3942
        lineNum = 3
        imageUri = "https://cdn.pixabay.com/photo/2018/03/01/09/26/people-3190181_960_720.jpg"
        postText = arrayListOf(
            " דבר יפה לא קיים בפני עצמו, ",
            " הוא מותנה בקיומו של אדם ",
            " שחווה אותו כיפה. ",
        )
        textLocation = arrayListOf(10,-1, 30,5,0,0, 0, 0)
        postId = 87
        postTransparency = 10
        postTextSize = arrayListOf(0, 14)
        val backgroundColor = "#0A174E"
        val textColor = "#D6ED17"
        postFontFamily = 103
        postBackground = util.improveColorString(backgroundColor)
        val textcolo = util.improveColorString(textColor)
        val col = "#$textcolo"
        postTextColor = arrayListOf(CONSTANT, col)
        postPadding = arrayListOf(0, 0, 0, 5)
        videoUrl="M063lXohF8Y"
    }
    drawPost.drawPostFire(post, layout)
    util.sendPostToStringFirestore(post)
}

    fun loadPost3943() {
        val post = Post()
        with(post) {
            postNum = 3943
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2022/09/05/16/08/leaves-7434524_960_720.jpg"
            postText = arrayListOf(
                " אל תתבאס מזה שאתה מבואס, ",
                " בגלל ",
                " שבדרך כלל זה ממש לא תלוי בך. ",
            )
            textLocation = arrayListOf(10,5, 30,-1,0,0, 0, 0)
            postId = 89
            postTransparency = 5
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#0A174E"
            val textColor = "#D6ED17"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            videoUrl="D2kIstcBISE"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3944() {
        val post = Post()
        with(post) {
            postNum = 3944
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2015/01/28/23/35/hills-615429_960_720.jpg"
            postText = arrayListOf(
                " המתכון הנכון לחיות ",
                " הוא להשתדל שלא למות ",
                " גם שאין לך סיבה טובה לחיות. ",
            )
            textLocation = arrayListOf(10,-1, 30,5,0,0, 0, 0)
            postId = 89
            postTransparency = 5
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#0A174E"
            val textColor = "#D6ED17"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            videoUrl="nxyq-1Ca4gg"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
        fun loadPost3945() {
        val post = Post()
        with(post) {
            postNum = 3945
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2020/08/25/11/10/chess-5516446_960_720.jpg"
            postText = arrayListOf(
                " לפעמים עדיף  ",
                " להתמקד בלא לעשות טעויות ",
                " מלנצח. ",
            )
            textLocation = arrayListOf(10,-1, 33,5,0,0, 0, 0)
            postId = 88
            postTransparency =8
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#00203F"
            val textColor = "#ADEFD1"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            videoUrl="8tE0GjSQpes"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3946() {
        val post = Post()
        with(post) {
            postNum = 3946
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2019/06/25/04/32/kids-4297372_960_720.jpg"
            postText = arrayListOf(
                " אני לא מסתדר עם העולם  ",
                " רק במקרים ",
                " שהוא לא בדיוק מתחשב בי. ",
            )
            textLocation = arrayListOf(10,-1, 35,10,0,0, 0, 0)
            postId = 86
            postTransparency =8
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#00203F"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            videoUrl="bo_efYhYU2A"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3947() {
        val post = Post()
        with(post) {
            postNum = 3947
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2018/09/27/15/24/chimps-3707291_960_720.jpg"
            postText = arrayListOf(
                " בוויכוח הפוליטי שלך עם כולם  ",
                " לא ברור מי הצודק ומי הטועה ",
                " אבל בטוח מי המפסיד. ",
            )
            textLocation = arrayListOf(10,-1, 35,10,0,0, 0, 0)
            postId = 87
            postTransparency =8
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#00203F"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            videoUrl="LHcP4MWABGY"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3948() {
        val post = Post()
        with(post) {
            postNum = 3948
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2019/11/07/05/13/terror-4607688_960_720.jpg"
            postText = arrayListOf(
                " אומנם למוות אין חוש הומור  ",
                " אבל זה לא סיבה שלא להתבדח אתו ",
                " בעיקר אם הבדיחה על חשבונך. ",
            )
            textLocation = arrayListOf(10,-1, 30,10,0,0, 0, 0)
            postId = 87
            postTransparency =8
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#00203F"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            videoUrl="s9HFcqzHKLQ"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3949() {
        val post = Post()
        with(post) {
            postNum = 3949
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2017/07/31/23/45/flowers-2562079_960_720.jpg"
            postText = arrayListOf(
                " העבר והעתיד הם בדרך כלל  ",
                " סוגים של מאמץ ",
                " ההווה הוא ההרפיה. ",
            )
            textLocation = arrayListOf(10,5, 30,-1,0,0, 0, 0)
            postId = 85
            postTransparency =4
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#E69A8D"
            val textColor = "#5F4B8B"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            videoUrl="rg02Jj91NWM"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3950() {
        val post = Post()
        with(post) {
            postNum = 3950
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2017/07/30/23/38/cactus-2556000_960_720.jpg"
            postText = arrayListOf(
                " לחיות בטוב  ",
                " זה לבקש ",
                " שלא ישתנה דבר. ",
            )
            textLocation = arrayListOf(10,5, 35,-1,0,0, 0, 0)
            postId = 88
            postTransparency =8
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#616247"
            val textColor = "#DAA03D"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            videoUrl="c3GTHdexzTU"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3951() {  //I
        val post = Post()
        with(post) {
            postNum = 3951
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2016/10/18/16/18/candle-1750640_960_720.jpg"
            postText = arrayListOf(
                " כל מה שמדליק אותך ",
                " ולא גורם לשריפות יער מיותרות ",
                " מבורך. ",
            )
            textLocation = arrayListOf(10,-1, 32,5,0,0, 0, 0)
            postId = 88
            postTransparency =10
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#616247"
            val textColor = "#DAA03D"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            videoUrl="5HNJ3QuX90c"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3952() {
        val post = Post()
        with(post) {
            postNum = 3952
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2021/09/05/16/48/rapeseed-6599950_960_720.jpg"
            postText = arrayListOf(
                " האלוהים ",
                " מעולם ",
                " לא יצר אדם שיצר אותו. ",
            )
            textLocation = arrayListOf(10,5, 35,-1,0,0, 0, 0)
            postId = 89
            postTransparency =8
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#616247"
            val textColor = "#DAA03D"
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

    fun loadPost3953() { //I
        val post = Post()
        with(post) {
            postNum = 3953
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2015/01/01/23/55/telephone-586266_960_720.jpg"
            postText = arrayListOf(
                " כדאי לך לשמור קשר כלשהו ",
                " עם החיים שלך, ",
                " יש סיכוי שתשתמש בהם יום אחד. ",
            )
            textLocation = arrayListOf(10,-1, 35,10,0,0, 0, 0)
            postId = 86
            postTransparency =5
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#616247"
            val textColor = "#DAA03D"
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

    fun loadPost3954() {
        val post = Post()
        with(post) {
            postNum = 3954
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2017/09/25/11/55/fittings-2784902_960_720.jpg"
            postText = arrayListOf(
                " האדם הוא מכונה פשוטה ",
                " ההופכת מוצרי מזון למחשבות ",
                " בתהליך הקרוי חיים. ",
            )
            textLocation = arrayListOf(10,-1, 33,10,0,0, 0, 0)
            postId = 87
            postTransparency =10
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            videoUrl="HRN1o7sFvUA"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3955() { //I
        val post = Post()
        with(post) {
            postNum = 3955
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2019/03/30/19/28/para-4091873_960_720.jpg"
            postText = arrayListOf(
                " בכל בוקר אני עושה היכרות מחודשת עם עצמי, ",
                " לפעמים יש כימיה ביננו ",
                " לפעמים פחות. ",
            )
            textLocation = arrayListOf(10,-1, 32,10,0,0, 0, 0)
            postId = 87
            postTransparency =5
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            videoUrl="E_3rcyHK3k0"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3956() { //I
        val post = Post()
        with(post) {
            postNum = 3956
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2016/07/09/12/16/apples-1506119_960_720.jpg"
            postText = arrayListOf(
                " החיים שלך ",
                " במקצתם זה מה שקורה בהם ",
                " וברובם איך שאתה מתייחס לזה. ",
            )
            textLocation = arrayListOf(10,-1, 30,25,0,0, 0, 0)
            postId = 87
            postTransparency =9
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 5)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3957() { //I
        val post = Post()
        with(post) {
            postNum = 3957
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2016/11/18/16/16/teddy-bear-1835598_960_720.jpg"
            postText = arrayListOf(
                " אין מנצחים ומפסידים בעולם הזה, ",
                " יש רק אנשים שחושבים שהם ניצחו ",
                " ואנשים שחושבים שהם הפסידו. ",
            )
            textLocation = arrayListOf(10,70, 30,-1,0,0, 0, 0)
            postId = 87
            postTransparency =0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 5)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3958() {
        val post = Post()
        with(post) {
            postNum = 3958
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2019/10/15/11/51/tears-4551435_960_720.jpg"
            postText = arrayListOf(
                " זה שאתה משתדל להבין את החיים ",
                " זה לא מבטיח לך ",
                " שהחיים ישתדלו להבין אותך. ",
            )
            textLocation = arrayListOf(10,-1, 30,10,0,0, 0, 0)
            postId = 87
            postTransparency =0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 5)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3959() {  //I
        val post = Post()
        with(post) {
            postNum = 3959
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2013/06/26/19/23/intravenous-141551_960_720.jpg"
            postText = arrayListOf(
                " אתה אף פעם ",
                " לא יודע מה הבעיות שלך ",
                " עד שיש לך ממש בעיות. ",
            )
            textLocation = arrayListOf(10,-1, 25,150,0,0, 0, 0)
            postId = 87
            postTransparency =0
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#000000"
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

    fun loadPost3960() {  //I
        val post = Post()
        with(post) {
            postNum = 3960
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2014/08/08/20/55/worried-girl-413690_960_720.jpg"
            postText = arrayListOf(
                " האדם מרגיש מסכן ברגע מסוים ",
                " פשוט כי הוא מסכן באותו רגע ",
                " ולא בגלל שום סיבה אחרת. ",
            )
            textLocation = arrayListOf(10,20, 30,-1,0,0, 0, 0)
            postId = 87
            postTransparency =0
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#ffffff"
            val textColor = "#000000"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            videoUrl="h-WPexVEujg"
          videoText=util1.getVideoText(postNum)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)

    }
//    private fun getVideoText(postNum: Int): String {
////        val fileName="v${postNum}"
//        val fileName="VideoCurrentText"
//        return context.applicationContext.assets
//            .open(fileName)
//            .bufferedReader().use {
//                it.readText()
//            }
//    }

    fun loadPost3961() {  //I
        val post = Post()
        with(post) {
            postNum = 3961
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2018/01/16/17/38/animal-3086397_960_720.jpg"
            postText = arrayListOf(
                " כל מה שאתה חושב על העולם, ",
                " זה רק ",
                " מה שאתה חושב על העולם. ",
            )
            textLocation = arrayListOf(10,60, 25,-1,0,0, 0, 0)
            postId = 87
            postTransparency =9
            postTextSize = arrayListOf(0, 12)
            val backgroundColor = "#000000"
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
    fun loadPost3962() {  //I
        val post = Post()
        with(post) {
            postNum = 3962
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2015/07/14/06/09/man-844211_960_720.jpg"
            postText = arrayListOf(
                " הדרך לחיים נכונים יותר, ",
                " להגיב פחות ",
                " ולהכיל יותר. ",
            )
            textLocation = arrayListOf(10,60, 25,-1,0,0, 0, 0)
            postId = 87
            postTransparency =0
            postTextSize = arrayListOf(0, 20)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 110
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3963() {
        val post = Post()
        with(post) {
            postNum = 3963
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2016/11/19/20/55/apples-1841132_960_720.jpg"
            postText = arrayListOf(
                " לשווק את החיים שלך לאחרים ",
                " זו טעות שיווקית ",
                " בגלל שיש להם כבר חיים משל עצמם. ",
            )
            textLocation = arrayListOf(10,240, 25,-1,0,0, 0, 0)
            postId = 85
            postTransparency =8
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#000000"
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

    fun loadPost3964() {  //I
        val post = Post()
        with(post) {
            postNum = 3964
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2019/10/14/15/53/women-4549266_960_720.jpg"
            postText = arrayListOf(
                " גן העדן והגיהנום ",
                " הם לא מקומות בעולם הבא ",
                " הם תפיסות עולם בעולם הזה. ",
            )
            textLocation = arrayListOf(10,20, 35,-1,0,0, 0, 0)
            postId = 85
            postTransparency =0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            videoUrl="QkF3oxziUI4"
            videoText=util1.getVideoText(postNum)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3965() {  //I
        val post = Post()
        with(post) {
            postNum = 3965
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2022/06/12/11/57/street-7257864_960_720.jpg"
            postText = arrayListOf(
                " המפתח לשקט הנפשי ",
                " הוא ",
                " מציאת ההשלמות בחוסר השלמות השגרתי. ",
            )
            textLocation = arrayListOf(10,-1, 23,170,0,0, 0, 0)
            postId = 85
            postTransparency =5
            postTextSize = arrayListOf(0, 13)
            val backgroundColor = "#000000"
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

    fun loadPost3966() {  //I
        val post = Post()
        with(post) {
            postNum = 3966
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2020/12/03/20/25/girl-5801502_960_720.jpg"
            postText = arrayListOf(
                " תשתדל שלא לתת ",
                " למחשבות שלך על החיים ",
                " להרוס לך את החיים. ",
            )
            textLocation = arrayListOf(10,100, 23,-1,0,0, 0, 0)
            postId = 85
            postTransparency =5
            postTextSize = arrayListOf(0, 13)
            val backgroundColor = "#000000"
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

    fun loadPost3967() {  //I
        val post = Post()
        with(post) {
            postNum = 3967
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2017/08/04/01/46/boy-2578814_960_720.jpg"
            postText = arrayListOf(
                "    אתה אף פעם לא יודע   ",
                "     שקורים לך ימים טובים     ",
                " עד שקורים לך ימים פחות טובים. ",
            )
            textLocation = arrayListOf(10,-1, 28,10,0,0, 0, 0)
            postId = 85
            postTransparency =10
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#424242"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            videoUrl="Ri7-vnrJD3k"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3968() {  //I
        val post = Post()
        with(post) {
            postNum = 3968
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2016/11/23/18/42/boy-1854308_960_720.jpg"
            postText = arrayListOf(
                " אם תיקח את עצמך ",
                " קצת יותר בקלות ",
                " יהיה לך קל יותר. ",
            )
            textLocation = arrayListOf(10,-1, 23,150,0,0, 0, 0)
            postId = 85
            postTransparency =10
            postTextSize = arrayListOf(0, 13)
            val backgroundColor = "#1E4174"
            val textColor = "#DDA94B"
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

    fun loadPost3969() {  //I
        val post = Post()
        with(post) {
            postNum = 3969
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2016/01/28/10/20/old-man-1166066_960_720.jpg"
            postText = arrayListOf(
                " עם השנים ",
                " העולם שוחק את הגוף האנושי ",
                " האדם את עצמו. ",
            )
            textLocation = arrayListOf(10,-1, 23,250,0,0, 0, 0)
            postId = 85
            postTransparency =10
            postTextSize = arrayListOf(0, 12)
            val backgroundColor = "#1E4174"
            val textColor = "#DDA94B"
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

    fun loadPost3970() {  //I
        val post = Post()
        with(post) {
            postNum = 3970
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2015/06/06/22/38/baby-799956_960_720.jpg"
            postText = arrayListOf(
                " ההצלחה שלך בחיים ",
                " נמדדת לפי הכושר שלך ",
                " שלא להציק לעצמך. ",
            )
            textLocation = arrayListOf(10,-1, 25,100,0,0, 0, 0)
            postId = 85
            postTransparency =10
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#1E4174"
            val textColor = "#DDA94B"
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

    fun loadPost3971() {
        val post = Post()
        with(post) {
            postNum = 3971
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2019/04/26/12/41/grandfather-4157450_960_720.jpg"
            postText = arrayListOf(
                " אם יש לך כוח לכעוס ",
                "  אז עדיין יש לך כוח כלשהוא  ",
                " וגם זה לטובה. ",
            )
            textLocation = arrayListOf(10,-1, 30,5,0,0, 0, 0)
            postId = 85
            postTransparency =10
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#1E4174"
            val textColor = "#DDA94B"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            videoUrl="RvgC3lbXLuk"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3972() {
        val post = Post()
        with(post) {
            postNum = 3972
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2013/03/23/23/10/brush-96240_960_720.jpg"
            postText = arrayListOf(
                " החיים שלך זו היצירה שלך ",
                "  הביקורת שלך על החיים האלה  ",
                " זה חלק מהיצירה הזו. ",
            )
            textLocation = arrayListOf(10,-1, 30,5,0,0, 0, 0)
            postId = 85
            postTransparency =10
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#A4193D"
            val textColor = "#FFDFB9"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            videoUrl="-tPcc1ftj8E"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
     fun loadPost3973() {
        val post = Post()
        with(post) {
            postNum = 3973
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2013/04/03/19/55/house-100205_960_720.jpg"
            postText = arrayListOf(
                " בכל יום שאתה בונה את העולם שלך ",
                " תשתדל שלא לעשות את זה עם חומרים נחותים, ",
                "  אחרי הכל אתה הולך לחיות בזה כל היום. ",
            )
            textLocation = arrayListOf(10,-1, 30,5,0,30, 1, 30)
            postId = 85
            postTransparency =10
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#101820"
            val textColor = "#FEE715"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 5)
            videoUrl="Sy8xcD3MZgs"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3974() {
        val post = Post()
        with(post) {
            postNum = 3974
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2019/12/11/18/11/storm-4688918_960_720.jpg"
            postText = arrayListOf(
                " אף אחד לא יודע כלום ",
                " על החיים שלך ",
                "  כי רק אתה נמצא שם. ",
            )
            textLocation = arrayListOf(10,-1, 30,5,0,0,0, 0)
            postId = 85
            postTransparency =10
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#101820"
            val textColor = "#FEE715"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 5)
            videoUrl="zwoCuzGMS_I"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3975() {
        val post = Post()
        with(post) {
            postNum = 3975
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2021/09/26/07/48/man-6656628_960_720.jpg"
            postText = arrayListOf(
                " בשביל להיכנס למים ולהישאר יבש ",
                " אתה צריך רק דבר אחד, ",
                "  מישהו שיאמין לסיפורים שלך. ",
            )
            textLocation = arrayListOf(10,-1, 30,5,0,0,0, 0)
            postId = 85
            postTransparency =10
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#101820"
            val textColor = "#FEE715"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 5)
            videoUrl="gGjkFLoiwJM"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost3976() {
        val post = Post()
        with(post) {
            postNum = 3976
            lineNum = 3
            imageUri = "https://cdn.pixabay.com/photo/2018/09/03/23/56/sea-3652697_960_720.jpg"
            postText = arrayListOf(
                " החיים הם כמו אוקינוס גדול, ",
                " רק כשאתה מגיע לאזור קו החוף ",
                "  אתה מתחיל להבין את זה. ",
            )
            textLocation = arrayListOf(10,-1, 35,5,0,0,0, 0)
            postId = 85
            postTransparency =10
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#101820"
            val textColor = "#FEE715"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 5)
            videoUrl="55O5FzEwdxc"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
}





