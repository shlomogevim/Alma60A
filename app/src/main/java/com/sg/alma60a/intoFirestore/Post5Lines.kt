package com.sg.alma60a

import android.app.Activity
import android.content.Context
import androidx.constraintlayout.widget.ConstraintLayout
import com.sg.alma60a.model.Post


class Post5Lines(val context: Context) {

    private val layout: ConstraintLayout = (context as Activity).findViewById(R.id.itemLayoutFire)
    val drawPost = DrawPostCenter(context)
    val pref = context.getSharedPreferences(SHARPREF_ALMA, Context.MODE_PRIVATE)
    private val util = Utility()

    fun loadPost500() {
        val post = Post()
        with(post) {
            postNum = 500
            postId=68
            lineNum = 5
            imageUri =
                "https://cdn.pixabay.com/photo/2018/12/02/20/26/till-eulenspiegel-3852068_1280.jpg"
            postText = arrayListOf(
                " ההבדל בין: ",
                "טמבל רגיל",
                " לטמבל עם תואר של דוקטור, ",
                " הוא רק הכבוד ",
                " שאתה חולק לכל אחד מהם. "
            )
            postBackground = "a9dce3"
            postTransparency = 8
            textLocation = arrayListOf(10,-1, 30,10,0, 0, 0, 0)
                     postTextSize = arrayListOf(0,14)
            postPadding = arrayListOf(5, 0, 5, 0)
            val col = "#ffffff"
            val col1 = "#4dd0e1"
            postTextColor = arrayListOf(CONSTANT, col, col1)
            postFontFamily = 103
            postRadiuas = 15
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost501() {
        val post = Post()
        with(post) {
            postNum = 501
            postId=75
            lineNum = 5
            imageUri =
                "https://cdn.pixabay.com/photo/2020/03/01/07/25/remote-control-4891936_1280.jpg"
            postText = arrayListOf(
                " האומנות בחיים  היא: ",
                "שלא לחיות אותם ",
                " בשידורים חוזרים שוב ושוב, ",
                " אלא להיות מספיק פתוח ",
                " לשידורים בזמן אמת. "
            )
            postBackground = "a9dce3"
            postTransparency = 0
            textLocation = arrayListOf(10,10, 35,-1,0, 0, 0, 0)
           postTextSize = arrayListOf(0, 16)
            postPadding = arrayListOf(0, 0, 0, 0)
            val col = "#ffffff"
            val col1 = "#4dd0e1"
            postTextColor = arrayListOf(CONSTANT, col, col1)
            postFontFamily = 103
            postRadiuas = 15
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost502() {
        val post = Post()
        with(post) {
            postNum = 502
            postId=75
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2013/10/02/23/03/mountains-190055_1280.jpg"
            postText = arrayListOf(
                "אמת לא הולכת אף פעם לאיבוד",
                "אף פעם לא משתנה,",
                " היא רק מתגלית לך ",
                " כל פעם מחדש  ",
                " בצורה קצת אחרת. "
            )
            postBackground = "a9dce3"
            postTransparency = 0
            textLocation = arrayListOf(10,10, 35,-1,0, 0, 0, 0)
             postTextSize = arrayListOf(0, 16)
            postPadding = arrayListOf(0, 0, 0, 0)
            val col = "#ffffff"
            val col1 = "#4dd0e1"
            postTextColor = arrayListOf(CONSTANT, col, col1, col1)
            postFontFamily = 103
            postRadiuas = 15
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost503() {
        val post = Post()
        with(post) {
            postId=74
            postNum = 503
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2018/09/23/23/13/children-3698745_1280.jpg"
            postText = arrayListOf(
                " העולם הזה, ",
                " לקטנים ",
                " הוא מגרש משחקים, ",
                " לגדולים ",
                " מגרש בלי משחקים. "
            )
            postBackground = "000000"
            postTransparency = 10
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
                   postTextSize = arrayListOf(0, 16)
            postPadding = arrayListOf(0, 0, 0, 0)
            val col = "#ffffff"
            postTextColor = arrayListOf(CONSTANT, col)
            postFontFamily = 103
            postRadiuas = 15
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost504() {
        val post = Post()
        with(post) {
            postNum = 504
            postId=91
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2016/01/19/17/22/children-1149671_1280.jpg"
            val st1 = " בסוף מה נשאר לך? "
            val st2 = " רק אהבה "
            postText = arrayListOf(
                " בזמנים שהכול נשבר מסביב ",
                " וכל גל נראה מאיים ואינסופי, ",
                " ניזכר במשפט של אריק איינשטיין: ",
                "\"" + st1,
                st2 + "\""
            )
            postBackground = "000000"
            //  postBackground ="4d3227"
            postTransparency = 0
            textLocation = arrayListOf(10,10, 35,-1,0, 0, 0, 0)
            val size1 = 16
            val size2 = 0
            postTextSize = arrayListOf(0, size1, size2)
            postPadding = arrayListOf(0, 0, 0, 0)
            val col = "#ffffff"
            postTextColor = arrayListOf(CONSTANT, col)
            postFontFamily = 103
            postRadiuas = 15
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost505() {
        val post = Post()
        with(post) {
            postNum = 505
            postId=76
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2013/04/04/12/34/mountains-100367_1280.jpg"
            postText = arrayListOf(
                "שיהיו ימינו ארוכים עד מעבר לקצה השדות,",
                "שהשמש החמימה תטה לנו חסד מידי פעם,",
                "שצל העצים הגדולים יהיה רחב ומזמין,",
                "שנהיה פחות בסיפור שלנו על החיים",
                "ויותר בחיים."
            )
            postBackground = "263238"
            postTransparency = 0
            textLocation = arrayListOf(10,-1, 30,10,0, 0, 0, 0)
            val size1 = 13
            val size2 = 0
            postTextSize = arrayListOf(0, size1, size2)
            postPadding = arrayListOf(0, 0, 0, 0)
            val col = "#f6ff03"
            postTextColor = arrayListOf(CONSTANT, col)
            postFontFamily = 103
            postRadiuas = 15
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost506() {
        val post = Post()
        with(post) {
            postNum = 506
            postId=74
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2017/02/27/00/19/male-2101801_1280.jpg"
            postText = arrayListOf(
                "  כל הטרדות שלך  ",
                "  גדולות כקטנות,  ",
                "  הן עוגנים השומרים אותך  ",
                "  לבל תתנפץ  ",
                "  בחוסר המשמעות של הקיום.  "
            )
            postBackground = "263238"
            postTransparency = 0
            textLocation = arrayListOf(10,10, 35,-1,0, 0, 0, 0)
            val size1 = 16
            val size2 = 0
            postTextSize = arrayListOf(0, size1, size2)
            postPadding = arrayListOf(0, 0, 0, 0)
            val col = "#ffffff"
            postTextColor = arrayListOf(CONSTANT, col)
            postFontFamily = 103
            postRadiuas = 15
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost507() {
        val post = Post()
        with(post) {
            postNum = 507
            lineNum = 5
            postId=90
            imageUri = "https://cdn.pixabay.com/photo/2019/08/09/23/11/forest-4395986_1280.jpg"
            postText = arrayListOf(
                "מלחמות גדולות",
                "מלחמות קטנות,",
                "בחלק מהם ניצחתי",
                "ובחלק פחות,",
                "והמוצלחות ביותר היו אילו שלא היו."
            )
            postBackground = "263238"
            postTransparency =0
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postTextSize = arrayListOf(0, 16)
            postPadding = arrayListOf(0, 0, 0, 0)
            val col = "#ffffff"
            postTextColor = arrayListOf(CONSTANT, col)
            postFontFamily = 103
            postRadiuas = 15
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost508() {
        val post = Post()
        with(post) {
            postNum = 508
            postId=79
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2020/08/19/00/13/sea-5499649_1280.jpg"
            postText = arrayListOf(
                " יש אנשים האומרים ",
                " שהיופי עובר עם הגיל, ",
                " לא יודע מי האנשים האלה ",
                " אבל בטוח ",
                "שהם לא מכירים את הים הגדול."
            )
            postBackground = "263238"
            postTransparency = 4
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
             postTextSize = arrayListOf(0, 16)
            postPadding = arrayListOf(0, 0, 0, 0)
            val col = "#ffffff"
            postTextColor = arrayListOf(CONSTANT, col)
            postFontFamily = 103
            postRadiuas = 15
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost509() {
        var post = Post()
        with(post) {
            postNum = 509
            postId=82
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2017/08/01/14/42/knight-2565957_1280.jpg"
            postText = arrayListOf(
                " היכולת שלך לחיות בשלום עם עצמך ",
                " תלויה בכישרון שבך, ",
                " לבחור בקפידה ",
                " להילחם ",
                " רק את המלחמות שמתאימות לך. "
            )
            textLocation = arrayListOf(10,-1, 30,10,0, 0, 0, 0)
            postTextSize = arrayListOf(0, 17)
            postTransparency = 10
            postBackground = "efc8b1"
            val textColor = "8a6626"
            postFontFamily = 320

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost510() {
        var post = Post()
        with(post) {
            postNum = 510
            postId=76
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2017/06/25/08/07/sunbeds-2439952_1280.jpg"
            postText = arrayListOf(
                "אתה רוצה דברים מסוימים",
                "שלא בגלל שאין לך אותם,",
                "כמו",
                "שאין בך מודעות ",
                "שבעצם יש לך כבר אותם."
            )
            textLocation = arrayListOf(10,10, 30,-1,0, 0, 0, 0)
            postTextSize = arrayListOf(0, 20)
            postTransparency = 7
            postBackground = "143d59"
            val textColor = "f6ff03"
            postFontFamily = 320

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost511() {
        var post = Post()
        with(post) {
            postNum = 511
            postId=84
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2013/05/11/08/28/sunset-110305__340.jpg"
            postText = arrayListOf(
                "הטוב,",
                "הרבה יותר קרוב",
                "ממה שאתה חושב,",
                "והרבה יותר רחוק",
                "ממה שאתה מצפה לו."
            )
            textLocation = arrayListOf(10,10, 30,-1,0, 0, 0, 0)
            postTextSize = arrayListOf(0, 20)
            postTransparency = 7
            postBackground = "143d59"
            val textColor = "f6ff03"
            postFontFamily = 320

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost512() {
        var post = Post()
        with(post) {
            postNum = 512
            postId=84
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2012/03/04/01/01/father-22194_1280.jpg"
            postText = arrayListOf(
                "גם אם תשתדל",
                "לא תהיה הכי חכם בעולם,",
                "לעומת זאת",
                "אם תשתדל",
                "תוכל להיות הכי אתה בעולם."
            )
            textLocation = arrayListOf(10,5, 30,-1,0, 0, 0, 0)
            postTextSize = arrayListOf(0, 20)
            postTransparency = 0
            postBackground = "143d59"
            val textColor = "f6ff03"
            postFontFamily = 320

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost513() {
        val post = Post()
        with(post) {
            postNum = 513
            postId=81
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2019/05/04/09/33/male-4177635_1280.jpg"
            postText = arrayListOf(
                "הנוחות של החיים שלך",
                "אינה נמדדת לפי",
                "כמה אחרים מציקים לך,",
                "אלא לפי",
                "כמה שאתה מציק לעצמך."
            )
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 24)
            val backgroundColor = "#F2EDD7"
            val textColor = "#b3b7b4"
            postFontFamily = 110

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 0

        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost514() {
        val post = Post()
        with(post) {
            postNum = 514
            postId=80
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2014/07/05/08/37/graveyard-384604_1280.jpg"
            postText = arrayListOf(
                "החיים בסך הכל",
                "זה דיל לא רע ,",
                "הבעיה",
                "שאתה מצליח להבין את זה",
                "רק בצ'ק אאוט."
            )
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 24)
            val backgroundColor = "#F2EDD7"
            val textColor = "#b3b7b4"
            postFontFamily = 110

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 0

        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost515() {
        val post = Post()
        with(post) {
            postNum = 515
            postId=78
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2016/10/27/14/23/old-man-1775239_1280.jpg"
            postText = arrayListOf(
                " גם אם תחייה עוד מאתיים שנה ",
                " לא תהיה חכם יותר, ",
                " או רעב פחות, ",
                " תהיה הרבה יותר זמן אתה, ",
                "  וזהו.  "
            )
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postTransparency = 5
            postTextSize = arrayListOf(0, 20)
            val backgroundColor = "#101820"
            val textColor = "#FEE715"
            postFontFamily = 100

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 0

        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost516() {
        val post = Post()
        with(post) {
            postNum = 516
            postId=79
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2018/06/04/06/56/religion-3452571_1280.jpg"
            postText = arrayListOf(
                " זה שלא הספקת לחיות ",
                " כי היית עסוק מידי, ",
                " זה לא סיבה מספיק טובה ",
                " לפתור אותך מדרך הנשמות ",
                " שיבוא יומך.  "
            )
            textLocation = arrayListOf(10,10, 35,-1,0, 0, 0, 0)
            postTransparency = 5
            postTextSize = arrayListOf(0, 24)
            val backgroundColor = "#101820"
            val textColor = "#FEE715"
            postFontFamily = 200

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 20

        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost517() {
        val post = Post()
        with(post) {
            postNum = 517
            postId=75
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2018/05/22/22/36/girl-3422711_1280.jpg"
            postText = arrayListOf(
                " יש הרבה סיבות  ",
                " להיות אומלל בעולם הזה, ",
                " וכול הסיבות יחד ",
                " זה לא סיבה מספיקה ",
                " להיות אומלל.  "
            )
            textLocation = arrayListOf(10,10, 35,-1,0, 0, 0, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 24)
            val backgroundColor = "#101820"
            val textColor = "#ACC7B4"
            postFontFamily = 200

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 20

        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }


    fun loadPost518() {
        val post = Post()
        with(post) {
            postNum = 518
            postId=81
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2016/05/15/20/49/people-1394377_1280.jpg"
            postText = arrayListOf(
                "  אם אתה  ",
                " מדבר כמו זקן, ",
                " חושב כמו זקן, ",
                " וחולם כמו זקן, ",
                " יש סיכוי שאתה זקן.  "
            )
            textLocation = arrayListOf(10,10, 35,-1,0, 0, 0, 0)
            postTransparency = 5
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#990011"
            val textColor = "#FCF6F5"
            postFontFamily = 103

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5, 0, 5, 0)
            postRadiuas = 20

        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost519() {
        val post = Post()
        with(post) {
            postNum = 519
            postId=68
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2018/11/11/10/46/opposites-3808487_1280.jpg"
            postText = arrayListOf(
                "  מעבר למפלס הטוב ורע  ",
                " יש מרחב של קיום בסיסי, ",
                " אתה לא מגיע אליו בדרך כלל ",
                " בגלל האופי ההישרדותי שבך ",
                " וחבל.  "
            )
            textLocation = arrayListOf(10,10, 35,-1,0, 0, 0, 0)
            postTransparency = 4
            postTextSize = arrayListOf(0, 15)
            val backgroundColor = "#00203F"
            val textColor = "#ADEFD1"
            postFontFamily = 103

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5, 0, 5, 0)
            postRadiuas = 20

        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost520() {
        val post = Post()
        with(post) {
            postNum = 520
            postId=65
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2015/03/17/16/59/clown-678042_1280.jpg"
            postText = arrayListOf(
                " האדם משמש סטטיסט  ",
                " בהפקה של תפיסת העולם שלו, ",
                " ההמולה מסביב אמיתית ",
                " אבל היא רק תפאורה לסיפור ",
                " שהאדם חי בו.  "
            )
            textLocation = arrayListOf(10,10, 35,-1,0, 0, 0, 0)
            postTransparency = 10
            postTextSize = arrayListOf(0, 18)
            val backgroundColor = "#F5D042"
            val textColor = "#0A174E"
            postFontFamily = 100

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 20

        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost521() {
        val post = Post()
        with(post) {
            postNum = 521
            postId=83
            lineNum = 5
            imageUri =
                "https://cdn.pixabay.com/photo/2016/07/30/00/03/winding-road-1556177_1280.jpg"
            postText = arrayListOf(
                " זה שאיבדת את הדרך לרגע  ",
                " זה לא אומר שאין דרך, ",
                " או שהדרך משובשת ",
                " זה רק אומר ",
                " שאיבדת את הדרך לרגע.  "
            )
            textLocation = arrayListOf(10,10, 35,-1,0, 0, 0, 0)
            postTransparency = 7
            postTextSize = arrayListOf(0, 18)
            val backgroundColor = "#F5D042"
            val textColor = "#0A174E"
            postFontFamily = 100

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 20

        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost522() {
        val post = Post()
        with(post) {
            postNum = 522
            postId=72
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2019/08/09/20/52/old-man-4395870_1280.jpg"
            postText = arrayListOf(
                " האדם הקדמון  ",
                " השתמש פחות בפייסבוק ",
                " עשה פחות לייקים ",
                " אבל נראה לי ",
                " שהיה לו יותר חברים.  "
            )
            val di = 0
            val dd = 10
            textLocation = arrayListOf(10,10, 35,-1,0, 0, 0, 0)
            postTransparency = 10
            postTextSize = arrayListOf(0, 18)
            val backgroundColor = "#F5D042"
            val textColor = "#0A174E"
            postFontFamily = 100
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 20

        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost523() {
        val post = Post()
        with(post) {
            postNum = 523
            postId=79
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2018/04/29/04/37/flower-3359072_1280.jpg"
            postText = arrayListOf(
                " האדם הטיפוסי  ",
                " בדרך כלל לא סגור על עצמו ",
                " אם הוא חיית השדה ",
                " דמות בסרט מצויר ",
                " או סתם עציץ.  "
            )
            textLocation = arrayListOf(10,10, 35,-1,0, 0, 0, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 18)
            val backgroundColor = "#F5D042"
            val textColor = "#0A174E"
            postFontFamily = 100

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 10

        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost524() {
        val post = Post()
        with(post) {
            postNum = 524
            postId=80
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2021/01/24/20/47/mountains-5946500_1280.jpg"
            postText = arrayListOf(
                " אין נחמה באזורי הכעס ",
                " אין תכלית באיזורי ההמון ",
                " אין אמת באזורי הצדק ",
                " אין שקט באזורי האומללות ",
                " הכל צומח בערבות האין סופים.  "
            )
            textLocation = arrayListOf(10,10, 35,-1,0, 0, 0, 0)
            postTransparency = 4
            postTextSize = arrayListOf(0, 18)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 100

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 5, 10, 0)
            postRadiuas = 10

        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost525() {
        val post = Post()
        with(post) {
            postNum = 525
            postId=79
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2017/05/16/21/24/gorilla-2318998_1280.jpg"
            postText = arrayListOf(
                " האדם המודרני הוא יצור די אבוד בעולמנו, ",
                " הוא חכם מדי ",
                " בשביל לחשוב כמו אבותיו הקדמונים, ",
                " וטיפש מידי ",
                " בשביל להבין שהוא נשאר יצור די פרימיטיבי. "
            )
            textLocation = arrayListOf(10,10, 30,-1,1,30, 0, 0)
            postTransparency = 5
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 5)
            postRadiuas = 10
            lineSpacing = 1.4f
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost526() {
        val post = Post()
        with(post) {
            postNum = 526
            lineNum = 5
            postId=83
            imageUri = "https://cdn.pixabay.com/photo/2019/12/12/18/02/window-4691326_1280.jpg"
            postText = arrayListOf(
                " זה לא משנה  ",
                " עד כמה האקס שלך דביל, ",
                " כאקס ",
                " תמיד הוא מוסיף ",
                " עוד מרחב לעולם שלך. "
            )
            textLocation = arrayListOf(10,10, 40,-1,0, 0, 0, 0)
            postTransparency = 3
            postTextSize = arrayListOf(0, 22)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 100

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5, 0, 5, 0)
            postRadiuas = 10
            lineSpacing = 1f
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost527() {
        val post = Post()
        with(post) {
            postNum = 527
            lineNum = 5
            postId=78
            imageUri = "https://cdn.pixabay.com/photo/2017/06/24/23/03/railway-2439189_1280.jpg"
            postText = arrayListOf(
                " אנשים שחיים לעד  ",
                " הם אלה שיודעים לעצור את הזמן ",
                " ויש כאלה ביננו, ",
                " הזמן אומנם ממשיך לזרום כדרכו ",
                " אבל לא בשבילם. "
            )
            textLocation = arrayListOf(10,10, 35,-1,0, 0, 0, 0)
            postTransparency =4
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#990011"
            val textColor = "#FCF6F5"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 10
            lineSpacing = 1f
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost528() {
        val post = Post()
        with(post) {
            postNum = 528
            postId=80
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2020/06/20/18/04/people-5321914_1280.jpg"
            postText = arrayListOf(
                " להיות מבסוט מהחיים  ",
                " זה פחות ענין של ",
                " כמה כסף יש לך בבנק ",
                " ויותר ",
                " כמה הבנה יש לך בלב. "
            )
            val di = 0
            val dd = 0
            textLocation = arrayListOf(10,-1, 30,10,0, 0, 0, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#101820"
            val textColor = "#F2AA4C"
            postFontFamily = 103

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 10
            lineSpacing = 1f
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost529() {
        val post = Post()
        with(post) {
            postNum = 529
            postId=78
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2016/09/28/22/20/old-1701640_1280.jpg"
            postText = arrayListOf(
                " שאתה חושב שטוב לך אז טוב לך  ",
                " שאתה חושב שרע לך אז רע לך, ",
                " זה שאתה נותן למחשבה ",
                " זכות בלעדית על איכות החיים שלך ",
                " זה חוסר אחריות בעליל. "
            )
            textLocation = arrayListOf(10,-1, 35,10,0, 0, 0, 0)
            postTransparency = 5
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#101820"
            val textColor = "#F2AA4C"
            postFontFamily = 103

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 5)
            postRadiuas = 10
            lineSpacing = 1.4f
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost530() {
        val post = Post()
        with(post) {
            postNum = 530
            lineNum = 5
            postId=78
            imageUri = "https://cdn.pixabay.com/photo/2015/07/27/00/41/homeless-861899_1280.jpg"
            postText = arrayListOf(
                " אמת  ",
                " היא דבר יחסי, ",
                " ההתבאסות שלך מחוסר האמת  ",
                " (לדעתך) ",
                " היא דבר מוחלט. "
            )
            textLocation = arrayListOf(10,20, 30,-1,0, 0, 0, 0)
            postTransparency = 4
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#101820"
            val textColor = "#F2AA4C"
            postFontFamily = 103

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 10
            lineSpacing = 1f
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost531() {
        val post = Post()
        with(post) {
            postNum = 531
            lineNum = 5
            postId=90
            imageUri = "https://cdn.pixabay.com/photo/2016/03/05/19/40/beach-1238462_1280.jpg"
            postText = arrayListOf(
                " בסוף הדרך ",
                " אין לך נצחנות והפסדים, ",
                " יש רק תובנה עמוקה  ",
                " עד כמה חיית את החיים שלך ",
                " כפי שאתה באמת. "
            )
            textLocation = arrayListOf(10,20, 30,-1,0, 0, 0, 0)
            postTransparency = 3
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#7b9acc"
            val textColor = "#FCF6F5"
            postFontFamily = 103

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 10
            lineSpacing = 1f
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost532() {
        val post = Post()
        with(post) {
            postNum = 532
            lineNum = 5
            postId=76
            imageUri = "https://cdn.pixabay.com/photo/2015/04/20/13/12/little-boy-731165_1280.jpg"
            postText = arrayListOf(
                " יש שני צורות חיים: ",
                " האחד נסיעה שבה כל הנוף חוזר על עצמו ",
                " והשנייה נסיעה בה הכל מתחדש בכל רגע,  ",
                " זה לא משנה איזה נוף תראה בחלון שמולך ",
                " אלא בפתיחות שלך אליו. "
            )
            textLocation = arrayListOf(10,20, 30,-1,0, 0, 0, 0)
            postTransparency = 10
            postTextSize = arrayListOf(0, 13)
            val backgroundColor = "#7b9acc"
            val textColor = "#FCF6F5"
            postFontFamily = 103

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 10
            lineSpacing = 1f
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost533() {
        val post = Post()
        with(post) {
            postNum = 533
            postId=79
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2015/06/24/16/00/church-820339_1280.jpg"
            postText = arrayListOf(
                " קשה לך לסלוח לאנשים ",
                " שהם כאלה, ",
                " כנראה בגלל  ",
                " שקשה לך לסלוח לעצמך ",
                " שאתה כזה. "
            )
            textLocation = arrayListOf(10,10, 30,-1,0, 0, 0, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#7b9acc"
            val textColor = "#FCF6F5"
            postFontFamily = 103

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 10
            lineSpacing = 1f
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost534() {
        val post = Post()
        with(post) {
            postNum = 534
            postId=77
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2015/12/01/20/28/road-1072821_1280.jpg"
            postText = arrayListOf(
                " אומנם הדרכים אל האושר ",
                " לא מסומנות בצורה מסודרת, ",
                " אבל בטוח שאם לא תתחיל ללכת  ",
                " באחד הדרכים האלה ",
                " וודאי שלא תגיע אליו. "
            )
            textLocation = arrayListOf(10,20, 30,-1,0, 0, 0, 0)
            postTransparency = 5
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#A4193D"
            val textColor = "#FCF6F5"
            postFontFamily = 103

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 10
            lineSpacing = 1f
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost535() {
        val post = Post()
        with(post) {
            postNum = 535
            lineNum = 5
            postId=80
            imageUri = "https://cdn.pixabay.com/photo/2015/06/19/21/24/avenue-815297_1280.jpg"
            postText = arrayListOf(
                " החיים שלך ",
                " זה מה שקורה אצלך עכשיו, ",
                " מה שלא קורה אצלך עכשיו  ",
                " קורה מן הסתם ",
                " אבל זה לא החיים שלך. "
            )
            textLocation = arrayListOf(10,10, 30,-1, 1, 0, 0, 0)
             postTransparency = 4
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 10
            lineSpacing = 1f
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost536() {
        val post = Post()
        with(post) {
            postNum = 536
            postId=79
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2018/05/28/23/05/sheeps-3437467_1280.jpg"
            postText = arrayListOf(
                " כעקרון אתה חייב שיהיה לך תפיסות עולם ",
                " כדי לתפוס את העולם בדרך כלשהיא, ",
                " בגלל עייפות קוסמית שלי  ",
                " משתדל לא לתפוס את העולם בבוקר, ",
                " מצידי שיסתובב לו חופשי. "
            )
            textLocation = arrayListOf(10,20, 30,-1, 1, 30, 0, 0)
            postTransparency =0
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#F5D042"
            val textColor = "#0A174E"
            postFontFamily = 103

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 10
            lineSpacing = 1.4f
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost537() {
        val post = Post()
        with(post) {
            postNum = 537
            postId=74
            lineNum = 5
//            imageUri = "https://cdn.pixabay.com/photo/2017/01/23/19/40/woman-2003647_1280.jpg"
            imageUri = "https://cdn.pixabay.com/photo/2018/04/01/17/54/people-3281583_1280.jpg"
            postText = arrayListOf(
                " המון תחנות בטלוויזיה ",
                " אבל אין משהו טוב, ",
                " בדומה לחיים שלך  ",
                " המון אפשרויות ",
                " אבל אין משהו טוב. "
            )
            textLocation = arrayListOf(10,-1, 30,10, 0, 0, 0, 0)
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
            postRadiuas = 10
            lineSpacing = 1f
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost538() {
        val post = Post()
        with(post) {
            postNum = 538
            postId=74
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2017/08/03/21/51/artist-2578454_1280.jpg"
            postText = arrayListOf(
                " שתהיה לך שגרה ",
                " מספיק מעניינת ",
                " שלא ליפול בה לשעמום ולטמטום,  ",
                " ומספיק רגועה ",
                " שלא ליפול בה בהרס הגוף והנפש. "
            )
            textLocation = arrayListOf(10, 5, 30, -1, 0, 0, 0, 0)
            postTransparency = 6
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#02343F"
            val textColor = "#F0EDCC"
            postFontFamily = 103

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 10
            lineSpacing = 1f
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost539() {
        val post = Post()
        with(post) {
            postNum = 539
            postId=80
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2018/03/03/17/05/malham-cove-3196076_1280.jpg"
            postText = arrayListOf(
                " אין מקום אחר, ",
                " זה אומנם נכון לגבי אבן ",
                " פחות לגבי אדם,  ",
                " בגלל שהאבן מוטלת בשדה ",
                " והאדם איפה שהמחשבה שלו. "
            )
            textLocation = arrayListOf(10, 5, 30, -1, 0, 0, 0, 0)
            postTransparency = 4
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#02343F"
            val textColor = "#F0EDCC"
            postFontFamily = 103

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 10
            lineSpacing = 1f
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost540() {
        val post = Post()
        with(post) {
            postNum = 540
            postId=79
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2016/03/05/19/02/hamburger-1238246_1280.jpg"
            postText = arrayListOf(
                " ג'אנק מודעות ",
                " (פוליטיקה, רכילות, שיטוט ברשת) ",
                " כמו ג'אנק פוד  ",
                " בכמות קטנה נסבלת איכשהו ",
                " אבל בכמות גדולה דופקת לך את הבטן. "
            )
            textLocation = arrayListOf(10, 10, 30, -1, 0, 0, 0, 0)
            postTransparency = 4
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#02343F"
            val textColor = "#F0EDCC"
            postFontFamily = 103

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 10
            lineSpacing = 1.2f
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost541() {
        val post = Post()
        with(post) {
            postNum = 541
            postId=72
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2021/11/13/23/06/tree-6792528_1280.jpg"
            postText = arrayListOf(
                " כשהמודעות מוגבלת בנקודה מסוימת, ",
                " הכניסה לפרטים ",
                " רק מקטינה את הדיוק,  ",
                " צריך אדם לשאוף לנקודה הזאת ",
                " וכשהגיע אליה להרפות. "
            )
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
            postTransparency = 5
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#02343F"
            val textColor = "#F0EDCC"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 10
            lineSpacing = 1.2f
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost542() {
        val post = Post()
        with(post) {
            postNum = 542
            postId = 84
            lineNum = 5
            imageUri =
                "https://cdn.pixabay.com/photo/2016/11/22/07/26/indiana-dunes-state-park-1848559_1280.jpg"
            postText = arrayListOf(
                " החופש  ",
                " הוא השחרור המיוחל ",
                " מכל ההתחייבויות לכולם  ",
                " לטובת העריצות האיומה  ",
                " של מה שאתה. "
            )
            textLocation = arrayListOf(10, -1, 30, 20, 0, 0, 0, 0)
            postTransparency = 6
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#02343F"
            val textColor = "#F0EDCC"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 10
            lineSpacing = 1.2f
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost543() {
        val post = Post()
        with(post) {
            postNum = 543
            postId = 83
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2014/02/02/17/40/photos-256887__480.jpg"
            postText = arrayListOf(
                " לאדם יש זוגיות משתנה עם החיים,  ",
                " בחלק הראשון של חייו ",
                " הוא לא בדיוק שמח שהם באים אליו  ",
                " ובחלק השני   ",
                " הוא לא בדיוק שמח שהם הולכים ממנו. "
            )
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
            postTransparency = 8
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#02343F"
            val textColor = "#F0EDCC"
            postFontFamily = 103

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 10
            lineSpacing = 1.2f
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost544() {
        val post = Post()
        with(post) {
            postNum = 544
            postId = 78
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2017/12/05/18/49/city-3000060_1280.jpg"
            postText = arrayListOf(
                " שהשחור  ",
                " הוא סוג של לבן ",
                " וכשהלבן  ",
                " הוא סוג של שחור  ",
                " תמונת המציאות כולה דמיונית. "
            )
            textLocation = arrayListOf(10, 10, 30, -1, 0, 0, 0, 0)
            postTransparency = 6
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#02343F"
            val textColor = "#F0EDCC"
            postFontFamily = 103

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 10
            lineSpacing = 1.2f
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost545() {
        val post = Post()
        with(post) {
            postNum = 545
            postId = 89
            lineNum = 5
            imageUri =
                "https://cdn.pixabay.com/photo/2017/06/22/23/40/picking-flowers-2432972_1280.jpg"
            postText = arrayListOf(
                " המוות בדרך כלל  ",
                " הוא לא סוף החיים ",
                " סוף החיים קורה לך הרבה לפני , ",
                " באותו רגע  ",
                " שאתה מפסיק לחיות. "
            )
            textLocation = arrayListOf(10, 10, 30, -1, 0, 0, 0, 0)
            postTransparency = 5
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#02343F"
            val textColor = "#F0EDCC"
            postFontFamily = 103

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 10
            lineSpacing = 1.2f
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost546() {
        val post = Post()
        with(post) {
            postNum = 546
            postId = 79
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2014/02/27/16/10/tree-276014_1280.jpg"
            postText = arrayListOf(
                " בראשית ברא אלוהים את האור,  ",
                " זו הייתה ונשארה המצאה די טובה ",
                " אבל לא מי יודע שימושית, ",
                " כי האדם מטבעו מתנהל בחושך  ",
                " והאור לא עוזר לו בזה. "
            )
            textLocation = arrayListOf(10, 10, 35, -1, 0, 0, 0, 0)
            postTransparency =5
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#2BAE66"
            val textColor = "#FCF6F5"
            postFontFamily = 103

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 10
            lineSpacing = 1.2f
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost547() {
        val post = Post()
        with(post) {
            postNum = 547
            postId = 78
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2018/05/30/19/26/rotorua-3442253_1280.jpg"
            postText = arrayListOf(
                " קח את מה שאתה סובל מהחוץ  ",
                " וקח מה שאתה סובל מהפנים ",
                " והשתדל ",
                " שלא לעשות את הסכום שלהם  ",
                " אלא את ההפרש. "
            )
            textLocation = arrayListOf(10, -1, 35, 20, 0, 0, 0, 0)
            postTransparency =2
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#000000"
            val textColor = "#FCF6F5"
            postFontFamily = 103

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 5, 0, 0)
            postRadiuas = 10
            lineSpacing = 1.2f
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost548() {
        val post = Post()
        with(post) {
            postNum = 548
            postId = 81
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2019/04/16/23/59/sad-4133121_1280.jpg"
            postText = arrayListOf(
                " ה-לא-  ",
                " קיים בחוסר קיומו, ",
                " לא מכחיש את זה, ",
                " אבל קשה לבסס עליו  ",
                " חיים של -כן-. "
            )
            textLocation = arrayListOf(10, -1, 40, 20, 0, 0, 0, 0)
            postTransparency = 7
            postTextSize = arrayListOf(0, 18)
            val backgroundColor = "#FFD662"
            val textColor = "#101820"
            postFontFamily = 103

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 10
            lineSpacing = 1.2f
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost549() {
        val post = Post()
        with(post) {
            postNum = 549
            postId = 81
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2019/09/16/19/52/beach-4481919_1280.jpg"
            postText = arrayListOf(
                " השקיעות נאספות אל הים  ",
                " הימים חולפים כסדרם, ",
                " לא מובן מאליו, ",
                " מלא הערכה למי שמפיק את כל זה  ",
                " יש לו את זה. "
            )
            textLocation = arrayListOf(10, 10, 35, -1, 0, 0, 0, 0)
            postTransparency = 3
            postTextSize = arrayListOf(0, 15)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 5, 0, 0)
            postRadiuas = 10
            lineSpacing = 1.2f
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost550() {
        val post = Post()
        with(post) {
            postNum = 550
            postId = 72
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2014/05/07/21/41/drip-339940_1280.jpg"
            postText = arrayListOf(
                " שתחיה בטוב  ",
                " פירושו: ",
                " שתגיע לרמת מודעות ",
                " כזאת  ",
                " שתיגע בטוב. "
            )
            textLocation = arrayListOf(10, -1, 40, 20, 0, 0, 0, 0)
            postTransparency = 3
            postTextSize = arrayListOf(0, 17)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 5, 0, 0)
            postRadiuas = 10
            lineSpacing = 1.2f
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost551() {
        val post = Post()
        with(post) {
            postNum = 551
            postId = 72
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2015/01/12/10/44/lost-places-597166_1280.jpg"
            postText = arrayListOf(
                " אל תחשוב שיש עולם אחר בשבילך  ",
                " אין דבר כזה ",
                " אבל ",
                " יש אמונה, שהיא מעבר למחשבה   ",
                " וכדאי לך להשתמש בה פה ושם. "
            )
            textLocation = arrayListOf(10,20, 35, -1, 0, 0, 0, 0)
            postTransparency = 3
            postTextSize = arrayListOf(0, 15)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 5, 0, 0)
            postRadiuas = 10
            lineSpacing = 1.2f
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost552() {
        val post = Post()
        with(post) {
            postNum = 552
            postId =87
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2018/03/27/12/24/beyond-3265854_1280.jpg"
            postText = arrayListOf(
                " המוות  ",
                " פותר את כל הבעיות בחיים, ",
                " אז אם אתה ממש לא רוצה למות ",
                " תשתדל להשאיר בעיה או שנים שלך  ",
                " לא פתורות. "
            )
            textLocation = arrayListOf(10, 10, 30, -1, 0, 0, 0, 0)
            postTransparency =3
            postTextSize = arrayListOf(0, 15)
            val backgroundColor = "#F95700"
            val textColor = "#ffffff"
            postFontFamily = 103

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 10
            lineSpacing = 1.2f
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }
        fun loadPost553() {
            val post = Post()
            with(post) {
                postNum = 553
                postId = 83
                lineNum = 5
                imageUri =
                    "https://cdn.pixabay.com/photo/2017/04/08/22/26/buddhism-2214532_1280.jpg"
                postText = arrayListOf(
                    " האמונה זו היכולת האנושית המובנת  ",
                    " למלא חללים בחומר ידידותי, ",
                    " ובגלל שהעולם הזה ברובו חלל ",
                    " רצוי לפתח את היכולת הזו  ",
                    " בכל תנאי מזג אוויר. "
                )
                textLocation = arrayListOf(10, 10, 30, -1, 0, 0, 0, 0)
                postTransparency = 5
                postTextSize = arrayListOf(0, 15)
                val backgroundColor = "#7b9acc"
                val textColor = "#FCF6F5"
                postFontFamily = 103

                postBackground = util.improveColorString(backgroundColor)
                val textcolo = util.improveColorString(textColor)
                val col = "#$textcolo"
                postTextColor = arrayListOf(CONSTANT, col)
                postPadding = arrayListOf(0, 0, 0, 0)
                postRadiuas = 10
                lineSpacing = 1.2f
            }
            pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
            drawPost.drawPostFire(post, layout)
            util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
        }

        fun loadPost554() {
            val post = Post()
            with(post) {
                postNum = 554
                postId = 91
                lineNum = 5
                imageUri = "https://cdn.pixabay.com/photo/2020/11/05/20/16/horses-5716127_1280.jpg"
                postText = arrayListOf(
                    " קסמים, ",
                    " בשביל קוסם מקצועי ",
                    " זה להוציא יונה מכובע ריק, ",
                    " בשביל בן אדם  ",
                    " זה להוציא יום חדש מבוקר שגרתי. "
                )
                textLocation = arrayListOf(10, -1, 30, 20, 0, 0, 0, 0)
                postTransparency = 0
                postTextSize = arrayListOf(0, 15)
                val backgroundColor = "#7b9acc"
                val textColor = "#FCF6F5"
                postFontFamily = 103

                postBackground = util.improveColorString(backgroundColor)
                val textcolo = util.improveColorString(textColor)
                val col = "#$textcolo"
                postTextColor = arrayListOf(CONSTANT, col)
                postPadding = arrayListOf(0, 0, 0, 0)
                postRadiuas = 10
                lineSpacing = 1.2f
            }
            pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
            drawPost.drawPostFire(post, layout)
            util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
        }

        fun loadPost555() {
            val post = Post()
            with(post) {
                postNum = 555
                postId = 79
                lineNum = 5
                imageUri = "https://cdn.pixabay.com/photo/2016/10/23/23/03/sunrise-1765027_1280.jpg"
                postText = arrayListOf(
                    " החיים האלה ",
                    " הם כלי לא רע  כדי לחיות, ",
                    " בכל מקרה ",
                    " בלעדיהם היה לך קצת קשה  ",
                    " להשתמש בסמרטפון שלך. "
                )
                postPadding = arrayListOf(100, -1, 35, 10)
                postTransparency = 0
                postTextSize = arrayListOf(0, 16)
                val backgroundColor = "#7b9acc"
                val textColor = "#FCF6F5"
                postFontFamily = 103
                postBackground = util.improveColorString(backgroundColor)
                val textcolo = util.improveColorString(textColor)
                val col = "#$textcolo"
                postTextColor = arrayListOf(CONSTANT, col)
                textLocation = arrayListOf(10, 10, 30, -1, 0, 0, 0, 0)
                postPadding = arrayListOf(0, 0, 0, 0)
                postRadiuas = 10
                lineSpacing = 1.2f
            }
            pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
            drawPost.drawPostFire(post, layout)
            util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
        }

        fun loadPost556() {
            val post = Post()
            with(post) {
                postNum = 556
                postId = 82
                lineNum = 5
                imageUri =
                    "https://cdn.pixabay.com/photo/2017/03/07/14/09/landscape-2124104_1280.jpg"
                postText = arrayListOf(
                    " אתה לא צריך לחסל את כל השדים שלך",
                    " זה אכזרי מדי ולא ראלי, ",
                    " מספיק שתשלח אותם לביתם הפרטי ",
                    " שמצוי אי שם  ",
                    " במרחבי העולם הנפשי שלך. "
                )
                postPadding = arrayListOf(100, -1, 30, 10)
                postTransparency = 0
                postTextSize = arrayListOf(0, 15)
                val backgroundColor = "#7b9acc"
                val textColor = "#FCF6F5"
                postFontFamily = 103
                postBackground = util.improveColorString(backgroundColor)
                val textcolo = util.improveColorString(textColor)
                val col = "#$textcolo"
                postTextColor = arrayListOf(CONSTANT, col)
                textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
                postPadding = arrayListOf(0, 0, 0, 0)
                postRadiuas = 10
                lineSpacing = 1.2f
            }
            pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
            drawPost.drawPostFire(post, layout)
            util.sendPostToStringFirestore(post)
        }

    fun loadPost557() {
        val post = Post()
        with(post) {
            postNum = 557
            postId = 85
            lineNum = 5
            imageUri =
                "https://cdn.pixabay.com/photo/2015/08/31/10/07/man-915230_1280.jpg"
            postText = arrayListOf(
                " האפשרות המובנת של  האדם ",
                " לחשוב כמו מישהו אחר, ",
                " חיסלה כמעט לחלוטין ",
                " את היכולת הבסיסית שלו  ",
                " להיות מה שהוא. "
            )
            postPadding = arrayListOf(100, -1, 30, 10)
            postTransparency = 0
            postTextSize = arrayListOf(0, 15)
            val backgroundColor = "#7b9acc"
            val textColor = "#FCF6F5"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 10
            lineSpacing = 1.2f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
        fun loadPost558() {
        val post = Post()
        with(post) {
            postNum = 558
            postId = 86
            lineNum = 5
            imageUri =
                "https://cdn.pixabay.com/photo/2014/02/23/09/16/man-272675_1280.jpg"
            postText = arrayListOf(
                " האדם ניכר ",
                " באתר הראשון במחשב ",
                " שהוא פותח בבוקר שלו, ",
                " ובסרט האחרון בטלוויזיה  ",
                " שהוא רואה בסוף היום שלו. "
            )
            postPadding = arrayListOf(100, -1, 30, 10)
            postTransparency = 0
            postTextSize = arrayListOf(0, 15)
            val backgroundColor = "#7b9acc"
            val textColor = "#FCF6F5"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 10
            lineSpacing = 1.2f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost559() {
        val post = Post()
        with(post) {
            postNum = 559
            postId = 84
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2014/03/26/21/00/climber-299018_1280.jpg"
            postText = arrayListOf(
                " יש שני סוגי אנשים: ",
                " האבודים ",
                " ואלה שנאחזים במשהו  ",
                " אפילו שהמשהו הזה בדרך כלל  ",
                " לא בדיוק מתאים להם. "
            )
            postId = 84
            textLocation = arrayListOf(10,10, 35,-1,0, 0,0, 0)
            postPadding = arrayListOf(0, 0, 0,0)
            postTransparency =0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#7b9acc"
            val textColor = "#FCF6F5"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost560() {
        val post = Post()
        with(post) {
            postNum = 560
            postId = 84
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2015/01/16/11/18/restaurant-601304_1280.jpg"
            postText = arrayListOf(
                " האדם בחיים דומה לאותו אחד ",
                " שנכנס למסעדת שף יוקרתית ",
                " הוא אוכל בנימוס והכל בסדר,  ",
                " אבל עמוק בפנים הוא יודע  ",
                " שהוא בנוי יותר לג'אנק פוד. "
            )
            postId = 85
            textLocation = arrayListOf(10,10, 35,-1,0, 0,0, 0)
            postPadding = arrayListOf(0, 0, 0,0)
            postTransparency =5
            postTextSize = arrayListOf(0, 16)
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

    fun loadPost561() {
        val post = Post()
        with(post) {
            postNum = 561
            postId = 86
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2014/12/24/05/02/drop-of-water-578897_1280.jpg"
            postText = arrayListOf(
                " היכולת המרעננת להתחדש תלויה: ",
                " במחנק מהקיים כרגע, ",
                " בנכונות לוותר על הישן והמוכר, ",
                " ובעוז  ",
                " להיכנס למחוזות לא מוכרים. "
            )
            postId = 85
            textLocation = arrayListOf(10,10, 30,-1,0, 0,0, 0)
            postPadding = arrayListOf(0, 0, 0,0)
            postTransparency =0
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#000000"
            val textColor = "#331B3F"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost562() {
        val post = Post()
        with(post) {
            postNum = 562
            postId = 86
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2022/07/26/03/35/jogger-7344979_1280.jpg"
            postText = arrayListOf(
                " אם אתה תופס את עצמך ",
                " כמישהו אחר, ",
                " אתה חי כמישהו אחר ",
                " ואת החיים שלך, ",
                " סתם חבל. "
            )
            postId = 86
            textLocation = arrayListOf(10,-1, 30,5,0, 0,0, 0)
            postPadding = arrayListOf(0, 0, 0,0)
            postTransparency =0
            postTextSize = arrayListOf(0, 16)
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
        fun loadPost563() {
        val post = Post()
        with(post) {
            postNum = 563
            postId = 86
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2022/07/26/03/35/sunset-7344981_1280.jpg"
            postText = arrayListOf(
                " בעולם הזה יש סט צבעים בסיסי, ",
                " אתה יוצר מהסט הזה ",
                " את הצבע המיוחד שלך, ",
                " ואיתו אתה צובע את כל הצורות ",
                " הקיימות בעולם הזה. "
            )
            postId = 88
            textLocation = arrayListOf(10,5, 30,-1,0, 0,0, 0)
            postPadding = arrayListOf(0, 0, 0,0)
            postTransparency =0
            postTextSize = arrayListOf(0, 16)
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
      fun loadPost564() {
        val post = Post()
        with(post) {
            postNum = 564
            postId = 86
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2019/08/10/20/39/the-roots-of-the-4397679_1280.jpg"
            postText = arrayListOf(
                " אתה צומח מהשורשים שבך ",
                " אותם שממוקמים מתחת הקרקע ",
                " ומסרבים להתבגר עם כל יום שעובר, ",
                " נכון זה לא האזור הכי מפותח בך ",
                " אבל משם אתה צומח. "
            )
            postId = 84
            textLocation = arrayListOf(10,5, 30,-1,3, 30,0, 0)
            postPadding = arrayListOf(0, 0, 0,0)
            postTransparency =4
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            lineSpacing=1.3f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost565() {
        val post = Post()
        with(post) {
            postNum = 565
            postId = 86
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2017/01/08/10/41/sports-1962574_1280.jpg"
            postText = arrayListOf(
                " החופש ",
                " הוא כמו אותם מתקני ספורט ביתיים ",
                " שאנשים קונים ברשת, ",
                " הוא קיים ",
                " אבל אף אחד לא באמת משתמש בו. "
            )
            postId = 87
            textLocation = arrayListOf(10,-1, 30,10,0, 0,0, 0)
            postPadding = arrayListOf(0, 0, 0,0)
            postTransparency =7
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            lineSpacing=1.3f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
    fun loadPost566() {
        val post = Post()
        with(post) {
            postNum = 566
            postId = 86
            lineNum = 5
            imageUri = "https://cdn.pixabay.com/photo/2020/02/20/23/21/woman-4866179_1280.jpg"
            postText = arrayListOf(
                " בחיים שלך ",
                " אתה מרגיש שמשהו חסר, ",
                " לא בגלל שמשהו באמת חסר, ",
                " אלא רק בגלל אותה הרגשה ",
                " שמשהו חסר. "
            )
            postId = 88
            textLocation = arrayListOf(10,5, 35,-1,0, 0,0, 0)
            postPadding = arrayListOf(0, 0, 0,0)
            postTransparency =7
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#2C5F2D"
            val textColor = "#97BC62"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            lineSpacing=1.3f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
    }



