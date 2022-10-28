package com.sg.alma60a

import android.app.Activity
import android.content.Context
import androidx.constraintlayout.widget.ConstraintLayout
import com.sg.alma60a.model.Post


class Post4Lines(val context: Context) {

    private val layout: ConstraintLayout = (context as Activity).findViewById(R.id.itemLayoutFire)
    val pref = context.getSharedPreferences(SHARPREF_ALMA, Context.MODE_PRIVATE)
    val drawPost = DrawPostCenter(context)
    private val util = Utility()


    fun loadPost400() {
        val post = Post()
        with(post) {
            postNum = 400
            postId = 68
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2020/01/21/11/39/running-4782722_1280.jpg"
            postText = arrayListOf(
                "על תהיה הכי טוב",
                "זה לא יצליח לך לאורך זמן,",
                " לך על משהו יותר ממשי",
                "תהיה הכי אתה."
            )
            postBackground = "a9dce3"
            postTransparency = 0
            textLocation = arrayListOf(10, 10, 30, -1, 0, 0, 0, 0)
            postTextSize = arrayListOf(0, 16)
            postPadding = arrayListOf(0, 0, 0, 0)
            val col = "#ffffff"
            val col1 = "#4dd0e1"
            postTextColor = arrayListOf(CONSTANT, col, col1, col1)
            postFontFamily = 103
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost401() {
        val post = Post()
        with(post) {
            postNum = 401
            postId = 82
            lineNum = 4
            imageUri =
                "https://cdn.pixabay.com/photo/2017/01/09/22/24/guy-playing-billiard-1967834_1280.jpg"
            postText = arrayListOf(
                " הבלים הם דברים אמיתיים, ",
                " מה שהופך אותם להבלים לגביך ",
                " זו היכולת שלהם ",
                " למנוע ממך להתפתח. "
            )
            postBackground = "210070"
            postTransparency = 9
            textLocation = arrayListOf(10, 10, 30, -1, 0, 0, 0, 0)
            postTextSize = arrayListOf(0, 16)
            postPadding = arrayListOf(0, 0, 0, 0)
            val col = "#ffffff"
            val col1 = "#4dd0e1"
            postTextColor = arrayListOf(CONSTANT, col, col1, col1)
            postFontFamily = 103
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost402() { //N
        val post = Post()
        with(post) {
            postNum = 402
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2020/01/25/09/28/woman-4792042_1280.jpg"
            postText = arrayListOf(
                " פסימיות ",
                " זה לחשוב שיש מישהו מאושר ממך, ",
                " אופטימיות ",
                " זה להבין שאין אחד כזה. "
            )
            postBackground = "a3842c"
            postTransparency = 9
            postId = 80
            textLocation = arrayListOf(10, -1, 28, 140, 0, 0, 0, 0)
            val size1 = 14
            val size2 = 0
            postTextSize = arrayListOf(0, size1, size2)
            postPadding = arrayListOf(0, 0, 0, 0)
            val col = "#ffffff"
            val col1 = "#4dd0e1"
            postTextColor = arrayListOf(CONSTANT, col)
            postFontFamily = 103
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
    }

    fun loadPost403() {
        val post = Post()
        with(post) {
            postNum = 403
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/06/01/09/15/art-1428646_1280.jpg"
            postText = arrayListOf(
                " האויב של הטוב ",
                " הוא הטוב יותר, ",
                " האויב של הרגע ",
                " הוא הרגע הבא. "
            )
            postBackground = "a3842c"
            postTransparency = 10
            postId = 78
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
            val size1 = 24
            val size2 = 0
            postTextSize = arrayListOf(0, size1, size2)
            postPadding = arrayListOf(0, 0, 0, 0)
            val col = "#ffffff"
            val col1 = "#4dd0e1"
            postTextColor = arrayListOf(CONSTANT, col)
            postFontFamily = 130
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
    }

    fun loadPost404() {
        val post = Post()
        with(post) {
            postNum = 404
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2019/01/10/09/28/castle-3925038_1280.jpg"
            postText = arrayListOf(
                "האנשים",
                "חיים כדרכם",
                "מתוך תא הכלא",
                "של מה שהם חושבים שהם."
            )
            postBackground = "a3842c"
            postTransparency = 4
            postId = 80
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            val size1 = 24
            val size2 = 0
            postTextSize = arrayListOf(0, size1, size2)
            postPadding = arrayListOf(10, 0, 10, 0)
            val col = "#ffffff"
            postTextColor = arrayListOf(CONSTANT, col)
            postFontFamily = 130
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
    }

    fun loadPost405() {
        val post = Post()
        with(post) {
            postNum = 405
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2020/12/16/21/58/tv-5837826_1280.jpg"
            postText = arrayListOf(
                "וגם באם תגיע לאור,",
                "הרי אחרי חצי שעה תקום לראות טלוויזיה,",
                "כי מתחיל האח הגדול",
                "ויש הדחה כפולה."
            )
            postId = 79
            textLocation = arrayListOf(10, -1, 30, 10, 0, 30, 0, 0)
            postTextSize = arrayListOf(0, 14)
            postBackground = "a3842c"
            postTransparency = 6
            val textColor = "ffffff"
            postFontFamily = 103

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(5, 0, 5, 5)
        }
        drawPost.drawPostFire(post, layout)
    }

    fun loadPost406() {
        val post = Post()
        with(post) {
            postNum = 406
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/06/29/20/48/cemetery-2456173_1280.jpg"
            postText = arrayListOf(
                "ישנם אנשים קרובים",
                "שבהלוויה שלהם,",
                "אתה פחות סופד להם",
                "ויותר לעצמך."
            )
            postId = 79
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            postTextSize = arrayListOf(0, 16)
            postBackground = "FCE77D"
            postTransparency = 9
            val textColor = "1820FF"
            postFontFamily = 103

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10, 0)
        }
        drawPost.drawPostFire(post, layout)
    }

    fun loadPost407() {
        val post = Post()
        with(post) {
            postNum = 407
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2020/11/24/17/36/magic-5773359_1280.png"
            val s1 = "\""
            val s2 = "\""
            val s12 = " פוליטיקלי קורקט "
            postText = arrayListOf(
                "$s1$s12$s2",
                "זה היכולת של האדם",
                "לקרוא ליום לילה וללילה יום",
                "בשם האמונות שלו."
            )
            postId = 65
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            postTextSize = arrayListOf(0, 16)
            postBackground = "FCE77D"
            postTransparency = 9
            val textColor = "1820FF"
            postFontFamily = 103

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10, 0)
        }

        drawPost.drawPostFire(post, layout)
    }

    fun loadPost408() {
        val post = Post()
        with(post) {
            postNum = 408
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/10/10/07/48/beach-2836300_1280.jpg"
            postText = arrayListOf(
                "שיחות עם הים",
                "כמו רוב השיחות עם בני האדם,",
                "לא יצאת חכם יותר",
                "אבל לפחות אמרת את מה שאתה חושב."
            )
            postId = 79
            textLocation = arrayListOf(10, -1, 35, 10, 2, 25, 0, 0)
            postTextSize = arrayListOf(0, 16)
            postBackground = "FCE77D"
            postTransparency = 7
            val textColor = "1820FF"
            postFontFamily = 103

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10, 0)
            lineSpacing = 1.1f
        }
        drawPost.drawPostFire(post, layout)
    }

    fun loadPost409() {
        val post = Post()
        with(post) {
            postNum = 409
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2021/11/20/05/15/car-6810885_1280.jpg"
            postText = arrayListOf(
                "השאלה היא פחות:",
                "מה קורה כאן,",
                "ויותר, איפה אני בכל",
                " מה שקורה כאן."
            )
            postId = 76
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
            postTextSize = arrayListOf(0, 22)
            postBackground = "F0A07C"
            postTransparency = 8
            val textColor = "4A274F"
            postFontFamily = 110

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10, 0)
        }
        drawPost.drawPostFire(post, layout)
    }

    fun loadPost410() {
        val post = Post()
        with(post) {
            postNum = 410
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/12/11/12/42/river-1899328_1280.jpg"
            postText = arrayListOf(
                "את האיזורים הרדודים בעולם",
                "אתה לא יכול להאשים ברדידות,",
                "אתה יכול להאשים רק את עצמך",
                " שאתה נמצא יותר מידי זמן באיזורים האלה."
            )
            postId = 81
            textLocation = arrayListOf(10, 10, 30, -1, 0, 0, 0, 0)
            postTextSize = arrayListOf(0, 14)
            postBackground = "00e1d9"
            postTransparency = 0
            val textColor = "5e001f"
            postFontFamily = 103
            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10, 0)
        }
        drawPost.drawPostFire(post, layout)
    }

    fun loadPost411() {
        val post = Post()
        with(post) {
            postNum = 411
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/02/06/10/54/sad-2042536_1280.jpg"
            postText = arrayListOf(
                " החיים שלך זה כמו השיער ",
                " יש ימים שהם מסתדרים לך, ",
                "ואז אתה מרגיש טוב עם עצמך",
                " ויש ימים שלא. "
            )
            postId = 75
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
            postTextSize = arrayListOf(0, 16)
            postBackground = "efc8b1"
            postTransparency = 7
            val textColor = "514644"
            postFontFamily = 103

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10, 0)
        }
        drawPost.drawPostFire(post, layout)
    }

    fun loadPost412() {
        val post = Post()
        with(post) {
            postNum = 412
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2012/02/24/16/56/beach-16698_1280.jpg"
            postText = arrayListOf(
                " תן לי את הכישרון ",
                " לראות הבלים כהבלים, ",
                "עם האמת הפשוטה",
                " אני כבר אסתדר. "
            )
            postId = 85
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
            postTextSize = arrayListOf(0, 20)
            postBackground = "efc8b1"
            postTransparency = 8
            val textColor = "514644"
            postFontFamily = 220
            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10, 0)
        }

        drawPost.drawPostFire(post, layout)
    }

    fun loadPost413() {
        val post = Post()
        with(post) {
            postNum = 413
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/10/18/05/19/old-man-1749360_1280.jpg"
            postText = arrayListOf(
                "  לא השתנת, ",
                "תמיד היית בנוי מאותם חומרים,",
                " רק שעם הגיל ",
                "אתה משתמש בהם קצת אחרת."
            )
            postId = 84
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
            postTextSize = arrayListOf(0, 16)
            postBackground = "558b2f"
            postTransparency = 0
            val textColor = "ffff00"
            postFontFamily = 103

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10, 0)
        }
        drawPost.drawPostFire(post, layout)
    }

    fun loadPost414() {
        val post = Post()
        with(post) {
            postNum = 414
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2018/10/06/08/27/religion-3727463__480.jpg"
            postText = arrayListOf(
                "גבולות העולם שלך די קבועים,",
                "ככה ",
                "שכמה שהאלוהות שבך יותר גדולה,",
                "הבעיות האישיות שלך יותר קטנות."
            )
            postId = 82
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
            postTextSize = arrayListOf(0, 14)
            postBackground = "337def"
            postTransparency = 7
            val textColor = "fcc729"
            postFontFamily = 103
            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10, 0)
        }
        drawPost.drawPostFire(post, layout)
    }

    fun loadPost415() {
        val post = Post()
        with(post) {
            postNum = 415
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2018/10/12/13/36/soder-3742220_1280.jpg"
            postText = arrayListOf(
                "להתעצבן בגלל פוליטיקה",
                "זה מותרות ",
                "שרק למי שיש חיי נצח",
                "יכול להרשות לעצמו."
            )
            postId = 78
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
            postTextSize = arrayListOf(0, 22)
            postBackground = "ffb8b1"
            postTransparency = 10
            val textColor = "993441"
            postFontFamily = 260

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10, 0)
        }
        drawPost.drawPostFire(post, layout)
    }

    fun loadPost416() {
        val post = Post()
        with(post) {
            postNum = 416
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/04/26/23/46/morning-2264051_1280.jpg"
            postText = arrayListOf(
                "לא היית יכול",
                "לחיות את חייך אחרת,",
                "פשוט",
                "כי אתה כזה."
            )
            postId = 78
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
            postTextSize = arrayListOf(0, 20)
            postBackground = "ffb8b1"
            postTransparency = 0
            val textColor = "ffffff"
            postFontFamily = 1

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10, 0)
        }
        drawPost.drawPostFire(post, layout)
    }

    fun loadPost417() {
        val post = Post()
        with(post) {
            postNum = 417
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2018/01/03/05/37/the-sun-3057625_1280.jpg"
            postText = arrayListOf(
                "בחיים האלה",
                "אתה יכול לחיות בכאילו,",
                "אבל בכל מקרה",
                "בסוף תמות באמת."
            )
            postId = 86
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
            postTextSize = arrayListOf(0, 16)
            postBackground = "ffb8b1"
            postTransparency = 0
            val textColor = "ffffff"
            postFontFamily = 103
            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10, 0)
        }
        drawPost.drawPostFire(post, layout)
    }

    fun loadPost418() {
        val post = Post()
        with(post) {
            postNum = 418
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/11/29/09/32/concept-1868728_1280.jpg"
            postText = arrayListOf(
                "החיים גדולים עליך בכמה מספרים,",
                "ובגלל זה ",
                "אתה מסתפק בסיפורים על החיים ",
                "שיש אצלך בראש."
            )
            postId = 72
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            postTextSize = arrayListOf(0, 16)
            postBackground = "000000"
            postTransparency = 8
            val textColor = "ffffff"
            postFontFamily = 103

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(5, 0, 5, 0)
        }
        drawPost.drawPostFire(post, layout)
    }

    fun loadPost419() {
        val post = Post()
        with(post) {
            postNum = 419
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/08/01/06/51/people-1560569_1280.jpg"
            postText = arrayListOf(
                "החיים האלה זה סוג של משחק,",
                "נכון מתים בסוף המשחק הזה ",
                "אבל כדי להנות ממנו ",
                "אתה צריך להיות קצת ילד."
            )
            postId = 80
            textLocation = arrayListOf(10, 5, 30, -1, 0, 0, 0, 0)
            postTextSize = arrayListOf(0, 16)
            postBackground = "000000"
            postTransparency = 5
            val textColor = "ffffff"
            postFontFamily = 103

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10, 0)
        }
        drawPost.drawPostFire(post, layout)
    }

    fun loadPost420() {
        val post = Post()
        with(post) {
            postNum = 420
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2010/12/13/09/50/jute-1655_1280.jpg"
            postText = arrayListOf(
                "ישנם בעיות אמיתיות",
                "וישנם בעיות דמי, ",
                "העוול הגדול שהאדם עושה לעצמו",
                "הוא לשים את כל הבעיות באותו שק."
            )
            postId = 78
            textLocation = arrayListOf(10, -1, 35, 10, 2, 35, 0, 0)
            postTextSize = arrayListOf(0, 16)
            postBackground = "000000"
            postTransparency = 4
            val textColor = "ffffff"
            postFontFamily = 103
            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10, 0)
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost421() {
        val post = Post()
        with(post) {
            postNum = 421
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2015/07/25/11/49/sea-859517_1280.jpg"
            postText = arrayListOf(
                "חבל להתעצבן היום על דברים,",
                "שאתה בלי בעיות ",
                "יכול להתעצבן עליהם",
                "גם מחר."
            )
            postId = 73
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
            postTextSize = arrayListOf(0, 16)
            postBackground = "000000"
            postTransparency = 4
            val textColor = "ffffff"
            postFontFamily = 103

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10, 0)
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost422() {
        val post = Post()
        with(post) {
            postNum = 422
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/06/26/02/47/man-2442565_1280.jpg"
            postText = arrayListOf(
                "האושר",
                "הוא תוצר לוואי",
                "  למעשים הנכונים לך  ",
                "שאתה עושה."
            )
            postId = 79
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
            postTextSize = arrayListOf(0, 16)
            postBackground = "000000"
            postTransparency = 4
            val textColor = "ffffff"
            postFontFamily = 103

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10, 0)
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost423() {
        val post = Post()
        with(post) {
            postNum = 423
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/08/07/08/46/city-2601562_1280.jpg"
            postText = arrayListOf(
                "חוסר שפיות",
                "זה לחיות את הטירוף שלך,",
                "שפיות",
                "זה לחיות את הטירוף של הכלל."
            )
            postId = 80
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)

            postTextSize = arrayListOf(0, 22)
            postBackground = "000000"
            postTransparency = 0
            val textColor = "ffffff"
            postFontFamily = 110

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 5, 10, 5)
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost424() {
        val post = Post()
        with(post) {
            postNum = 424
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/06/05/11/01/airport-2373727_1280.jpg"
            postText = arrayListOf(
                "אנשים נוסעים לפה",
                "אנשים נוסעים לשם,",
                "אבל בסוף",
                "תמיד הם פוגשים בעיקר את עצמם."
            )
            postId = 81
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
            postTextSize = arrayListOf(0, 16)
            postBackground = "000000"
            postTransparency = 3
            val textColor = "ffffff"
            postFontFamily = 105

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10, 0)
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost425() {
        val post = Post()
        with(post) {
            postNum = 425
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/01/26/05/33/character-1161955_1280.jpg"
            postText = arrayListOf(
                "אומנם",
                "אתה רואה את החיים כמו שהם",
                "אבל",
                "תופס אותם כמו שאתה."
            )
            postId = 81
            textLocation = arrayListOf(10, -1, 40, 10, 0, 0, 0, 0)
            postTextSize = arrayListOf(0, 22)
            postBackground = "000000"
            postTransparency = 3
            val textColor = "ffffff"
            postFontFamily = 100

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10, 0)
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost426() {
        val post = Post()
        with(post) {
            postNum = 426
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2020/04/20/15/55/flame-5068748_1280.jpg"
            postText = arrayListOf(
                "להביא חושך בחשכה",
                "כל אחד יכול,",
                "להביא אור בחשכה",
                "זה קצת יותר ייחודי."
            )
            postId = 84
            textLocation = arrayListOf(10, 20, 30, -1, 0, 0, 0, 0)
            postTextSize = arrayListOf(0, 22)
            postBackground = "000000"
            postTransparency = 1
            val textColor = "ffffff"
            postFontFamily = 110

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postRadiuas = 15
            postPadding = arrayListOf(10, 0, 10, 0)
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost427() {
        val post = Post()
        with(post) {
            postNum = 427
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2015/07/09/22/45/tree-838667_1280.jpg"
            postText = arrayListOf(
                "נחמה",
                "זה שמישהו אומר לך שאתה בסדר,",
                "שלווה",
                "זה שאתה מבין שאתה בסדר."
            )
            postId = 87
            textLocation = arrayListOf(10, 20, 30, -1, 0, 0, 0, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 16)
            postBackground = "1E4174"
            val textColor = "DDA94B"
            postFontFamily = 103

            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost428() {
        val post = Post()
        with(post) {
            postNum = 428
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2018/02/21/08/05/woman-3169680_1280.jpg"
            postText = arrayListOf(
                "כשאתה סימן שאלה",
                "תשובה אמיתית יכולה לעזור לך להתיישר,",
                "אבל לרוב אתה סימן קריאה",
                "והתשובה האמיתית מחליקה עליך ונעלמת."
            )
            postId = 78
            textLocation = arrayListOf(10, 80, 35, -1, 2, 30, 0, 0)

            postTransparency = 0
            postTextSize = arrayListOf(0, 16)
            postBackground = "1E4174"
            val textColor = "D6ED17"
            postFontFamily = 103

            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost429() {
        val post = Post()
        with(post) {
            postNum = 429
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/09/16/17/41/boy-2756201_1280.jpg"
            postText = arrayListOf(
                "החיים הם כמו משחק שח,",
                "אתה יכול לדעת את כל הכללים,",
                "אבל זה ממש לא עוזר לך",
                "  לדעת לשחק את המשחק הזה.  "
            )
            postId = 79
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            postTransparency = 8
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#F2EDD7"
            val textColor = "#755139"
            postFontFamily = 103

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost430() {
        val post = Post()
        with(post) {
            postNum = 430
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2019/10/31/11/42/cup-4591710_1280.jpg"
            postText = arrayListOf(
                "  גם  ",
                "שמדברים כל הזמן על החצי כוס הריקה,",
                "  זה  ",
                "  לא עושה אותה יותר מחצי כוס.  "
            )
            postId = 80
            textLocation = arrayListOf(10, 20, 30, -1, 0, 0, 0, 0)
            postTransparency = 8
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#F2EDD7"
            val textColor = "#755139"
            postFontFamily = 103

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost431() {
        val post = Post()
        with(post) {
            postNum = 431
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/02/04/23/02/candle-2038736_1280.jpg"
            postText = arrayListOf(
                "בכאן ועכשיו",
                "או שאתה אור,",
                "או שאתה חושך,",
                "ככה פשוט."
            )
            postId = 86
            textLocation = arrayListOf(10, 20, 30, -1, 0, 0, 0, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 18)
            val backgroundColor = "#F2EDD7"
            val textColor = "#ffffff"
            postFontFamily = 300
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5, 0, 5, 0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost432() {
        val post = Post()
        with(post) {
            postNum = 432
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/03/27/17/42/man-1283235_1280.jpg"
            postText = arrayListOf(
                "זה שאני חי כל כך הרבה שנים",
                "זה לא אומר שיש לי כישורים מיוחדים לעשות את זה,",
                "זה אומר רק שלא נהרגתי אפילו פעם אחת",
                "ושאני יודע לקום בבוקר."
            )
            postId = 73
            textLocation = arrayListOf(10, 20, 30, -1, 2, 30, 3, 30)
            postTransparency = 6
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#FCF6F5"
            val textColor = "#990011"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5, 0, 5, 0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }


    fun loadPost433() {
        val post = Post()
        with(post) {
            postNum = 433
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/11/14/04/12/school-1822566_1280.jpg"
            postText = arrayListOf(
                "תהיה",
                "יותר עצמך",
                "כי אין לך משהו אחר",
                " להיות. "
            )
            postId = 75
            textLocation = arrayListOf(10, 20, 35, -1, 0, 0, 0, 0)
            postTransparency = 5
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#FCF6F5"
            val textColor = "#990011"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost434() {
        val post = Post()
        with(post) {
            postNum = 434
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/09/06/19/43/african-2722733_1280.jpg"
            postText = arrayListOf(
                "אתה יצור מוזר,",
                "גם אם היו נותנים לך כרגע את גן העדן",
                "היית פותח חדשות ",
                " כדי לשמוע מה קורה בגיהנום. "
            )
            postId = 79
            textLocation = arrayListOf(10, 20, 30, -1, 0, 0, 0, 0)
            postTransparency = 9
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "000000"
            val textColor = "ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost435() {
        val post = Post()
        with(post) {
            postNum = 435
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2015/06/22/08/37/children-817365_1280.jpg"
            postText = arrayListOf(
                " להצליח בחיים ",
                " זה לא למות ",
                " לא מבחוץ  ",
                " ולא מבפנים. "
            )
            postId = 86
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            postTransparency = 6
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#2BAE66"
            val textColor = "ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost436() {
        val post = Post()
        with(post) {
            postNum = 436
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2018/10/27/00/50/male-3775700_1280.jpg"
            postText = arrayListOf(
                " בשבח השתיקה ",
                " בשבח חוסר התגובה ",
                " שיעבור עלי ",
                " שיעבור. "
            )
            postId = 69
            textLocation = arrayListOf(10, 20, 30, -1, 0, 0, 0, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#2BAE66"
            val textColor = "ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost437() {
        val post = Post()
        with(post) {
            postNum = 437
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2021/03/19/07/56/tavern-6106835_1280.jpg"
            postText = arrayListOf(
                " הבלים הם חלק מהחיים ",
                " ואין בהם כל בעיה, ",
                " כל זמן ",
                " שאתה תופס אותם כהבלים."
            )
            postId = 74
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
            postTransparency = 8
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#CED46A"
            val textColor = "#07553B"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost438() {
        val post = Post()
        with(post) {
            postNum = 438
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2019/09/17/12/54/landscape-4483412_1280.jpg"
            postText = arrayListOf(
                " שאתה קטן ",
                " כל גרגר מוחץ אותך, ",
                " שאתה גדול ",
                " זה סתם אבק ברוח."
            )
            postId = 77
            textLocation = arrayListOf(10, 20, 35, -1, 0, 0, 0, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#00203F"
            val textColor = "#ADEFD1"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost439() {
        val post = Post()
        with(post) {
            postNum = 439
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2014/12/03/15/42/boy-555577_1280.jpg"
            postText = arrayListOf(
                " ביקורת רעה על העולם ",
                " זה הרבה יותר מביקורת, ",
                " זה הופך את החיים שלך ",
                " להצגה כושלת."
            )
            postId = 68
            textLocation = arrayListOf(10, 20, 35, -1, 0, 0, 0, 0)
            postTransparency = 4
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#00203F"
            val textColor = "#ADEFD1"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost440() {
        val post = Post()
        with(post) {
            postNum = 440
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/07/23/21/07/mountains-2532825_1280.jpg"
            postText = arrayListOf(
                " בשורות טובות, ",
                " המשיח כבר כאן  ",
                " אבל האדם נמצא במקום אחר ",
                " ולכן קשה לו לפגוש אותו אישית. "
            )
            postId = 64
            textLocation = arrayListOf(10, 20, 35, -1, 0, 0, 0, 0)
            postTransparency = 6
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#00203F"
            val textColor = "#ADEFD1"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost441() {
        val post = Post()
        with(post) {
            postNum = 441
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2021/11/13/23/06/tree-6792528_1280.jpg"
            postText = arrayListOf(
                " התסכול שבך ",
                " נגמר בקצה המודעות שלך,  ",
                " העולם ממשיך להיות ",
                " הרבה מעבר לזה. "
            )
            postId = 73
            textLocation = arrayListOf(10, 20, 35, -1, 0, 0, 0, 0)
            postTransparency = 6
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#00203F"
            val textColor = "#ADEFD1"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }


    fun loadPost442() {
        val post = Post()
        with(post) {
            postNum = 442
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2015/12/04/09/34/crawl-1076324_1280.jpg"
            postText = arrayListOf(
                " האמנות הזו ",
                "  להשתתף רק בוויכוחים  ",
                " שנכונים לך, ",
                "  שמורה למתי מעט.  "
            )
            postId = 78
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            postTransparency = 6
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#00203F"
            val textColor = "#ADEFD1"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15

        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost443() {
        val post = Post()
        with(post) {
            postNum = 443
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2014/11/02/09/15/man-513529_1280.jpg"
            postText = arrayListOf(
                " כל אדם ",
                "  מייצר את הסבל האנושי שלו,  ",
                " העולם סביב ",
                "  רק בורא את החומרים לזה.  "
            )
            postId = 77
            textLocation = arrayListOf(10, 20, 35, -1, 0, 0, 0, 0)
            postTransparency = 7
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#1E4174"
            val textColor = "#DDA94B"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost444() {
        val post = Post()
        with(post) {
            postNum = 444
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2015/01/01/23/55/telephone-586266_1280.jpg"
            postText = arrayListOf(
                " האדם הוא יצור די טמבל, ",
                "  המזל שלו  ",
                " שלא צריך להיות חכם גדול ",
                "  כדי לחיות בעולם הזה.  "
            )
            postId = 68
            textLocation = arrayListOf(10, 20, 30, -1, 0, 0, 0, 0)
            postTransparency = 6
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#1E4174"
            val textColor = "#DDA94B"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost445() {
        val post = Post()
        with(post) {
            postNum = 445
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2019/04/06/16/18/passover-4107705_1280.jpg"
            postText = arrayListOf(
                " רוב האנשים יודעים לאמץ מסגרות ",
                " חלקם יודעים אפילו ליצור אותם ",
                " אבל רק מעטים  ",
                " יודעים לתת בהם תוכן. "
            )
            postId = 69
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            postTransparency = 8
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#F0EDCC"
            val textColor = "#02343F"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 2, 0, 2)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost446() {
        val post = Post()
        with(post) {
            postNum = 446
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2019/11/27/07/01/trouble-4656179_1280.jpg"
            postText = arrayListOf(
                " כל החכמה בחיים האלה ",
                " זה להשתדל ",
                " שלא ליצור בעיות  ",
                " איפה שהן לא קיימות. "
            )
            postId = 76
            textLocation = arrayListOf(10, 20, 35, -1, 0, 0, 0, 0)
            postTransparency = 6
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#1E4174"
            val textColor = "#DDA94B"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost447() {
        val post = Post()
        with(post) {
            postNum = 447
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/09/08/20/29/chess-2730034_1280.jpg"
            postText = arrayListOf(
                " אותה אמת ",
                "שאתה די בטוח בה שהיא אמת",
                " בדרך כלל  ",
                " מונעת ממך לדעת את האמת. "
            )
            postId = 70
            textLocation = arrayListOf(10, -1, 35, 20, 0, 0, 0, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#1E4174"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost448() {
        val post = Post()
        with(post) {
            postNum = 448
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/01/18/20/11/old-man-1147288_1280.jpg"
            postText = arrayListOf(
                " המוות לא קיים ",
                "החיים נמשכים לעד,",
                " רק שאתה מרגע מסוים  ",
                " לא תשתתף בהם יותר. "
            )
            postId = 72
            textLocation = arrayListOf(10, 20, 35, -1, 0, 0, 0, 0)
            postTransparency = 6
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#1E4174"
            val textColor = "#DDA94B"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost449() {
        val post = Post()
        with(post) {
            postNum = 449
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/11/29/08/51/city-1868530_1280.jpg"
            postText = arrayListOf(
                "  אין חדש תחת השמש ",
                " זה מובן לי וידוע, ",
                " הבעיה שלפעמים גם עם הישן  ",
                " קשה לי להסתדר. "
            )
            postId = 81
            textLocation = arrayListOf(10, 20, 35, -1, 0, 0, 0, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#1E4174"
            val textColor = "#DDA94B"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost450() {
        val post = Post()
        with(post) {
            postNum = 450
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/11/01/16/48/cube-2908605_1280.jpg"
            postText = arrayListOf(
                "  אל תתייאש, ",
                " לפעמים הפתרון ",
                " עובר דרך איזורים   ",
                " שנראים לך כחסרי פתרון. "
            )
            postId = 82
            textLocation = arrayListOf(10, 10, 30, -1, 0, 0, 0, 0)
            postTransparency = 2
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#1E4174"
            val textColor = "#DDA94B"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost451() {
        val post = Post()
        with(post) {
            postNum = 451
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/04/27/20/38/girl-1357485_1280.jpg"
            postText = arrayListOf(
                "  אתה יכול לעשות הרבה דברים ",
                " עם החיים שלך, ",
                " והכי טוב  ",
                " זה לחיות אותם.  "
            )
            postId = 78
            textLocation = arrayListOf(10, -1, 30, 20, 0, 0, 0, 0)
            postTransparency = 8
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#1E4174"
            val textColor = "#DDA94B"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost452() {
        val post = Post()
        with(post) {
            postNum = 452
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/07/28/15/17/pokemon-1548194_1280.jpg"
            postText = arrayListOf(
                "  בעידן המודרני ",
                " קומץ קטן של ממציאים גאונים ",
                "  מאפשרים לשאר האנושות  ",
                "  לשקוע בטמטום גמור.  "
            )
            postId = 78
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            postTransparency = 9
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#1E4174"
            val textColor = "#DDA94B"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5, 0, 5, 5)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost453() {
        val post = Post()
        with(post) {
            postNum = 453
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/07/09/12/16/apples-1506119_1280.jpg"
            postText = arrayListOf(
                "  אם לא הייתי ",
                " מפריע כל כך לעצמי ",
                " וודאי שהייתי  ",
                "יכול להנות הרבה יותר מהחיים האלה."
            )
            postId = 81
            textLocation = arrayListOf(10, 10, 30, -1, 0, 0, 0, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#1E4174"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 5, 0, 5)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost454() {
        val post = Post()
        with(post) {
            postNum = 454
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2013/11/28/10/03/river-219972_1280.jpg"
            postText = arrayListOf(
                "  חוסר המנוחה הבסיסי שיש לאדם ",
                " נובע מהחיים עצמם ",
                " שאינם אגם קפוא  ",
                " אלא נהר זורם. "
            )
            postId = 82
            textLocation = arrayListOf(10, 10, 30, -1, 0, 0, 0, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#1E4174"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 5, 0, 5)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost455() {
        val post = Post()
        with(post) {
            postNum = 455
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/08/01/20/15/girl-1562025_1280.jpg"
            postText = arrayListOf(
                "  למודעות שלך יש קיבולת מוגבלת ",
                " על כל קורטוב הבלים שאתה מאמץ ",
                " קורטוב קדושה חומק ממך  ",
                "  בעיקר בגלל חוסר מקום. "
            )
            postId = 86
            textLocation = arrayListOf(10, 10, 30, -1, 0, 0, 0, 0)
            postTransparency = 6
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#1E4174"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost456() {
        val post = Post()
        with(post) {
            postNum = 456
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/07/03/09/17/fog-1494431_1280.jpg"
            postText = arrayListOf(
                " האמת ",
                " לא הולכת אף פעם לאיבוד, ",
                " היא רק מתגלית לך  ",
                "  כל פעם מחדש. "
            )
            postId = 76
            textLocation = arrayListOf(10, 10, 35, -1, 0, 0, 0, 0)
            postTransparency = 2
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#1E4174"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost457() {
        val post = Post()
        with(post) {
            postNum = 457
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/06/09/23/45/soldier-1447008_1280.jpg"
            postText = arrayListOf(
                " על דבר אחד בטוח שלא תסלח לעצמך, ",
                " על שבזבת את עצמך ",
                " במלחמות סרק  ",
                "  שהיו קיימות רק בראש שלך. "
            )
            postId = 80
            textLocation = arrayListOf(10, 10, 30, -1, 0, 0, 0, 0)
            postTransparency = 2
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#1E4174"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost458() {
        val post = Post()
        with(post) {
            postNum = 458
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2018/10/19/12/14/train-3758523_1280.jpg"
            postText = arrayListOf(
                " החיים לא מתכוונים לפגוע בך אישית ",
                " הם מתנהלים בדרכם, ",
                " רק שאתה לפעמים עומד להם  ",
                "  באמצע אותה דרך. "
            )
            postId = 85
            textLocation = arrayListOf(10, 10, 30, -1, 0, 0, 0, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#000000"
            val textColor = "#111111"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost459() {
        val post = Post()
        with(post) {
            postNum = 459
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2018/01/06/10/12/adult-3064693_1280.jpg"
            postText = arrayListOf(
                " גובה  ההר נמדד ",
                " מהמפלס שבו הוא מתחיל להתרומם, ",
                " השמחה שלך נמדדת  ",
                " ממפלס הצער בו היית. "
            )
            postId = 80
            textLocation = arrayListOf(10, -1, 30, 20, 0, 25, 0, 0)
            postTransparency = 5
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#1E4174"
            val textColor = "#DDA94B"
            postFontFamily = 101
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 5)
            postRadiuas = 15
            lineSpacing = 1f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost460() {
        val post = Post()
        with(post) {
            postNum = 460
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2020/05/05/12/12/coffee-5132832_1280.jpg"
            postText = arrayListOf(
                " בבוקרו של יום חדש ",
                " מעט אנשים מוצאים באמת את עצמם, ",
                " היתר משחקים את הדמות שלהם  ",
                " כמו שהם מכירים אותה. "
            )
            postId = 75
            textLocation = arrayListOf(10, 10, 30, -1, 0, 0, 0, 0)
            postTransparency = 5
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#000000"
            val textColor = "##FFFFFF"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 5)
            postRadiuas = 15
            lineSpacing = 1f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost461() {
        val post = Post()
        with(post) {
            postNum = 461
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/08/01/01/33/beanie-2562646_1280.jpg"
            postText = arrayListOf(
                " העולם גדול ורחב, ",
                " אבל אתה קולט בו רק את אותו חלק ",
                " שאפשרי לך  ",
                " בתור מה שאתה ברגע זה. "
            )
            postId = 75
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            postTransparency = 10
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#F2AA4C"
            val textColor = "#101820"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 5, 0, 0)
            postRadiuas = 15
            lineSpacing = 1f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost462() {
        val post = Post()
        with(post) {
            postNum = 462
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2019/01/18/20/15/rain-3940580_1280.jpg"
            postText = arrayListOf(
                " הוצאתי פטור ",
                " שלא להתעסק בעגמות נפש ",
                " עד יום שלישי הבא,  ",
                " איזה כיף. "
            )
            postId = 77
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            postTransparency = 5
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#606060"
            val textColor = "#D6ED17"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15
            lineSpacing = 1f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost463() {
        val post = Post()
        with(post) {
            postNum = 463
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/02/20/19/20/buddha-1212620_1280.jpg"
            postText = arrayListOf(
                "  אם האדם היה ממש מבין ",
                " עד כמה הוא מטבעו טמבל, ",
                " הוא לא היה מתבייש בזה בכלל  ",
                " אלא צוחק על זה בפה מלא. "
            )
            postId = 76
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
            postTransparency = 3
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5, 0, 5, 0)
            postRadiuas = 15
            lineSpacing = 1f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost464() {
        val post = Post()
        with(post) {
            postNum = 464
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2013/10/21/10/05/saint-198958_1280.jpg"
            postText = arrayListOf(
                "  האלוהים לא שם באופן קבוע ",
                " אתה צריך ליצור אותו כל בוקר, ",
                " ובאם לא תיצור אותו ",
                " הוא לא יברא אותך מחדש. "
            )
            postId = 82
            textLocation = arrayListOf(10, -1, 35, 20, 0, 0, 0, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5, 0, 5, 0)
            postRadiuas = 5
            lineSpacing = 1f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost465() {
        val post = Post()
        with(post) {
            postNum = 465
            lineNum = 4
            imageUri =
                "https://images.unsplash.com/photo-1530071698688-1e4c30e1ea52?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=433&q=80"
            postText = arrayListOf(
                "  הכל יחסי בעולם הזה ",
                " חוץ מהמחשבה הזו שיש לך בראש, ",
                " כי היא היחידה ",
                " הקיימת בעולם שלך ברגע זה. "
            )
            postId = 75
            textLocation = arrayListOf(10, -1, 35, 20, 0, 0, 0, 0)
            postTransparency = 6
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#02343F"
            val textColor = "#F0EDCC"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 5, 0, 0)
            postRadiuas = 15
            lineSpacing = 1f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost466() {
        val post = Post()
        with(post) {
            postNum = 466
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2018/08/13/03/21/family-3602245_1280.jpg"
            postText = arrayListOf(
                "  יש הרבה אנשים שחיים חיים טובים ",
                " והם בכלל לא יודעים את זה ",
                " אולי בגלל  שלא הודיעו להם רשמית ",
                " שיש להם חיים טובים. "
            )
            postId = 73
            textLocation = arrayListOf(10, -1, 30, 5, 0, 0, 0, 0)
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
            postRadiuas = 5
            lineSpacing = 1f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost467() {
        val post = Post()
        with(post) {
            postNum = 467
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/08/02/23/52/bag-1565402_1280.jpg"
            postText = arrayListOf(
                "  אתה יודע מה קורה בחיים שלך ",
                " אבל לא ממש מכיר אותם, ",
                " באיזשהו מקום קצת חבל ",
                " כי הם יכולים להיות די נחמדים. "
            )
            postId = 76
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            postTransparency = 6
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#815854"
            val textColor = "#F0EDCC"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 5, 0, 0)
            postRadiuas = 15
            lineSpacing = 1f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost468() {  //I
        val post = Post()
        with(post) {
            postNum = 468
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2020/08/19/05/53/asleep-5500058_1280.jpg"
            postText = arrayListOf(
                "  בסוף היום ",
                " גם מי שעשה המון ",
                " וגם מי שלא עשה דבר ",
                " הולכים לישון עייפים. "
            )
            postId = 89
            textLocation = arrayListOf(10, -1, 25, 180, 0, 0, 0, 0)
            postTransparency =5
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#606060"
            val textColor = "#D6ED17"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost469() {
        val post = Post()
        with(post) {
            postNum = 469
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/04/27/20/17/dandelion-2266558_1280.jpg"
            postText = arrayListOf(
                " הרוחות הרעות מנשבות מקצה עולם עד קצהו ",
                " ואין לך סיכוי שהם לא יכו בך מדי פעם על הפנים, ",
                " הרוחות הטובות מנשבות רק במקומות ספורים ",
                " וצריך התכוונות לטוב כדי להרגיש אותם. "
            )
            postId = 82
            textLocation = arrayListOf(10, -1, 30, 10, 0, 30, 1, 30)
            postTransparency = 0
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#606060"
            val textColor = "#D6ED17"
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
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost470() {
        val post = Post()
        with(post) {
            postNum = 470
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2015/12/29/17/50/teddy-1113160_1280.jpg"
            postText = arrayListOf(
                "  להבין ולקבל את החיפוש לנחמה ",
                " זו חצי נחמה, ",
                " החצי השני ",
                " זה לדעת שהיא כבר פה. "
            )
            postId = 81
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
            postTransparency = 5
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#606060"
            val textColor = "#D6ED17"
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
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost471() {
        val post = Post()
        with(post) {
            postNum = 471
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2019/07/13/02/25/man-4333898_1280.jpg"
            postText = arrayListOf(
                "  להיות אופטימי  ",
                " זה להרגיש טוב יותר ברגע זה ",
                " על חשבון עתיד לא ידוע, ",
                " אז למה לא ... "
            )
            postId = 79
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            postTransparency = 8
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#00203F"
            val textColor = "#ADEFD1"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 5, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost472() {
        val post = Post()
        with(post) {
            postNum = 472
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2015/05/11/21/33/human-763156_1280.jpg"
            postText = arrayListOf(
                "  אל תבלף  ",
                " איפה שממש לא הכרחי, ",
                " ואם כבר הכרחי ",
                " עשה את זה בטעם. "
            )
            postId = 78
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
            postTransparency = 10
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#101820"
            val textColor = "#FEE715"
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
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost473() {
        val post = Post()
        with(post) {
            postNum = 473
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2019/01/29/18/05/burger-3962997_1280.jpg"
            postText = arrayListOf(
                "  טעויות  ",
                " שאתה מוכן לשלם עליהן, ",
                " אינם טעויות ",
                " אלא דרך חיים. "
            )
            postId = 81
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
            postTransparency = 6
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#101820"
            val textColor = "#FEE715"
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
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost474() {
        val post = Post()
        with(post) {
            postNum = 474
            lineNum = 4
            imageUri =
                "https://cdn.pixabay.com/photo/2016/12/02/03/08/people-talking-1876726_1280.jpg"
            postText = arrayListOf(
                "אם אתה לא יודע להתלוצץ על עצמך",
                " אז אין לך חוש הומור כלל וכלל, ",
                " כי אנשים עם הומור ",
                "  מבינים בדיחה טובה. "
            )
            postId = 79
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
            postTransparency = 8
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#101820"
            val textColor = "#FEE715"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5, 0, 5, 0)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost475() {
        val post = Post()
        with(post) {
            postNum = 475
            lineNum = 4
            imageUri =
                "https://cdn.pixabay.com/photo/2018/02/16/02/03/pocket-watch-3156771_1280.jpg"
            postText = arrayListOf(
                " שעון מקולקל ",
                " צודק לפחות פעמיים ביום, ",
                " שעון תקין ",
                " יכול לטעות תמיד. "
            )
            postId = 84
            textLocation = arrayListOf(10, 10, 35, -1, 0, 0, 0, 0)
            postTransparency = 5
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
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost476() {
        val post = Post()
        with(post) {
            postNum = 476
            lineNum = 4
            imageUri =
                "https://cdn.pixabay.com/photo/2015/12/17/14/40/jewish-cemetery-1097409_1280.jpg"
            postText = arrayListOf(
                " שאתה מת ",
                " בטוח שאתה מת, ",
                " שאתה חי ",
                " לא בטוח שאתה חי. "
            )
            postId = 79
            textLocation = arrayListOf(10, 10, 35, -1, 0, 0, 0, 0)
            postTransparency = 6
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#101820"
            val textColor = "#FEE715"

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
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost477() {
        val post = Post()
        with(post) {
            postNum = 477
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/03/29/11/29/nepal-2184940_1280.jpg"
            postText = arrayListOf(
                " מה הם החיים ? ",
                " זו שאלה פתוחה ",
                " שהתשובה לה ",
                " מקטינה את החיים. "
            )
            postId = 83
            textLocation = arrayListOf(10, 10, 30, -1, 0, 0, 0, 0)
            postTransparency = 4
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#101820"
            val textColor = "#FEE715"

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
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost478() {
        val post = Post()
        with(post) {
            postNum = 478
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/12/29/11/04/girl-3047297_1280.jpg"
            postText = arrayListOf(
                " הכושר הזה להכניס את עצמך לבאסה ",
                " מכל צל צילה של מחשבה עוברת ",
                " הוא צורך הכרחי ",
                " אם אתה רוצה לחיות טוב  בגיהינום. "
            )
            postId = 81
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
            postTransparency = 5
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#101820"
            val textColor = "#FEE715"

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
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost479() {
        val post = Post()
        with(post) {
            postNum = 479
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2019/05/16/12/53/sad-4207079_1280.jpg"
            postText = arrayListOf(
                " לפעמים  ",
                " הבעיה של האדם ",
                " היא רק אותה המחשבה ",
                " שיש לו בעיה. "
            )
            postId = 84
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            postTransparency = 5
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#101820"
            val textColor = "#FEE715"

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
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost480() {
        val post = Post()
        with(post) {
            postNum = 480
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2014/04/05/11/40/punch-316605_1280.jpg"
            postText = arrayListOf(
                "  אומנם הרבה השתנה  ",
                "  מאז אבותיי הפרה היסטוריים  ",
                "  אבל הכעס שלו והכעס שלי  ",
                " דומים להפליא. "
            )
            postId = 79
            textLocation = arrayListOf(10, 10, 30, -1, 0, 0, 0, 0)
            postTransparency = 4
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#101820"
            val textColor = "#FEE715"

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
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost481() {
        val post = Post()
        with(post) {
            postNum = 481
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2020/04/12/10/37/sunset-5033708_1280.jpg"
            postText = arrayListOf(
                "  כולם חושבים את אותם הדברים  ",
                "  אבל מעטים יודעים את זה,  ",
                "  אם יותר אנשים היו מודעים לזה  ",
                " הייתה פחות בדידות בעולם. "
            )
            postId = 83
            textLocation = arrayListOf(10, 10, 35, -1, 0, 0, 0, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#101820"
            val textColor = "#FEE715"

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
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost482() {
        val post = Post()
        with(post) {
            postNum = 482
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2019/12/11/18/11/storm-4688918_1280.jpg"
            postText = arrayListOf(
                "  למצא פתרון לבעיה שלא קיימת  ",
                "  זה אפשרי אבל ממש לא מעשי,  ",
                "  אחת מהבעיות האלה היא  ",
                " משמעות החיים. "
            )
            postId = 78
            textLocation = arrayListOf(10, 10, 35, -1, 0, 0, 0, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#FFDFDE"
            val textColor = "#6A7BA2"

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
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost483() {
        val post = Post()
        with(post) {
            postNum = 72
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2019/07/29/21/27/filming-4371566_1280.jpg"
            postText = arrayListOf(
                "  החיים שלך  ",
                "  זו הפקה די בינונית של חי אדם  ",
                "  המבוססת על מקרה אמיתי  ",
                " של מה שקרה לך. "
            )
            postId = 72
            textLocation = arrayListOf(10, 10, 35, -1, 0, 0, 0, 0)
            postTransparency = 6
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#FFDFDE"
            val textColor = "#6A7BA2"
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
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost484() {
        val post = Post()
        with(post) {
            postNum = 484
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/12/15/20/17/cleaning-1909978_1280.jpg"
            postText = arrayListOf(
                "  מוטב לעשות  ",
                "  את מה שאתה יכול לעשות,  ",
                " מלהתבכיין ",
                " על מה שאתה לא יכול לעשות. "
            )
            postId = 79
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
            postTransparency = 7
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#755139"
            val textColor = "#F2EDD7"

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
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost485() {
        val post = Post()
        with(post) {
            postNum = 485
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2018/09/27/23/34/water-3708190_1280.jpg"
            postText = arrayListOf(
                " חצי הכוס הריקה ",
                "  הוא המקום היחידי  ",
                " בו אפשרי לך ",
                " ליצור יש מהאין. "
            )
            postId = 84
            textLocation = arrayListOf(10, 10, 35, -1, 0, 0, 0, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#755139"
            val textColor = "#F2EDD7"

            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 5, 0, 5)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost486() {
        val post = Post()
        with(post) {
            postNum = 486
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/11/22/19/32/hands-1850223_1280.jpg"
            postText = arrayListOf(
                " טעות היא לחשוב ",
                "  שהאדם רוצה יחס,  ",
                " היחס הוא חלק מהאדם עצמו ",
                " וללא יחס הוא מרגיש חסר. "
            )
            postId = 80
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
            postTransparency = 7
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#755139"
            val textColor = "#ffffff"

            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5, 0, 5, 0)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost487() {
        val post = Post()
        with(post) {
            postNum = 487
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2020/01/24/05/38/tunisia-4789342_1280.jpg"
            postText = arrayListOf(
                " הקסם בחיים  ",
                "  הוא דבק  ",
                " שמחבר בין הדברים שקורים ",
                "  לידי חוויה אישית. "
            )
            postId = 84
            textLocation = arrayListOf(10, 10, 30, -1, 0, 0, 0, 0)
            postTransparency = 6
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#CED46A"
            val textColor = "#07553B"

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
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost488() {
        val post = Post()
        with(post) {
            postNum = 488
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2019/10/14/18/19/senior-4549666_1280.jpg"
            postText = arrayListOf(
                " אתה חי עם החיים שלך כבר המון שנים  ",
                " ולא ממש מכיר אותם,  ",
                " זה מרגיש יותר כמו נישואי נוחות ",
                "  מסיפור אהבה. "
            )
            postId = 83
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
            postTransparency = 4
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#A4193D"
            val textColor = "#FFDFB9"

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
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost489() {
        val post = Post()
        with(post) {
            postNum = 489
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2013/02/05/21/05/running-78192_1280.jpg"
            postText = arrayListOf(
                " המפסידים בחיים ",
                " אלה אינם אלה שהגיעו במקומות האחרונים,  ",
                " אלה אותם ",
                "  שלא משתתפים. "
            )
            postId = 79
            textLocation = arrayListOf(10, -1, 30, 5, 0, 25, 0, 0)
            postTransparency = 8
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#ADEFD1"
            val textColor = "#00203F"

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
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost490() {
        val post = Post()
        with(post) {
            postNum = 490
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/11/23/18/07/dog-1854123_1280.jpg"
            postText = arrayListOf(
                " הים הגדול ממשיך עד מעבר לאופק  ",
                " אבל הצעקות של השכנה שמדברת בפלאפון  ",
                " ממלאות לי את כל חלל המודעות ",
                "  כי אני יצור שבנוי ברובו לעיסוק בהבלים.  "
            )
            textLocation = arrayListOf(10, -1, 30, 5, 0, 25, 0, 0)
            postTransparency = 3
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#00203F"
            val textColor = "#ADEFD1"

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
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4901() {  //I
        val post = Post()
        with(post) {
            postNum = 4901
            postId = 80
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2018/04/29/01/23/skin-3358873_1280.jpg"
            postText = arrayListOf(
                " החיים שלך  ",
                " זה לא מה שקורה לך, ",
                " אלא ",
                "  מה שאתה מבין מכל מזה.  "
            )
            textLocation = arrayListOf(10, -1, 25, 100, 0, 0, 0, 0)
            postTransparency = 7
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#101820"
            val textColor = "#F2AA4C"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.5f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4902() {
        val post = Post()
        with(post) {
            postNum = 4902
            postId = 84
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/11/29/04/17/bonfire-1867275_1280.jpg"
            postText = arrayListOf(
                " הפייסבוק   ",
                " זאת מדורת השבט המודרנית, ",
                " רחוק מידי תתקרר ",
                "  קרוב מידי תישרף.  "
            )
            textLocation = arrayListOf(10, -1, 35, 5, 0, 0, 0, 0)
            postTransparency = 8
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#101820"
            val textColor = "#F2AA4C"

            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.5f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4903() {
        val post = Post()
        with(post) {
            postNum = 4903
            postId = 80
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/03/07/20/45/cog-wheels-2125169_1280.jpg"
            postText = arrayListOf(
                " האדם מכיר את עצמו  ",
                " ומכיר את העולם ",
                " אבל הוא לא מסוגל להבין ",
                "  איך זה עובד ביחד.  "
            )
            textLocation = arrayListOf(10, -1, 35, 5, 0, 0, 0, 0)
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
            postRadiuas = 16
            lineSpacing = 1.5f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4904() {
        val post = Post()
        with(post) {
            postNum = 4904
            postId = 76
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/10/27/15/52/jaguar-2894706_1280.jpg"
            postText = arrayListOf(
                " ככול שההישרדות היומיומית של האדם  ",
                " מתנוונת  עם הקדמה הטכנולוגית,  ",
                " הכשרון  לבזבז את החיים שלו ",
                "  מתפתח אצלו לרמה מרשימה.  "
            )
            textLocation = arrayListOf(10, -1, 35, 5, 0, 0, 0, 0)
            postTransparency = 9
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#F9EBDE"
            val textColor = "#815854"

            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.5f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4905() {
        val post = Post()
        with(post) {
            postNum = 4905
            postId = 79
            lineNum = 4
            imageUri =
                "https://cdn.pixabay.com/photo/2017/10/03/07/23/elephant-calf-2811487_1280.jpg"
            postText = arrayListOf(
                " האדם נמצא בדרך כלל   ",
                "  במקום שבטוח לו להיות שם,  ",
                " לא תמיד  ",
                "  זה המקום שהכי טוב בשבילו.  "
            )
            textLocation = arrayListOf(10, -1, 35, 5, 0, 0, 0, 0)
            postTransparency = 8
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#CED46A"
            val textColor = "#07553B"

            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 5, 10, 0)
            postRadiuas = 16
            lineSpacing = 1.5f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4906() {
        val post = Post()
        with(post) {
            postNum = 4906
            postId = 79
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2015/02/21/18/15/wall-644468_1280.jpg"
            postText = arrayListOf(
                " אתה יכול להבין    ",
                " את המגבלה שלך בתור בן אנוש,  ",
                " אבל ההבנה הזאת בדרך כלל  ",
                "  לא תחלץ אותך מתוך המגבלה הזו.  "
            )
            textLocation = arrayListOf(10, -1, 30, 20, 0, 0, 0, 0)
            postTransparency = 5
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#990011"
            val textColor = "#ffffff"

            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.5f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4907() {
        val post = Post()
        with(post) {
            postNum = 4907
            postId = 75
            lineNum = 4
            imageUri =
                "https://cdn.pixabay.com/photo/2016/08/23/15/52/fresh-orange-juice-1614822_1280.jpg"
            postText = arrayListOf(
                " האדם יוצר את הבעיות שלו  ",
                " מתוך העולם שסביבו, ",
                " הוא לא ממציא עובדות חדשות למציאות  ",
                "  אלא פשוט מרכיב אותם שלא בסדר הנכון. "
            )
            textLocation = arrayListOf(10, -1, 30, 20, 2, 25, 0, 0)
            postTransparency = 9
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#CED46A"
            val textColor = "#07553B"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 5)
            postRadiuas = 16
            lineSpacing = 1.2f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4908() {
        val post = Post()
        with(post) {
            postNum = 4908
            postId = 81
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2021/08/02/11/03/hallelujah-6516410_1280.jpg"
            postText = arrayListOf(
                " החיים חסרי משמעות  ",
                " וטוב שכך,  ",
                " ככה נשאר לאדם מרחב נקי  ",
                "  ליצור את המשמעות שלו בחיים.  "
            )
            textLocation = arrayListOf(10, 20, 35, -1, 0, 0, 0, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 17)
            val backgroundColor = "#50586C"
            val textColor = "#DCE2F0"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.2f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4909() {
        val post = Post()
        with(post) {
            postNum = 4909
            postId = 83
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2020/11/08/16/57/road-5724397_1280.jpg"
            postText = arrayListOf(
                " הדרך הנכונה בשבילך  ",
                " בנויה מאבנים רגילות,  ",
                " מה שמייחד אותה ",
                "  שהיא הדרך הנכונה בשבילך.  "
            )
            textLocation = arrayListOf(10, -1, 35, 20, 0, 0, 0, 0)
            postTransparency = 7
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#50586C"
            val textColor = "#DCE2F0"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.2f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4910() {
        val post = Post()
        with(post) {
            postNum = 4910
            postId = 90
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/06/05/08/50/train-2373323_1280.jpg"
            postText = arrayListOf(
                " אל תיקח את החיים האלה  ",
                " בצורה כל כך אישית, ",
                " אחרי הכל ",
                "  כולם משתמשים בהם.  "
            )
            textLocation = arrayListOf(10, -1, 35, 20, 0, 0, 0, 0)
            postTransparency = 7
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#50586C"
            val textColor = "#DCE2F0"

            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.2f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4911() {
        val post = Post()
        with(post) {
            postNum = 4911
            postId = 82
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2014/08/24/02/05/time-425818_1280.jpg"
            postText = arrayListOf(
                " ההבדל בין  ",
                " רגע בחיים לחיים כולם, ",
                " שהרגע עובר לפעמים ",
                "  הרבה יותר לאט.  "
            )
            textLocation = arrayListOf(10, -1, 35, 20, 0, 0, 0, 0)
            postTransparency = 8
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#50586C"
            val textColor = "#DCE2F0"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.2f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4912() {
        val post = Post()
        with(post) {
            postNum = 4912
            postId = 87
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2015/07/27/00/41/homeless-861899_1280.jpg"
            postText = arrayListOf(
                " תפיסות ישנות ",
                " טובות בשביל להסתדר בעולם  ",
                " אבל הן פחות טובות ",
                "  בשביל לחוות אותו מחדש.  "
            )
            textLocation = arrayListOf(10, -1, 35, 20, 0, 0, 0, 0)
            postTransparency = 4
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#50586C"
            val textColor = "#DCE2F0"

            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.2f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4913() {
        val post = Post()
        with(post) {
            postNum = 4913
            postId = 79
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2015/11/06/11/32/girl-1026246_1280.jpg"
            postText = arrayListOf(
                " האדם יכול להיות בטוב ",
                " והוא לא יידע מזה, ",
                " בגלל שכל תשומת הלב שלו ",
                "  מכוונת להתמודדות עם הרע.  "
            )
            textLocation = arrayListOf(10, -1, 35, 20, 0, 0, 0, 0)
            postTransparency = 6
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#50586C"
            val textColor = "#DCE2F0"

            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.2f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4914() {
        val post = Post()
        with(post) {
            postNum = 4914
            postId = 83
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2015/11/29/19/25/morning-1069218_1280.jpg"
            postText = arrayListOf(
                " לא מתבאס שהעולם הזה קצת עקום  ",
                " שיתבאס מי שיצר אותו כזה,  ",
                " לא אחראי על כל זה ",
                "  אני באתי הנה רק לביקור קצר.  "
            )
            textLocation = arrayListOf(10, 10, 30, -1, 0, 0, 0, 0)
            postTransparency = 8
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#F5D042"
            val textColor = "#0A174E"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.2f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4915() {
        val post = Post()
        with(post) {
            postNum = 4915
            postId = 79
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2019/01/25/11/18/girl-3954232_1280.jpg"
            postText = arrayListOf(
                " אנשים נוסעים למקומות אחרים  ",
                " שלא כל כך כדי להיות שם,  ",
                " כמו שלא להישאר כאן ",
                "  לבד עם עצמם.  "
            )
            textLocation = arrayListOf(10, -1, 35, 20, 0, 0, 0, 0)
            postTransparency = 8
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#80634C"
            val textColor = "#1AAFBC"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5, 5, 5, 0)
            postRadiuas = 16
            lineSpacing = 1.2f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4916() {
        val post = Post()
        with(post) {
            postNum = 4916
            postId = 76
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2014/10/20/11/18/woman-495124_1280.jpg"
            postText = arrayListOf(
                " ואם כבר לכעוס ",
                "  עדיף על דברים מוצדקים,  ",
                " צדק ",
                "  הוא לא אחד מהם.  "
            )
            textLocation = arrayListOf(10, -1, 35, 20, 0, 0, 0, 0)
            postPadding = arrayListOf(5, 5, 5, 0)
            postTransparency = 6
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#F2AA4C"
            val textColor = "#101820"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postRadiuas = 16
            lineSpacing = 1.2f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4917() {
        val post = Post()
        with(post) {
            postNum = 4917
            postId = 84
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/06/25/08/07/sunbeds-2439951_1280.jpg"
            postText = arrayListOf(
                " הנוחות ",
                "  היא תנאי חשוב  ",
                " לעודף משקל ",
                "  לא לשביעות רצון.  "
            )
            textLocation = arrayListOf(10, -1, 35, 20, 0, 0, 0, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#F2AA4C"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.2f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4918() {
        val post = Post()
        with(post) {
            postNum = 4918
            postId = 83
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2018/10/09/00/21/netflix-3733812_1280.jpg"
            postText = arrayListOf(
                " טמטום חושים ",
                "  זו תחנה טובה לרדת בה,  ",
                " אם אוטובוס המחשבות שלך ",
                "  לוקח אותך למחוזות אבודים.  "
            )
            textLocation = arrayListOf(10, -1, 35, 20, 0, 0, 0, 0)
            postTransparency = 8
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#2BAE66"
            val textColor = "#FCF6F5"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5, 0, 5, 0)
            postRadiuas = 16
            lineSpacing = 1.2f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4919() {
        val post = Post()
        with(post) {
            postNum = 4919
            postId = 86
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/11/19/14/39/girl-1839623_1280.jpg"
            postText = arrayListOf(
                "  אחרים כמעט ולא מזיקים לך  ",
                "  פשוט כי הם לא יכולים,  ",
                " ואתה לעומת זאת מזיק לעצמך חופשי, ",
                "  כי אתה יכול.  "
            )
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
            postTransparency = 8
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#2BAE66"
            val textColor = "#FCF6F5"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.2f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
//        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost4920() {
        val post = Post()
        with(post) {
            postNum = 4920
            postId = 84
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/05/09/03/47/deck-2297211_1280.jpg"
            postText = arrayListOf(
                " הכל טוב, ",
                "  הרע שאתה רואה  ",
                " זה רק הצל של המחשבה שלך ",
                "  על הטוב.  "
            )
            textLocation = arrayListOf(10, -1, 35, 20, 0, 0, 0, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#F95700"
            val textColor = "#FFFFFF"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.2f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4921() {
        val post = Post()
        with(post) {
            postNum = 4921
            postId = 89
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2020/04/10/12/07/monster-5025495_1280.jpg"
            postText = arrayListOf(
                " העולם הזה ",
                "  הוא שגעון אחד גדול,  ",
                " אל תיתן לאנשים יותר מידי שפויים ",
                "  להסביר לך אותו.  "
            )
            textLocation = arrayListOf(10, -1, 35, 20, 0, 0, 0, 0)
            postTransparency = 6
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#F95700"
            val textColor = "#FFFFFF"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.2f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4922() {
        val post = Post()
        with(post) {
            postNum = 4922
            postId = 86
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/11/03/18/26/man-2915187_1280.jpg"
            postText = arrayListOf(
                " הקריטריון היחידי לחיים טובים ",
                "  הוא רק  ",
                " אם האדם שחי אותם ",
                "  חושב שהם טובים.  "
            )
            textLocation = arrayListOf(10, -1, 35, 20, 0, 0, 0, 0)
            postPadding = arrayListOf(0, 0, 0, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#F95700"
            val textColor = "#FFFFFF"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postRadiuas = 16
            lineSpacing = 1.2f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4923() {
        val post = Post()
        with(post) {
            postNum = 4923
            postId = 86
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/03/27/21/37/sea-1284368_1280.jpg"
            postText = arrayListOf(
                " אם תהיה הרבה צודק ",
                "  זה יעלה לך בהרבה בריאות,  ",
                " אם תהיה קצת צודק  ",
                "  זה יעלה לך בקצת בריאות.  "
            )
            textLocation = arrayListOf(10, 10, 35, -1, 0, 0, 0, 0)
            postPadding = arrayListOf(0, 0, 0, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#F95700"
            val textColor = "#FFFFFF"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postRadiuas = 16
            lineSpacing = 1.2f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4924() {
        val post = Post()
        with(post) {
            postNum = 4924
            postId = 86
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/09/10/17/18/book-1659717_1280.jpg"
            postText = arrayListOf(
                " חבל שאין כל כך קשר ",
                "  בין החיים בתאוריה לחיים למעשה  ",
                " כי אז היינו יכולים ללמוד משהו על החיים  ",
                "  במקום לקבל בראש בכל יום מחדש.  "
            )
            textLocation = arrayListOf(10, 10, 30, -1, 0, 0, 0, 0)
            postPadding = arrayListOf(0, 0, 0, 0)
            postTransparency = 4
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postRadiuas = 16
            lineSpacing = 1.2f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4925() {
        val post = Post()
        with(post) {
            postNum = 4925
            postId = 83
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2015/11/20/10/15/person-1052696_1280.jpg"
            postText = arrayListOf(
                " כולנו דפוקים פחות או יותר, ",
                "  רק שיש כמה  ",
                " שמשתפים עם זה יותר פעולה  ",
                " ויש כמה שפחות.  "
            )
            textLocation = arrayListOf(10, -1, 30, 20, 0, 0, 0, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 18)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.2f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4926() {
        val post = Post()
        with(post) {
            postNum = 4926
            postId = 83
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/11/29/12/17/autumn-1869426_1280.jpg"
            postText = arrayListOf(
                " בבוקר של אחרי ההלוויה   ",
                "  קמנו כמו תמיד אבל היינו אחרים,  ",
                "  לא טובים יותר או רעים יותר  ",
                "  רק חסרים יותר.  "
            )
            textLocation = arrayListOf(10, 10, 35, -1, 0, 0, 0, 0)
            postPadding = arrayListOf(0, 0, 0, 0)
            postTransparency = 7
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4927() {
        val post = Post()
        with(post) {
            postNum = 4927
            postId = 68
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/04/05/03/18/prayer-1308663_1280.jpg"
            postText = arrayListOf(
                " אמונה היא מעבר לאלוהים ",
                "  בגלל שאלוהים זו תפיסה מחשבתית כלשהי,  ",
                "  ( אלוהים הוא כזה או כזה )  ",
                "  אמונה זה משהו שמעבר לתפיסה הזו.  "
            )
            textLocation = arrayListOf(10, -1, 35, 20, 2, 35, 0, 30)
            postPadding = arrayListOf(0, 0, 0, 0)
            postTransparency = 9
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#FAEBEF"
            val textColor = "#333D79"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4928() {
        val post = Post()
        with(post) {
            postNum = 4928
            postId = 82
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2019/04/15/11/47/man-4129126_1280.jpg"
            postText = arrayListOf(
                " זו שטות לבזבז את החיים האלה ",
                "  בלהיות בן אדם רציני ,  ",
                "  זה סתם מעיק עליך  ",
                "  ובדרך כלל לא משלמים לך על זה.  "
            )
            textLocation = arrayListOf(10, -1, 35, 20, 0, 0, 0, 0)
            postTransparency = 6
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#422057"
            val textColor = "#FCF951"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 5, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4929() {
        val post = Post()
        with(post) {
            postNum = 4929
            postId = 80
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2020/04/18/11/30/nature-5058888_1280.jpg"
            postText = arrayListOf(
                " היחידי שיש לו אישור ",
                "  לחיות את החיים שלך לפי הבנתך  ",
                "  זה אתה,  ",
                "  חבל שאתה לא משתמש בו.  "
            )
            textLocation = arrayListOf(10, 10, 35, -1, 0, 0, 0, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#422057"
            val textColor = "#FCF951"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 5, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4930() {
        val post = Post()
        with(post) {
            postNum = 4930
            postId = 85
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2012/12/24/08/39/sad-72217_1280.jpg"
            postText = arrayListOf(
                " המציאות הזו ",
                "  מכה אותנו לפעמים פה ושם,  ",
                "  אבל תפיסת המציאות שלנו  ",
                "  מתעללת בנו על בסיס קבוע.  "
            )
            textLocation = arrayListOf(10, -1, 35, 20, 0, 0, 0, 0)
            postTransparency = 4
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#422057"
            val textColor = "#FCF951"
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
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4931() {
        val post = Post()
        with(post) {
            postNum = 4931
            postId = 78
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/10/12/02/53/girl-1733341_1280.jpg"
            postText = arrayListOf(
                "  לחיות כל יום את אותם חיים, ",
                " לחשוב את אותם מחשבות באותה צורה, ",
                "  ולקוות למשהו חדש,  ",
                "  זה ממש לא בכיוון.  "
            )
            textLocation = arrayListOf(10, 10, 35, -1, 2, 30, 0, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#FCF6F5"
            val textColor = "#990011"
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
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4932() {
        val post = Post()
        with(post) {
            postNum = 4932
            postId = 80
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2018/10/17/20/32/makeup-3754906_1280.jpg"
            postText = arrayListOf(
                "  השגרה שומרת את האדם ",
                "  להיות מי שהוא,  ",
                "  אבל מונעת ממנו  ",
                "  להיות מישהו אחר.  "
            )
            textLocation = arrayListOf(10, 10, 35, -1, 0, 0, 0, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#FCF6F5"
            val textColor = "#990011"
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
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4933() {
        val post = Post()
        with(post) {
            postNum = 4933
            postId = 81
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/11/07/23/17/chess-2928700_1280.jpg"
            postText = arrayListOf(
                "  יש בעיות שאין להן פתרון ",
                "  קוראים להן עובדות חיים,  ",
                "  חוסר היכולת שלך לקבל אותם  ",
                "  זו בעיה.  "
            )
            textLocation = arrayListOf(10, 10, 30, -1, 0, 0, 0, 0)
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
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4934() {
        val post = Post()
        with(post) {
            postNum = 4934
            postId = 85
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2019/10/14/14/50/senior-4549099_1280.jpg"
            postText = arrayListOf(
                "  לאדם קשה לחיות עם עצמו ",
                "  בעיקר בגלל פער מנטלי,  ",
                "  דרישות מוגזמות  ",
                "  וזוגיות חונקת.  "
            )
            textLocation = arrayListOf(10, 10, 30, -1, 0, 0, 0, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 14)
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
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4935() {
        val post = Post()
        with(post) {
            postNum = 4935
            postId = 84
            lineNum = 4
            imageUri =
                "https://cdn.pixabay.com/photo/2015/12/17/14/40/jewish-cemetery-1097409_1280.jpg"
            postText = arrayListOf(
                "  איפה הצדק איפה, ",
                "  בסוף כולם מתים  ",
                "  גם אלה שצודקים  ",
                "  וגם אלה שלא.  "
            )
            textLocation = arrayListOf(10, 10, 35, -1, 0, 0, 0, 0)
            postTransparency = 4
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
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4936() {
        val post = Post()
        with(post) {
            postNum = 4936
            postId = 81
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2014/02/27/16/10/flowers-276014_1280.jpg"
            postText = arrayListOf(
                "  הפרח פורח במיטבו ",
                "  לא איפה שיש הכי הרבה מים  ",
                "  אלא  ",
                "  איפה שכי מתאים לו.  "
            )
            textLocation = arrayListOf(10, 10, 35, -1, 0, 0, 0, 0)
            postTransparency = 6
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#FAEBEF"
            val textColor = "#333D79"
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
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4937() {
        val post = Post()
        with(post) {
            postNum = 4937
            postId = 82
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2020/12/26/20/08/grandfather-5862273_1280.jpg"
            postText = arrayListOf(
                "  דפים מלאים ",
                "  טובים למספרי סיפורים  ",
                "  דפים ריקים  ",
                "  טובים ליוצרי מציאות.  "
            )
            textLocation = arrayListOf(10, -1, 35, 20, 0, 0, 0, 0)
            postTransparency = 5
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#755139"
            val textColor = "#F2EDD7"
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
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4938() {
        val post = Post()
        with(post) {
            postNum = 4938
            postId = 81
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2018/03/31/06/31/dog-3277416_1280.jpg"
            postText = arrayListOf(
                "  מי שנובח על כלב  ",
                " הוא כלב, ",
                "  מי שמתווכח עם שוטה ",
                "  הוא שוטה.  "
            )
            textLocation = arrayListOf(10, -1, 35, 20, 0, 0, 0, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#755139"
            val textColor = "#F2EDD7"
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
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4939() { //I
        val post = Post()
        with(post) {
            postNum = 4939
            postId = 83
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/05/16/10/06/loneliness-2317414_1280.jpg"
            postText = arrayListOf(
                "  כל עוגמות הנפש שלי   ",
                " קורות לי כי אני כזה, ",
                "  אם הייתי אחר  ",
                "  היו לי עוגמות נפש אחרות.  "
            )
            textLocation = arrayListOf(10, 50, 28,-1, 0, 0, 0, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#DCE2F0"
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
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4940() { //I
        val post = Post()
        with(post) {
            postNum = 4940
            postId = 82
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/11/29/07/22/bible-1868070_1280.jpg"
            postText = arrayListOf(
                "  שתהיה דף מלא   ",
                " מיום האתמול, ",
                "  ודף ריק  ",
                "  ליום המחר.  "
            )
            textLocation = arrayListOf(10, 220,28, -1, 0, 0, 0, 0)
            postTransparency = 10
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#00539C"
            val textColor = "#FFD662"
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
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4941() {
        val post = Post()
        with(post) {
            postNum = 4941
            postId = 78
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2015/07/18/08/00/people-850097_1280.jpg"
            postText = arrayListOf(
                "  במידה והאדם היה רוצה   ",
                " את מה שהוא באמת צריך, ",
                " ולא את מה שאין לו כרגע  ",
                " הרבה מהבעיות שלו היו נעלמות. "
            )
            textLocation = arrayListOf(10, -1, 35, 20, 0, 0, 0, 0)
            postPadding = arrayListOf(0, 0, 0, 0)
            postTransparency = 5
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#00539C"
            val textColor = "#FFD662"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4942() {
        val post = Post()
        with(post) {
            postNum = 4942
            postId = 79
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2015/09/16/21/07/egg-943413_1280.jpg"
            postText = arrayListOf(
                "  אין מתכון בדוק לחיים טובים  ",
                " כי הטוב בא והולך, ",
                " אבל יש מתכון כזה לחיים רעים  ",
                " פשוט תישאר ברע. "
            )
            textLocation = arrayListOf(10, 10, 35, -1, 0, 0, 0, 0)
            postPadding = arrayListOf(0, 0, 0, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#00539C"
            val textColor = "#FFD662"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4943() { //I
        val post = Post()
        with(post) {
            postNum = 4943
            postId = 82
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2018/09/14/22/51/cobblestones-3678292_960_720.jpg"
            postText = arrayListOf(
                " עדיף ללכת בדרך פחות נוחה ",
                " המובילה אותך לעצמך, ",
                " מללכת בדרך נוחה  ",
                " המובילה אותך לשום מקום. "
            )
            textLocation = arrayListOf(10, -1, 28, 100, 0, 0, 0, 0)
            postPadding = arrayListOf(0, 0, 0, 0)
            postTransparency = 10
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#EEA47F"
            val textColor = "#00539C"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4944() {
        val post = Post()
        with(post) {
            postNum = 4944
            postId = 87
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2015/06/01/00/20/man-792821_1280.jpg"
            postText = arrayListOf(
                " אתה החיים, ",
                " האישיות שלך ",
                " היא רק נקודת מבט זמנית ",
                " על החיים. "
            )
            textLocation = arrayListOf(10, 10, 35, -1, 0, 0, 0, 0)
            postPadding = arrayListOf(0, 0, 0, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#00539C"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4945() {
        val post = Post()
        with(post) {
            postNum = 4945
            postId = 83
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2020/11/01/10/35/street-5703332_1280.jpg"
            postText = arrayListOf(
                " כל כמה ",
                " שאתה מתרחק מעצמך, ",
                " ההמולה הזאת מסביב ",
                " רועשת יותר ויותר. "
            )
            textLocation = arrayListOf(10, 10, 35, -1, 0, 0, 0, 0)
            postPadding = arrayListOf(0, 0, 0, 0)
            postTransparency = 8
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#ffffff"
            val textColor = "#000000"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4946() {
        val post = Post()
        with(post) {
            postNum = 4946
            postId = 83
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2015/08/28/16/06/everyday-912097_1280.jpg"
            postText = arrayListOf(
                " כל אתרי הרשת ",
                " לא יתנו לך תשובה אמיתית, ",
                " הם רק ישכיחו ממך לרגע  ",
                " את השאלה שלך. "
            )
            textLocation = arrayListOf(10, 20, 35, -1, 0, 0, 0, 0)
            postPadding = arrayListOf(0, 0, 0, 0)
            postTransparency = 7
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "##0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4947() {  //I
        val post = Post()
        with(post) {
            postNum = 4947
            postId = 79
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2019/08/26/08/12/street-4431082_960_720.jpg"
            postText = arrayListOf(
                " מה שבאמת קשה לך ",
                "  זה לא האנשים עצמם, ",
                " אלא  ",
                " היחס שלך לאנשים האלה. "
            )
            textLocation = arrayListOf(10, -1, 28, 20, 0, 0, 0, 0)
            postPadding = arrayListOf(0, 0, 0, 0)
            postTransparency = 10
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "##0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4948() {  //I
        val post = Post()
        with(post) {
            postNum = 4948
            postId = 85
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2015/01/27/09/58/man-613601_1280.jpg"
            postText = arrayListOf(
                " מה שקורה בחיים ",
                " זה מה שאני חושב שקורה בחיים, ",
                " ואם אתה חושב אחרת ",
                " החיים שלך קצת אחרים משלי. "
            )
            textLocation = arrayListOf(10, -1, 28, 80, 0, 0, 0, 0)
            postPadding = arrayListOf(0, 0, 0, 0)
            postTransparency = 10
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#990011"
            val textColor = "#FCF6F5"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4949() {
        val post = Post()
        with(post) {
            postNum = 4949
            postId = 80
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/07/26/19/05/pokemon-1543556_1280.jpg"
            postText = arrayListOf(
                " המועקה האנושית ",
                " נובעת משתי סיבות: ",
                " מעודף אינפורמציה לא חיונית ",
                " וחוסר אינפורמציה חיונית. "
            )
            textLocation = arrayListOf(10, -1, 35, 20, 0, 0, 0, 0)
            postPadding = arrayListOf(0, 0, 0, 0)
            postTransparency = 3
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost4950() {  //I
        val post = Post()
        with(post) {
            postNum = 4950
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2011/12/13/14/31/earth-11015_960_720.jpg"
            postText = arrayListOf(
                " אתה יצרת ",
                " את כל הרע והטוב בעולם, ",
                " בלעדיך ",
                " זה היה רק עולם. "
            )
            postId = 86
            textLocation = arrayListOf(10, 150, 28, -1, 0, 0, 0, 0)
            postPadding = arrayListOf(0, 0, 0, 0)
            postTransparency = 10
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4951() {
        val post = Post()
        with(post) {
            postNum = 4951
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/11/29/04/19/ocean-1867285_1280.jpg"
            postText = arrayListOf(
                " שתהיה מספיק קרוב לים ",
                " כך שתוכל לראות אותו, ",
                " ומספיק רחוק ממנו ",
                " שלא תטבע בו. "
            )
            postId = 89
            textLocation = arrayListOf(10, -1, 30, 20, 0, 0, 0, 0)
            postPadding = arrayListOf(0, 0, 0, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4952() {
        val post = Post()
        with(post) {
            postNum = 4952
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/04/04/14/12/monitor-1307227_1280.jpg"
            postText = arrayListOf(
                " עולם הרייטינג עשוי כולו ",
                " מפולסים חשמליים בתוך מכשירים דיגיטליים , ",
                " קשה להיתמך בהם פיסית ",
                " כשאתה מאבד שווי משקל באמצע הרחוב. "
            )
            postId = 86
            textLocation = arrayListOf(10, 10, 35, -1, 2, 30, 0, 0)
            postPadding = arrayListOf(0, 0, 0, 5)
            postTransparency = 5
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postRadiuas = 16
            lineSpacing = 1.4f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4953() {
        val post = Post()
        with(post) {
            postNum = 4953
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2014/07/13/02/18/woman-391555_1280.jpg"
            postText = arrayListOf(
                " אין עולם אחר ",
                " אבל יש תפיסה אחרת של העולם , ",
                " תפיסה שהיא פחות תוכנית ראליטי ",
                " ויותר מציאות. "
            )
            postId = 84
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 5, 5)
            postPadding = arrayListOf(0, 0, 0, 0)
            postTransparency = 2
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postRadiuas = 16
            lineSpacing = 1.4f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4954() {
        val post = Post()
        with(post) {
            postNum = 4954
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2015/09/09/20/23/baby-933097_1280.jpg"
            postText = arrayListOf(
                " החיים שלך קורים ",
                " רק ברגע הזה , ",
                " שאר הזמנים ",
                " קורים רק בראש שלך. "
            )
            postId = 84
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            postPadding = arrayListOf(0, 0, 0, 0)
            postTransparency = 3
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postRadiuas = 16
            lineSpacing = 1.4f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4955() {
        val post = Post()
        with(post) {
            postNum = 4955
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/01/28/02/24/japan-2014619_1280.jpg"
            postText = arrayListOf(
                " העולם סביבך נראה עולב רציני ",
                " כולו עשוי בצלמו ובדמותו של האדם, ",
                " לא שהוא כזה ",
                " אבל אתה כאדם תופס או ככזה.  "
            )
            postId = 84
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            postPadding = arrayListOf(0, 0, 0, 0)
            postTransparency = 6
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postRadiuas = 16
            lineSpacing = 1.4f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4956() {
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
    }
        fun loadPost4957() {
        val post = Post()
        with(post) {
            postNum = 4957
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/11/29/08/58/hands-1868562_1280.jpg"
            postText = arrayListOf(
                " הכניסה לפרטים ",
                " לפעמים מרחיקה אותך מהדיוק, ",
                " ובמקרה שכזה  ",
                " עדיף לראות את כל הציור מרחוק. "
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
    }
    fun loadPost4958() {
        val post = Post()
        with(post) {
            postNum = 4958
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/10/07/17/40/woman-2827304_1280.jpg"
            postText = arrayListOf(
                " בחיים האלה אתה צריך ",
                " כסא שנוח לך לשבת בו ",
                " דרך פתוחה  ללכת בה  ",
                " ופטור גורף מהבלים. "
            )
            postId = 87
            textLocation = arrayListOf(10, 5, 30, -1, 0, 0, 0, 0)
            postPadding = arrayListOf(0, 0, 0, 0)
            postTransparency = 1
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
    }

    fun loadPost4959() {
        val post = Post()
        with(post) {
            postNum = 4959
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2018/02/18/21/18/people-3163556_1280.jpg"
            postText = arrayListOf(
                " למעשה, ",
                " אנו לא רוצים לדעת את האמת ",
                " אלא רק להרגיש טוב עם עצמנו  ",
                " וברוב המקרים זה לא הולך ביחד. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 4
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
    }

   fun loadPost4960() {
       val post = Post()
       with(post) {
           postNum = 4960
           lineNum = 4
           imageUri = "https://cdn.pixabay.com/photo/2012/02/23/12/21/puzzle-16116_1280.jpg"
           postText = arrayListOf(
               " אמור לי ",
               " מה חסר לך בחיים, ",
               " ואומר לך  ",
               " מה יש לך. "
           )
           postId = 89
           textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
           postPadding = arrayListOf(10, 0, 10, 0)
           postTransparency = 0
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
   }

    fun loadPost4961() {
        val post = Post()
        with(post) {
            postNum = 4961
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2019/08/28/17/17/girl-4437225_1280.jpg"
            postText = arrayListOf(
                " חשיבות האדם בשבילך, ",
                " היא לא לפי מה שהוא ",
                " אלא לפי  ",
                " החלק שהוא תופס בעולמך. "
            )
            postId = 89
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 7
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#CED46A"
            val textColor = "#07553B"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4962() {
        val post = Post()
        with(post) {
            postNum = 4962
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2018/09/08/11/15/information-3662301_1280.jpg"
            postText = arrayListOf(
                " בדיחה בלי פואנטה ",
                " זה סתם סיפור, ",
                " חיים בלי טעם  ",
                " זה סתם לוחות זמנים. "
            )
            postId = 89
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 5
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

    fun loadPost4963() {
        val post = Post()
        with(post) {
            postNum = 4963
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2014/08/08/20/55/worried-girl-413690_1280.jpg"
            postText = arrayListOf(
                " שלב הבגרות של האדם מגיע ",
                " שהוא מפסיק  ",
                " להטריד את ההורים שלו  ",
                " ומסתפק בלהטריד את עצמו. "
            )
            postId = 87
            textLocation = arrayListOf(10, 5, 30, -1, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#111111"
            val textColor = "#000000"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4964() {
        val post = Post()
        with(post) {
            postNum = 4964
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2020/07/27/13/03/rope-5442378_1280.jpg"
            postText = arrayListOf(
                " המגבלות של האדם ",
                " ברובם הגדול  ",
                " הם אלה  ",
                " שהאדם מטיל על עצמו. "
            )
            postId = 84
            textLocation = arrayListOf(10, 5, 30, -1, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =4
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

    fun loadPost4965() {
        val post = Post()
        with(post) {
            postNum = 4965
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2018/05/24/18/18/hohenstaufen-3427266_1280.jpg"
            postText = arrayListOf(
                " המשיח כבר כאן ",
                " אבל משום מה  ",
                " רוב האנשים  ",
                " רואים רק את החמור. "
            )
            postId = 87
            textLocation = arrayListOf(10, 5, 30, -1, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =6
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4966() {
        val post = Post()
        with(post) {
            postNum = 4966
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2014/07/10/11/15/balloons-388973_1280.jpg"
            postText = arrayListOf(
                " השוטה ",
                " הולך תמיד עם תחושת הבטן,  ",
                " החכם  ",
                " רק במקרים מיוחדים. "
            )
            postId = 82
            textLocation = arrayListOf(10, -1, 30,10, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =5
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

fun loadPost4967() {
    val post = Post()
    with(post) {
        postNum = 4967
        lineNum = 4
        imageUri = "https://cdn.pixabay.com/photo/2015/01/06/16/14/woman-590490_1280.jpg"
        postText = arrayListOf(
            " מי שעושה שיר מהחיים שלך ",
            " זה בדרך כלל אנשים אחרים, ",
            " אתה עסוק יותר מידי  ",
            " בלהפיק אותם מוזיקלית וכלכלית. "
        )
        postId = 89
        textLocation = arrayListOf(10, -1, 30,5, 0, 0, 0, 0)
        postPadding = arrayListOf(10, 0, 10, 0)
        postTransparency =0
        postTextSize = arrayListOf(0, 16)
        val backgroundColor = "#0A174E"
        val textColor = "#F5D042"
        postFontFamily = 103
        postBackground = util.improveColorString(backgroundColor)
        val textcolo = util.improveColorString(textColor)
        val col = "#$textcolo"
        postTextColor = arrayListOf(CONSTANT, col)
    }
    drawPost.drawPostFire(post, layout)
    util.sendPostToStringFirestore(post)
}
    fun loadPost4968() {
      val post = Post()
      with(post) {
          postNum = 4968
          lineNum = 4
          imageUri = "https://cdn.pixabay.com/photo/2017/09/16/01/03/girl-2754233_1280.jpg"
          postText = arrayListOf(
              " כדי לדעת באם האדם חי בטוב או לא  ",
              " ממש לא משנה מה התנאים סביבו , ",
              " אלא  ",
              " איך הוא מתייחס אליהם. "
          )
          postId = 86
          textLocation = arrayListOf(10, -1, 30,5, 0, 0, 0, 0)
          postPadding = arrayListOf(5, 0, 5, 5)
          postTransparency =6
          postTextSize = arrayListOf(0, 14)
          val backgroundColor = "#0A174E"
          val textColor = "#F5D042"
          postFontFamily = 103
          postBackground = util.improveColorString(backgroundColor)
          val textcolo = util.improveColorString(textColor)
          val col = "#$textcolo"
          postTextColor = arrayListOf(CONSTANT, col)
      }
      drawPost.drawPostFire(post, layout)
      util.sendPostToStringFirestore(post)
  }

    fun loadPost4969() {
        val post = Post()
        with(post) {
            postNum = 4969
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2015/06/22/08/37/children-817365_1280.jpg"
            postText = arrayListOf(
                " חפש פחות  ",
                " את הטוב בעולם סביב, ",
                " ויותר את המקום בך ",
                " שממנו רואים את העולם בטוב. "
            )
            postId = 86
            textLocation = arrayListOf(10, -1, 30,5, 0, 0, 0, 0)
            postPadding = arrayListOf(5, 0, 5, 5)
            postTransparency =6
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4970() {
        val post = Post()
        with(post) {
            postNum = 4970
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/03/27/14/59/man-2179243_1280.jpg"
            postText = arrayListOf(
                " העולם מתנהל על פי דרכו, ",
                " דעתך על הדרך הזו ",
                " לא משנה דבר ",
                " חוץ מאת המצב רוח שלך. "
            )
            postId = 88
            textLocation = arrayListOf(10, -1, 30,5, 0, 0, 0, 0)
            postPadding = arrayListOf(5, 0, 5, 5)
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

    fun loadPost4971() {
        val post = Post()
        with(post) {
            postNum = 4971
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2014/09/27/17/35/dandelion-463928_1280.jpg"
            postText = arrayListOf(
                " תחשוב כבד ",
                " תשקע,  ",
                " תחשוב קל  ",
                " תעוף. "
            )
            postId = 88
            textLocation = arrayListOf(10, 10, 35,-1, 0, 0, 0, 0)
            postPadding = arrayListOf(0, 0, 0, 0)
            postTransparency =4
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#DDA94B"
            val textColor = "#1E4174"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4972() {
        val post = Post()
        with(post) {
            postNum = 4972
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/11/14/05/29/girl-1822702_1280.jpg"
            postText = arrayListOf(
                " אתה מרגיש אומלל ",
                " לא בגלל שאתה אומלל, ",
                " אלא בגלל ",
                " שאתה מרגיש אומלל. "
            )
            postId = 88
            textLocation = arrayListOf(10, -1, 30,10, 0, 0, 0, 0)
            postPadding = arrayListOf(0, 0, 0, 0)
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

    fun loadPost4973() {
        val post = Post()
        with(post) {
            postNum = 4973
            lineNum = 4
            val s1 = "\""
            val s2 = "\""
            val s12 = " אני רק בן אדם... "
            imageUri = "https://cdn.pixabay.com/photo/2015/08/05/04/25/people-875617_1280.jpg"
            postText = arrayListOf(
                "$s1$s12$s2",
                " זו סיבה מספיק טובה ",
                " להתנהל בחוסר הגיון ",
                " אם אתה בן אדם. "
            )

            postId = 85
            textLocation = arrayListOf(10, -1, 30,10, 0, 0, 0, 0)
            postPadding = arrayListOf(0, 0, 0, 0)
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

    fun loadPost4974() {
        val post = Post()
        with(post) {
            postNum = 4974
            lineNum = 4
             imageUri = "https://cdn.pixabay.com/photo/2020/05/04/16/05/mckenzie-river-5129717_1280.jpg"
            postText = arrayListOf(
                "תזרים את עצמך",
                " אחרת ",
                " תהיה ביצה ",
                " במקום נהר. "
            )
            postId = 88
            textLocation = arrayListOf(10, -1, 30,10, 0, 0, 0, 0)
            postPadding = arrayListOf(0, 0, 0, 0)
            postTransparency =4
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#00203F"
            val textColor = "#ADEFD1"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4975() {
        val post = Post()
        with(post) {
            postNum = 4975
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/06/25/17/36/rain-1479303_1280.jpg"
            postText = arrayListOf(
                "חוסר השלמות",
                " סובלת מיחסי ציבור גרועים, ",
                " בחי היום יום שלה ",
                " היא השלמות בהתגלמותה. "
            )
            postId = 88
            textLocation = arrayListOf(10, 10, 30,-1, 0, 0, 0, 0)
            postPadding = arrayListOf(5, 0, 5, 0)
            postTransparency =4
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

    fun loadPost4976() {
        val post = Post()
        with(post) {
            postNum = 4976
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2014/02/27/16/10/medieval-276019_1280.jpg"
            postText = arrayListOf(
                " להסתדר בחיים ",
                " זה כשרון וקצת מזל, ",
                " לגעת בחיים ",
                " זו אומנות. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 35,5, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =6
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

    fun loadPost4977() {
        val post = Post()
        with(post) {
            postNum = 4977
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/01/11/11/33/cake-1971552_1280.jpg"
            postText = arrayListOf(
                " מה שעושה לך טוב ",
                " זה לא הדברים עצמם, ",
                " אלא היכולת שלך ",
                " ליהנות מהם. "
            )
            postId = 87
            textLocation = arrayListOf(10, 10, 30,-1, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =8
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#50586C"
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

    fun loadPost4978() {
        val post = Post()
        with(post) {
            postNum = 4978
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/06/14/20/40/frog-2403334_1280.jpg"
            postText = arrayListOf(
                "זה שהרבה חופפים את הראש שלהם",
                " במי ביוב (המכונים פוליטיקה), ",
                " זה לא עושה את המים האלה ",
                " פחות מסריחים. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 30,5, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =8
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#50586C"
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

    fun loadPost4979() {
        val post = Post()
        with(post) {
            postNum = 4979
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2014/09/19/19/55/vernier-caliper-452987_1280.jpg"
            postText = arrayListOf(
                "השאיפה לדיוק",
                " יכולה להיות מכשול ",
                " זאם אתה צריך ",
                " לפתור בעיות לא מדויקות. "
            )
            postId = 84
            textLocation = arrayListOf(10, -1, 30,5, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =8
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#50586C"
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

    fun loadPost4980() {
        val post = Post()
        with(post) {
            postNum = 4980
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2019/11/11/10/05/law-4617873_1280.jpg"
            postText = arrayListOf(
                "חוסר צדק כמו הקורונה",
                "מסוכן רק לאנשים עם מחלות רקע ",
                " כמו אלה שמאמינים ",
                " בצדק או בהגינות בסיסית. "
            )
            postId = 86
            textLocation = arrayListOf(10, 5, 35,-1, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =8
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#50586C"
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

    fun loadPost4981() {
        val post = Post()
        with(post) {
            postNum = 4981
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/07/18/17/34/lace-2516496_1280.jpg"
            postText = arrayListOf(
                "כולנו רקמה אנושית אחת",
                "אמר המשורר, ",
                " התקשורת היא חלק ממנה ",
                " כמו שאתה חלק ממנה. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 30,10, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#50586C"
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

    fun loadPost4982() {
        val post = Post()
        with(post) {
            postNum = 4982
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2018/05/03/09/06/auto-3370743_1280.jpg"
            postText = arrayListOf(
                "אתה אומנם",
                "חושב כמו כולם, ",
                " אבל בסוף הסופים ",
                " מת כמו שאתה. "
            )
            postId = 85
            textLocation = arrayListOf(10, 10, 30,-1, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =5
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#50586C"
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

    fun loadPost4983() {
        val post = Post()
        with(post) {
            postNum = 4983
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2018/04/05/14/10/boat-3292934_1280.jpg"
            postText = arrayListOf(
                "בדרך כלל",
                "בני אדם מבינים ",
                " את הקונספט של החיים ",
                " רק שהם נוגעים במוות. "
            )
            postId = 85
            textLocation = arrayListOf(10, 10, 30,-1, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#50586C"
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

    fun loadPost4984() {
        val post = Post()
        with(post) {
            postNum = 4984
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/02/21/08/42/rain-2085065_1280.jpg"
            postText = arrayListOf(
                "האדם הוא יצור בעייתי,",
                " או שיש לו בעיות ",
                " או שאין לו בעיות ",
                " וזה בעיה בפני עצמה. "
            )
            postId = 87
            textLocation = arrayListOf(10, 10, 30,-1, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =8
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#50586C"
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

    fun loadPost4985() {
        val post = Post()
        with(post) {
            postNum = 4985
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2015/07/14/17/19/gorilla-845119_1280.jpg"
            postText = arrayListOf(
                "אל תתייחס לעצמך",
                " כל כך ברצינות,  ",
                " תשאיר את זה לאחרים ",
                " שממש לא יודעים מי אתה. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 30,5, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =3
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#50586C"
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

    fun loadPost4986() {
        val post = Post()
        with(post) {
            postNum = 4986
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2018/01/03/05/33/the-sun-3057622_1280.jpg"
            postText = arrayListOf(
                "תהיה מה שאתה,",
                " ואם אתה לא יודע  ",
                " מה שאתה עכשיו, ",
                " תהיה אי הידיעה. "
            )
            postId = 90
            textLocation = arrayListOf(10, -1, 30,5, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#50586C"
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

    fun loadPost4987() {
        val post = Post()
        with(post) {
            postNum = 4987
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/03/28/16/01/sad-2182545_1280.jpg"
            postText = arrayListOf(
                "שיהיה בך דו שיח פנימי",
                " תרבותי ופורה, ",
                " ולא סתם ויכוחי סרק ",
                " וחלופי האשמות עקרים. "
            )
            postId = 89
            textLocation = arrayListOf(10,-1,35,5, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =8
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#331B3F"
            val textColor = "#ACC7B4"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4988() {
        val post = Post()
        with(post) {
            postNum = 4988
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2013/03/23/23/10/brush-96240_1280.jpg"
            postText = arrayListOf(
                "השאלה אינה ",
                " מה אתה ומי אתה, ",
                " אלא ",
                " מה אתה יוצר עם כל זה. "
            )
            postId = 87
            textLocation = arrayListOf(10,-1,35,5, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =8
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#EEA47F"
            val textColor = "#00539C"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4989() {
        val post = Post()
        with(post) {
            postNum = 4989
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2018/02/03/15/40/landscape-3127859_1280.jpg"
            postText = arrayListOf(
                " תהנה מהדרך, ",
                " כי כשתגיע בסוף לקצה ",
                " לא תהיה לך אופציה שכזאת, ",
                " תהנה מהדרך. "
            )
            postId = 87
            textLocation = arrayListOf(10,10,35,-1, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =3
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

    fun loadPost4990() {
        val post = Post()
        with(post) {
            postNum = 4990
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2013/07/05/12/20/rubbish-143465_1280.jpg"
            postText = arrayListOf(
                " התקשורת מייצרת מציאות ",
                " מערכת המשפט מייצרת צדק ",
                " אתה מייצר תפיסת חיים, ",
                " וככה כל זה באמת נראה. "
            )
            postId = 83
            textLocation = arrayListOf(10,-1,35,10, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =10
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

    fun loadPost4991() {
        val post = Post()
        with(post) {
            postNum = 4991
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2018/04/15/18/47/work-3322460_1280.jpg"
            postText = arrayListOf(
                " יש מה שאתה חושב שצריך ",
                " ויש מה שקיים כרגע ",
                " האושר שלך נמדד  ",
                " לפי הפער שביניהם. "
            )
            postId = 84
            textLocation = arrayListOf(10,-1,35,10, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =6
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4992() {
        val post = Post()
        with(post) {
            postNum = 4992
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/12/29/22/01/alcoholic-1939418_1280.jpg"
            postText = arrayListOf(
                " חופש הבחירה היחידי הקיים ",
                " הוא באיזה צורה ",
                " אתה בוחר  ",
                " לדפוק את החיים שלך. "
            )
            postId = 87
            textLocation = arrayListOf(10,10,35,-1, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =3
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
fun loadPost4993() {
    val post = Post()
    with(post) {
        postNum = 4993
        lineNum = 4
        imageUri = "https://cdn.pixabay.com/photo/2016/10/14/00/08/old-man-1739154_960_720.jpg"
        postText = arrayListOf(
            " מה שאתה כרגע ",
            " זה בדיוק מה שיועדת להיות, ",
            " ומי שאומר לך אחרת ",
            " גם הוא יועד להיות כזה. "
        )
        postId = 85
        textLocation = arrayListOf(10,-1,35,5, 0, 0, 0, 0)
        postPadding = arrayListOf(10, 0, 10, 0)
        postTransparency =7
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

    fun loadPost4994() {
        val post = Post()
        with(post) {
            postNum = 4994
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2022/09/09/18/47/lake-7443622_960_720.jpg"
            postText = arrayListOf(
                " השתדל",
                " להטריד את עצמך ",
                " כמה שפחות ",
                " במה שאתה. "
            )
            postId = 88
            textLocation = arrayListOf(10,10,30,-1, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#000000"
            val textColor = "#6A7BA2"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4995() {
        val post = Post()
        with(post) {
            postNum = 4995
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2020/04/21/17/54/jokers-5074032_960_720.jpg"
            postText = arrayListOf(
                " חוסר הטעם שלך ",
                " זו סוג של מחלה, ",
                " שפוגעת יותר בסובבים אותך ",
                " ופחות בך. "
            )
            postId = 87
            textLocation = arrayListOf(10,-1,30,5, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =6
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4996() {
        val post = Post()
        with(post) {
            postNum = 4996
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/01/11/18/53/cold-1972619_960_720.jpg"
            postText = arrayListOf(
                " במלחמות פוליטיות ",
                " אתה נלחם על טובת הציבור כולו  ",
                " אבל בסופו של יום ",
                " זה משפיע רק על הבריאות שלך. "
            )
            postId = 87
            textLocation = arrayListOf(10,-1,30,5, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =9
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4997() {
        val post = Post()
        with(post) {
            postNum = 4997
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2022/08/27/11/50/flower-7414318_960_720.jpg"
            postText = arrayListOf(
                " הדברים שאתה צריך כרגע ",
                " כבר נמצאים אצלך,  ",
                " חוץ מאותה תודעה מבורכת ",
                " שיודעת את זה. "
            )
            postId = 89
            textLocation = arrayListOf(10,5,30,-1, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =9
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4998() {
        val post = Post()
        with(post) {
            postNum = 4998
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/06/04/23/17/lighthouse-2372461_960_720.jpg"
            postText = arrayListOf(
                " מה אתה רוצה להביא לעולם ",
                " אור או צדק ?  ",
                " תחליט, כי בדרך כלל ",
                " זה לא בא ביחד. "
            )
            postId = 87
            textLocation = arrayListOf(10,-1,30,10, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =9
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999() {
        val post = Post()
        with(post) {
            postNum = 4999
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2022/09/16/20/24/forest-7459565_960_720.jpg"
            postText = arrayListOf(
                " האור בכול, ",
                " הצללים שאתה רואה  ",
                " אלה המקומות שאתה מטיל עליהם ",
                " את הצל שלך. "
            )
            postId = 89
            textLocation = arrayListOf(10,5,30,-1, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =5
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999000() {
        val post = Post()
        with(post) {
            postNum = 4999000
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/11/18/19/39/beach-1836597_960_720.jpg"
            postText = arrayListOf(
                " יש לאדם שני בעיות עיקריות ",
                " ראשית ומשנית,  ",
                " הבעיה המשנית היא ",
                " שהוא לא יודע מה הבעיה הראשית שלו. "
            )
            postId = 88
            textLocation = arrayListOf(10,5,30,-1, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#0A174E"
            val textColor = "#02343F"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999001() {
        val post = Post()
        with(post) {
            postNum = 4999001
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/11/03/18/19/social-media-1795578_960_720.jpg"
            postText = arrayListOf(
                " טמטום חושים ",
                " הוא הלך רוח אנושי טיפוסי שבו,  ",
                " האדם צורך כל אינפורמציה ",
                " שתחזק בו את הטמטום חושים. "
            )
            postId = 88
            textLocation = arrayListOf(10,-1,30,5, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =8
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

    fun loadPost4999002() {
        val post = Post()
        with(post) {
            postNum = 4999002
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/02/20/18/03/cat-2083492_960_720.jpg"
            postText = arrayListOf(
                " תלמד להקשיב לעולם ",
                " אחרי הכל יש לו קצת ניסיון בחיים,  ",
                " אומנם הוא לא נחשב במקומותינו ",
                " אבל לפעמים יש לו מה לומר. "
            )
            postId = 87
            textLocation = arrayListOf(10,-1,30,5, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =8
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

     fun loadPost4999003() {
        val post = Post()
        with(post) {
            postNum = 4999003
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/08/10/03/47/guy-2617866_960_720.jpg"
            postText = arrayListOf(
                " המילים אינם תחליף למציאות, ",
                " במקרה הטוב  ",
                " הם מספקים רק חצי נחמה ",
                " למוכים והחבולים ממנה. "
            )
            postId = 88
            textLocation = arrayListOf(10,-1,30,5, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =8
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

    fun loadPost4999004() {
        val post = Post()
        with(post) {
            postNum = 4999004
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/01/17/19/52/old-man-1145469_960_720.jpg"
            postText = arrayListOf(
                " האדם בפני אחרים נתפס לפי ",
                " מה שהוא מעורר בהם,  ",
                " האדם בפני עצמו נתפס לפי ",
                " מה שהוא העורר בעצמו. "
            )
            postId = 83
            textLocation = arrayListOf(10,-1,30,5, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =8
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#07553B"
            val textColor = "#CED46A"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999005() {   //I
        val post = Post()
        with(post) {
            postNum = 4999005
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/03/28/22/55/night-photograph-2183637_960_720.jpg"
            postText = arrayListOf(
                " שאלות פתוחות נותנות מרחב, ",
                " אל תמהר לתת להן תשובות  ",
                " כדי שלא להקטין ",
                " את המרחב הזה . "
            )
            postId = 86
            textLocation = arrayListOf(10,150,35,-1, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =8
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#FFDFDE"
            val textColor = "#3B1877"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999006() {
        val post = Post()
        with(post) {
            postNum = 4999006
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2020/05/03/23/10/suicide-5127103_960_720.jpg"
            postText = arrayListOf(
                " מעניין, ",
                " העולם לא מושלם  ",
                " בדיוק באותם מקומות ",
                " בהם אתה לא מושלם. "
            )
            postId = 88
            textLocation = arrayListOf(10,-1,35,5, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =8
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#F0EDCC"
            val textColor = "#02343F"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999007() {
        val post = Post()
        with(post) {
            postNum = 4999007
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2020/06/13/17/51/milky-way-5295160_960_720.jpg"
            postText = arrayListOf(
                " למרות כל מה שאתה חושב ",
                " אתה לא מרכז היקום,  ",
                " כדאי שתמקם שוב את מפת עולמך  ",
                " אולי אז תצליח למצא את עצמך. "
            )
            postId = 88
            textLocation = arrayListOf(10,-1,30,5, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =8
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#331B3F"
            val textColor = "#ACC7B4"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999008() {
        val post = Post()
        with(post) {
            postNum = 4999008
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2013/07/05/12/20/rubbish-143465_960_720.jpg"
            postText = arrayListOf(
                " לעולם הפנימי שבו אתה חי ",
                " יש יכולת קיבול מוגבלת ,  ",
                " אם תמלא את כל כולו בהבל  ",
                " לא יישאר מקום לאמת. "
            )
            postId = 88
            textLocation = arrayListOf(10,-1,30,5, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =10
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#CBCE91"
            val textColor = "#76528B"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999009() { //I
        val post = Post()
        with(post) {
            postNum = 4999009
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2015/08/05/04/25/people-875617_960_720.jpg"
            postText = arrayListOf(
                " האדם שאתה ",
                " זה לא מה שאתה חושב,  ",
                " אבל מה שאתה חושב  ",
                " משפיע רבות על האדם שאתה. "
            )
            postId = 88
            textLocation = arrayListOf(10,-1,30,5, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =10
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#00203F"
            val textColor = "#ADEFD1"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999010() { //I
        val post = Post()
        with(post) {
            postNum = 4999010
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2018/10/18/04/56/book-3755514_960_720.jpg"
            postText = arrayListOf(
                " יש אנשים שכאלה ",
                " שלא יעזור לך  ",
                " גם אם תתרחק מהם אל מעבר לאופק  ",
                " החוויה איתם נשארת איתך קרוב. "
            )
            postId = 88
            textLocation = arrayListOf(10,-1,30,5, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =10
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#00203F"
            val textColor = "#ADEFD1"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999011() { //I
        val post = Post()
        with(post) {
            postNum = 4999011
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2019/12/22/17/13/barbed-wire-4713012_960_720.jpg"
            postText = arrayListOf(
                " אתה מספיק אידיוט ",
                " להתעצבן על כל זה,  ",
                " ואתה מספיק אידיוט  ",
                " לחשוב שאתה לא כזה. "
            )
            postId = 87
            textLocation = arrayListOf(10,-1,30,150, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =8
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999012() { //I
        val post = Post()
        with(post) {
            postNum = 4999012
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2020/03/06/14/33/man-4907204_960_720.jpg"
            postText = arrayListOf(
                " אני מבסוט ",
                " גם שלא להיות מבסוט,  ",
                " כי ככה  ",
                " אני מוכר יותר לעצמי. "
            )
            postId = 87
            textLocation = arrayListOf(10,-1,25,320, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =8
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999013() { //I
        val post = Post()
        with(post) {
            postNum = 4999013
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/04/19/15/23/teddy-1338895_960_720.jpg"
            postText = arrayListOf(
                " אתה לא צריך להרגיש כל כך רע עם עצמך, ",
                " זה לא אתה שיצרת את האדם  ",
                " אתה רק מתפעל אותו לזמן קצר,  ",
                " אז תרגיע. "
            )
            postId = 87
            textLocation = arrayListOf(10,20,25,-1, 1, 25, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =9
            postTextSize = arrayListOf(0, 13)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999014() { //I
        val post = Post()
        with(post) {
            postNum = 4999014
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2020/05/31/19/37/iranian-architecture-5243948_960_720.jpg"
            postText = arrayListOf(
                " ישנם שלשה גילאים בחי אנוש: ",
                " עלומים – כשרק העתיד שלך נכנס בעתיד,  ",
                " בגרות – שגם ההווה שלך נכנס בעתיד  ",
                " וזקנה – שגם העבר שלך נכנס בעתיד. "
            )
            postId = 87
            textLocation = arrayListOf(10,170,25,-1, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =0
            postTextSize = arrayListOf(0, 13)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999015() { //I
        val post = Post()
        with(post) {
            postNum = 4999015
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2018/12/15/23/26/glass-3877768_960_720.jpg"
            postText = arrayListOf(
                " זה שכולם מדברים כל הזמן ",
                " רק על החצי כוס הריקה,  ",
                " זה לא עושה את האין  ",
                " ליותר מחצי כוס. "
            )
            postId = 87
            textLocation = arrayListOf(10,170,25,-1, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =9
            postTextSize = arrayListOf(0, 13)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999016() { //I
        val post = Post()
        with(post) {
            postNum = 4999016
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2015/10/21/07/51/boot-998966_960_720.jpg"
            postText = arrayListOf(
                " מוטב לך ",
                " שלא לעסוק בכפיתיות  ",
                " בבעיות שימשיכו להיות כאן ",
                " שנים אחרי שאתה כבר לא תהיה. "
            )
            postId = 87
            textLocation = arrayListOf(10,440,25,-1, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =10
            postTextSize = arrayListOf(0, 13)
            val backgroundColor = "#F9EBDE"
            val textColor = "#815854"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost4999017() {
        val post = Post()
        with(post) {
            postNum = 4999017
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2022/09/16/17/07/city-7459162_960_720.jpg"
            postText = arrayListOf(
                " בסך הכל ",
                " החיים זו הפקה לא רעה,  ",
                " הבעיה שמעט אנשים ממש מבינים ",
                " את הקונספציה של ההפקה הזו. "
            )
            postId = 87
            textLocation = arrayListOf(10,-1,25,20, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =0
            postTextSize = arrayListOf(0, 13)
            val backgroundColor = "#F9EBDE"
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

    fun loadPost4999018() {  //I
        val post = Post()
        with(post) {
            postNum = 4999018
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/06/29/22/02/parking-space-1487891_960_720.jpg"
            postText = arrayListOf(
                " תאורטית בעולם הזה ",
                " אתה יכול לעשות מה שאתה רוצה,  ",
                " מעשית ",
                " אתה מוגבל במה שאתה ברגע זה. "
            )
            postId = 87
            textLocation = arrayListOf(10,-1,25,280, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =5
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

    fun loadPost4999019() {  //I
        val post = Post()
        with(post) {
            postNum = 4999019
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2017/09/08/02/24/chess-2727443_960_720.jpg"
            postText = arrayListOf(
                " שהמלך מתאים לאג'נדה הפוליטית שלך ",
                " גם שהוא ערום  ",
                " בשבילך  ",
                " הוא יהיה לבוש לתפארת. "
            )
            postId = 87
            textLocation = arrayListOf(10,-1,28,350, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =10
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

    fun loadPost4999020() {  //I
        val post = Post()
        with(post) {
            postNum = 4999020
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2015/07/27/18/34/life-862985_960_720.jpg"
            postText = arrayListOf(
                " מטען ההצלחות והכישלונות בחיים שלך ",
                " אינו תלוי במה שקורה לך,  ",
                " אלא במה נחשב אצלך כהצלחה  ",
                " ומה נחשב ככישלון. "
            )
            postId = 87
            textLocation = arrayListOf(10,-1,28,350, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =10
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

    fun loadPost4999021() {  //I
        val post = Post()
        with(post) {
            postNum = 4999021
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2021/08/20/07/13/bird-6559677_960_720.jpg"
            postText = arrayListOf(
                "כדי להבין את האדם  ",
                " לך למרחבי הרווח וההפסד,  ",
                " כדי להבין את העולם  ",
                " לך למרחבי החיים והמוות. "
            )
            postId = 87
            textLocation = arrayListOf(10,-1,28,180, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =10
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

    fun loadPost4999022() {  //I
        val post = Post()
        with(post) {
            postNum = 4999022
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2015/10/30/20/13/sunrise-1014712_960_720.jpg"
            postText = arrayListOf(
                " האומנות המוטבעת באדם היא ",
                " לקחת ארבעה חומרים פשוטים,  ",
                " אש, אדמה, אוויר, ומים  ",
                " וליצור מהם חווית חיים. "
            )
            postId = 87
            textLocation = arrayListOf(10,-1,28,120, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =10
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

    fun loadPost4999023() {  //I
        val post = Post()
        with(post) {
            postNum = 4999023
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2022/04/03/09/45/flower-7108507_960_720.jpg"
            postText = arrayListOf(
                " החיים שלך ",
                " זה מה שאתה חושב שזה החיים שלך,  ",
                " המוות שלך  ",
                " זה מה שקורה באמת. "
            )
            postId = 87
            textLocation = arrayListOf(10,-1,28,120, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =10
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

    fun loadPost4999024() {  //I
        val post = Post()
        with(post) {
            postNum = 4999024
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2016/02/24/18/37/windsurf-1220492_960_720.jpg"
            postText = arrayListOf(
                " על עסקי גלישה. ",
                " מי שלא יכול להודות על ימים ללא רוח,  ",
                " לא יכול להודות על ימים עם רוח,  ",
                " כי היכולת להודות לא קשורה למצב הרוח. "
            )
            postId = 87
            textLocation = arrayListOf(10,-1,23,50, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =10
            postTextSize = arrayListOf(0, 12)
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

    fun loadPost4999025() {  //I
        val post = Post()
        with(post) {
            postNum = 4999025
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2022/09/02/13/35/mountains-7427623_960_720.jpg"
            postText = arrayListOf(
                " כמו שהכותבים רוצים התייחסות בפייסבוק ",
                " כך האלוהים רוצה התייחסות על החיים,  ",
                " ולפי מצב הלייקים שהוא מקבל כל יום  ",
                " מפליא אותי שהוא ממשיך בזה. "
            )
            postId = 87
            textLocation = arrayListOf(10,-1,23,50, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =0
            postTextSize = arrayListOf(0, 12)
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

    fun loadPost4999026() {  //I
        val post = Post()
        with(post) {
            postNum = 4999026
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2022/09/28/10/43/sea-7484743_960_720.jpg"
            postText = arrayListOf(
                " כמה יותר דברים ",
                " שאין לך דעה עליהם,  ",
                " ככה יותר חופש  ",
                " יש לך בעולם. "
            )
            postId = 87
            textLocation = arrayListOf(10,-1,25,50, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =0
            postTextSize = arrayListOf(0, 13)
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

    fun loadPost4999027() {  //I
        val post = Post()
        with(post) {
            postNum = 4999027
            lineNum = 4
            imageUri = "https://cdn.pixabay.com/photo/2019/07/25/10/43/ballerina-4362282_960_720.jpg"
            postText = arrayListOf(
                " את החיים האלה צריך להבין, ",
                " וכמו בבלט או בציור  ",
                " אם אתה לא מבין בזה  ",
                " בשבילך זה סתם קשקוש. "
            )
            postId = 87
            textLocation = arrayListOf(10,-1,24,10, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =6
            postTextSize = arrayListOf(0, 12)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
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






