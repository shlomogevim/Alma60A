package com.sg.alma60a

import android.app.Activity
import android.content.Context
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout


class Post8Lines(val context: Context) {
    private val layout: ConstraintLayout = (context as Activity).findViewById(R.id.itemLayoutFire)
    val pref = context.getSharedPreferences(SHARPREF_ALMA, Context.MODE_PRIVATE)
    val drawPost= DrawPostCenter(context)
    private val util= Utility()

    fun loadPost800() {
        val post = Post()
        with(post) {
            postNum = 800
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
            postBackground ="a9dce3"
            postTransparency =9
            val di=0
            val dd=0
            postMargin = arrayListOf(
                arrayListOf(0,0+di,0,-1),
                arrayListOf(0,-1+di,0,250+dd),
                arrayListOf(0,-1+di, 0, 215+dd),
                arrayListOf(0,-1+di, 0, 180+dd),
                arrayListOf(0,-1+di, 0,145+dd),
                arrayListOf(0,-1+di, 0,90+dd),
                arrayListOf(0,-1+di, 0,55+dd),
                arrayListOf(0,-1+di, 0,0+dd)
            )
           val size1=16
            val size2=0
            postTextSize =  arrayListOf(0, size1,size2)
            postPadding =  arrayListOf(0, 0,0, 0)
            val col = "#ffffff"
            val col1 = "#4dd0e1"
            postTextColor = arrayListOf(CONSTANT, col, col1, col1)
            postFontFamily =103
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }
    fun loadPost801() {
        val post = Post()
        with(post) {
            postNum = 801
            lineNum =8
            imageUri ="https://cdn.pixabay.com/photo/2019/11/07/20/44/dog-4609870_1280.jpg"
            postText  = arrayListOf(
                "הכלבים על הבוקר רצים בתזזיתיות",
                "משיח לשיח, מריחים  פה מריחים שם:",
                "מי עשה מה, איפה ומתי, ",
                "האדם נע על הבוקר ברחבי הרשת",
                "מאתר לאתר, קורא פה קורא שם: ",
                "מי עשה מה, איפה ומתי,",
                "ונראה שאם היית פחות הכלב שבך ",
                "הבוקר שלך היה רגוע יותר."
            )
            postBackground ="000000"
            postTransparency =9
            val di=0
            val dd=0
            postMargin = arrayListOf(
                arrayListOf(0,15+di,0,-1),
                arrayListOf(0,40+di,0,-1+dd),
                arrayListOf(0,65+di, 0, -1+dd),
                arrayListOf(0,-1+di, 0,100+dd),
                arrayListOf(0,-1+di, 0,75+dd),
                arrayListOf(0,-1+di, 0,50+dd),
                arrayListOf(0,-1+di, 0,25+dd),
                arrayListOf(0,-1+di, 0,0+dd)
            )
            val size1=12
            val size2=0
            postTextSize =  arrayListOf(0, size1,size2)
            postPadding =  arrayListOf(10, 0,10, 0)
            val col = "#ffffff"
            val col1 = "#4dd0e1"
            postTextColor = arrayListOf(CONSTANT, col, col1, col1)
            postFontFamily =103
            postRadiuas = 15
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

fun loadPost802() {
    val post = Post()
    with(post) {
        postNum = 802
        lineNum =8
        imageUri ="https://cdn.pixabay.com/photo/2017/08/01/20/52/people-2567915_1280.jpg"
        postText  = arrayListOf(
            "כמה שאתה שומע יותר חדשות",
            "יש לך פחות יידע מה קורה באמת,",
            "כמה שיש לך יותר זמן פנוי ",
            "אתה פחות פנו,",
            "כמה שיש לך יותר קבוצות וואסאפ  ",
            "יש לך פחות חברים,",
            "כמה שאתה משתדל להבין את עצמך, ",
            "אתה פחות יודע מי אתה. "
        )
        postBackground ="000000"
        postTransparency =9
        val di=0
        val dd=0
        postMargin = arrayListOf(
            arrayListOf(0,-1+di,0,210+dd),
            arrayListOf(0,-1+di,0,180+dd),
            arrayListOf(0,-1+di, 0, 150+dd),
            arrayListOf(0,-1+di, 0, 120+dd),
            arrayListOf(0,-1+di, 0,90+dd),
            arrayListOf(0,-1+di, 0,60+dd),
            arrayListOf(0,-1+di, 0,30+dd),
            arrayListOf(0,-1+di, 0,0+dd)
        )
        val size1=14
        val size2=0
        postTextSize =  arrayListOf(0, size1,size2)
        postPadding =  arrayListOf(10, 0,10, 0)
        val col = "#ffffff"
        val col1 = "#4dd0e1"
        postTextColor = arrayListOf(CONSTANT, col, col1, col1)
        postFontFamily =103
        postRadiuas = 15
    }
    drawPost.drawPostFire(post,layout)
    util.sendPostToStringFirestore(post)
}

     fun loadPost803() {
       val post = Post()
       with(post) {
           postNum = 803
           lineNum =8
           imageUri ="https://cdn.pixabay.com/photo/2016/08/23/12/37/files-1614223_1280.jpg"
           postText  = arrayListOf(
               " אתה דמות מסרט, ",
               "הזמן המקום והזהות דוחקים אותך לתפקיד חייך,",
               " מדבר את אותם טקסטים ידועים ",
               " חולם חלומות משומשים ",
               "ונפגע מאותם קצוות חיים ביום יום. ",
               " יש אומנם הרבה חיים מעבר לתפקיד הזה ",
               " אבל אתה לא משתמש בהם ",
               " כי זה מחוץ לתפקיד שלך. "
           )
           val di=0
           val dd=30
           postMargin = arrayListOf(
               arrayListOf(0,-1+di,0,270+dd),
               arrayListOf(0,-1+di,0,210+dd),
               arrayListOf(0,-1+di, 0, 180+dd),
               arrayListOf(0,-1+di, 0, 150+dd),
               arrayListOf(0,-1+di, 0,120+dd),
               arrayListOf(0,-1+di, 0,60+dd),
               arrayListOf(0,-1+di, 0,30+dd),
               arrayListOf(0,-1+di, 0,-5+dd)
           )
           postTransparency =9
          postTextSize =  arrayListOf(0, 14)
           val backgroundColor = "0A174E"
           val textColor = "#F5D042"
           postFontFamily =103
           postBackground = util.improveColorString(backgroundColor)
           val textcolo = util.improveColorString(textColor)
           val col = "#$textcolo"
           postTextColor = arrayListOf(CONSTANT, col)
           postPadding = arrayListOf(0, 5, 0, 5)
           postRadiuas = 16
           lineSpacing=1.4f
       }
       drawPost.drawPostFire(post,layout)
       util.sendPostToStringFirestore(post)
   }

    fun loadPost804() {
        val post = Post()
        with(post) {
            postNum = 804
            lineNum =8
            imageUri ="https://cdn.pixabay.com/photo/2017/05/30/16/35/galaxy-2357504_1280.jpg"
            postText  = arrayListOf(
                "  האדם בבוקר השכם  ",
                "  הוא כרוח אלוהים על פני תהום ",
                "ואחר כך הוא יוצר לעצמו את הים והשמים ",
                " את היבשה את העשב ואת בעלי החיים ",
                " ובסוף הוא יוצר את עצמו ברגע שהוא נכנס לדמות שלו. ",
                 " ומבחינתי הייתי מעדיך לרחף עוד קצת ",
                " כרוח אלוהים על פני המים ",
                " לפני כל עבודת הבריאה הזו. "
            )
            val di=0
            val dd=-30
            postMargin = arrayListOf(
                arrayListOf(0,-1+di,0,270+dd),
                arrayListOf(0,-1+di,0,240+dd),
                arrayListOf(0,-1+di, 0, 210+dd),
                arrayListOf(0,-1+di, 0, 180+dd),
                arrayListOf(0,-1+di, 0,120+dd),
                arrayListOf(0,-1+di, 0,90+dd),
                arrayListOf(0,-1+di, 0,60+dd),
                arrayListOf(0,-1+di, 0,30+dd)
            )
            postTransparency =4
            postTextSize =  arrayListOf(0, 14)
            val backgroundColor = "0A174E"
            val textColor = "#F5D042"
            postFontFamily =103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 16
            lineSpacing=1.4f
        }
        drawPost.drawPostFire(post,layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost805() {
        val post = Post()
        with(post) {
            postNum = 805
            lineNum =8
            imageUri ="https://cdn.pixabay.com/photo/2018/12/29/19/53/food-3902073_1280.jpg"
            postText  = arrayListOf(
                "  ג'אנק-פוד כמו  ",
                "  המבורגרים פיצות ובורקסים ",
                " טעימים בטירוף ",
                " אבל דופקים לך את הבטן, ",
                " ג'אנק-מודעות כמו ",
                " פוליטיקה רכילות ואתרים ברשת ",
                " מעניינים בטירוף ",
                " אבל שורפים לך את המודעות. "
            )
            /*val di=0
            val dd=20
            postMargin = arrayListOf(
                arrayListOf(0,-1+di,0,210+dd),
                arrayListOf(0,-1+di,0,180+dd),
                arrayListOf(0,-1+di, 0, 150+dd),
                arrayListOf(0,-1+di, 0, 120+dd),
                arrayListOf(0,-1+di, 0,90+dd),
                arrayListOf(0,-1+di, 0,60+dd),
                arrayListOf(0,-1+di, 0,30+dd),
                arrayListOf(0,-1+di, 0,0+dd)
            )*/
            postTransparency =6
            postTextSize =  arrayListOf(0, 14)
            val backgroundColor = "0A174E"
            val textColor = "#F5D042"
            postFontFamily =103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(100, -1, 30, 10)
            postRadiuas = 16
            lineSpacing=1.4f
        }
                pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }
    }


