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
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
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
            textLocation = arrayListOf(10, 10, 30, -1, 3, 30, 0, 0)
            postTextSize = arrayListOf(0, 14)
            postTransparency = 5
            postBackground = "337def"
            val textColor = "fcc727"
            postFontFamily = 103
            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
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
            textLocation = arrayListOf(10, 10, 30, -1, 0, 0, 0, 0)
            postTextSize = arrayListOf(0, 14)
            postTransparency = 3
            postBackground = "000000"
            val textColor = "fcc727"
            postFontFamily = 103
            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost603() {
        var post = Post()
        with(post) {
            postNum = 603
            postId = 77
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2018/01/26/08/32/nature-3108066__480.jpg"
            postText = arrayListOf(
                " גן העדן והגיהנום ",
                "הם לא מקומות",
                "בעולם הבא,",
                "הם יותר צורת",
                "המחשבות שלך",
                "בעולם הזה."
            )
            textLocation = arrayListOf(10, 10, 35, -1, 0, 0, 0, 0)
            postTextSize = arrayListOf(0, 16)
            postTransparency = 5
            postBackground = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 240
            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(10, 5, 10, 0)
            postRadiuas = 15
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost604() {
        val post = Post()
        with(post) {
            postNum = 604
            postId = 84
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2015/07/09/22/45/tree-838667_1280.jpg"
            postText = arrayListOf(
                "נחמה",
                "זה שמישהו אומר לך ",
                "שאתה בסדר,",
                "שלווה",
                "זה שאתה מבין",
                "שאתה בסדר."
            )
            textLocation = arrayListOf(10, 10, 30, -1, 0, 0, 0, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 20)
            postBackground = "1E4174"
            val textColor = "DDA94B"
            postFontFamily = 300
            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15

        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost605() {
        val post = Post()
        with(post) {
            postNum = 605
            postId = 80
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2020/02/06/09/39/girl-4823612_1280.jpg"
            postText = arrayListOf(
                "החופש הזה שלא לדעת,",
                "החופש הזה שלא להיות צודק,",
                "החופש הזה שלא להיות מקובל,",
                "החופש הזה שלא להיות חכם,",
                "החופש הזה שלא להיות מישהו,",
                "החופש הזה של רק להיות."
            )
            textLocation = arrayListOf(10, 10, 35, -1, 0, 0, 0, 0)
            postTransparency = 5
            postTextSize = arrayListOf(0, 14)
            postBackground = "#101820"
            val textColor = "DDA94B"
            postFontFamily = 103

            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 5, 10, 0)
            postRadiuas = 15

        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
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
            postTransparency = 5
            postTextSize = arrayListOf(0, 16)
            postBackground = "#101820"
            val textColor = "DDA94B"
            postFontFamily = 103

            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 5)
            postRadiuas = 15

        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost607() {
        val post = Post()
        with(post) {
            postNum = 607
            postId = 86
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2017/02/10/15/10/love-2055372_1280.jpg"
            postText = arrayListOf(
                " בדרך כלל ",
                "בשר ודם הוא רק בשר ודם, ",
                "ולפעמים ",
                "בשר ודם הופך לעפר",
                "ולפעמים ",
                "הוא הופך לקסם."
            )
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 16)
            postBackground = "#101820"
            val textColor = "DDA94B"
            postFontFamily = 103
            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 5, 10, 0)
            postRadiuas = 15
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
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
                "ממש בסדר",
                "האנשים גם הם מתנהלים לפי דרכם",
                "ממש בסדר",
                "ואם אתה חושב אחרת",
                " גם זה ממש בסדר."
            )
            postTransparency = 6
            postTextSize = arrayListOf(0, 15)
            postBackground = "#101820"
            val textColor = "DDA94B"
            postFontFamily = 103
            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
            postRadiuas = 15
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
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
            postRadiuas = 15

        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost610() {
        val post = Post()
        with(post) {
            postNum = 610
            postId = 72
            lineNum = 6
            imageUri = "https://cdn.pixabay.com/photo/2013/08/18/23/09/goats-173940_1280.jpg"
            postText = arrayListOf(
                " כדי להישרד ",
                " אתה צריך לפעמים ",
                "  להתעמת עם העולם סביבך, ",
                " כדי להיות נכון ",
                " אתה צריך לפעמים ",
                "להתעמת עם עצמך. "
            )
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
            postTransparency = 7
            postTextSize = arrayListOf(0, 14)
            postBackground = "#F5D042"
            val textColor = "#0A174E"
            postFontFamily = 103
            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
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
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
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
            postRadiuas = 15
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
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
            postRadiuas = 15
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

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
            postRadiuas = 15
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
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
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

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
            postRadiuas = 15
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
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
            postRadiuas = 15
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
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
            postRadiuas = 15
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
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
            postRadiuas = 15
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
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
            postRadiuas = 15
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
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
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
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
}

