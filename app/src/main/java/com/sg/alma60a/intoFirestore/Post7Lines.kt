package com.sg.alma60a

import android.app.Activity
import android.content.Context
import androidx.constraintlayout.widget.ConstraintLayout
import com.sg.alma60a.model.Post

class Post7Lines(val context: Context) {
    private val layout: ConstraintLayout = (context as Activity).findViewById(R.id.itemLayoutFire)
    val pref = context.getSharedPreferences(SHARPREF_ALMA, Context.MODE_PRIVATE)
    val drawPost = DrawPostCenter(context)
    private val util = Utility()
    private val util1 = Utility1(context)


    fun loadPost700() {
        val post = Post()
        with(post) {
            postNum = 700
            postId=72
            lineNum = 7
            imageUri = "https://cdn.pixabay.com/photo/2017/09/03/09/17/question-2709670_1280.jpg"
            postText = arrayListOf(
                "האדם המחפש משמעות בחיים",
                "דומה לאחד שקיבל במתנה כלי מופלא",
                "והוא ממש נבוך מהמתנה הזו,",
                " מצד אחד ",
                "הוא שמע מכולם שהכלי הזה מדהים ברמות,",
                " אבל מהצד השני ",
                "הוא לא יודע  מה לעזאזל עושים עם זה."
            )
            postBackground = "000000"
            postTransparency = 10
            postTextSize = arrayListOf(0, 14)
            textLocation = arrayListOf(10, -1, 30,10, 0,0,0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
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

    fun loadPost701() {
        var post = Post()
        with(post) {
            postNum = 701
            postId=76
            lineNum = 7
            imageUri = "https://cdn.pixabay.com/photo/2016/04/05/03/18/prayer-1308663_1280.jpg"
            postText = arrayListOf(
                " בראש השנה כולם מתפללים לאל עליון ",
                " שיתן להם שנה טובה, ",
                " אבל, היחיד שיכול ליצור בשבילך ",
                " שנה טובה ",
                " הוא אתה, ",
                " כי אתה הוא היוצר היחידי ",
                " של הטוב והרע בעולמך. "
            )
            postTextSize = arrayListOf(0, 15)
            postTransparency = 7
            postBackground = "337def"
            val textColor = "fcc727"
            postFontFamily = 103
            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            textLocation = arrayListOf(10, -1, 35,10, 0,0,0, 0)
            postPadding = arrayListOf(0, 5, 0, 0)
            postRadiuas = 15
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost702() {
        var post = Post()
        with(post) {
            postNum = 702
            postId=73
            lineNum = 7
            imageUri = "https://cdn.pixabay.com/photo/2018/04/03/16/34/clock-3287232_1280.jpg"
            postText = arrayListOf(
                "להגיד את הדבר הנכון",
                "במקום הלא נכון זה חוסר טקט,",
                "להגיד את הדבר הלא נכון",
                "במקום הנכון זו טיפשות,",
                "להגיד את הדבר הנכון",
                "במקום הנכון",
                "זו אומנות."
            )
             postTextSize = arrayListOf(0, 20)
            postTransparency = 9
            postBackground = "337def"
            val textColor = "fcc727"
            postFontFamily = 320
            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            textLocation = arrayListOf(10, -1, 35,10, 0,0,0, 0)
            postPadding = arrayListOf(10, 5, 10, 0)
            postRadiuas = 15
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost703() {
        var post = Post()
        with(post) {
            postNum = 703
            postId=75
            lineNum = 7
            imageUri = "https://cdn.pixabay.com/photo/2017/02/15/11/50/forest-2068375_1280.jpg"
            postText = arrayListOf(
                "החיים בשבילך הם בעיקר תפיסת עולם",
                " בתוך אינסוף של קיום, ",
                " תחשוב קטן הם יהיו קטנים ",
                " תחשוב גדול הם יהיו גדולים ",
                " תחשוב מדכא הן יהיו מדכאים ",
                " תחשוב אופטימי הם יהיו אופטימיים ",
                " תחשוב אינסוף הם יהיו אינסופיים. "
            )
             postTextSize = arrayListOf(0, 14)
            postTransparency = 7
            postBackground = "#2BAE66"
            val textColor = "ffffff"
            postFontFamily = 103
            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            textLocation = arrayListOf(10, -1, 35,10, 0,0,0, 0)
            postPadding = arrayListOf(10, 5,10, 0)
            postRadiuas = 15
            lineSpacing=1.2f
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost704() {
        var post = Post()
        with(post) {
            postNum = 704
            lineNum = 7
            postId=80
            imageUri = "https://cdn.pixabay.com/photo/2017/08/30/01/05/milky-way-2695569_1280.jpg"
            postText = arrayListOf(
                " דיכאון ",
                " זה להיות בטוח שברגע זה",
                "  העולם נגמר בגבול המודעות שלך, ",
                " רווחה ",
                " זה לדעת ברגע זה ",
                " שהעולם ממשיך בכל מקרה ",
                " הרבה מעבר לגבול המודעות שלך. "
            )
            postTextSize = arrayListOf(0, 16)
            postTransparency = 0
            postBackground = "#2BAE66"
            val textColor = "ffffff"
            postFontFamily = 103
            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            textLocation = arrayListOf(10, -1, 35,10, 0,0,0, 0)
            postPadding = arrayListOf(0, 5,0, 5)
            postRadiuas = 15
            lineSpacing=1.2f
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost705() {  //I
        var post = Post()
        with(post) {
            postNum = 705
            lineNum = 7
            postId=81
            imageUri = "https://cdn.pixabay.com/photo/2015/01/09/17/34/opera-594592_1280.jpg"
            postText = arrayListOf(
                " בחיים שלך ",
                " אתה השחקן הראשי ",
                "  אתה המבקר האכזרי ",
                " והקהל המשועמם, ",
                " חוסר השקט הפנימי שלך ",
                " נוצר בגלל הכורח ",
                " להכניס את כולם בגוף אחד. "
            )
             postTextSize = arrayListOf(0, 16)
            postTransparency = 10
            postBackground = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            textLocation = arrayListOf(10, 200, 35,-1, 0,0,0, 0)
            postPadding = arrayListOf(0, 0,0, 0)
            postRadiuas = 15
            lineSpacing=1.2f
        }
       //pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost706() {
        var post = Post()
        with(post) {
            postNum = 706
            postId=75
            lineNum = 7
            imageUri = "https://cdn.pixabay.com/photo/2020/10/29/15/32/beach-5696492_1280.jpg"
            postText = arrayListOf(
                " האדם רואה רק את הצל שלו  ",
                " אבל הוא לא רואה את עצמו, ",
                "  האדם יודע רק מה הוא חושב  ",
                " אבל הוא לא יודע מי זה החושב, ",
                " ולמען הסדר בעולמך רצוי שתדע  ",
                " את הצל שלך כצל ",
                " והמחשבה כמחשבה. "
            )
             postTextSize = arrayListOf(0, 16)
            postTransparency = 5
            postBackground = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            textLocation = arrayListOf(10, -1, 35,10, 0,0,0, 0)
            postPadding = arrayListOf(0, 0,0, 0)
            postRadiuas = 15
            lineSpacing=1.2f
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost707() {
        var post = Post()
        with(post) {
            postNum = 707
            postId=78
            lineNum = 7
            imageUri = "https://cdn.pixabay.com/photo/2018/02/03/15/40/landscape-3127859_1280.jpg"
            postText = arrayListOf(
                " הדרך לחיים נכונים היא  ",
                " לעשות את הדבר הנכון בזמן הנכון, ",
                "  ואפילו   ",
                " אם זה לא נראה לך, ",
                " או שאתה לא בנוי לזה ",
                " או שאין לך זמן לזה  ",
                " או שלא נוח לך כרגע. "
            )
            postTextSize = arrayListOf(0, 15)
            postTransparency =3
            postBackground = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            textLocation = arrayListOf(10, -1, 35,10, 0,0,0, 0)
            postPadding = arrayListOf(0, 0,0, 0)
            postRadiuas = 15
            lineSpacing=1.2f
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost708() {
        var post = Post()
        with(post) {
            postNum = 708
             postId=78
            lineNum = 7
            imageUri = "https://cdn.pixabay.com/photo/2018/01/09/20/22/tree-3072431_1280.jpg"
            postText = arrayListOf(
                " האדם לא גורש מגן העדן  ",
                " זה סתם סיפור מקראי, ",
                "  הוא פשוט לא התאים כל כך לשם   ",
                " אז הוא עבר לפרברים של הגן הזה ",
                " בואך לגיהינום, ",
                " שם הוא מצא חברים וגם את עצמו  ",
                " ושם הוא בנה את ביתו. "
            )
            postTextSize = arrayListOf(0, 15)
            postTransparency =4
            postBackground = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            textLocation = arrayListOf(10, -1, 35,10, 0,0,0, 0)
            postPadding = arrayListOf(0, 0,0, 0)
            postRadiuas = 15
            lineSpacing=1.2f
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }

    fun loadPost709() {
        var post = Post()
        with(post) {
            postNum = 709
            postId=75
            lineNum = 7
            imageUri = "https://cdn.pixabay.com/photo/2018/07/01/13/28/two-pin-3509490_1280.jpg"
            postText = arrayListOf(
                " אתה המתאם האורגינלי ",
                " בין השדים שלך לעולם החיצוני, ",
                "  דרכך זורמת אנרגית חיים   ",
                " שמפעילה אותם בצבע ובמלל, ",
                " בלעדיך הם היו נעלמים ",
                " תוך זמן קצר  ",
                " כשהסוללה שלהם הייתה מתרוקנת. "
            )
            postTextSize = arrayListOf(0, 16)
            postTransparency =0
            postBackground = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            textLocation = arrayListOf(10, -1, 35,10, 0,0,0, 0)
            postPadding =  arrayListOf(0, 5,0, 0)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
                pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost710() {
        var post = Post()
        with(post) {
            postNum = 710
                 lineNum = 7
            imageUri = "https://cdn.pixabay.com/photo/2016/11/29/01/31/man-1866559_1280.jpg"
            postText = arrayListOf(
                " שתחזיק מעצמך מספיק בסדר ",
                " ככה ",
                " שלא תציק לעצמך על מה שאתה,  ",
                " ועם זאת ",
                " שתחזיק מעצמך מספיק לא בסדר ",
                " ככה  ",
                " שלא תציק לאחרים על מה שהם. "
            )
            postId=87
            textLocation = arrayListOf(10, -1, 35,10, 0,0,0, 0)
            postPadding =  arrayListOf(0, 0,0, 0)
            postTransparency =6
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            videoUrl="3gG4ZqlafPg"
           }
         drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

fun loadPost711() {
    var post = Post()
    with(post) {
        postNum = 711
        lineNum = 7
        imageUri = "https://cdn.pixabay.com/photo/2017/03/31/15/34/sunset-2191645_1280.jpg"
        postText = arrayListOf(
            " האדם הראשון ",
            " חיפש את גן העדן ",
            " בגן העדן  ",
            " וגם שם הוא מצא רק תפוח, ",
            " ואז כמו היום ",
            " האדם חזק בלחפש ולחפש  ",
            " ודי גרוע בלמצוא. "
        )
        postId=86
        textLocation = arrayListOf(10, -1, 30,10, 0,0,0, 0)
        postPadding =  arrayListOf(0, 0,0, 0)
        postTransparency =6
        postTextSize = arrayListOf(0, 16)
        val backgroundColor = "#0A174E"
        val textColor = "#F5D042"
        postFontFamily = 103
        postBackground = util.improveColorString(backgroundColor)
        val textcolo = util.improveColorString(textColor)
        val col = "#$textcolo"
        postTextColor = arrayListOf(CONSTANT, col)
        videoUrl="e3-5YC_oHjE"
    }
    drawPost.drawPostFire(post, layout)
    util.sendPostToStringFirestore(post)
}

   fun loadPost712() {
       var post = Post()
       with(post) {
           postNum = 712
           lineNum = 7
           imageUri = "https://cdn.pixabay.com/photo/2019/06/08/11/30/people-4259948_1280.jpg"
           postText = arrayListOf(
               " אתה יכול ",
               " להרגיש שהכל אפשרי לך ",
               " לחשוב את המחשבות שלך  ",
               " ולפתח תפיסת עולם משלך, ",
               " אבל בסופו של יום ",
               " איך שלא תגלגל את זה  ",
               " אתה חלק מהעדר. "
           )
           postId=87
           textLocation = arrayListOf(10, -1, 30,10, 0,0,0, 0)
           postPadding =  arrayListOf(0, 0,0, 0)
           postTransparency =6
           postTextSize = arrayListOf(0, 16)
           val backgroundColor = "#0A174E"
           val textColor = "#F5D042"
           postFontFamily = 103
           postBackground = util.improveColorString(backgroundColor)
           val textcolo = util.improveColorString(textColor)
           val col = "#$textcolo"
           postTextColor = arrayListOf(CONSTANT, col)
           videoUrl="IPJn1nwqcCY"
       }
       drawPost.drawPostFire(post, layout)
       util.sendPostToStringFirestore(post)
   }

    fun loadPost713() {
        var post = Post()
        with(post) {
            postNum = 713
            lineNum = 7
            imageUri = "https://cdn.pixabay.com/photo/2016/05/15/20/52/spectator-1394393_1280.jpg"
            postText = arrayListOf(
                " השאיפה לרייטינג מצביעה על ",
                " עד כמה אתה מחובר לעדר, ",
                " השאיפה ליצירה אישית מצביעה על  ",
                " עד כמה אתה מחובר לעצמך. ",
                " וההתלבטות היויומית היא: ",
                " באם ללכת על מה שיותר נחשב  ",
                " או על מה שיותר חשוב. "
            )
            postId=83
            textLocation = arrayListOf(10, -1, 30,10, 0,0,0, 0)
            postPadding =  arrayListOf(0, 0,0, 0)
            postTransparency =6
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            videoUrl="8DalgZC7r70"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

fun loadPost714() {
    val post = Post()
    with(post) {
        postNum = 714
        lineNum = 7
        imageUri = "https://cdn.pixabay.com/photo/2021/11/08/11/33/justice-6778953_960_720.jpg"
        postText = arrayListOf(
            " בוויכוח הפוליטי הזה ",
            " אתה לא יודע דבר, ",
            " מה באמת היה ומה לא,  ",
            " מי הטובים ומי הרעים, ",
            " אתה רוצה רק להיות צודק, ",
            " ובשביל זה  ",
            " אתה באמת לא צריך לדעת דבר. "
        )
        postId=87
        textLocation = arrayListOf(10, -1, 30,5, 0,0,0, 0)
        postPadding =  arrayListOf(0, 0,0, 5)
        postTransparency =6
        postTextSize = arrayListOf(0, 14)
        val backgroundColor = "#0A174E"
        val textColor = "#F5D042"
        postFontFamily = 103
        postBackground = util.improveColorString(backgroundColor)
        val textcolo = util.improveColorString(textColor)
        val col = "#$textcolo"
        postTextColor = arrayListOf(CONSTANT, col)
        videoUrl="UPrkr-KJxxY"
    }
    drawPost.drawPostFire(post, layout)
    util.sendPostToStringFirestore(post)
}

    fun loadPost715() {
        val post = Post()
        with(post) {
            postNum = 715
            lineNum = 7
            imageUri = "https://cdn.pixabay.com/photo/2016/07/11/20/31/construction-1510561_960_720.jpg"
            postText = arrayListOf(
                " רצף מילים יוצרות משפט ",
                " שנה את סדר המילים ",
                " והמשפט יקבל משמעות אחרת,  ",
                " גם אתה ",
                " באם תארגן את עצמך ",
                " בסדר שונה במקצת  ",
                " תהיה אחר. "
            )
            postId=86
            textLocation = arrayListOf(10, -1, 30,5, 0,0,0, 0)
            postPadding =  arrayListOf(0, 0,0, 0)
            postTransparency =10
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            videoUrl="rfgLgC1R2EA"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
     fun loadPost716() {  //nv
        val post = Post()
        with(post) {
            postNum = 716
            lineNum = 7
            imageUri = "https://cdn.pixabay.com/photo/2022/01/01/17/08/judaean-desert-6908389_960_720.jpg"
            postText = arrayListOf(
                " בכל דור ודור ",
                " יש את מי שעולה להר סיני ",
                " ויש את ההמון שסוגד למטה לעגל הזהב,  ",
                " בכל מקרה ",
                " הסנה עדיין בוער ",
                " והדרך פתוחה  ",
                " לאלה שבוחרים לעלות בהר. "
            )
            postId=86
            textLocation = arrayListOf(10, -1, 30,5, 0,0,0, 0)
            postPadding =  arrayListOf(0, 0,0, 0)
            postTransparency =10
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            videoUrl="sA017MMcYx4"
          }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost717() {
        val post = Post()
        with(post) {
            postNum = 717
            lineNum = 7
            imageUri = "https://cdn.pixabay.com/photo/2016/05/21/15/19/depot-1406937_960_720.jpg"
            postText = arrayListOf(
                " אם אתה לא מקבל מהחיים ",
                " את מה שאתה רוצה מהם ",
                " כדאי שתבדוק,  ",
                "אפשר שאלה חיים של מישהו אחר ",
                " והם פשוט התבלבלו בחלוקה, ",
                " ואתה  ",
                " לא בדיוק מה שאתה חושב שאתה. "
            )
            postId=86
            textLocation = arrayListOf(10, -1, 25,10, 0,0,0, 0)
            postPadding =  arrayListOf(0, 0,0, 0)
            postTransparency =5
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            videoUrl="V0tm6EbhFAg"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost718() {
        val post = Post()
        with(post) {
            postNum = 718
            lineNum = 7
            imageUri = "https://cdn.pixabay.com/photo/2017/08/01/10/05/people-2564217_960_720.jpg"
            postText = arrayListOf(
                " בלכתו בשבילי החיים ",
                " לאדם יש נטיה מובהקת ",
                " הוא מביט על האדמה.  ",
                "זה טוב",
                " כי ככה הוא לא נופל לבורות בדרך, ",
                " זה פחות טוב  ",
                " כי ככה הוא לא רואה את השמים. "
            )
            postId=86
            textLocation = arrayListOf(10, -1, 30,10, 0,0,0, 0)
            postPadding =  arrayListOf(0, 0,0, 0)
            postTransparency =5
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            videoUrl="ZRMmFaKNyc4"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
}

