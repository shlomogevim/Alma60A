package com.sg.alma60a

import android.app.Activity
import android.content.Context
import androidx.constraintlayout.widget.ConstraintLayout
import com.sg.alma60a.model.Post

class Post6Lines(val context: Context) {

    private val layout: ConstraintLayout = (context as Activity).findViewById(R.id.itemLayoutFire)
    val pref = context.getSharedPreferences(SHARPREF_ALMA, Context.MODE_PRIVATE)
    val drawPost = DrawPostCenter(context)
    private val util = Utility()
    private val util1 = Utility1(context)

    fun loadPost600() {
        val post = Post()
        with(post) {
            postNum = 600
            lineNum = 6
            postId = 70
            imageUri = "https://cdn.pixabay.com/photo/2021/03/27/05/10/pills-6127501_1280.jpg"
            postText = arrayListOf(
                "המיינד",
                "הוא כדור הרגעה",
                "מהאין סופיות של החיים,",
                "טוב להשתמש בו מידי פעם,",
                "אבל כדי לשמור קשר טוב למציאות",
                "רצוי שלא להתמכר אליו יותר מידי."
            )
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
            postBackground = "030e4f"
            postTransparency = 7
            postTextSize = arrayListOf(0, 14)
            postPadding = arrayListOf(10, 0, 10, 0)
            val col = "#f49f1c"
            postTextColor = arrayListOf(CONSTANT, col)
            postFontFamily = 103
            postRadiuas = 15
            videoUrl="9hu0yzZk_Fk"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost601() {
        var post = Post()
        with(post) {
            postNum = 601
            postId = 74
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2020/01/14/23/16/unicorn-4766547_1280.jpg"
            postText = arrayListOf(
                "אתה חי בתוך אגדה עתיקה,",
                "גן העדן והגיהנום נמצאים כאן ועכשיו,",
                "ומי שמחליט לאיזה מחוזות תנוע בעולם הזה הוא:",
                "אתה.",
                "ומה שנותר פתוח",
                "זו אותה אמונה באגדות עתיקות."
            )
            textLocation = arrayListOf(10, 50, 30, -1, 3, 30, 0, 0)
            postTextSize = arrayListOf(0, 14)
            postTransparency = 5
            postBackground = "337def"
            val textColor = "fcc727"
            postFontFamily = 103
            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15
            videoUrl="gdS5uRgu_TA"
        }

        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost602() {
        var post = Post()
        with(post) {
            postNum = 602
            postId = 74
            lineNum = 6
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
            textLocation = arrayListOf(10, -1, 30, 5, 4,28, 0, 0)
            postTextSize = arrayListOf(0, 14)
            postTransparency =10
            postBackground = "000000"
            val textColor = "fcc727"
            postFontFamily = 103
            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(10, 0, 10, 0)
           videoUrl="cCqGnplGdAY"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost603() {
        var post = Post()
        with(post) {
            postNum = 603
            postId = 77
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2022/11/17/03/20/woman-7597270_960_720.jpg"
            postText = arrayListOf(
                " גן העדן והגיהנום ",
                "הם לא מקומות",
                "בעולם הבא,",
                "הם יותר צורת",
                "המחשבות שלך",
                "בעולם הזה."
            )
            textLocation = arrayListOf(10, -1, 35, 5, 0, 0, 0, 0)
            postTextSize = arrayListOf(0, 16)
            postTransparency = 5
            postBackground = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 240
            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(10, 5, 10, 0)
            videoUrl="VTbqsoJYAZA"
             }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost604() {
        val post = Post()
        with(post) {
            postNum = 604
            postId = 84
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2022/08/29/22/33/sunset-7419911_960_720.jpg"
            postText = arrayListOf(
                "נחמה",
                "זה שמישהו אומר לך ",
                "שאתה בסדר,",
                "שלווה",
                "זה שאתה מבין",
                "שאתה בסדר."
            )
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
            postTransparency = 10
            postTextSize = arrayListOf(0, 20)
            postBackground = "1E4174"
            val textColor = "DDA94B"
            postFontFamily = 300
            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
           videoUrl="FmC6LU2AgMM"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost605() {
        val post = Post()
        with(post) {
            postNum = 605
            postId = 80
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2014/11/21/15/40/farmer-540658_960_720.jpg"
            postText = arrayListOf(
                "החופש הזה שלא לדעת,",
                "החופש הזה שלא להיות צודק,",
                "החופש הזה שלא להיות מקובל,",
                "החופש הזה שלא להיות חכם,",
                "החופש הזה שלא להיות מישהו,",
                "החופש הזה של רק להיות."
            )
            textLocation = arrayListOf(10, -1, 30, 5, 0, 0, 0, 0)
            postTransparency = 10
            postTextSize = arrayListOf(0, 14)
            postBackground = "#101820"
            val textColor = "DDA94B"
            postFontFamily = 103

            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
             videoUrl="fgbmzSGK_0E"
        }

        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost606() {
        val post = Post()
        with(post) {
            postNum = 606
            postId = 75
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2010/12/16/14/49/justice-3612_1280.jpg"
            val st1 = " בסעיף של "
            val st2 = "עשה אל תעשה"
            val st12 = "\""
            val st = st1 + st12 + st2 + st12
            postText = arrayListOf(
                st,
                " אל תחשוב תמיד במושגים של: ",
                " טוב ורע, ",
                "אלא במושגים של: ",
                "מתאים למה שאני ",
                "לא מתאים  למה שאני."
            )
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            postTransparency = 10
            postTextSize = arrayListOf(0, 16)
            postBackground = "#101820"
            val textColor = "DDA94B"
            postFontFamily = 103

            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 5)
            videoUrl="CH5DPl0NfEs"

        }
            drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost607() {
        val post = Post()
        with(post) {
            postNum = 607
            postId = 86
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2020/04/11/01/14/couple-5028352_960_720.jpg"
            postText = arrayListOf(
                " בדרך כלל ",
                "בשר ודם הוא רק בשר ודם, ",
                "ולפעמים ",
                "הוא הופך לעפר ואפר",
                "ולפעמים ",
                "הוא הופך לקסם."
            )
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            postTransparency = 10
            postTextSize = arrayListOf(0, 16)
            postBackground = "#101820"
            val textColor = "DDA94B"
            postFontFamily = 103
            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 5, 10, 0)
            videoUrl="Wb7bt2_9aHw"
        }
       drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost608() {
        val post = Post()
        with(post) {
            postNum = 608
            postId = 72
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2011/12/13/14/28/earth-11009_1280.jpg"
            postText = arrayListOf(
                "העולם מתנהל לפי דרכו",
                "ממש בסדר,",
                "האנשים גם הם מתנהלים לפי דרכם",
                "ממש בסדר,",
                "ואם אתה חושב אחרת",
                " גם זה ממש בסדר."
            )
            postTransparency = 10
            postTextSize = arrayListOf(0, 15)
            postBackground = "#101820"
            val textColor = "DDA94B"
            postFontFamily = 103
            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
           videoUrl="ZQJiRZZhtR0"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost609() {
        val post = Post()
        with(post) {
            postNum = 609
            postId = 86
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2018/05/02/09/29/auto-3368094_1280.jpg"
            postText = arrayListOf(
                "מאמין במה שאינו נגמר לעולם,",
                "באנשים שנשארים בך",
                "גם אחרי שהם הולכים,",
                "בשירים שעדיין מתנגנים בך ",
                "במרחק השנים,",
                " ובמה שחי בך מאז ומתמיד."
            )
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            postTransparency = 10
            postTextSize = arrayListOf(0, 16)
            postBackground = "#07553B"
            val textColor = "#CED46A"
            postFontFamily = 103
            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 5)
           videoUrl="MnLXJmrB0-A"

        }
               drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost610() {
        val post = Post()
        with(post) {
            postNum = 610
            postId = 72
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2015/04/17/16/08/poverty-727510_960_720.jpg"
            postText = arrayListOf(
                " כדי להישרד ",
                " אתה צריך לפעמים ",
                "  להתעמת עם העולם סביבך, ",
                " כדי להיות נכון ",
                " אתה צריך לפעמים ",
                "להתעמת עם עצמך. "
            )
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
            postTransparency = 10
            postTextSize = arrayListOf(0, 14)
            postBackground = "#F5D042"
            val textColor = "#0A174E"
            postFontFamily = 103
            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
           videoUrl="RM-rr0L7luE "
        }

        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost611() {
        val post = Post()
        with(post) {
            postNum = 611
            postId = 74
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2017/10/06/00/25/woman-2821623_1280.jpg"
            postText = arrayListOf(
                " העולם הזה ברדק אחד גדול, ",
                " אף אחד לא אומר לך ",
                " מתי החיים שלך מתחילים, ",
                " וגם תאריך הסיום לא ברור, ",
                " בוא נאמר ששירות הלקוחות שלהם ",
                "  לא משהו.  "
            )
            textLocation = arrayListOf(10, 10, 35, -1, 0, 0, 0, 0)
            postTransparency = 8
            postTextSize = arrayListOf(0, 15)
            postBackground = "#ACC7B4"
            val textColor = "#331B3F"
            postFontFamily = 103
            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5, 5, 5, 0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost612() {
        val post = Post()
        with(post) {
            postNum = 612
            lineNum = 6
            postId = 72
            imageUri = "https://cdn.pixabay.com/photo/2017/01/18/16/53/earth-1990298_1280.jpg"
            postText = arrayListOf(
                " אתה כמו לווין אבוד בחלל ",
                " שנע סביב כדור הארץ, ",
                " היחס שלך לעולם ",
                " הוא נקודת המבט הרגעית שלך על הכדור, ",
                " פעם אתה קולט אותו בצידו האפל ",
                "  ופעם בצידו המואר. "
            )
            textLocation = arrayListOf(10, 0, 35, -1, 0, 0, 0, 0)
            postTransparency = 8
            postTextSize = arrayListOf(0, 13)
            postBackground = "#331B3F"
            val textColor = "#ACC7B4"
            postFontFamily = 103

            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 5, 0, 5)
        }
       drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost613() {
        val post = Post()
        with(post) {
            postNum = 613
            postId = 70
            lineNum = 6
            imageUri =
                "https://images.unsplash.com/photo-1575893363557-0aa0ab80e225?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=870&q=80"
            postText = arrayListOf(
                " דוח מצב זמני : ",
                " אתה נמצא על כוכב לכת כלשהו ",
                " בצורה מוגדרת ובתפקיד לא ידוע, ",
                " הגוף מוכר לך בתשוקותיו ומכאוביו, ",
                " אבל אתה לא ברור ",
                "  מלבד היכולת הזאת לראות ולחוות. "
            )
            textLocation = arrayListOf(10, 10, 35, -1, 0, 0, 0, 0)
            postTransparency = 8
            postTextSize = arrayListOf(0, 13)
            postBackground = "#CCF381"
            val textColor = "#4831D4"
            postFontFamily = 103

            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 5, 0, 5)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)    }

    fun loadPost614() {
        val post = Post()
        with(post) {
            postNum = 614
            lineNum = 6
            postId = 84
            imageUri = "https://cdn.pixabay.com/photo/2016/09/01/19/07/boy-1637188_1280.jpg"
            postText = arrayListOf(
                " המוצר הכי מיותר בעולם ",
                " שהאדם יוצר על בסיס יומי ",
                " הם עוגמות הנפש, ",
                " הם ממש לא שימושיות, ",
                " מבאסות לך את החיים ",
                "  ומקשות עליך להיות מה שאתה. "
            )
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            postTransparency = 7
            postTextSize = arrayListOf(0, 16)
            postBackground = "#02343F"
            val textColor = "#F0EDCC"
            postFontFamily = 103
            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 5, 0, 0)
           }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost615() {
        val post = Post()
        with(post) {
            postNum = 615
            postId = 71
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2019/06/08/11/30/people-4259948_1280.jpg"
            postText = arrayListOf(
                " אלוהי הרייטינג  ",
                " נבחר כאל הכי פופולרי ביקום, ",
                " אני יודע שזה לא צודק ",
                " ויש אחרים ששווים יותר ",
                " אבל זה העולם שהאדם יצר סביבו ",
                "  בצלמו ובדמות. "
            )
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            postTransparency = 5
            postTextSize = arrayListOf(0, 16)
            postBackground = "#02343F"
            val textColor = "#F0EDCC"
            postFontFamily = 103
            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 5)
            postRadiuas = 15
        }
         drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)    }

    fun loadPost616() {
        val post = Post()
        with(post) {
            postNum = 616
            postId = 82
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2019/07/17/22/06/sri-lanka-4345091_1280.jpg"
            postText = arrayListOf(
                " שהייתי קטן  ",
                " רציתי להכיר את העולם, ",
                " שהייתי כבר יותר גדול ",
                " השתדלתי להסתדר אתו כמה שיותר, ",
                " ועכשיו בגילי המופלג  ",
                "  אני מסתפק בכמה שפחות להיפגע ממנו. "
            )
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
            postTransparency = 10
            postTextSize = arrayListOf(0, 13)
            postBackground = "#02343F"
            val textColor = "#F0EDCC"
            postFontFamily = 103
            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 5, 0, 5)
             }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost617() {
        val post = Post()
        with(post) {
            postNum = 617
            postId = 78
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2017/10/21/15/04/sea-2874928_1280.jpg"
            postText = arrayListOf(
                " הזמן שעובר  ",
                " הוא השובל שאתה משאיר אחריך ",
                " במסע הזה שלך באוקיאנוס הקיום, ",
                " ומי שמצליח לראות את השובל הזה ",
                " נעלם לאט לתוך המים הגדולים  ",
                " מודע לתנועה שלו בחיים. "
            )
            textLocation = arrayListOf(10, 10, 30, -1, 0, 0, 0, 0)
            postTransparency = 8
            postTextSize = arrayListOf(0, 15)
            postBackground = "#1E4174"
            val textColor = "#DDA94B"
            postFontFamily = 103
            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)

        }
         drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost618() {
        val post = Post()
        with(post) {
            postNum = 618
            postId = 71
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2022/01/25/19/13/nature-6967075_1280.jpg"
            postText = arrayListOf(
                " אי אפשר להבין את הגוף האנושי ",
                " אבל אפשר לראות את התנועה שלו, ",
                " הגוף הזה מובל על ידי המודעות  ",
                " ככלב ההולך אחרי אדונו, ",
                " אי אפשר לראות המודעות הזו ",
                " אבל אפשר להבין אותה. "
            )
            textLocation = arrayListOf(10, 10, 30, -1, 0, 0, 0, 0)
            postTransparency = 6
            postTextSize = arrayListOf(0, 15)
            postBackground = "#1E4174"
            val textColor = "#DDA94B"
            postFontFamily = 103
            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost619() {
        val post = Post()
        with(post) {
            postNum = 619
            postId = 79
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2017/08/02/19/52/girl-2573111_1280.jpg"
            postText = arrayListOf(
                " השוטה ",
                " נמצא ברע ",
                " גם שהוא בטוב,  ",
                " החכם ",
                " נמצא בטוב ",
                " גם שהוא ברע. "
            )
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
            postTransparency = 6
            postTextSize = arrayListOf(0, 16)
            postBackground = "#1E4174"
            val textColor = "#DDA94B"
            postFontFamily = 103
            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)

        }

        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost620() {
        val post = Post()
        with(post) {
            postNum = 620
            postId = 81
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2013/01/17/16/13/daisy-75191_1280.jpg"
            postText = arrayListOf(
                " בין לחיות בעולם חסר ",
                " של -לרצות- ",
                " לבין לחיות בשממה  ",
                " של -לא לרצות-, ",
                " עדיף לחיות עכשיו ",
                " את מה שיש. "
            )
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
            postTransparency = 5
            postTextSize = arrayListOf(0, 15)
            postBackground = "#1E4174"
            val textColor = "#ffffff"
            postFontFamily = 103
            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 5, 0, 0)

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost621() {
        val post = Post()
        with(post) {
            postNum = 621
            postId = 81
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2018/01/09/11/04/dog-3071334_1280.jpg"
            postText = arrayListOf(
                " אפשר לרדוף כל היום אחרי הזנב שלך ",
                " מיטב הכלבים עושים את זה ",
                " בעיקר שהם גורים קטנים,  ",
                " והשאלה הקוסמית העולה: ",
                " האם אתה מנטלית ",
                " גור כלבים טיפוסי. "
            )
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
            postTransparency = 2
            postTextSize = arrayListOf(0, 15)
            postBackground = "#1E4174"
            val textColor = "#ffffff"
            postFontFamily = 103
            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 5, 0, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost622() {
        val post = Post()
        with(post) {
            postNum = 622
            postId = 87
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2015/01/13/13/20/guy-598180_1280.jpg"
            postText = arrayListOf(
                " לחיות את הקונפליקט ",
                " בין מה שאתה עכשיו ",
                " למה שהיית לפני חמש דקות,  ",
                " זו משימה די קשה ",
                " בעיקר אם אתה מאמין ",
                " שיש לך אישיות מוגדרת. "
            )
            textLocation = arrayListOf(10, 10, 30, -1, 0, 0, 0, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 15)
            postBackground = "#1E4174"
            val textColor = "#02343F"
            postFontFamily = 103
            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 5, 0, 0)
            postRadiuas = 15
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost623() {
        val post = Post()
        with(post) {
            postNum = 623
            postId = 85
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2018/11/13/22/44/fire-3814159_1280.jpg"
            postText = arrayListOf(
                " אתה יוצר את אלוהיך ",
                " שיוצר אותך, ",
                " תיצור אותו מעגל הזהב  ",
                " הוא יהיה עגל זהב, ",
                " תיצור אותו מסנה בוער ",
                " הוא יהיה סנה בוער. "
            )
            postTransparency = 8
            postTextSize = arrayListOf(0, 15)
            postBackground = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
            postRadiuas = 15
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost624() {
        val post = Post()
        with(post) {
            postNum = 624
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2021/09/28/14/21/clocks-6664622_1280.jpg"
            postText = arrayListOf(
                " לכל רגע יש את האיכות שלו, ",
                " ואם אתה לא מוצא אותה ",
                " כנראה חיפשת את האיכות הזו  ",
                " בזמן או במקום אחר, ",
                " או שבכלל לא חיפשת אותה ",
                " בגלל שאין לך צורך אישי בזה. "
            )
            textLocation = arrayListOf(10, 5, 30, -1, 0, 0, 0, 0)
            postId = 84
            postTransparency = 8
            postTextSize = arrayListOf(0, 15)
            postBackground = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15
            lineSpacing = 1.4f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost625() {
        val post = Post()
        with(post) {
            postNum = 625
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2015/01/21/00/56/door-husband-606236_1280.jpg"
            postText = arrayListOf(
                " אומנם העולם גדול ורחב  ",
                " אבל אתה חי בתוך הראש שלך ",
                " שכולו בגודל כדורגל ממוצע,  ",
                " אז מה הפלא ",
                " שאתה מרגיש בדרך כלל ",
                " שהעולם מתאמן עליך בבעיטות חופשיות. "
            )
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
            postId = 86
            postTransparency = 5
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

    fun loadPost626() {
        val post = Post()
        with(post) {
            postNum = 626
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2016/08/31/19/22/portrait-1634421_1280.jpg"
            postText = arrayListOf(
                " אל תטריד את השדים שלך ",
                " תן להם לחיות את חייהם במנוחה ",
                " רחוק ממך בארץ השדים,  ",
                " אתה יכול לקרא להם מידי פעם ",
                " כי אחרי הכל אתם ידידים וותיקים ",
                " אבל רצוי שלא להגזים בזה. "
            )
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
            postId = 86
            postTransparency = 2
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

    fun loadPost627() {
        val post = Post()
        with(post) {
            postNum = 627
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2015/05/31/10/51/technology-791029_1280.jpg"
            postText = arrayListOf(
                " מודיעים לך ברשת  ",
                " מתי להיות שמח ומתי עצוב ",
                " ובאמת אתה נהיה כזה,  ",
                " והכי גרוע  ",
                " שזה ממש לא תלוי בך ",
                " או במה שקורה סביבך. "
            )
            textLocation = arrayListOf(10, 10, 30, -1, 0, 0, 0, 0)
            postId = 82
            postTransparency = 5
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
     fun loadPost628() {
        val post = Post()
        with(post) {
            postNum = 628
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2018/03/31/10/31/sense-3277815_1280.jpg"
            postText = arrayListOf(
                " הרוח מעיפה הכל  ",
                " גם נעל בית וגם עיתון ישן, ",
                " רוח הזמנים שבאה עם היום החדש  ",
                " מעיפה אותך מעצמך,  ",
                " בעיקר אם אתה תופס את עצמך ",
                " כנעל בית או עיתון ישן. "
            )
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
            postId = 85
            postTransparency = 7
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#50586C"
            val textColor = "#DCE2F0"
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

    fun loadPost629() {
        val post = Post()
        with(post) {
            postNum = 629
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2016/11/29/06/20/blonde-1867768_1280.jpg"
            postText = arrayListOf(
                " אתה מה שאתה מיועד להיות  ",
                " בדיוק ",
                " לא יותר לא פחות,  ",
                " התיסכול שלך צריך להיות  ",
                " ממה שיועדת להיות ",
                " לא ממה שאתה. "
            )
            textLocation = arrayListOf(10, 5, 35, -1, 0, 0, 0, 0)
            postId = 81
            postTransparency = 7
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#6A7BA2"
            val textColor = "#FFDFDE"
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
    fun loadPost630() {
        val post = Post()
        with(post) {
            postNum = 630
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2021/07/08/03/55/mount-everest-6395759_1280.jpg"
            postText = arrayListOf(
                " מודעות ",
                " זה לדעת מאיפה אתה בא ",
                " ולאיפה את הולך,  ",
                " אותנטיות  ",
                " זה לתת לידע הזה מקום וזמן ",
                " לאורך כל המסע. "
            )
            textLocation = arrayListOf(10, 5, 35, -1, 0, 0, 0, 0)
            postId = 85
            postTransparency = 7
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#6A7BA2"
            val textColor = "#FFDFDE"
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

    fun loadPost631() {
        val post = Post()
        with(post) {
            postNum = 631
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2019/07/15/14/11/grain-4339477_1280.jpg"
            postText = arrayListOf(
                " אם האלוהים היה יודע ",
                " שהאדם מסתפק בפייסבוק, ",
                " נראה שהוא היה מביא לו  ",
                " אלבום צילומי סלפי,  ",
                " במקום לארגן לו ",
                " מסע מורכב שכזה בארץ החיים. "
            )
            textLocation = arrayListOf(10, -1, 35, 5, 0, 0, 0, 0)
            postId = 86
            postTransparency = 6
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postPadding = arrayListOf(5, 0, 5, 5)
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost632() {
        val post = Post()
        with(post) {
            postNum = 632
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2016/06/30/20/37/broken-heart-1489818_1280.jpg"
            postText = arrayListOf(
                " לשפוך טונה של מים ",
                " סתם באמצע המדבר, ",
                " זה כמו  ",
                " להשקיע טונה רגשות ",
                " במלחמות אבודות, ",
                " זה לא יצמיח דבר. "
            )
            textLocation = arrayListOf(10, -1, 35, 5, 0, 0, 0, 0)
            postId = 87
            postTransparency = 6
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postPadding = arrayListOf(10, 0, 10, 0)
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost633() {
        val post = Post()
        with(post) {
            postNum = 633
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2017/05/07/19/46/desperate-2293377_1280.jpg"
            postText = arrayListOf(
                " כאדם ",
                " יש לך את האישור האלוהי ",
                " להיות טמבל,  ",
                " אבל רק כתזכורת, ",
                " זו לא חובה ",
                " להשתמש באישור הזה. "
            )
            textLocation = arrayListOf(10, -1, 35, 5, 0, 0, 0, 0)
            postId = 88
            postTransparency = 6
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#101820"
            val textColor = "#F2AA4C"
            postPadding = arrayListOf(10, 0, 10, 0)
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost634() {
        val post = Post()
        with(post) {
            postNum = 634
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2017/09/30/09/39/time-2801596_1280.jpg"
            postText = arrayListOf(
                " אין רגע משעמם או חסר ערך ",
                " בחיים האלה, ",
                " אבל יש הרבה רגעים  ",
                " שאתה פשוט לא מבין ",
                " או לא  מקבל ",
                " את טיבם. "
            )
            textLocation = arrayListOf(10, -1, 35, 5, 0, 0, 0, 0)
            postId = 89
            postTransparency = 10
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#0A174E"
            val textColor = "#F2AA4C"
            postPadding = arrayListOf(10, 0, 10, 0)
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost635() {  //I
        val post = Post()
        with(post) {
            postNum = 635
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2017/06/14/07/52/train-2401406_960_720.jpg"
            postText = arrayListOf(
                " אם אתה לא שומע ",
                " את שקשוק גלגלי רכבת החיים שלך ",
                " העוברת ביעף על מסילת הזמנים,  ",
                " אז כנראה ",
                " אתה תקוע באיזה תחנה ",
                " בעבר שלך. "
            )
            textLocation = arrayListOf(10,80, 30, -1, 0, 0, 0, 0)
            postId = 87
            postTransparency = 10
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#0A174E"
            val textColor = "#F2AA4C"
            postPadding = arrayListOf(10, 0, 10, 0)
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
       fun loadPost636() {
        val post = Post()
        with(post) {
            postNum = 636
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2021/02/13/13/02/red-lighthouse-6011477_960_720.jpg"
            postText = arrayListOf(
                " ביום בהיר עם ראות טובה ",
                " כזה שרואים חופשי למרחקים ",
                " אם תחפש את קצה העולם,  ",
                " תראה אחרי מאמצים רבים ",
                " שם בקצה האופק ",
                " אותך מחפש את קצה העולם. "
            )
            textLocation = arrayListOf(10,5, 30, -1, 0, 0, 0, 0)
            postId = 90
            postTransparency =10
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#0A174E"
            val textColor = "#F2AA4C"
            postPadding = arrayListOf(10, 0, 10, 5)
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost637() {
        val post = Post()
        with(post) {
            postNum = 637
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2016/08/17/00/31/trains-1599445_960_720.jpg"
            postText = arrayListOf(
                " האדם רוצה ",
                " שבמותו ",
                " יזכרו את האהבות שלו,  ",
                " אבל משום מה ",
                " בחייו ",
                " הוא מטפח את השנאות שלו. "
            )
            textLocation = arrayListOf(10,5, 30, -1, 0, 0, 0, 0)
            postId = 85
            postTransparency =10
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#0A174E"
            val textColor = "#F2AA4C"
            postPadding = arrayListOf(10, 0, 10, 0)
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost638() {
        val post = Post()
        with(post) {
            postNum = 638
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2018/03/06/18/39/ball-3204197_960_720.jpg"
            postText = arrayListOf(
                " אתה כמו כדור משחק, ",
                " לכאורה אתה יכול לנוע לכל כיוון ",
                " (קוראים לזה: בחירה חופשית)  ",
                " למעשה אתה נע ",
                " רק לפי ",
                " איך שהחיים האלה בועטים אותך. "
            )
            textLocation = arrayListOf(10,5, 30, -1, 0, 0, 0, 0)
            postId = 86
            postTransparency =3
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#0A174E"
            val textColor = "#F2AA4C"
            postPadding = arrayListOf(10, 0, 10, 0)
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost639() {
        val post = Post()
        with(post) {
            postNum = 639
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2019/12/23/05/41/woman-4713807_960_720.jpg"
            postText = arrayListOf(
                " לפעמים, ",
                " שאתה לבד ",
                " זה לא בגלל שהשאירו אותך מאחור,  ",
                " אלא בגלל שבקטע הזה ",
                " של הדרך הזו שלך ",
                " יש מקום לאדם אחד בלבד. "
            )
            textLocation = arrayListOf(10,5, 30, -1, 0, 0, 0, 0)
            postId = 88
            postTransparency =7
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#0A174E"
            val textColor = "#F2AA4C"
            postPadding = arrayListOf(10, 0, 10, 0)
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost640() {  //I
        val post = Post()
        with(post) {
            postNum = 640
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2015/12/07/20/17/baby-1081334_960_720.jpg"
            postText = arrayListOf(
                " בחיים האלה אתה נמצא תמיד ",
                " אבל תמיד ",
                " בזמן הנכון ובמקום הנכון לך,  ",
                " ומה שנותר לך בכל זה ",
                " להתרווח לחוות ואולי אפילו להנות  ",
                " מהרגע הזה במסע הזה. "
            )
            textLocation = arrayListOf(10,350, 29, -1, 0, 0, 0, 0)
            postId = 88
            postTransparency =7
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#0A174E"
            val textColor = "#F2AA4C"
            postPadding = arrayListOf(10, 0, 10, 0)
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost641() {  //I
        val post = Post()
        with(post) {
            postNum = 641
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2015/07/31/06/50/forest-868715_960_720.jpg"
            postText = arrayListOf(
                " מי שאומר שהעולם חרא ",
                " צודק מאה אחוז ",
                " מי שאומר שהעולם נפלא  ",
                " צודק מאה אחוז, ",
                " כל אחד רואה את העולם  ",
                " מהמקום שהוא מצוי בו ברגע זה. "
            )
            textLocation = arrayListOf(10,350, 29, -1, 0, 0, 0, 0)
            postId = 88
            postTransparency =9
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#0A174E"
            val textColor = "#F2AA4C"
            postPadding = arrayListOf(10, 0, 10, 0)
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost642() {  //I
        val post = Post()
        with(post) {
            postNum = 642
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2014/11/30/14/11/cat-551554_960_720.jpg"
            postText = arrayListOf(
                " בדרך כלל ",
                " אתה נמחץ בין ",
                " הצורך האובססיבי שלך לדעת הכל  ",
                " (כצורך הישרדותי קדום), ",
                " והעייפות הנפשית שנובעת מזה  ",
                " (כבעל קיבולת חוויתית מוגבלת). "
            )
            textLocation = arrayListOf(10,350, 29, -1, 0, 0, 0, 0)
            postId = 88
            postTransparency =9
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#0A174E"
            val textColor = "#F2AA4C"
            postPadding = arrayListOf(10, 0, 10, 0)
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost643() {  //I
        val post = Post()
        with(post) {
            postNum = 643
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2016/09/01/19/07/boy-1637188_960_720.jpg"
            postText = arrayListOf(
                " יש לך תחביב מוזר, ",
                " ליצור בורות חדשים בכל יום ",
                " וליפול לבורות האלה,  ",
                " צריך כושר גופני לתחביב הזה, ",
                " יכולת לקבל בראש ללא הגבלה  ",
                " והתמדה לעסוק בזה כל יום מחדש. "
            )
            textLocation = arrayListOf(10,450, 25, -1, 0, 0, 0, 0)
            postId = 88
            postTransparency =5
            postTextSize = arrayListOf(0, 13)
            val backgroundColor = "#0A174E"
            val textColor = "#F2AA4C"
            postPadding = arrayListOf(10, 0, 10, 0)
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost644() {  //I //nv
        val post = Post()
        with(post) {
            postNum = 644
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2018/04/27/03/50/portrait-3353699_960_720.jpg"
            postText = arrayListOf(
                " אתה לא נהנה בחיים שלך ",
                " כי לא באת הנה להנות, ",
                " באת לחיות כמה שנים  ",
                " וזהו, ",
                "אומנם חלק מהחיים זה להראות שאתה נהנה",
                " אבל אין לזה שום קשר עם ההנאה עצמה. "
            )
            textLocation = arrayListOf(10,-1, 22, 5, 0, 0, 0, 0)
            postId = 88
            postTransparency =5
            postTextSize = arrayListOf(0, 12)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postPadding = arrayListOf(10, 0, 10, 0)
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            videoUrl="2wZaJCccPao"
            videoText=util1.getVideoText(post.postNum)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
    fun loadPost645() {  //v
        val post = Post()
        with(post) {
            postNum = 645
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2022/10/31/17/57/subway-7560452_960_720.jpg"
            postText = arrayListOf(
                " אנשים רבים יש בתבל ",
                " כל אחד חי בעולם משל עצמו, ",
                " גם אתה  ",
                " גם אתה, ",
                "וכמה שהמגבלה שלך יותר גדולה",
                " ככה העולם שלך יותר קטן. "
            )
            textLocation = arrayListOf(10,-1, 28, 5, 0, 0, 0, 0)
            postId = 88
            postTransparency =5
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postPadding = arrayListOf(10, 0, 10, 0)
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            videoUrl="Tdx6lLvvRyg"

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost646() {  //v
        val post = Post()
        with(post) {
            postNum = 646
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2013/02/08/22/23/afghanistan-79492_960_720.jpg"
            postText = arrayListOf(
                " כל הבעיות בעולם סביב ",
                " יסתדרו גם בלעדיך ",
                " בצורה כזו או אחרת,  ",
                " השאלה ",
                "כמה אתה תסתדר בלעדיך",
                " בזמן שכולך שקוע בבעיות האלה. "
            )
            textLocation = arrayListOf(10,-1, 28, 5, 0, 0, 0, 0)
            postId = 88
            postTransparency =10
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postPadding = arrayListOf(10, 0, 10, 0)
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            videoUrl="sCJh9YcrL3k"

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost647() {  //v
        val post = Post()
        with(post) {
            postNum = 647
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2016/05/07/20/51/monk-1378196_960_720.jpg"
            postText = arrayListOf(
                " מילת כזב ",
                " היא מילה שעוברת לידך, ",
                " מילת אמת  ",
                " היא מילה שחיה בך, ",
                "זו יכולה להיות אותה מילה ",
                " שפוגשת אותך בזמנים שונים. "
            )
            textLocation = arrayListOf(10,-1, 28, 5, 0, 0, 0, 0)
            postId = 88
            postTransparency =10
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postPadding = arrayListOf(10, 0, 10, 0)
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            videoUrl="3IILk2QjBBU"

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
      fun loadPost648() {  //v
        val post = Post()
        with(post) {
            postNum = 648
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2014/09/16/01/19/girl-447701_960_720.jpg"
            postText = arrayListOf(
                " האדם בנוי מהחלק הגלוי לכולם ",
                " והוא תוצר של כל הבעיות שלו ",
                " שנפתרו בעבר,  ",
                " ומהחלק הסמוי מכול ",
                " והוא תוצר של כל הבעיות שלו ",
                " שלא נפתרו מעולם. "
            )
            textLocation = arrayListOf(10,-1, 28, 5, 0, 0, 0, 0)
            postId = 88
            postTransparency =10
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postPadding = arrayListOf(10, 0, 10, 0)
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            videoUrl="jOTSvTsAVzQ"
            videoText = util1.getPostExplanation(postNum, postText)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
}

