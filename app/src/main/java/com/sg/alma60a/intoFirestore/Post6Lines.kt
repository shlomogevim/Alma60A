package com.sg.alma60a

import android.app.Activity
import android.content.Context
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
class Post6Lines(val context: Context) {

    private val layout: ConstraintLayout = (context as Activity).findViewById(R.id.itemLayoutFire)
    val drawPost= DrawPostCenter(context)
    private val util= Utility()

    fun loadPost600() {
        val post = Post()
        with(post) {
            postNum = 600
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2021/03/27/05/10/pills-6127501_1280.jpg"
            postText = arrayListOf(
                "המיינד",
                "הוא כדור הרגעה",
                "מהאין סופיות של החיים,",
                "טוב להשתמש בו מידי פעם,",
                "אבל כדי לשמור קשר טוב למציאות",
                "רצוי שלא להתמכר אליו יותר מידי."
            )
            val di = 0
            val du = 0
            postMargin = arrayListOf(
                arrayListOf(0, -1 + du, 0, 370 + di),
                arrayListOf(0, -1 + du, 0, 310+ di),
                arrayListOf(0, -1 + du, 0, 255 + di),
                arrayListOf(0, -1 + du, 0, 195 + di),
                arrayListOf(0, -1 + du, 0,90 + di),
                arrayListOf(0, -1 + du, 0, 0 + di)
            )
            postBackground = "030e4f"
            postTransparency = 10
            postTextSize = arrayListOf(0,24)
            postPadding = arrayListOf(10, 10, 10, 10)
            val col="#f49f1c"
            postTextColor = arrayListOf(CONSTANT,col)
            postFontFamily = 100
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }
    fun loadPost601() {
        var post = Post()
        with(post) {
            postNum = 601
            lineNum =6
            imageUri = "https://cdn.pixabay.com/photo/2020/01/14/23/16/unicorn-4766547_1280.jpg"
            postText = arrayListOf(
                "אתה חי בתוך אגדה עתיקה,",
                "גן העדן והגיהנום נמצאים כאן ועכשיו,",
                "ומי שמחליט לאיזה מחוזות תנוע בעולם הזה הוא:",
                "אתה.",
                "ומה שנותר פתוח",
                "זו אותה אמונה באגדות עתיקות."
            )
            val di = 0
            val du = 0
            postMargin = arrayListOf(
                arrayListOf(0, 0 + du, 0, -1 + di),
                arrayListOf(0,35 + du, 0, -1 + di),
                arrayListOf(0, 95+ du, 0, -1 + di),
                arrayListOf(0,155 + du, 0, -1 + di),
                arrayListOf(0, 190 + du, 0,-1 + di),
                arrayListOf(0,225 + du, 0, -1 + di)
            )
            postTextSize = arrayListOf(0, 20)
            postTransparency = 7
            postBackground = "337def"
            val textColor = "fcc727"
            postFontFamily = 5
            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
    fun loadPost602() {
        var post = Post()
        with(post) {
            postNum = 602
            lineNum =6
            imageUri = "https://cdn.pixabay.com/photo/2018/11/02/09/50/human-3789910_1280.jpg"
            postText = arrayListOf(
                "הגאומטריה של הסבל,",
                "במשולש הקיום שלך שלשה קודקודים: ",
                "מה שאתה צריך,",
                "מה שאתה רוצה",
                "ומה שיש לך,",
                "וככול ששטח המשולש קטן יותר," +
                        " אתה פחות סובל."
            )
            val di = 0
            val du = 0
            postMargin = arrayListOf(
                arrayListOf(0, 0 + du, 0, -1 + di),
                arrayListOf(0,35 + du, 0, -1 + di),
                arrayListOf(0, 95+ du, 0, -1 + di),
                arrayListOf(0,130 + du, 0, -1 + di),
                arrayListOf(0, 165 + du, 0,-1 + di),
                arrayListOf(0,200 + du, 0, -1 + di)
            )
            postTextSize = arrayListOf(0, 20)
            postTransparency = 7
            postBackground = "337def"
            val textColor = "fcc727"
            postFontFamily = 5
            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
    fun loadPost603() {
        var post = Post()
        with(post) {
            postNum = 603
            lineNum =6
            imageUri = "https://cdn.pixabay.com/photo/2018/01/26/08/32/nature-3108066__480.jpg"
            postText = arrayListOf(
                " גן העדן והגיהנום ",
                "הם לא מקומות",
                "בעולם הבא,",
                "הם יותר צורת",
                "המחשבות שלך",
                "בעולם הזה."
            )
            val di = 0
            val du = 50
           /* postMargin = arrayListOf(
                arrayListOf(0, -1 + du, 0, 200 + di),
                arrayListOf(0, -1 + du, 0, 160 + di),
                arrayListOf(0, -1 + du, 0,120 + di),
                arrayListOf(0, -1 + du, 0, 80 + di),
                arrayListOf(0, -1 + du, 0, 40 + di),
                arrayListOf(0, -1 + du, 0, 0 + di)
            )*/
            postMargin = arrayListOf(
                arrayListOf(0, 0 + du, 0, -1 + di),
                arrayListOf(0,40+ du, 0, -1 + di),
                arrayListOf(0, 80+ du, 0, -1 + di),
                arrayListOf(0,120 + du, 0, -1 + di),
                arrayListOf(0, 160+ du, 0,-1 + di),
                arrayListOf(0,200 + du, 0, -1 + di)
            )
            postTextSize = arrayListOf(0, 24)
            postTransparency = 0
            postBackground = "428289"
            val textColor = "007591"
            postFontFamily = 240
            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
    fun loadPost604() {
        val post = Post()
        with(post) {
            postNum = 604
            lineNum =6
            imageUri = "https://cdn.pixabay.com/photo/2015/07/09/22/45/tree-838667_1280.jpg"
            postText = arrayListOf(
                "נחמה",
                "זה שמישהו אומר לך ",
                "שאתה בסדר,",
                "שלווה",
                "זה שאתה מבין",
                "שאתה בסדר."
            )
            val di =0
            val du =20
            postMargin = arrayListOf(
                arrayListOf(0, 0 + du, 0, -1 + di),
                arrayListOf(0,30+ du, 0, -1 + di),
                arrayListOf(0, 60+ du, 0, -1 + di),
                arrayListOf(0,100 + du, 0, -1 + di),
                arrayListOf(0, 130+ du, 0,-1 + di),
                arrayListOf(0,160 + du, 0, -1 + di)
            )

            postTransparency =0
            postTextSize = arrayListOf(0, 20)
            postBackground = "1E4174"
            val textColor = "DDA94B"
            postFontFamily =300

            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
     fun loadPost605() {
        val post = Post()
        with(post) {
            postNum = 605
            lineNum =6
            imageUri = "https://cdn.pixabay.com/photo/2020/02/06/09/39/girl-4823612_1280.jpg"
            postText = arrayListOf(
                "החופש הזה שלא לדעת",
                "החופש הזה שלא להיות צודק ",
                "החופש הזה שלא להיות מקובל",
                "החופש הזה שלא להיות חכם",
                "החופש הזה שלא להיות מישהו",
                "החופש הזה של רק להיות."
            )
            val di =0
            val du =10
            postMargin = arrayListOf(
                arrayListOf(0, 0 + du, 0, -1 + di),
                arrayListOf(0,30+ du, 0, -1 + di),
                arrayListOf(0, 60+ du, 0, -1 + di),
                arrayListOf(0,90 + du, 0, -1 + di),
                arrayListOf(0, 120+ du, 0,-1 + di),
                arrayListOf(0,150 + du, 0, -1 + di)
            )

            postTransparency =5
            postTextSize = arrayListOf(0, 16)
            postBackground = "#101820"
            val textColor = "DDA94B"
            postFontFamily =300

            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 5, 10, 5)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost606() {
        val post = Post()
        with(post) {
            postNum = 606
            lineNum =6
            imageUri = "https://cdn.pixabay.com/photo/2010/12/16/14/49/justice-3612_1280.jpg"
            val st1=" בסעיף של "
            val st2="עשה אל תעשה"
            val st12="\""
            val st=st1+st12+st2+st12
            postText = arrayListOf(
                st,
                " אל תחשוב במושגים של: ",
                " טוב ורע, ",
                "אלא במושגים של: ",
                "מתאים למה שאני ",
                "לא מתאים  למה שאני."
            )
            val di =0
            val du =10
            postMargin = arrayListOf(
                arrayListOf(0, 0 + du, 0, -1 + di),
                arrayListOf(0,35+ du, 0, -1 + di),
                arrayListOf(0,70+ du, 0, -1 + di),
                arrayListOf(0,105 + du, 0, -1 + di),
                arrayListOf(0, 140+ du, 0,-1 + di),
                arrayListOf(0,175 + du, 0, -1 + di)
            )

            postTransparency =5
            postTextSize = arrayListOf(0, 18)
            postBackground = "#101820"
            val textColor = "DDA94B"
            postFontFamily =103

            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10,0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

fun loadPost607() {
    val post = Post()
    with(post) {
        postNum = 607
        lineNum =6
        imageUri = "https://cdn.pixabay.com/photo/2017/02/10/15/10/love-2055372_1280.jpg"
           postText = arrayListOf(
               " בדרך כלל ",
            "בשר ודם הוא רק בשר ודם, ",
            "ולפעמים ",
            "בשר ודם הופך לעפר",
            "ולפעמים ",
            "הוא הופך לקסם."
        )
        val di =0
        val du =0
        postMargin = arrayListOf(
            arrayListOf(0, 0 + du, 0, -1 + di),
            arrayListOf(0,35+ du, 0, -1 + di),
            arrayListOf(0,-1+ du, 0, 115+ di),
            arrayListOf(0,-1+ du, 0, 80 + di),
            arrayListOf(0, -1+ du, 0,45 + di),
            arrayListOf(0,-1 + du, 0,10 + di)
        )

        postTransparency =6
        postTextSize = arrayListOf(0, 18)
        postBackground = "#101820"
        val textColor = "DDA94B"
        postFontFamily =103

        val col = "#$textColor"
        postTextColor = arrayListOf(CONSTANT, col)
        postPadding = arrayListOf(10, 0, 10,0)
        postRadiuas = 15

    }
    drawPost.drawPostFire(post, layout)
    util.sendPostToStringFirestore(post)
}

    fun loadPost608() {
        val post = Post()
        with(post) {
            postNum = 608
            lineNum =6
            imageUri = "https://cdn.pixabay.com/photo/2011/12/13/14/28/earth-11009_1280.jpg"
            postText = arrayListOf(
                "העולם מתנהל לפי דרכו",
                "ממש בסדר",
                "האנשים גם הם מתנהלים לפי דרכם",
                "ממש בסדר",
                "ואם אתה חושב אחרת",
                " גם זה ממש בסדר."
            )
            val di =0
            val du =0
            postMargin = arrayListOf(
                arrayListOf(0, -1 + du, 0, 160 + di),
                arrayListOf(0,-1+ du, 0, 130 + di),
                arrayListOf(0,-1+ du, 0, 100+ di),
                arrayListOf(0,-1+ du, 0, 70 + di),
                arrayListOf(0, -1+ du, 0,40 + di),
                arrayListOf(0,-1 + du, 0,10 + di)
            )

            postTransparency =6
            postTextSize = arrayListOf(0, 15)
            postBackground = "#101820"
            val textColor = "DDA94B"
            postFontFamily =103

            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10,0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost609() {
        val post = Post()
        with(post) {
            postNum = 609
            lineNum =6
            imageUri = "https://cdn.pixabay.com/photo/2018/05/02/09/29/auto-3368094_1280.jpg"
            postText = arrayListOf(
                "מאמין במה שאינו נגמר לעולם,",
                "באנשים שנשארים בך",
                "גם אחרי שהם הולכים,",
                "בשירים שעדיין מתנגנים בך ",
                "במרחק השנים,",
                " ובמה שחי בך מאז ומתמיד."
            )
            val di =0
            val du =0
            postMargin = arrayListOf(
                arrayListOf(0, -1 + du, 0, 190 + di),
                arrayListOf(0,-1+ du, 0, 150 + di),
                arrayListOf(0,-1+ du, 0, 115+ di),
                arrayListOf(0,-1+ du, 0, 80 + di),
                arrayListOf(0, -1+ du, 0,45 + di),
                arrayListOf(0,-1 + du, 0,10 + di)
            )

            postTransparency =10
            postTextSize = arrayListOf(0, 17)
            postBackground = "#07553B"
            val textColor = "#CED46A"
            postFontFamily =103

            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10,0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost610() {
        val post = Post()
        with(post) {
            postNum = 610
            lineNum =6
            imageUri = "https://cdn.pixabay.com/photo/2013/08/18/23/09/goats-173940_1280.jpg"
            postText = arrayListOf(
                " כדי להישרד ",
                " אתה צריך לפעמים ",
                "  להתעמת עם העולם סביבך, ",
                " כדי להיות נכון ",
                " אתה צריך לפעמים ",
                "להתעמת עם עצמך. "
            )
            val di =0
            val du =0
            postMargin = arrayListOf(
                arrayListOf(0, -1 + du, 0, 185 + di),
                arrayListOf(0,-1+ du, 0, 150 + di),
                arrayListOf(0,-1+ du, 0, 115+ di),
                arrayListOf(0,-1+ du, 0, 80 + di),
                arrayListOf(0, -1+ du, 0,45 + di),
                arrayListOf(0,-1 + du, 0,10 + di)
            )

            postTransparency =6
            postTextSize = arrayListOf(0, 17)
            postBackground = "#07553B"
            val textColor = "#CED46A"
            postFontFamily =103

            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10,0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost611() {
        val post = Post()
        with(post) {
            postNum = 611
            lineNum =6
            imageUri = "https://cdn.pixabay.com/photo/2017/10/06/00/25/woman-2821623_1280.jpg"
            postText = arrayListOf(
                " העולם הזה ברדק אחד גדול, ",
                " אף אחד לא אומר לך ",
                " מתי החיים שלך מתחילים, ",
                " וגם תאריך הסיום לא ברור, ",
                " בוא נאמר ששירות הלקוחות שלהם ",
                "  לא משהו.  "
            )
            val di =0
            val du =0
            postMargin = arrayListOf(
                arrayListOf(0, -1 + du, 0, 185 + di),
                arrayListOf(0,-1+ du, 0, 150 + di),
                arrayListOf(0,-1+ du, 0, 115+ di),
                arrayListOf(0,-1+ du, 0, 80 + di),
                arrayListOf(0, -1+ du, 0,45 + di),
                arrayListOf(0,-1 + du, 0,10 + di)
            )

            postTransparency =10
            postTextSize = arrayListOf(0, 15)
            postBackground = "#ACC7B4"
            val textColor = "#331B3F"
            postFontFamily =103

            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5,5, 5,5)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost612() {
        val post = Post()
        with(post) {
            postNum = 612
            lineNum =6
            imageUri = "https://cdn.pixabay.com/photo/2017/01/18/16/53/earth-1990298_1280.jpg"
            postText = arrayListOf(
                " אתה כמו לווין אבוד בחלל ",
                " שנע סביב כדור הארץ, ",
                " היחס שלך לעולם ",
                " הוא נקודת המבט הרגעית שלך על הכדור, ",
                " פעם אתה קולט אותו בצידו האפל ",
                "  ופעם בצידו המואר. "
            )
            val di =0
            val du =0
            postMargin = arrayListOf(
                arrayListOf(0, 0 + du, 0, -1 + di),
                arrayListOf(0,35+ du, 0, -1 + di),
                arrayListOf(0,70+ du, 0, -1 + di),
                arrayListOf(0,105 + du, 0, -1 + di),
                arrayListOf(0, 140+ du, 0,-1 + di),
                arrayListOf(0,175 + du, 0, -1 + di)
            )
            postTransparency =10
            postTextSize = arrayListOf(0, 13)
            postBackground = "#331B3F"
            val textColor = "#ACC7B4"
            postFontFamily =103

            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,5, 0,5)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
        fun loadPost613() {
        val post = Post()
        with(post) {
            postNum = 613
            lineNum =6
            imageUri = "https://images.unsplash.com/photo-1575893363557-0aa0ab80e225?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=870&q=80"
            postText = arrayListOf(
                " דוח מצב זמני : ",
                " אתה נמצא על כוכב לכת כלשהו ",
                " בצורה מוגדרת ובתפקיד לא ידוע, ",
                " הגוף מוכר לך בתשוקותיו ומכאוביו, ",
                " אבל אתה לא ברור ",
                "  מלבד היכולת הזאת לראות ולחוות. "
            )
            val di =-10
            val du =0
            postMargin = arrayListOf(
                arrayListOf(0, -1 + du, 0, 185 + di),
                arrayListOf(0,-1+ du, 0, 150 + di),
                arrayListOf(0,-1+ du, 0, 115+ di),
                arrayListOf(0,-1+ du, 0, 80 + di),
                arrayListOf(0, -1+ du, 0,45 + di),
                arrayListOf(0,-1 + du, 0,10 + di)
            )
            postTransparency =10
            postTextSize = arrayListOf(0, 13)
            postBackground = "#CCF381"
            val textColor = "#4831D4"
            postFontFamily =103

            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,5, 0,5)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

fun loadPost614() {
    val post = Post()
    with(post) {
        postNum = 614
        lineNum =6
        imageUri = "https://cdn.pixabay.com/photo/2016/09/01/19/07/boy-1637188_1280.jpg"
        postText = arrayListOf(
            " המוצר הכי מיותר בעולם ",
            " שהאדם יוצר על בסיס יומי ",
            " הם עוגמות הנפש, ",
            " הם ממש לא שימושיות, ",
            " מבאסות לך את החיים ",
            "  ומקשות עליך להיות מה שאתה. "
        )
        val di =10
        val du =0
        postMargin = arrayListOf(
            arrayListOf(0, -1 + du, 0, 185 + di),
            arrayListOf(0,-1+ du, 0, 150 + di),
            arrayListOf(0,-1+ du, 0, 115+ di),
            arrayListOf(0,-1+ du, 0, 80 + di),
            arrayListOf(0, -1+ du, 0,45 + di),
            arrayListOf(0,-1 + du, 0,10 + di)
        )
        postTransparency =0
        postTextSize = arrayListOf(0, 16)
        postBackground = "#CCF381"
        val textColor = "#DDA94B"
        postFontFamily =103

        val col = "#$textColor"
        postTextColor = arrayListOf(CONSTANT, col)
        postPadding = arrayListOf(0,5, 0,5)
        postRadiuas = 15
    }
    drawPost.drawPostFire(post, layout)
    util.sendPostToStringFirestore(post)
}

    fun loadPost615() {
        val post = Post()
        with(post) {
            postNum = 615
            lineNum =6
            imageUri = "https://cdn.pixabay.com/photo/2019/06/08/11/30/people-4259948_1280.jpg"
            postText = arrayListOf(
                " אלוהי הרייטינג  ",
                " נבחר כאל הכי פופולרי ביקום, ",
                " אני יודע שזה לא צודק ",
                " ויש אחרים ששווים יותר ",
                " אבל זה העולם שהאדם יצר סביבו ",
                "  בצלמו ובדמות. "
            )
            val di =0
            val du =0
            postMargin = arrayListOf(
                arrayListOf(0, -1 + du, 0, 185 + di),
                arrayListOf(0,-1+ du, 0, 150 + di),
                arrayListOf(0,-1+ du, 0, 115+ di),
                arrayListOf(0,-1+ du, 0, 80 + di),
                arrayListOf(0, -1+ du, 0,45 + di),
                arrayListOf(0,-1 + du, 0,10 + di)
            )
            postTransparency =5
            postTextSize = arrayListOf(0, 16)
            postBackground = "#02343F"
            val textColor = "#F0EDCC"
            postFontFamily =103

            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,5, 0,5)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost616() {
        val post = Post()
        with(post) {
            postNum = 616
            lineNum =6
            imageUri = "https://cdn.pixabay.com/photo/2019/07/17/22/06/sri-lanka-4345091_1280.jpg"
            postText = arrayListOf(
                " שהייתי קטן  ",
                " רציתי להכיר את העולם, ",
                " שהייתי כבר יותר גדול ",
                " השתדלתי להסתדר אתו כמה שיותר, ",
                " ועכשיו בגילי המופלג  ",
                "  אני מסתפק בכמה שפחות להיפגע ממנו. "
            )
            val di =0
            val du =0
            postMargin = arrayListOf(
                arrayListOf(0, -1 + du, 0, 185 + di),
                arrayListOf(0,-1+ du, 0, 150 + di),
                arrayListOf(0,-1+ du, 0, 115+ di),
                arrayListOf(0,-1+ du, 0, 80 + di),
                arrayListOf(0, -1+ du, 0,45 + di),
                arrayListOf(0,-1 + du, 0,10 + di)
            )
            postTransparency =10
            postTextSize = arrayListOf(0, 13)
            postBackground = "#02343F"
            val textColor = "#F0EDCC"
            postFontFamily =103
            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,5, 0,5)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
     fun loadPost617() {
        val post = Post()
        with(post) {
            postNum = 617
            lineNum =6
            imageUri = "https://cdn.pixabay.com/photo/2017/10/21/15/04/sea-2874928_1280.jpg"
            postText = arrayListOf(
                " הזמן שעובר  ",
                " הוא השובל שאתה משאיר אחריך ",
                " במסע הזה שלך באוקיאנוס הקיום, ",
                " ומי שמצליח לראות את השובל הזה ",
                " נעלם לאט לתוך המים הגדולים  ",
                " מודע לתנועה שלו בחיים. "
            )
            val di =0
            val du =0
            postMargin = arrayListOf(
                arrayListOf(0, -1 + du, 0, 185 + di),
                arrayListOf(0,-1+ du, 0, 150 + di),
                arrayListOf(0,-1+ du, 0, 115+ di),
                arrayListOf(0,-1+ du, 0, 80 + di),
                arrayListOf(0, -1+ du, 0,45 + di),
                arrayListOf(0,-1 + du, 0,10 + di)
            )
            postTransparency =8
            postTextSize = arrayListOf(0, 15)
            postBackground = "#1E4174"
            val textColor = "#DDA94B"
            postFontFamily =103
            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,5, 0,0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
        fun loadPost618() {
        val post = Post()
        with(post) {
            postNum = 618
            lineNum =6
            imageUri = "https://cdn.pixabay.com/photo/2022/01/25/19/13/nature-6967075_1280.jpg"
            postText = arrayListOf(
                 " אי אפשר להבין את הגוף האנושי ",
                " אבל אפשר לראות את התנועה שלו, ",
                " הגוף הזה מובל על ידי המודעות  ",
                " ככלב ההולך אחרי אדונו, ",
                " אי אפשר לראות המודעות הזו ",
                " אבל אפשר להבין אותה. "
            )
            val di =0
            val du =0
            postMargin = arrayListOf(
                arrayListOf(0, 0 + du, 0, -1 + di),
                arrayListOf(0,35+ du, 0, -1 + di),
                arrayListOf(0,70+ du, 0, -1 + di),
                arrayListOf(0,105 + du, 0, -1 + di),
                arrayListOf(0, 140+ du, 0,-1 + di),
                arrayListOf(0,175 + du, 0, -1 + di)
            )
            postTransparency =6
            postTextSize = arrayListOf(0, 15)
            postBackground = "#1E4174"
            val textColor = "#DDA94B"
            postFontFamily =103
            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,5, 0,0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
        fun loadPost619() {
        val post = Post()
        with(post) {
            postNum = 619
            postId=82
            lineNum =6
            imageUri = "https://cdn.pixabay.com/photo/2017/08/02/19/52/girl-2573111_1280.jpg"
            postText = arrayListOf(
                " השוטה ",
                " נמצא ברע ",
                " גם שהוא בטוב,  ",
                " החכם ",
                " נמצא בטוב ",
                " גם שהוא ברע. "
            )
            val di =0
            val du =0
            postMargin = arrayListOf(
                arrayListOf(0, 0 + du, 0, -1 + di),
                arrayListOf(0,35+ du, 0, -1 + di),
                arrayListOf(0,70+ du, 0, -1 + di),
                arrayListOf(0,105 + du, 0, -1 + di),
                arrayListOf(0, 140+ du, 0,-1 + di),
                arrayListOf(0,175 + du, 0, -1 + di)
            )
            postTransparency =2
            postTextSize = arrayListOf(0, 18)
            postBackground = "#1E4174"
            val textColor = "#DDA94B"
            postFontFamily =103
            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,5, 0,0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost620() {
        val post = Post()
        with(post) {
            postNum = 620
            postId=84
            lineNum =6
            imageUri = "https://cdn.pixabay.com/photo/2013/01/17/16/13/daisy-75191_1280.jpg"
            postText = arrayListOf(
                " בין לחיות בעולם חסר ",
                " של -לרצות- ",
                " לבין לחיות בשממה  ",
                " של -לא לרצות-, ",
                " עדיף לחיות עכשיו ",
                " את מה שיש. "
            )
            val di =0
            val du =0
            postMargin = arrayListOf(
                arrayListOf(0, -1 + du, 0, 185 + di),
                arrayListOf(0,-1+ du, 0, 150 + di),
                arrayListOf(0,-1+ du, 0, 115+ di),
                arrayListOf(0,-1+ du, 0, 80 + di),
                arrayListOf(0, -1+ du, 0,45 + di),
                arrayListOf(0,-1 + du, 0,10 + di)
            )
            postTransparency =2
            postTextSize = arrayListOf(0, 15)
            postBackground = "#1E4174"
            val textColor = "#ffffff"
            postFontFamily =103
            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,5, 0,0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost621() {
        val post = Post()
        with(post) {
            postNum = 621
            postId=81
            lineNum =6
            imageUri = "https://cdn.pixabay.com/photo/2018/01/09/11/04/dog-3071334_1280.jpg"
            postText = arrayListOf(
                " אפשר לרדוף כל היום אחרי הזנב שלך ",
                " מיטב הכלבים עושים את זה ",
                " בעיקר שהם גורים קטנים,  ",
                " והשאלה הקוסמית העולה: ",
                " האם אתה מנטלית ",
                " גור כלבים טיפוסי. "
            )
            val di =0
            val du =0
            postMargin = arrayListOf(
                arrayListOf(0, -1 + du, 0, 185 + di),
                arrayListOf(0,-1+ du, 0, 150 + di),
                arrayListOf(0,-1+ du, 0, 115+ di),
                arrayListOf(0,-1+ du, 0, 80 + di),
                arrayListOf(0, -1+ du, 0,45 + di),
                arrayListOf(0,-1 + du, 0,10 + di)
            )
            postTransparency =2
            postTextSize = arrayListOf(0, 15)
            postBackground = "#1E4174"
            val textColor = "#ffffff"
            postFontFamily =103
            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,5, 0,0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
        //util.sendPostToStringFirestore(post)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost622() {
        val post = Post()
        with(post) {
            postNum = 622
            postId=85
            lineNum =6
            imageUri = "https://cdn.pixabay.com/photo/2015/01/13/13/20/guy-598180_1280.jpg"
            postText = arrayListOf(
                " לחיות את הקונפליקט ",
                " בין מה שאתה עכשיו ",
                " למה שהיית לפני חמש דקות,  ",
                " זו משימה די קשה ",
                " בעיקר אם אתה מאמין ",
                " שיש לך אישיות מוגדרת. "
            )
            val di =0
            val du =10
            postMargin = arrayListOf(
                arrayListOf(0, 0 + du, 0, -1 + di),
                arrayListOf(0,35+ du, 0, -1 + di),
                arrayListOf(0,70+ du, 0, -1 + di),
                arrayListOf(0,105 + du, 0, -1 + di),
                arrayListOf(0, 140+ du, 0,-1 + di),
                arrayListOf(0,175 + du, 0, -1 + di)
            )
            postTransparency =0
            postTextSize = arrayListOf(0, 15)
            postBackground = "#1E4174"
            val textColor = "#02343F"
            postFontFamily =103
            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,5, 0,0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost623() {
        val post = Post()
        with(post) {
            postNum = 623
            postId=92
            lineNum =6
            imageUri = "https://cdn.pixabay.com/photo/2018/11/13/22/44/fire-3814159_1280.jpg"
            postText = arrayListOf(
                " אתה יוצר את אלוהיך ",
                " שיוצר אותך, ",
                " תיצור אותו מעגל הזהב  ",
                " הוא יהיה עגל זהב, ",
                " תיצור אותו מסנה בוער ",
                " הוא יהיה סנה בוער. "
            )
            val di =0
            val du =10
            postMargin = arrayListOf(
                arrayListOf(0, 0 + du, 0, -1 + di),
                arrayListOf(0,35+ du, 0, -1 + di),
                arrayListOf(0,70+ du, 0, -1 + di),
                arrayListOf(0,105 + du, 0, -1 + di),
                arrayListOf(0, 140+ du, 0,-1 + di),
                arrayListOf(0,175 + du, 0, -1 + di)
            )
            postTransparency =8
            postTextSize = arrayListOf(0, 15)
            postBackground = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily =103
            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0,5, 0,0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
  
  }

