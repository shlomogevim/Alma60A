package com.sg.alma60a

import android.app.Activity
import android.content.Context
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout


class Post8Lines(val context: Context) {
    private val layout: ConstraintLayout = (context as Activity).findViewById(R.id.itemLayoutFire)
    val pref = context.getSharedPreferences(SHARPREF_ALMA, Context.MODE_PRIVATE)
    val drawPost = DrawPostCenter(context)
    private val util = Utility()

    /* fun loadPost800() {
         val post = Post()
         with(post) {
             postNum = 800
             postId=70
             lineNum =8
             imageUri ="https://cdn.pixabay.com/photo/2016/05/05/02/37/sunset-1373171_1280.jpg"
             postText  = arrayListOf(
                 " על החיים: ",
                 "האדם שמחפש משמעות בחיים",
                 "דומה לאחד שקיבל כלי מופלא",
                 "והוא ממש נבוך מהמתנה הזו,",
                 " מצד אחד ",
                 "הוא שמע מכולם שהכלי הזה מדהים ברמות,",
                 " אבל מהצד השני ",
                 "הוא לא יודע  מה לעזאזל עושים עם זה."
             )

             postTransparency =9
             postTextSize =  arrayListOf(0, 16)
             postPadding =  arrayListOf(0, 0,0, 0)
             postBackground ="a9dce3"
             val col = "#ffffff"
             postTextColor = arrayListOf(CONSTANT, col)
             postFontFamily =103
             postRadiuas = 15
             textLocation = arrayListOf(10, -1, 30,10, 0, -60,0, 0)
             postPadding =  arrayListOf(10, 0,10, 0)
             postFontFamily =103
             postRadiuas = 15
         }
         pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
 //    pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
         drawPost.drawPostFire(post, layout)
         util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
     }*/
    fun loadPost801() {
        val post = Post()
        with(post) {
            postNum = 801
            lineNum = 8
            postId = 70
            imageUri = "https://cdn.pixabay.com/photo/2019/11/07/20/44/dog-4609870_1280.jpg"
            postText = arrayListOf(
                "הכלבים על הבוקר רצים בתזזיתיות",
                "משיח לשיח, מריחים  פה מריחים שם",
                "מי עשה מה, איפה ומתי, ",
                "האדם נע על הבוקר ברחבי הרשת",
                "מאתר לאתר, קורא פה קורא שם ",
                "מי עשה מה, איפה ומתי,",
                "ונראה שאם היית פחות הכלב שבך ",
                "הבוקר שלך היה רגוע יותר."
            )
            postBackground = "000000"
            postTransparency = 4
            postTextSize = arrayListOf(0, 15)
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            val col = "#ffffff"
            postTextColor = arrayListOf(CONSTANT, col)
            postFontFamily = 103
            postRadiuas = 15
            lineSpacing = 1.4f
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//    pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost802() {
        val post = Post()
        with(post) {
            postNum = 802
            lineNum = 8
            postId = 76
            imageUri = "https://cdn.pixabay.com/photo/2020/11/06/07/42/girl-5717067_1280.jpg"
            postText = arrayListOf(
                "כמה שאתה שומע יותר חדשות",
                "אתה פחות יודע מה קורה באמת,",
                "כמה שיש לך יותר זמן פנוי ",
                "אתה פחות פנוי,",
                "כמה שיש לך יותר קבוצות וואסאפ  ",
                "יש לך פחות חברים,",
                "כמה שאתה משתדל להבין את עצמך, ",
                "אתה פחות תופס מי אתה. "
            )
            postBackground = "#606060"
            postTransparency = 7
            postTextSize = arrayListOf(0, 18)
            val col = "#D6ED17"
            val col1 = "#4dd0e1"
            postTextColor = arrayListOf(CONSTANT, col, col1, col1)
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)            //top
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 16
            lineSpacing = 1.4f
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//    pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost803() {
        val post = Post()
        with(post) {
            postNum = 803
            postId = 70
            lineNum = 8
            imageUri = "https://cdn.pixabay.com/photo/2016/03/10/17/01/stage-1248769_1280.jpg"
            postText = arrayListOf(
                " אתה דמות מסרט, ",
                "הזמן המקום והזהות דוחקים אותך לתפקיד חייך,",
                " מדבר את אותם טקסטים ידועים ",
                " חולם חלומות משומשים ",
                "ונפגע מאותם קצוות חיים ביום יום. ",
                " יש אומנם הרבה חיים מעבר לתפקיד הזה ",
                " אבל אתה לא משתמש בהם ",
                " כי זה מחוץ לתפקיד שלך. "
            )

            postTransparency = 9
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            textLocation = arrayListOf(10, -1, 35, 10, 0, 35, 4, 35)            //top
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.4f
        }
//         pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost804() {
        val post = Post()
        with(post) {
            postNum = 804
            postId = 75
            lineNum = 8
            imageUri = "https://cdn.pixabay.com/photo/2017/05/30/16/35/galaxy-2357504_1280.jpg"
            postText = arrayListOf(
                "  האדם בבוקר השכם  ",
                "  הוא כרוח אלוהים על פני תהום ",
                "ואחר כך הוא יוצר לעצמו את הים והשמים ",
                " את היבשה את העשב ואת בעלי החיים ",
                " ובסוף הוא יוצר את עצמו ברגע שהוא נכנס לדמות שלו. ",
                " ומבחינתי הייתי מעדיך לרחף עוד קצת ",
                " כרוח אלוהים על פני המים ",
                " לפני כל עבודת הבריאה הזו. "
            )
            postTransparency = 4
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)

            textLocation = arrayListOf(10, -1, 30, 10, 3, 30, 0, 0)
            //top     //dis        //bottom     //line1   //dis1
//       post.textLocation = arrayListOf(101, -1,       35,            10,             3,        60)            // locate in the bottom
            //    post.textLocation = arrayListOf(101, 10,       35,            -1,            3,        60)            //locate in the top

            postPadding = arrayListOf(0, 5, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.4f
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost805() {
        val post = Post()
        with(post) {
            postNum = 805
            postId = 75
            lineNum = 8
            imageUri = "https://cdn.pixabay.com/photo/2018/12/29/19/53/food-3902073_1280.jpg"
            postText = arrayListOf(
                "  ג'אנק-פוד כמו  ",
                "  המבורגרים פיצות ובורקסים ",
                " טעימים בטירוף ",
                " אבל דופקים לך את הבטן, ",
                " ג'אנק-מודעות כמו ",
                " פוליטיקה רכילות ואתרים ברשת ",
                " מעניינים בטירוף ",
                " אבל שורפים לך את המודעות. "
            )
            postTransparency = 6
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)     //bottom
//            textLocation = arrayListOf(100, 6, 30, -1)     //up
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.4f
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost806() {
        val post = Post()
        with(post) {
            postNum = 806
            postId = 90
            lineNum = 8
            imageUri = "https://cdn.pixabay.com/photo/2017/08/02/13/02/people-2571488_1280.jpg"
            postText = arrayListOf(
                "  האמת קיימת ולא משתנה,  ",
                "  האמת הזו ",
                " לפי אנשי החדשות היא לא מעניינת ",
                " לפי אנשי הרכילות היא ממש לא סיפור ",
                " לפי אנשי המסיבות היא לא צבעונית ",
                " לפי אנשי העסקים היא לא מוכרת ",
                " ולפי הנטרפים ברוחות השינויים ",
                " היא הנחמה. "
            )
            postTransparency = 0
            postTextSize = arrayListOf(0, 15)
            val backgroundColor = "0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            textLocation = arrayListOf(10, -1, 32, 10, 0, 0, 0, 0)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
}


