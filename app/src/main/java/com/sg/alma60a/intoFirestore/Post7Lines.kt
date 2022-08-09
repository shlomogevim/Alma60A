package com.sg.alma60a

import android.app.Activity
import android.content.Context
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout

class Post7Lines(val context: Context) {
    private val layout: ConstraintLayout = (context as Activity).findViewById(R.id.itemLayoutFire)
    val drawPost = DrawPostCenter(context)
    private val util = Utility()

    fun loadPost700() {
        val post = Post()
        with(post) {
            postNum = 700
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
            val di = 0
            val dd = 10
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 200 + dd),
                arrayListOf(0, -1 + di, 0,170 + dd),
                arrayListOf(0, -1 + di, 0, 140 + dd),
                arrayListOf(0, -1 + di, 0, 110 + dd),
                arrayListOf(0, -1 + di, 0, 60 + dd),
                arrayListOf(0, -1 + di, 0, 30 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            val size1 = 14
            val size2 = 0
            postTextSize = arrayListOf(0, size1, size2)
            postPadding = arrayListOf(5, 0, 5, 0)
            val col = "#ffffff"
            val col1 = "#4dd0e1"
            postTextColor = arrayListOf(CONSTANT, col, col1)
            postFontFamily = 103
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost701() {
        var post = Post()
        with(post) {
            postNum = 701
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
            val di = 0
            val dd = 15
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 150 + dd),
                arrayListOf(0, -1 + di, 0, 125 + dd),
                arrayListOf(0, -1 + di, 0, 100 + dd),
                arrayListOf(0, -1 + di, 0, 75 + dd),
                arrayListOf(0, -1 + di, 0, 50 + dd),
                arrayListOf(0, -1 + di, 0, 25 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTextSize = arrayListOf(0, 17)
            postTransparency = 7
            postBackground = "337def"
            val textColor = "fcc727"
            postFontFamily = 320

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost702() {
        var post = Post()
        with(post) {
            postNum = 702
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
            val di = 0
            val dd = 5
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 180 + dd),
                arrayListOf(0, -1 + di, 0, 150 + dd),
                arrayListOf(0, -1 + di, 0, 120 + dd),
                arrayListOf(0, -1 + di, 0, 90 + dd),
                arrayListOf(0, -1 + di, 0, 60 + dd),
                arrayListOf(0, -1 + di, 0, 30 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTextSize = arrayListOf(0, 20)
            postTransparency = 9
            postBackground = "337def"
            val textColor = "fcc727"
            postFontFamily = 320
            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost703() {
        var post = Post()
        with(post) {
            postNum = 703
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
            val di = 0
            val dd = 5
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 210 + dd),
                arrayListOf(0, -1 + di, 0, 175 + dd),
                arrayListOf(0, -1 + di, 0, 140 + dd),
                arrayListOf(0, -1 + di, 0, 105 + dd),
                arrayListOf(0, -1 + di, 0, 70 + dd),
                arrayListOf(0, -1 + di, 0, 35 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTextSize = arrayListOf(0, 14)
            postTransparency = 8
            postBackground = "#2BAE66"
            val textColor = "ffffff"
            postFontFamily = 103
            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(10, 5,10, 5)
            postRadiuas = 15
            lineSpacing=1.2f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost704() {
        var post = Post()
        with(post) {
            postNum = 704
            lineNum = 7
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
            val di = 0
            val dd = 5
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 210 + dd),
                arrayListOf(0, -1 + di, 0, 175 + dd),
                arrayListOf(0, -1 + di, 0, 140 + dd),
                arrayListOf(0, -1 + di, 0, 105 + dd),
                arrayListOf(0, -1 + di, 0, 70 + dd),
                arrayListOf(0, -1 + di, 0, 35 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTextSize = arrayListOf(0, 16)
            postTransparency = 0
            postBackground = "#2BAE66"
            val textColor = "ffffff"
            postFontFamily = 103
            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(0, 5,0, 5)
            postRadiuas = 15
            lineSpacing=1.2f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost705() {
        var post = Post()
        with(post) {
            postNum = 705
            lineNum = 7
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
            val di = 0
            val dd = 5
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 180 + dd),
                arrayListOf(0, -1 + di, 0, 150 + dd),
                arrayListOf(0, -1 + di, 0, 120 + dd),
                arrayListOf(0, -1 + di, 0, 90 + dd),
                arrayListOf(0, -1 + di, 0, 60 + dd),
                arrayListOf(0, -1 + di, 0, 30 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTextSize = arrayListOf(0, 16)
            postTransparency = 5
            postBackground = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(0, 0,0, 0)
            postRadiuas = 15
            lineSpacing=1.2f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost706() {
        var post = Post()
        with(post) {
            postNum = 706
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
            val di = 0
            val dd = 5
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 180 + dd),
                arrayListOf(0, -1 + di, 0, 150 + dd),
                arrayListOf(0, -1 + di, 0, 120 + dd),
                arrayListOf(0, -1 + di, 0, 90 + dd),
                arrayListOf(0, -1 + di, 0, 60 + dd),
                arrayListOf(0, -1 + di, 0, 30 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTextSize = arrayListOf(0, 16)
            postTransparency = 5
            postBackground = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(0, 0,0, 0)
            postRadiuas = 15
            lineSpacing=1.2f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost707() {
        var post = Post()
        with(post) {
            postNum = 707
            lineNum = 7
            imageUri = "https://cdn.pixabay.com/photo/2018/02/03/15/40/landscape-3127859_1280.jpg"
            postText = arrayListOf(
                " הדרך לחיים נכונים היא  ",
                " לעשות את הדבר הנכון בזמן הנכון ",
                "  ואפילו   ",
                " אם זה לא נראה לך, ",
                " או שאתה לא בנוי לזה ",
                " או שאין לך זמן לזה  ",
                " או שלא נוח לך כרגע. "
            )
            val di = 0
            val dd = 5
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 180 + dd),
                arrayListOf(0, -1 + di, 0, 150 + dd),
                arrayListOf(0, -1 + di, 0, 120 + dd),
                arrayListOf(0, -1 + di, 0, 90 + dd),
                arrayListOf(0, -1 + di, 0, 60 + dd),
                arrayListOf(0, -1 + di, 0, 30 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTextSize = arrayListOf(0, 15)
            postTransparency =0
            postBackground = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(0, 0,0, 0)
            postRadiuas = 15
            lineSpacing=1.2f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
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
            val di = 0
            val dd = 5
            postMargin = arrayListOf(
                arrayListOf(0, -1 + di, 0, 180 + dd),
                arrayListOf(0, -1 + di, 0, 150 + dd),
                arrayListOf(0, -1 + di, 0, 120 + dd),
                arrayListOf(0, -1 + di, 0, 90 + dd),
                arrayListOf(0, -1 + di, 0, 60 + dd),
                arrayListOf(0, -1 + di, 0, 30 + dd),
                arrayListOf(0, -1 + di, 0, 0 + dd)
            )
            postTextSize = arrayListOf(0, 15)
            postTransparency =0
            postBackground = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(0, 0,0, 0)
            postRadiuas = 15
            lineSpacing=1.2f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
}

