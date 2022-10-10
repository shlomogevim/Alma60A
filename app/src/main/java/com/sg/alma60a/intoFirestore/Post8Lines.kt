package com.sg.alma60a

import android.app.Activity
import android.content.Context
import androidx.constraintlayout.widget.ConstraintLayout
import com.sg.alma60a.model.Post


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
            postId = 84
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
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }
        fun loadPost807() {
        val post = Post()
        with(post) {
            postNum = 807
            postId = 85
            lineNum = 8
            imageUri = "https://cdn.pixabay.com/photo/2015/10/30/12/18/thumb-1013968_1280.jpg"
            postText = arrayListOf(
                " גם אם הכל יהיה בסדר ",
                " משהוא יהיה לא בסדר, ",
                " ואיך זה ? ",
                "ה\"בסדר\" וה\"לא בסדר\"",
                " הם מרכזים הקיימים באדם כל הזמן ",
                " ללא תלות מה קורה מסביב, ",
                " ובזמנים שהכל מסתדר סביבך בסדר, אבל אתה מתמקד בלא בסדר, ",
                " אז יש אלמנט של \"לא בסדר\" בכל ה\"בסדר\" הזה. "
            )
            postId = 84
//            textLocation = arrayListOf(10,-1, 30,10,5, 30,6, 30)
            textLocation = arrayListOf(10,5, 30,-1,3, 410,7,30)
            postPadding = arrayListOf(5, 0, 5,0)
            postTransparency =6
            postTextSize = arrayListOf(0, 14)
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
      fun loadPost808() {
        val post = Post()
        with(post) {
            postNum = 808
            postId = 85
            lineNum = 8
            imageUri = "https://cdn.pixabay.com/photo/2022/02/07/16/39/swamp-6999795_1280.jpg"
            postText = arrayListOf(
                " אצלנו בביצה המקומית ",
                " בין הטחב של הזיכרונות, ",
                " החלומות המשומשים, ",
                "השגרה חסרת המשמעות,",
                " הזוהמה של הפוליטיקה, ",
                " הצורך שלא להיטרף, ",
                "וההכרח להישאר שפוי כמו כולם",
                " כל צפרדע חולמת להיות נרקיס."
            )
            postId = 85
            textLocation = arrayListOf(10, -1, 30,10, 0, 0, 0, 0)
            postPadding = arrayListOf(0, 0, 0, 0)
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

    fun loadPost809() {
        val post = Post()
        with(post) {
            postNum = 809
            postId = 85
            lineNum = 8
            imageUri = "https://cdn.pixabay.com/photo/2016/10/18/05/19/old-man-1749360_1280.jpg"
            postText = arrayListOf(
                " יש לך בחייך שלשה משאבים מוגבלים בכמותם: ",
                " הכסף שלך, הבריאות שלך והמודעות שלך. ",
                " את הכסף שלך ",
                "אתה שומר מכל משמר,",
                " את הבריאות שלך ",
                " אתה לפעמים נוטה לבזבז, ",
                "ואת המודעות שלך",
                " אתה משחית חופשי על כל הבל."
            )
            postId = 89
            textLocation = arrayListOf(10, -1, 30,5, 0, 35, 0, 0)
            postPadding = arrayListOf(0, 0, 0, 0)
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

    fun loadPost810() {
        val post = Post()
        with(post) {
            postNum = 810
           lineNum = 8
            imageUri = "https://cdn.pixabay.com/photo/2013/02/09/04/15/doctor-79579_1280.jpg"
            postText = arrayListOf(
                " כשאיבר בגוף שלך עובד מושלם  ",
                " אתה לא מרגיש אותו כלל, ",
                " אבל כשאיבר בגוף לא עובד טוב ",
                "הכאב מחרפן אותך בוקר וערב,",
                " ולמה ? ",
                " בגלל שאתה יצור  ",
                " שממוקד בחוסר השלמות, ",
                " השלמות לא עושה לך דבר."
            )
            postId = 86
            textLocation = arrayListOf(10, -1, 30,5, 0, 0, 0, 0)
            postPadding = arrayListOf(0, 0, 0, 0)
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

    fun loadPost811() {
        val post = Post()
        with(post) {
            postNum = 811
            lineNum = 8
            imageUri = "https://cdn.pixabay.com/photo/2017/04/26/23/46/man-2264051_1280.jpg"
            postText = arrayListOf(
                " מעטים האנשים ",
                " שמגיעים אל המנוחה ואל הנחלה, ",
                " בגלל ש\"המנוחה והנחלה\" ",
                "זה לא מקום ותנאים פיזיים ,",
                " זה מצב נפשי רגעי שבו ",
                " האדם מוצא מנוחה ונחלה על האדמה, ",
                " וזה לא תלוי במה יש לו  ",
                " אלא במה שחסר לו ברגע זה."
            )
            postId = 86
            textLocation = arrayListOf(10, 5, 30,-1, 0, 0, 0, 0)
            postPadding = arrayListOf(0, 0, 0, 0)
            postTransparency =4
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
       fun loadPost812() { //N
        val post = Post()
        with(post) {
            postNum = 812
            lineNum = 8
            imageUri = "https://cdn.pixabay.com/photo/2016/07/01/22/34/people-1492052_1280.jpg"
            postText = arrayListOf(
                " רבי נחמן אמר: ",
                " \"אין ייאוש בעולם כלל\" ",
                "ולמה התכוון, ",
                " העולם הוא מה שהוא, ",
                " האדם יוצר ממנו: ",
                " שמחה, דאגה, אמונה וייאוש, ",
                " אבל בעולם עצמו  ",
                " אין ייאוש כלל."
            )
            postId = 89
            textLocation = arrayListOf(10, -1, 28,200, 0, 0, 0, 0)
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

    fun loadPost813() { //N
        val post = Post()
        with(post) {
            postNum = 813
            lineNum = 8
            imageUri = "https://cdn.pixabay.com/photo/2015/01/08/18/29/entrepreneur-593360_960_720.jpg"
            postText = arrayListOf(
                " גן העדן ",
                " הוא כמו מלונות הכל כלול ",
                "האדם שוקע בהם בטמטום חושים, ",
                " האלוהים גירש את האדם מגן העדן ",
                " כדי למנוע אותו מזה, ",
                " וכך האדם נזרק לאדמה הזו ",
                " ותוך המחסור היומיומי שמסביב  ",
                " נוצרת היצירה האנושית."
            )
            postId = 82
            textLocation = arrayListOf(10, 220, 28,-1, 0, 0, 0, 0)
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

    fun loadPost814() { //N
        val post = Post()
        with(post) {
            postNum = 814
            lineNum = 8
            imageUri = "https://cdn.pixabay.com/photo/2018/03/04/23/32/book-3199610_960_720.jpg"
            postText = arrayListOf(
                " המחשבה היא כלי הישרדותי, ",
                " היא נועדה לנתח מצבים  ",
                " כדי לגבש דרכי תגובה בעולם עוין,  ",
                " שירה היא כלי אומנותי ",
                " שבאה לתאר את החיים סביב ",
                " כדי לתת לעצמך קצת הבנה על העולם, ",
                " ולאדם המודרני מומלץ  ",
                " עשה יותר שירה ופחות מחשבה. "
            )
            postId = 87
            textLocation = arrayListOf(10, -1, 28,140, 0, 0, 0, 0)
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
}


