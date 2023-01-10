package com.sg.alma60a

import android.app.Activity
import android.content.Context
import androidx.constraintlayout.widget.ConstraintLayout
import com.sg.alma60a.model.Post


class Post2Lines(val context: Context) {

    private val layout: ConstraintLayout = (context as Activity).findViewById(R.id.itemLayoutFire)
    val drawPost = DrawPostCenter(context)
    val pref = context.getSharedPreferences(SHARPREF_ALMA, Context.MODE_PRIVATE)
    private val util = Utility()
    private val util1 = Utility1(context)


    fun loadPost200() {
        val post = Post()
        with(post) {
            postNum = 200
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2014/09/16/01/19/girl-447701_1280.jpg"
            postText = arrayListOf(
                "אין בעיות בעולם",
                "חוץ מאלה שאצלך בראש."
            )
            textLocation = arrayListOf(10, 20, 30, -1, 0, 0, 0, 0)
            postId = 90
            postBackground = "000000"
            postTransparency = 6
            val size1 = 16
            val size2 = 0
            postTextSize = arrayListOf(0, size1, size2)
            postPadding = arrayListOf(10, 0, 10, 0)
            val col = "#ffffff"
            postTextColor = arrayListOf(CONSTANT, col)
            postFontFamily = 103
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//       util.sendPostToStringFirestore(post)
    }

    fun loadPost201() {
        val post = Post()
        // util.logi("Post2Line   ========> /n 201A ")
        with(post) {
            postNum = 201
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2017/11/04/14/25/pinocchio-2917652_1280.jpg"
            postText = arrayListOf(
                "  לאמת פנים רבות  ",
                "  אחד מהם הוא השקר."
            )
            textLocation = arrayListOf(10, -1, 35, 5, 0, 0, 0, 0)
            postId = 86
            postBackground = "263238"
            postTransparency = 5
            val size1 = 16
            postTextSize = arrayListOf(0, size1)
            postPadding = arrayListOf(5, 0, 5, 0)
            val col = "#a7aba8"
            postTextColor = arrayListOf(CONSTANT, col)
            postFontFamily = 103
            postRadiuas = 15
        }
        //util.logi("Post2Line   ========> /n 201B  post=$post ")
        drawPost.drawPostFire(post, layout)
//      util.sendPostToStringFirestore(post)
    }

    fun loadPost202() { //N
        val post = Post()
        with(post) {
            postNum = 202
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2017/12/16/22/22/bora-bora-3023437_1280.jpg"
            postText = arrayListOf(
                " כל חלום מפסיק להיות כזה ",
                " ברגע שהוא הופך לשגרה. "
            )
            textLocation = arrayListOf(10, -1, 35, 130, 0, 0, 0, 0)
            postId = 85
            postTransparency = 8
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5, 0, 5, 0)
            postRadiuas = 15

        }
        //  util.logi("Post2Line   ========> /n 201B  post=$post ")
        drawPost.drawPostFire(post, layout)
//       util.sendPostToStringFirestore(post)
    }

    fun loadPost203() {
        val post = Post()
        with(post) {
            postNum = 203
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2018/02/13/22/02/light-3151723_1280.jpg"
            postText = arrayListOf(
                "ונתתי את האור וחושך לפניך",
                "ובחרת באור."
            )
            textLocation = arrayListOf(10, -1, 35, 5, 0, 0, 0, 0)
            postId = 89
            postBackground = "263238"
            postTransparency = 4
            val size1 = 25
            postTextSize = arrayListOf(0, size1)
            postPadding = arrayListOf(0, 0, 0, 0)
            val col = "#f6ff03"
            postTextColor = arrayListOf(CONSTANT, col)
            postFontFamily = 200
            postRadiuas = 15
            lineSpacing = 1.1f
        }
        drawPost.drawPostFire(post, layout)
//    util.sendPostToStringFirestore(post)
    }

    fun loadPost204() {  //N
        val post = Post()
        with(post) {
            postNum = 204
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2021/01/09/21/09/antelope-5903514_1280.jpg"
            postText = arrayListOf(
                " אם אתה לא יכול להטיב את המצב ",
                " אז על תתערב. "
            )
            textLocation = arrayListOf(10, -1, 35, 70, 0, 0, 0, 0)
            postId = 81
            postBackground = "07553B"
            postTransparency = 9
            postTextSize = arrayListOf(0, 18)
            postPadding = arrayListOf(10, 7, 10, 7)
            val col = "#CED46A"
            val col1 = "#CED46A"
            postTextColor = arrayListOf(CONSTANT, col, col1, col1)
            postFontFamily = 600
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//      util.sendPostToStringFirestore(post)
    }

    fun loadPost205() {
        val post = Post()
        with(post) {
            postNum = 205
            lineNum = 2
            imageUri =
                "https://cdn.pixabay.com/photo/2020/01/06/10/16/theravada-buddhism-4745053_1280.jpg"
            postText = arrayListOf(
                "אי עשייה גוררת  אי עשייה ,",
                "עשייה גוררת  עשייה."
            )
            textLocation = arrayListOf(10, 20, 40, -1, 0, 0, 0, 0)
            postId = 86
            postBackground = "000000"
            postTransparency = 6
            postTextSize = arrayListOf(0, 20)
            postPadding = arrayListOf(20, 0, 20, 0)
            val col = "#ffffff"
            val col1 = "#ffffff"
            postTextColor = arrayListOf(CONSTANT, col, col1, col1)
            postFontFamily = 4
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost206() {
        val post = Post()
        with(post) {
            postNum = 206
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2020/06/26/08/28/soil-5342049_1280.jpg"
            postText = arrayListOf(
                "ככל  שהחיים נעשים שבירים יותר,",
                " כך הם  מובנים יותר. "
            )
            textLocation = arrayListOf(10, -1, 40, 5, 0, 0, 0, 0)
            postId = 87
            postBackground = "101820"
            postTransparency = 8
            postTextSize = arrayListOf(0, 26)
            postPadding = arrayListOf(0, 0, 0, 0)
            val col = "#fcc729"
            val col1 = "#143d59"
            postTextColor = arrayListOf(CONSTANT, col, col1, col1)
            postFontFamily = 200
            postRadiuas = 15
            lineSpacing = 1.0f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost207() {
        val post = Post()
        with(post) {
            postNum = 207
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2020/01/14/19/09/crayon-4766037_1280.jpg"
            postText = arrayListOf(
                " האלוהים ברא את היצירה ",
                " האדם  את  הביקורת. "
            )
            textLocation = arrayListOf(10, -1, 40, 20, 0, 0, 0, 0)
            postId = 84
            postBackground = "337def"
            postTransparency = 4
            postTextSize = arrayListOf(0, 26)
            postPadding = arrayListOf(0, 0, 0, 0)
            val col = "#fcc729"
            val col1 = "#143d59"
            postTextColor = arrayListOf(CONSTANT, col, col1, col1)
            postFontFamily = 200
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost208() {
        val post = Post()
        with(post) {
            postNum = 208
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2020/05/25/17/03/travel-5219496_1280.jpg"
            postText = arrayListOf(
                "אתה בוחר מן הסתם להגיע למקומות מסוימים,",
                "אבל החיים בוחרים לך את סוג החוויה שם."
            )
            textLocation = arrayListOf(10, -1, 35, 5, 0, 30, 0, 0)
            postId = 82
            postTransparency = 3
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5, 0, 5, 5)
            postRadiuas = 15
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost209() {
        val post = Post()
        with(post) {
            postNum = 209
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2016/06/23/21/04/fool-1476189_1280.jpg"
            postText = arrayListOf(
                "זה שאתה באמת מאמין בהבלים,",
                "זה לא עושה אותם פחות הבלים."
            )
            textLocation = arrayListOf(10, -1, 30, 20, 0, 0, 0, 0)
            postId = 83
            postTextSize = arrayListOf(0, 20)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 6
            postBackground = "#030e4f"
            val textColor = "f49f1c"
            postTextColor = arrayListOf(CONSTANT, "$textColor")
            postFontFamily = 200
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost210() {
        val post = Post()
        with(post) {
            postNum = 210
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2015/08/09/19/29/people-882078_1280.jpg"
            postText = arrayListOf(
                " חכם לא עושה דברים ",
                " שטיפש סובל מהם על בסיס קבוע. "
            )
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            postId = 86
            postTextSize = arrayListOf(0, 16)
            postPadding = arrayListOf(0, 0, 0, 0)
            postTransparency = 4
            postBackground = "000000"
            val textColor = "ffffff"
            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postFontFamily = 103
            postRadiuas = 15
            lineSpacing = 1.2f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost211() {
        val post = Post()
        with(post) {
            postNum = 211
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2017/08/16/03/04/chimp-2646308_1280.jpg"
            postText = arrayListOf(
                " הטיפש בטוח בחכמתו ",
                " החכם בטוח בטיפשוטו. "
            )
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            postId = 80
            postTextSize = arrayListOf(0, 16)
            postPadding = arrayListOf(0, 0, 0, 0)
            postTransparency = 3
            postBackground = "#616247"
            val textColor = "#DAA03D"
            postTextColor = arrayListOf(CONSTANT, "$textColor")
            postFontFamily = 103
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost212() {
        val post = Post()
        with(post) {
            postNum = 212
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2018/02/21/16/59/human-3170876_1280.jpg"
            postText = arrayListOf(
                "   להיתפס כטמבל בעיני עצמך   ",
                " זה הרבה יותר גרוע מלהיות טמבל. "
            )
            textLocation = arrayListOf(10, -1, 40, 10, 0, 30, 0, 0)
            postId = 84
            postTextSize = arrayListOf(0, 18)
            postTransparency = 7
            postBackground = "#2C5F2D"
            val textColor = "#FFE77A"
            postFontFamily = 300

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(0, 5, 0, 5)
            postRadiuas = 15
            lineSpacing = 1.1f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost213() {
        val post = Post()
        with(post) {
            postNum = 213
            lineNum = 2
            imageUri =
                "https://cdn.pixabay.com/photo/2016/09/21/04/46/barley-field-1684052_1280.jpg"
            postText = arrayListOf(
                "אתה לא יכול להרוויח משהו אמיתי בחיים האלה,",
                "פרט לזכות הזאת לחיות את הרגע הזה."
            )
            textLocation = arrayListOf(10, -1, 35, 10, 0, 30, 0, 0)
            postId = 86
            postTextSize = arrayListOf(0, 16)
            postTransparency = 2
            postBackground = "000000"
            val textColor = "#ffffff"
            postFontFamily = 103

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost214() {
        val post = Post()
        with(post) {
            postNum = 214
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2020/02/19/09/34/health-4861815_1280.jpg"
            postText = arrayListOf(
                " אתה לא מספיק טוב ",
                " כדי להבין כמה טוב. "
            )
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            postId = 88
            postTextSize = arrayListOf(0, 22)
            postTransparency = 0
            postBackground = "bdfff6"
            val textColor = "ffffff"
            postFontFamily = 300

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost215() {  //I
        val post = Post()
        with(post) {
            postNum = 215
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2015/05/02/18/15/church-750251_1280.jpg"
            postText = arrayListOf(
                " הימים הנוראים לא כל כך נוראיים, ",
                " סתם יצא להם שם שכזה. "
            )
            textLocation = arrayListOf(10, -1, 30, 60, 0, 0, 0, 0)
            postId = 78
            postTextSize = arrayListOf(0, 18)
            postTransparency =0
            postBackground = "000000"
            val textColor = "ffffff"
            postFontFamily = 300

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(0, 5, 0, 0)
            postRadiuas = 15
            lineSpacing = 1.1f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost216() {
        val post = Post()
        with(post) {
            postNum = 216
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2016/08/21/18/43/smilies-1610505_1280.jpg"
            postText = arrayListOf(
                "החיים טובים",
                "למי שטוב לעצמו"
            )
            textLocation = arrayListOf(10, 20, 35, -1, 0, 0, 0, 0)
            postId = 89
            postTextSize = arrayListOf(0, 26)
            postTransparency = 0
            postBackground = "bdfff6"
            val textColor = "ffffff"
            postFontFamily = 300

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost217() {
        val post = Post()
        with(post) {
            postNum = 217
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2015/06/28/12/20/happiness-824419_1280.jpg"
            postText = arrayListOf(
                "החיים לא שווים הרבה",
                "אם לא חיים אותם."
            )
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            postId = 86
            postTextSize = arrayListOf(0, 24)
            postTransparency = 0
            postBackground = "#FDDB27"
            val textColor = "#00B1D2"
            postFontFamily = 300

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(5, 0, 5, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost218() {
        val post = Post()
        with(post) {
            postNum = 218
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2018/05/28/02/08/diary-3435095_1280.jpg"
            postText = arrayListOf(
                "מילים יכולות לפתוח לך עולמות",
                "התחכמויות סוגרות לך עולמות."
            )
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            postId = 81
            postTextSize = arrayListOf(0, 16)
            postTransparency = 10
            postBackground = "#9FC131"
            val textColor = "#eedfe2"
            postFontFamily = 103

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost219() {
        val post = Post()
        with(post) {
            postNum = 219
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2020/09/29/12/51/man-5612736_1280.jpg"
            postText = arrayListOf(
                "משתדל שלא להילחם עם החיים",
                "למרות שאני תמיד צודק."
            )
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            postId = 83
            postTextSize = arrayListOf(0, 16)
            postTransparency = 5
            postBackground = "0D47A1"
            val textColor = "ffffff"
            postFontFamily = 300

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(5, 5, 5, 5)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost220() {
        val post = Post()
        with(post) {
            postNum = 220
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2020/01/01/14/59/person-4733756_1280.jpg"
            postText = arrayListOf(
                "האדם",
                "הוא מה שהוא חושב שהוא."
            )
            textLocation = arrayListOf(10, -1, 35, 10, 0, 30, 0, 0)
            postId = 87
            postTextSize = arrayListOf(0, 22)
            postTransparency = 0
            postBackground = "0D47A1"
            val textColor = "ffffff"
            postFontFamily = 300

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15
            lineSpacing = 0.9f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost221() {
        val post = Post()
        with(post) {
            postNum = 221
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2016/11/18/19/15/animal-1836482_1280.jpg"
            postText = arrayListOf(
                "זה שהחילזון רואה את השמים",
                "זה לא עושה אותו פחות חילזון."
            )
            textLocation = arrayListOf(10, 10, 35, -1, 1, 30, 0, 0)
            postId = 83
            postTextSize = arrayListOf(0, 20)
            postTransparency = 0
            postBackground = "0D47A1"
            val textColor = "ffffff"
            postFontFamily = 300

            postTextColor = arrayListOf(CONSTANT, "#$textColor")
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15
            lineSpacing = 1.1f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost222() {
        val post = Post()
        with(post) {
            postNum = 222
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2017/05/09/16/06/windsurfing-2298647_1280.jpg"
            postText = arrayListOf(
                "אם זה נכון בשבילך",
                "כל טרחה שווה."
            )
            textLocation = arrayListOf(10, 10, 35, -1, 0, 0, 0, 0)
            postId = 85

            postTransparency = 0
            postTextSize = arrayListOf(0, 24)
            postBackground = "1E4174"
            val textColor = "ffffff"
            postFontFamily = 110

            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost223() {
        val post = Post()
        with(post) {
            postNum = 223
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2020/08/23/16/11/abstract-5511271_1280.jpg"
            postText = arrayListOf(
                "החיים זה מרחב אינסופי",
                "שבו גם אתה קורה."
            )
            textLocation = arrayListOf(10, 30, 35, -1, 0, 0, 0, 0)
            postId = 84

            postTransparency = 2
            postTextSize = arrayListOf(0, 24)
            postBackground = "1E4174"
            val textColor = "DDA94B"
            postFontFamily = 200

            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost224() {
        val post = Post()
        with(post) {
            postNum = 224
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2017/02/15/11/51/forest-2068376_1280.jpg"
            postText = arrayListOf(
                "החיים הם הרבה יותר",
                "מהסיפור שאתה מספר לעצמך עליהם."
            )
            textLocation = arrayListOf(10, -1, 35, 10, 0, 30, 0, 0)
            postId = 83

            postTransparency = 0
            postTextSize = arrayListOf(0, 24)
            postBackground = "1E4174"
            val textColor = "ffffff"
            postFontFamily = 200

            val col = "#$textColor"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 15
            lineSpacing = 0.9f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }


    fun loadPost225() {
        val post = Post()
        with(post) {
            postNum = 225
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2017/04/05/18/04/brick-2205882_1280.jpg"
            postText = arrayListOf(
                "רגשות אשמה זה המקום",
                "בו אתה לא מקבל את מה שאתה."
            )
            textLocation = arrayListOf(10, -1, 35, 10, 0, 25, 0, 0)
            postId = 81

            postTransparency = 3
            postTextSize = arrayListOf(0, 18)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 300

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5, 0, 5, 5)
            postRadiuas = 15
            lineSpacing = 1.1f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost226() {
        val post = Post()
        with(post) {
            postNum = 226
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2014/08/09/15/45/sky-414199_1280.jpg"
            postText = arrayListOf(
                "מי שאין לו קצת עננים מעליו,",
                "קרינת השמש שורפת לו את המחשבה."
            )
            textLocation = arrayListOf(10, 10, 30, -1, 0, 0, 0, 0)
            postId = 83
            postTransparency = 0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5, 0, 5, 5)
            postRadiuas = 15
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost227() {
        val post = Post()
        with(post) {
            postNum = 227
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2013/06/26/19/23/intravenous-141551_1280.jpg"
            postText = arrayListOf(
                "מעדיף תיסכולים דמיוניים של אדם בריא",
                "על תסכולים אמיתיים של אדם חולה."
            )
            textLocation = arrayListOf(10, 10, 30, -1, 1, 30, 0, 0)
            postId = 87
            postTransparency = 0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5, 5, 5, 5)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost228() {
        val post = Post()
        with(post) {
            postNum = 228
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2016/07/01/09/26/texting-1490691_1280.jpg"
            postText = arrayListOf(
                "במקום שבו כולם חרשים",
                "מי ששומע חריג."
            )
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            postId = 83
            postTransparency = 2
            postTextSize = arrayListOf(0, 22)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
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

    fun loadPost229() {
        val post = Post()
        with(post) {
            postNum = 229
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2017/03/26/15/41/girl-2175843_1280.jpg"
            postText = arrayListOf(
                "אחד המכשולים הגדולים של החיים",
                "  הוא חוסר במכשולים.  "
            )
            textLocation = arrayListOf(10, 20, 35, -1, 0, 0, 0, 0)
            postId = 86
            postTransparency = 6
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#F0EDCC"
            val textColor = "#02343F"
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

    fun loadPost230() {
        val post = Post()
        with(post) {
            postNum = 230
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2013/11/28/10/36/road-220058_1280.jpg"
            postText = arrayListOf(
                "הדרך לגיהינום",
                "רצופה בחוסר מודעות."
            )
            textLocation = arrayListOf(10, -1, 40, 10, 0, 0, 0, 0)
            postId = 85
            postTransparency = 8
            postTextSize = arrayListOf(0, 27)
            val backgroundColor = "#F0EDCC"
            val textColor = "#02343F"
            postFontFamily = 200

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

    fun loadPost231() {
        val post = Post()
        with(post) {
            postNum = 231
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2015/07/14/19/47/hand-845269_1280.jpg"
            postText = arrayListOf(
                "הדברים שאתה יוצר",
                "יוצרים אותך."
            )
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            postId = 86
            postTransparency = 0
            postTextSize = arrayListOf(0, 27)
            val backgroundColor = "#80634C"
            val textColor = "#1AAFBC"
            postFontFamily = 200

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

    fun loadPost232() {
        val post = Post()
        with(post) {
            postNum = 232
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2020/11/25/09/30/girls-5775077_1280.jpg"
            postText = arrayListOf(
                "הכישרון הכי כיפי שאני מכיר",
                "זה היכולת להינות גם מקלישאות."
            )
            textLocation = arrayListOf(10, -1, 30, 10, 0, 30, 0, 0)
            postId = 85
            postTransparency = 10
            postTextSize = arrayListOf(0, 22)
            val backgroundColor = "#EEA47F"
            val textColor = "#00539C"
            postFontFamily = 200

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5, 0, 5, 5)
            postRadiuas = 15
            lineSpacing = 0.9f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost233() {
        val post = Post()
        with(post) {
            postNum = 233
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2016/11/23/17/31/boy-1853960_1280.jpg"
            postText = arrayListOf(
                "מה שאתה עושה מהחיים",
                "זה מה שהם בשבילך."
            )
            textLocation = arrayListOf(10, 10, 35, -1, 0, 0, 0, 0)
            postId = 83
            postTransparency = 7
            postTextSize = arrayListOf(0, 25)
            val backgroundColor = "#EEA47F"
            val textColor = "#00539C"
            postFontFamily = 200

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

    fun loadPost234() {
        val post = Post()
        with(post) {
            postNum = 234
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2020/10/14/22/32/buildings-5655593_1280.jpg"
            postText = arrayListOf(
                "הבעיה המרכזית של בני האדם",
                "היא בהיותם בני אדם."
            )
            textLocation = arrayListOf(10, 10, 35, -1, 0, 0, 0, 0)
            postId = 81
            postTransparency = 8
            postTextSize = arrayListOf(0, 23)
            val backgroundColor = "#EEA47F"
            val textColor = "#00539C"
            postFontFamily = 110

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

    fun loadPost235() {
        val post = Post()
        with(post) {
            postNum = 235
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2017/10/09/02/06/hands-2832239_1280.jpg"
            postText = arrayListOf(
                "שתיצור בחיים",
                "יותר מאשר החיים יצרו אותך."
            )
            textLocation = arrayListOf(10, -1, 45, 10, 0, 0, 0, 0)
            postId = 83
            postTransparency = 7
            postTextSize = arrayListOf(0, 23)
            val backgroundColor = "#ADEFD1"
            val textColor = "#00203F"
            postFontFamily = 100

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

    fun loadPost236() {
        val post = Post()
        with(post) {
            postNum = 236
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2019/12/05/20/55/woman-4676131_1280.jpg"
            postText = arrayListOf(
                "אתה לא צריך להיות טיפש",
                "כדי לדבר בטיפשות."
            )
            textLocation = arrayListOf(10, 10, 40, -1, 0, 0, 0, 0)
            postId = 86
            postTransparency = 0
            postTextSize = arrayListOf(0, 23)
            val backgroundColor = "#815854"
            val textColor = "#F9EBDE"
            postFontFamily = 100

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

    fun loadPost237() {
        val post = Post()
        with(post) {
            postNum = 237
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2020/04/07/04/17/desperate-5011953_1280.jpg"
            postText = arrayListOf(
                "אל תעסוק הרבה במחשבות שלך",
                "הם מסתדרות יפה מאוד גם בלעדיך."
            )
            textLocation = arrayListOf(10, 10, 35, -1, 0, 0, 0, 0)
            postId = 83
            postTransparency = 10
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#F0EDCC"
            val textColor = "#02343F"
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

    fun loadPost238() {
        val post = Post()
        with(post) {
            postNum = 238
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2017/11/27/07/02/time-2980690_1280.jpg"
            postText = arrayListOf(
                "  זמן פנוי יכול להיות הרסני  ",
                "  למי שיש לו רק זמן פנוי.  "
            )
            textLocation = arrayListOf(10, 10, 35, -1, 0, 0, 0, 0)
            postId = 83
            postTransparency = 8
            postTextSize = arrayListOf(0, 23)
            val backgroundColor = "#F0EDCC"
            val textColor = "#02343F"
            postFontFamily = 110

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

    fun loadPost239() {
        val post = Post()
        with(post) {
            postNum = 239
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2012/02/22/20/07/book-15584_1280.jpg"
            postText = arrayListOf(
                " החיים זה דבר משעמם ",
                "  לאנשים שלא מבינים בזה.  "
            )
            textLocation = arrayListOf(10, -1, 40, 10, 0, 0, 0, 0)
            postId = 86
            postTransparency = 10
            postTextSize = arrayListOf(0, 23)
            val backgroundColor = "#F0EDCC"
            val textColor = "#02343F"
            postFontFamily = 100

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

    fun loadPost240() {    //I
        val post = Post()
        with(post) {
            postNum = 240
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2016/01/26/09/09/merry-1162081_1280.jpg"
            postText = arrayListOf(
                " גם מחצי כוס ריקה ",
                "  אפשר לשתות לרוויה.  "
            )
            textLocation = arrayListOf(10, 100, 35, -1, 0, 0, 0, 0)
            postId = 86
            postTransparency = 10
            postTextSize = arrayListOf(0, 26)
            val backgroundColor = "#343148"
            val textColor = "#D7C49E"
            postFontFamily = 110

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 5, 10, 5)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost241() {
        val post = Post()
        with(post) {
            postNum = 241
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2019/03/17/12/57/phone-4060860_1280.jpg"
            postText = arrayListOf(
                " אתה לא יכול לשחק משחק ",
                "  שאתה מתנכר לכללים שלו.  "
            )
            textLocation = arrayListOf(10, -1, 40, 10, 0, 0, 0, 0)
            postId = 80
            postTransparency = 6
            postTextSize = arrayListOf(0, 22)
            val backgroundColor = "#343148"
            val textColor = "#D7C49E"
            postFontFamily = 100

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//    util.sendPostToStringFirestore(post)
    }

    fun loadPost242() {
        val post = Post()
        with(post) {
            postNum = 242
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2017/07/31/08/12/dogs-2556820_1280.jpg"
            postText = arrayListOf(
                " וויכוחים פוליטיים ",
                "  היא הרכילות של אנשים רציניים.  "
            )
            textLocation = arrayListOf(10, 5, 40, -1, 0, 0, 0, 0)
            postId = 86
            postTransparency = 3
            postTextSize = arrayListOf(0, 22)
            val backgroundColor = "#343148"
            val textColor = "#D7C49E"
            postFontFamily = 100

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

    fun loadPost243() {
        val post = Post()
        with(post) {
            postNum = 243
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2016/11/29/05/32/rooster-1867562_1280.jpg"
            postText = arrayListOf(
                " כל מה שאתה חושב על העולם, ",
                "  זה רק מה שאתה חושב על העולם.  "
            )
            textLocation = arrayListOf(10, -1, 35, -1, 0, 35, 0, 0)
            postId = 86
            postTransparency = 3
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 5)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost244() {
        val post = Post()
        with(post) {
            postNum = 244
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2016/11/18/16/16/teddy-bear-1835598_1280.jpg"
            postText = arrayListOf(
                " שתתבאס פחות על דברים ",
                " שאתה בכלל לא צריך להתבאס מהם. "
            )
            textLocation = arrayListOf(10, 5, 35, -1, 0, 0, 0, 0)
            postId = 86
            postTransparency = 0
            postTextSize = arrayListOf(0, 18)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 101

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

    fun loadPost245() {
        val post = Post()
        with(post) {
            postNum = 245
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2021/08/20/17/16/dna-6560897_1280.jpg"
            postText = arrayListOf(
                " האדם הוא מוטציה ",
                " של יצור הגיוני.  "
            )
            textLocation = arrayListOf(10, -1, 40, -1, 0, 0, 0, 0)
            postId = 86
            postTransparency = 0
            postTextSize = arrayListOf(0, 22)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 101

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 5, 0, 5)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//    util.sendPostToStringFirestore(post)
    }

    fun loadPost246() {
        val post = Post()
        with(post) {
            postNum = 246
            lineNum = 2
            imageUri =
                "https://cdn.pixabay.com/photo/2014/09/21/17/56/mountaineering-455338_1280.jpg"
            postText = arrayListOf(
                " למציאות פרשנויות רבות ",
                " לאגו פרשנות אחת.  "
            )
            textLocation = arrayListOf(10, 5, 35, -1, 0, 0, 0, 0)
            postId = 86
            postTransparency = 4
            postTextSize = arrayListOf(0, 18)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 101

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

    fun loadPost247() {
        val post = Post()
        with(post) {
            postNum = 247
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2016/04/14/11/01/jerusalem-1328645_1280.jpg"
            postText = arrayListOf(
                " הציונות בת יותר ממאה שנים ",
                " והיא באמת נראית ככה.  "
            )
            textLocation = arrayListOf(10, 5, 35, -1, 0, 0, 0, 0)
            postId = 75
            postTransparency = 7
            postTextSize = arrayListOf(0, 22)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 110

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 5)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost248() {
        val post = Post()
        with(post) {
            postNum = 248
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2012/12/19/18/13/waiting-71011_1280.jpg"
            postText = arrayListOf(
                " יום חדש הוא כמו יום האתמול ",
                " אם אתה נשאר מה שהיית אתמול.  "
            )
            textLocation = arrayListOf(10, -1, 35, 20, 0, 30, 0, 0)
            postId = 84
            postTransparency = 4
            postTextSize = arrayListOf(0, 18)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 101

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 5, 0, 0)
            postRadiuas = 15
            lineSpacing = 1.2f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost249() {
        val post = Post()
        with(post) {
            postNum = 249
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2014/12/15/13/40/smartphone-569076_1280.jpg"
            postText = arrayListOf(
                " מי שלא רץ אחרי סיפורים ",
                " לא נפגע מבדותות.  "
            )
            textLocation = arrayListOf(10, 5, 35, -1, 0, 0, 0, 0)
            postId = 82
            postTransparency = 3
            postTextSize = arrayListOf(0, 18)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 101

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

    fun loadPost250() {
        val post = Post()
        with(post) {
            postNum = 250
            lineNum = 2
            imageUri =
                "https://cdn.pixabay.com/photo/2016/07/01/09/26/mobile-phones-1490691_1280.jpg"
            postText = arrayListOf(
                " שאתה מתייחס להבלים ",
                " אתה עוסק בהבלים. "
            )
            textLocation = arrayListOf(10, 5, 35, -1, 0, 0, 0, 0)
            postId = 85
            postTransparency = 0
            postTextSize = arrayListOf(0, 18)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 101

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

    fun loadPost251() {
        val post = Post()
        with(post) {
            postNum = 251
            lineNum = 2
            imageUri =
                "https://cdn.pixabay.com/photo/2017/01/12/17/30/warm-and-cozy-1975215_1280.jpg"
            postText = arrayListOf(
                " הנוחות לאורך זמן ",
                " הופכת ללא נוחה. "
            )
            textLocation = arrayListOf(10, 5, 55, -1, 0, 0, 0, 0)
            postId = 76
            postTransparency = 8
            postTextSize = arrayListOf(0, 25)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 100

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5, 5, 5, 5)
            postRadiuas = 15
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost252() {
        val post = Post()
        with(post) {
            postNum = 252
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2017/11/19/07/30/girl-2961959_1280.jpg"
            postText = arrayListOf(
                " שמור אותי מעוגמות הנפש שלי, ",
                " עם החיים עצמם אסתדר כבר בעצמי. "
            )
            textLocation = arrayListOf(10, -1, 35, 10, 0, 30, 0, 0)
            postId = 86
            postTransparency = 80
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 5)
            postRadiuas = 15
            lineSpacing = 1.4f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost253() {
        val post = Post()
        with(post) {
            postNum = 253
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2018/02/16/14/38/portrait-3157821_1280.jpg"
            postText = arrayListOf(
                " אתה לא תמיד הכי מוצלח ",
                " אבל אתה תמיד הכי אתה. "
            )
            textLocation = arrayListOf(10, -1, 35, 20, 0, 0, 0, 0)
            postId = 86
            postTransparency = 0
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15
            lineSpacing = 0.9f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost254() {
        val post = Post()
        with(post) {
            postNum = 254
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2014/02/24/14/51/lonely-273629_1280.jpg"
            postText = arrayListOf(
                " השמים הגבוהים לא שימושיים ",
                " למי שחי בתוך המחשבות שלו. "
            )
            textLocation = arrayListOf(10, -1, 40, 20, 0, 0, 0, 0)
            postId = 86
            postTransparency = 0
            postTextSize = arrayListOf(0, 22)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 100

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15
            lineSpacing = 0.9f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost255() {
        val post = Post()
        with(post) {
            postNum = 255
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2014/03/22/22/17/phone-292994_1280.jpg"
            postText = arrayListOf(
                " הלבד ",
                " זה הביחד החדש. "
            )
            textLocation = arrayListOf(10, 5, 45, -1, 0, 0, 0, 0)
            postId = 76
            postTransparency = 5
            postTextSize = arrayListOf(0, 24)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 100

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15
            lineSpacing = 0.9f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost256() {
        val post = Post()
        with(post) {
            postNum = 256
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2016/09/27/02/11/cemetery-1697469_1280.jpg"
            postText = arrayListOf(
                " שאתה נוכח בשקט",
                " אתה יוצר שקט בך. "
            )
            textLocation = arrayListOf(10, 5, 45, -1, 0, 0, 0, 0)
            postId = 86
            postTransparency = 4
            postTextSize = arrayListOf(0, 24)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 100

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(5, 0, 5, 0)
            postRadiuas = 15
            lineSpacing = 0.9f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost257() {
        val post = Post()
        with(post) {
            postNum = 257
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2016/09/19/20/49/baby-1681181_1280.jpg"
            postText = arrayListOf(
                " אם תצליח לוותר על שניתן לוותר ",
                " תוכל להתחיל מנקודת ההתחלה. "
            )
            textLocation = arrayListOf(10, 20, 45, -1, 0, 0, 0, 0)
            postId = 86
            postTransparency = 4
            postTextSize = arrayListOf(0, 22)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 100

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 5, 0, 0)
            postRadiuas = 15
            lineSpacing = 0.9f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost258() {  //I
        val post = Post()
        with(post) {
            postNum = 258
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2020/06/18/18/48/highway-5314645_1280.jpg"
            postText = arrayListOf(
                "    אין חופש אמיתי     ",
                "   ללא חרדה מהבלתי ידוע.   "
            )
            textLocation = arrayListOf(10, -1, 35, 40, 0, 0, 0, 0)
            postId = 86
            postTransparency = 10
            postTextSize = arrayListOf(0, 18)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 100

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 5, 10, 0)
            postRadiuas = 15
            lineSpacing = 0.9f
        }
        drawPost.drawPostFire(post, layout)
//    util.sendPostToStringFirestore(post)
    }

    fun loadPost259() {
        val post = Post()
        with(post) {
            postNum = 259
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2015/01/16/22/55/road-601871_1280.jpg"
            postText = arrayListOf(
                " הגוף חי בעולם הזה ",
                "  הנשמה קובעת איך. "
            )
            textLocation = arrayListOf(10, 20, 45, -1, 0, 0, 0, 0)
            postId = 86
            postTransparency = 0
            postTextSize = arrayListOf(0, 20)
            val backgroundColor = "#ACC7B4"
            val textColor = "#ffffff"
            postFontFamily = 103

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 5, 0, 5)
            postRadiuas = 15
            lineSpacing = 0.9f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost260() {
        val post = Post()
        with(post) {
            postNum = 260
            lineNum = 2
            imageUri =
                "https://cdn.pixabay.com/photo/2018/11/05/14/29/trees-sunrise-3796183_1280.jpg"
            postText = arrayListOf(
                " מי שמסתייג מהצל שלו ",
                "  שלא יצא לשמש. "
            )
            textLocation = arrayListOf(10, 20, 45, -1, 0, 0, 0, 0)
            postId = 86
            postTransparency = 9
            postTextSize = arrayListOf(0, 20)
            val backgroundColor = "#ff9967"
            val textColor = "#558600"
            postFontFamily = 103

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15
            lineSpacing = 0.9f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost261() {
        val post = Post()
        with(post) {
            postNum = 261
            lineNum = 2
            imageUri =
                "https://cdn.pixabay.com/photo/2018/02/11/21/39/weightlifter-3146825_1280.jpg"
            postText = arrayListOf(
                " אל תהיה מטומטם ",
                "  כדי שלא תרגיש מטומטם. "
            )
            textLocation = arrayListOf(10, 20, 45, -1, 0, 0, 0, 0)
            postId = 83
            postTransparency = 6
            postTextSize = arrayListOf(0, 20)
            val backgroundColor = "#A4193D"
            val textColor = "#FFDFB9"
            postFontFamily = 103

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15
            lineSpacing = 0.9f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost262() {
        val post = Post()
        with(post) {
            postNum = 262
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2018/01/26/18/40/baby-3109433_1280.jpg"
            postText = arrayListOf(
                " אם אתה לא מתחדש ",
                "  אתה מתיישן. "
            )
            textLocation = arrayListOf(10, 20, 45, -1, 0, 0, 0, 0)
            postId = 85
            postTransparency = 0
            postTextSize = arrayListOf(0, 20)
            val backgroundColor = "#A4193D"
            val textColor = "#FFDFB9"
            postFontFamily = 103

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15
            lineSpacing = 0.9f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost263() {
        val post = Post()
        with(post) {
            postNum = 263
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2016/02/13/16/14/water-1198130_1280.jpg"
            postText = arrayListOf(
                " אל תתבאס מהמקומות הלא נחמדים  ",
                "  אפשר ששם מונחת בשבילך התשובה. "
            )

            postId = 86
            textLocation = arrayListOf(10, 20, 60, -1, 0, 0, 0, 0)
            postTransparency = 6
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "000000"
            val textColor = "#ffffff"
            postFontFamily = 103

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 15
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost264() {
        val post = Post()
        with(post) {
            postNum = 264
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2014/10/16/20/00/woman-491623_1280.jpg"
            postText = arrayListOf(
                " אם החלומות שלך מזדקנים איתך,  ",
                "  סימן שלא בחרת את החלומות הנכונים. "
            )
            postId = 86
            textLocation = arrayListOf(10, -1, 35, 10, 0, 35, 0, 0)
            postTransparency = 3
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "ffffff"
            val textColor = "#000000"
            postFontFamily = 103

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 5)
            postRadiuas = 15
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
    }

    fun loadPost265() {
        val post = Post()
        with(post) {
            postNum = 265
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2016/04/27/16/30/pretty-1357039_1280.jpg"
            postText = arrayListOf(
                "מי שלא יודע להניח לדברים",
                "הדברים לא מניחים לו."
            )
            postId = 86
            textLocation = arrayListOf(10, -1, 35, 20, 0, 0, 0, 0)
            postTransparency = 3
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "000000"
            val textColor = "#ffffff"
            postFontFamily = 103

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 5)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        // pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post, layout)
//        util.sendPostToStringFirestore(post)
    }

    fun loadPost266() {
        val post = Post()
        with(post) {
            postNum = 266
            lineNum = 2
            imageUri =
                "https://cdn.pixabay.com/photo/2013/08/24/08/35/mountain-bike-175216_1280.jpg"
            postText = arrayListOf(
                "בעולם ללא ירידות",
                "אין עליות."
            )
            postId = 83
            textLocation = arrayListOf(10, -1, 35, 20, 0, 0, 0, 0)
            postTransparency = 5
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "000000"
            val textColor = "#ffffff"
            postFontFamily = 103

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost267() {
        val post = Post()
        with(post) {
            postNum = 267
            postId = 89
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2017/02/20/18/03/cat-2083492_1280.jpg"
            postText = arrayListOf(
                "העולם נראה לך כזה",
                "בגלל שאתה כזה."
            )

            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            postTransparency = 5
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "000000"
            val textColor = "#ffffff"
            postFontFamily = 103

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost268() {
        val post = Post()
        with(post) {
            postNum = 268
            postId = 89
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2020/03/21/19/27/sea-4955005_1280.jpg"
            postText = arrayListOf(
                "כל קסם הופך לשיגרה",
                "אם הוא קורה על בסיס יומי."
            )

            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            postTransparency = 2
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "000000"
            val textColor = "#ffffff"
            postFontFamily = 103

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost269() {
        val post = Post()
        with(post) {
            postNum = 269
            postId = 88
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2016/11/23/18/06/dog-1854119_1280.jpg"
            postText = arrayListOf(
                "אדם החושב כמו כלב",
                "חי כמו כלב."
            )
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            postTransparency = 2
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "000000"
            val textColor = "#ffffff"
            postFontFamily = 103

            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(10, 0, 10, 0)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost270() {
        val post = Post()
        with(post) {
            postNum = 270
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2015/10/10/19/57/elderly-981400_1280.jpg"
            postText = arrayListOf(
                "כמה שמסביבך הכל יותר בסדר",
                "כך אתה יותר בסדר."
            )
            postId = 84
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            postPadding = arrayListOf(5, 0, 5, 0)
            postTransparency = 4
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

    fun loadPost271() {
        val post = Post()
        with(post) {
            postNum = 271
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2018/11/17/22/15/trees-3822149_1280.jpg"
            postText = arrayListOf(
                "לא כל הנוצץ זהב",
                "ולא כל זהב נוצץ."
            )
            postId = 88
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            postPadding = arrayListOf(5, 0, 5, 0)
            postTransparency = 4
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

    fun loadPost272() {
        val post = Post()
        with(post) {
            postNum = 272
            postId = 89
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2017/02/22/07/30/burning-log-2088631_1280.jpg"
            postText = arrayListOf(
                "אי אפשר להתחמם",
                "מצילומי אח בוערת."
            )
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            postPadding = arrayListOf(5, 0, 5, 0)
            postTransparency = 4
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

    fun loadPost273() {
        val post = Post()
        with(post) {
            postNum = 273
            postId = 86
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2016/08/13/19/23/rome-1591429_1280.jpg"
            postText = arrayListOf(
                "שמור אותי מהצודקים",
                "עם הטועים אני כבר אסתדר."
            )
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            postPadding = arrayListOf(5, 0, 5, 0)
            postTransparency = 6
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            videoUrl="LHcP4MWABGY"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost274() {
        val post = Post()
        with(post) {
            postNum = 274
            postId = 86
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2019/03/27/22/32/mood-4086055_1280.jpg"
            postText = arrayListOf(
                "אין הרבה חכמים גדולים בחיים האלה",
                "בעיקר בסוף הלילה."
            )
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            postPadding = arrayListOf(5, 0, 5, 0)
            postTransparency = 6
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

    fun loadPost275() {
        val post = Post()
        with(post) {
            postNum = 275
            postId = 86
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2016/05/01/21/20/earth-1365995_1280.jpg"
            postText = arrayListOf(
                "אם אתה רוצה לשנות את העולם",
                "זה סימן שלא הבנת אותו מי יודע מה."
            )
            textLocation = arrayListOf(10, 10, 35, -1, 0, 0, 0, 0)
            postPadding = arrayListOf(5, 0, 5, 0)
            postTransparency =2
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

    fun loadPost276() {
        val post = Post()
        with(post) {
            postNum = 276
            postId = 82
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2022/07/15/19/28/solitaire-7323878_1280.jpg"
            postText = arrayListOf(
                "פוליטיקה זו ארץ גזרה",
                "שאתה הולך אליה מרצון."
            )
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            postPadding = arrayListOf(5, 0, 5, 0)
            postTransparency = 6
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

    fun loadPost277() {
        val post = Post()
        with(post) {
            postNum = 277
            postId = 87
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2020/05/02/20/10/lonely-5122894_1280.jpg"
            postText = arrayListOf(
                "אנשים נוטים לבזבז את החיים שלהם",
                "במחשבות על החיים שלהם."
            )
            textLocation = arrayListOf(10, 10, 30, -1, 0, 0, 0, 0)
            postPadding = arrayListOf(5, 0, 5, 0)
            postTransparency = 2
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

    fun loadPost278() {
        val post = Post()
        with(post) {
            postNum = 278
            postId = 88 
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2018/05/02/09/45/human-3368111_1280.jpg"
            postText = arrayListOf(
                "נראה, שכדי להישאר בגן עדן",
                "כדאי לך להימנע מעץ הדעת."
            )
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 6
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

    fun loadPost279() {
        val post = Post()
        with(post) {
            postNum = 279
            postId = 84
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2020/07/10/20/18/goats-5392037_960_720.jpg"
            postText = arrayListOf(
                "כולם יכולים להשתתף בוויכוח פוליטי",
                "רק מעטים יכולים להמנע מכך."
            )
            textLocation = arrayListOf(10, -1, 30, 10, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 6
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

    fun loadPost280() {
        val post = Post()
        with(post) {
            postNum = 280
            postId = 89
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2017/02/20/18/03/cat-2083492_960_720.jpg"
            postText = arrayListOf(
                "שתבין כאלוהים",
                "את חיית השדה שבך ."
            )
            textLocation = arrayListOf(10, 5, 35, -1, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 6
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

    fun loadPost281() {
        val post = Post()
        with(post) {
            postNum = 281
            postId = 87
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2016/09/28/22/32/analogue-1701651_960_720.jpg"
            postText = arrayListOf(
                "מעדיף חיים עם בעיות",
                "ממוות ללא בעיות."
            )
            textLocation = arrayListOf(10, 5, 35, -1, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 6
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

    fun loadPost282() {
        val post = Post()
        with(post) {
            postNum = 282
            postId = 87
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2019/04/06/02/20/cyclist-4106536_960_720.jpg"
            postText = arrayListOf(
                "אם עשית את המיטב שלך",
                "איש לא יכול להאשים אותך בדבר."
            )
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 6
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#0A174E"
            val textColor = "#F5D042"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            videoUrl="w019MzRosmk"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost283() {
        val post = Post()
        with(post) {
            postNum = 283
            postId = 85
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2020/03/31/11/06/crowd-4987227_960_720.jpg"
            postText = arrayListOf(
                "פוליטיקה",
                "היא אלטרנטיבה לא רעה לחיים."
            )
            textLocation = arrayListOf(10, 5, 35, -1, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 6
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

    fun loadPost284() {
        val post = Post()
        with(post) {
            postNum = 284
            postId = 87
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2022/09/09/11/33/silver-wattle-7442792_960_720.jpg"
            postText = arrayListOf(
                "שתצליח לגעת בחיים",
                "לפני שהמוות יגע בך."
            )
            textLocation = arrayListOf(10, -1, 35, 5, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 10
            postTextSize = arrayListOf(0, 16)
            val backgroundColor = "#2BAE66"
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

    fun loadPost285() {  //I
        val post = Post()
        with(post) {
            postNum = 285
            postId = 89
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2013/08/29/02/48/sunset-176939_960_720.jpg"
            postText = arrayListOf(
                "הכל צפוי",
                "גם התגובה שלך."
            )
            textLocation = arrayListOf(10,160, 35, -1, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 0
            postTextSize = arrayListOf(0, 18)
            val backgroundColor = "#2BAE66"
            val textColor = "#0A174E"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost286() {
        val post = Post()
        with(post) {
            postNum = 286
            postId = 89
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2018/07/23/06/10/man-3556090_960_720.jpg"
            postText = arrayListOf(
                "על תביט לאחור",
                "אם את הולך קדימה."
            )
            textLocation = arrayListOf(10, 5, 30, -1, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 0
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

    fun loadPost287() {
        val post = Post()
        with(post) {
            postNum = 287
            postId = 89
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2020/04/26/10/35/home-5094603_960_720.jpg"
            postText = arrayListOf(
                "תהיה אופטימי",
                "תמיד יכול להיות יותר גרוע."
            )
            textLocation = arrayListOf(10, 5, 30, -1, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 0
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

    fun loadPost288() {
        val post = Post()
        with(post) {
            postNum = 288
            postId = 87
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2022/09/02/14/38/mountains-7427724_960_720.jpg"
            postText = arrayListOf(
                "השקט כבר נמצא פה",
                "אתה רק צריך להביא את עצמך אליו."
            )
            textLocation = arrayListOf(10, -1, 30, 5, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 3
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

    fun loadPost289() {
        val post = Post()
        with(post) {
            postNum = 289
            postId = 87
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2015/07/14/06/04/old-844207_960_720.jpg"
            postText = arrayListOf(
                "שתהיה לך חוצפה להיות אתה",
                "גם במקומות שמקדשים את העדר."
            )
            textLocation = arrayListOf(10, -1, 30, 5, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 6
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

    fun loadPost290() {
        val post = Post()
        with(post) {
            postNum = 290
            postId = 88
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2016/07/29/06/08/man-1550501_960_720.jpg"
            postText = arrayListOf(
                "בתחושה הזו, שאין לך כלום",
                "העשיר והעני נמצאים על אותו קו."
            )
            textLocation = arrayListOf(10, -1, 30, 5, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 6
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

fun loadPost291() { //I
    val post = Post()
    with(post) {
        postNum = 291
        postId = 88
        lineNum = 2
        imageUri = "https://cdn.pixabay.com/photo/2017/03/27/16/50/beach-2179624_960_720.jpg"
        postText = arrayListOf(
            "כמה שהאופק שלך יותר רחוק",
            "ככה נכנס בך יותר עולם."
        )
        textLocation = arrayListOf(10, -1, 30, 5, 0, 0, 0, 0)
        postPadding = arrayListOf(10, 0, 10, 0)
        postTransparency = 6
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

    fun loadPost292() { //I
        val post = Post()
        with(post) {
            postNum = 292
            postId = 87
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2016/09/18/14/21/swimmer-1678307_960_720.jpg"
            postText = arrayListOf(
                "את החלומות רצוי שתשמור באיזור החלומות,",
                " במציאות הם יכולים לגרום לך ברדק רציני."
            )
            textLocation = arrayListOf(10, -1, 30, 40, 0,30, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 5)
            postTransparency = 6
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

    fun loadPost293() {  //I
        val post = Post()
        with(post) {
            postNum = 293
            postId = 87
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2016/11/22/19/25/man-1850181_960_720.jpg"
            postText = arrayListOf(
                "אני רק בן אדם",
                " ואין לי הרבה מה לעשות בנושא זה."
            )
            textLocation = arrayListOf(10, 110, 30, -1, 0,0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 5)
            postTransparency = 6
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

    fun loadPost294() {   //I
        val post = Post()
        with(post) {
            postNum = 294
            postId = 87
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2017/02/04/23/02/candle-2038736_960_720.jpg"
            postText = arrayListOf(
                " להביא חושך בחשכה כל אחד יכול ",
                " להביא אור בחשכה זה קצת יותר ייחודי."
            )
            textLocation = arrayListOf(10, -1, 30, 170, 0,30, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 5)
            postTransparency = 6
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

    fun loadPost295() {   //I
        val post = Post()
        with(post) {
            postNum = 295
            postId = 87
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2017/01/12/09/39/animals-1974166_960_720.jpg"
            postText = arrayListOf(
                " מה שמזעזע אותי  ",
                " זה מה שמזעזע אותי. "
            )
            textLocation = arrayListOf(10, 130, 30, -1, 0,0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 5)
            postTransparency = 0
            postTextSize = arrayListOf(0, 28)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 200
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost296() {  //I
        val post = Post()
        with(post) {
            postNum = 296
            postId = 87
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2020/09/30/14/21/man-5615889_960_720.jpg"
            postText = arrayListOf(
                " אל תהיה מוטרד  ",
                " מזה שאתה מוטרד. "
            )
            textLocation = arrayListOf(10, 370, 30, -1, 0,0, 0, 0)
            postPadding = arrayListOf(10, 5, 10, 0)
            postTransparency = 10
            postTextSize = arrayListOf(0, 25)
            val backgroundColor = "#FCF6F5"
            val textColor = "#2BAE66"
            postFontFamily = 200
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost297() {  //I
        val post = Post()
        with(post) {
            postNum = 297
            postId = 87
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2016/07/29/15/30/game-1553995_960_720.jpg"
            postText = arrayListOf(
                " כמה שאתה יותר מחובר לרשת  ",
                " ככה אתה פחות מחובר לעצמך. "
            )
            textLocation = arrayListOf(10, 350, 25, -1, 0,0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 10
            postTextSize = arrayListOf(0,14)
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

    fun loadPost298() {  //I
        val post = Post()
        with(post) {
            postNum = 298
            postId = 87
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2017/03/25/19/57/marijuana-2174302_960_720.jpg"
            postText = arrayListOf(
                " החיים זה חומר משובח  ",
                " חבל שהאדם לא יודע להשתמש בו טוב יותר. "
            )
            textLocation = arrayListOf(10, 400, 25, -1, 0,0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 6
            postTextSize = arrayListOf(0,12)
            val backgroundColor = "#2BAE66"
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

    fun loadPost299() {  //I
        val post = Post()
        with(post) {
            postNum = 299
            postId = 87
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2019/06/17/16/21/morning-light-4280353_960_720.jpg"
            postText = arrayListOf(
                " העולם לא כל כך קשה  ",
                " כמו שאתה עושה אותו קשה. "
            )
            textLocation = arrayListOf(10, 470, 28, -1, 0,0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 5
            postTextSize = arrayListOf(0,14)
            val backgroundColor = "#ffffff"
            val textColor = "#990011"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost29900() {  //I  //v
        val post = Post()
        with(post) {
            postNum = 29900
            postId = 87
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2015/09/05/07/28/writing-923882_960_720.jpg"
            postText = arrayListOf(
                " אתה הוא זה  ",
                " שעושה את הדשא של השכן ירוק יותר. "
            )
            textLocation = arrayListOf(10, -1, 32, 10, 0,30, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 5
            postTextSize = arrayListOf(0,16)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            lineSpacing=1.2f
            postTextColor = arrayListOf(CONSTANT, col)
            videoUrl="knkZ33vL-70"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost29901() {  //I  //v
        val post = Post()
        with(post) {
            postNum = 29901
            postId = 87
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2013/07/18/14/57/baby-164003_960_720.jpg"
            postText = arrayListOf(
                " אל תוציא סתם מילים  ",
                " כי אתה מה שאתה אומר. "
            )
            textLocation = arrayListOf(10, -1, 28, 20, 0,0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency = 10
            postTextSize = arrayListOf(0,14)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            videoUrl="n03g8nsaBro"

        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost29902() {  //I  //nv
        val post = Post()
        with(post) {
            postNum = 29902
            postId = 87
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2016/07/27/13/13/monk-1545250_960_720.jpg"
            postText = arrayListOf(
                " כמה שתכיר במגבלה שלך  ",
                " ככה תהיה פחות מוגבל. "
            )
            textLocation = arrayListOf(10, -1, 25, 20, 0,0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =10
            postTextSize = arrayListOf(0,14)
            val backgroundColor = "#F5D042"
            val textColor = "#0A174E"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            videoUrl="mb_cj7Mw8VM"
           videoText=util1.getVideoText(postNum)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost29903() {  //I  //nv
        val post = Post()
        with(post) {
            postNum = 29903
            postId = 87
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2015/03/01/16/52/puzzle-654956_960_720.jpg"
            postText = arrayListOf(
                " חוסר השלמות נוצרת  ",
                " מחוסר ההבנה של השלמות. "
            )
            textLocation = arrayListOf(10, -1, 35, 20, 0,0, 0, 0)
            postPadding = arrayListOf(10, 5, 10, 5)
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            val backgroundColor = "#2E3C7E"
            val textColor = "#FBEAEB"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            videoUrl="DSTLjD2DYTw"
            videoText=util1.getVideoText(postNum)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
   fun loadPost29904() {  //v
        val post = Post()
        with(post) {
            postNum = 29904
            postId = 87
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2022/09/14/14/36/window-7454482_960_720.jpg"
            postText = arrayListOf(
                " מה שאתה יוצר  ",
                " יוצר אותך. "
            )
            textLocation = arrayListOf(10, -1, 30, 20, 0,0, 0, 0)
            postPadding = arrayListOf(10, 5, 10, 5)
            postTransparency =4
            postTextSize = arrayListOf(0,16)
            val backgroundColor = "#2E3C7E"
            val textColor = "#FBEAEB"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            videoUrl="EdfxwaHVnAk"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
fun loadPost29905() {  //v
    val post = Post()
    with(post) {
        postNum = 29905
        postId = 87
        lineNum = 2
        imageUri = "https://cdn.pixabay.com/photo/2017/08/21/23/55/daniel-2667386_960_720.jpg"
        postText = arrayListOf(
            "האדם מתמחה בללכת בדרכים ללא מוצא",
            " ובלקטר שלדרכים האלה אין מוצא. "
        )
        textLocation = arrayListOf(10, -1, 35, 20, 0,0, 0, 0)
        postPadding = arrayListOf(10, 5, 10, 5)
        postTransparency =8
        postTextSize = arrayListOf(0,16)
        val backgroundColor = "#2E3C7E"
        val textColor = "#FBEAEB"
        postFontFamily = 103
        postBackground = util.improveColorString(backgroundColor)
        val textcolo = util.improveColorString(textColor)
        val col = "#$textcolo"
        postTextColor = arrayListOf(CONSTANT, col)
        videoUrl="MsPC61BiJ9w"
    }
    drawPost.drawPostFire(post, layout)
    util.sendPostToStringFirestore(post)
}

    fun loadPost29906() {  //v
        val post = Post()
        with(post) {
            postNum = 29906
            postId = 87
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2015/07/18/23/26/man-850971_960_720.jpg"
            postText = arrayListOf(
                " אני לא תמיד הכי חכם בעולם ",
                " אבל אני תמיד הכי אני בעולם. "
            )
            textLocation = arrayListOf(10, -1, 35, 20, 0,0, 0, 0)
            postPadding = arrayListOf(10, 5, 10, 5)
            postTransparency =4
            postTextSize = arrayListOf(0,16)
            val backgroundColor = "#2E3C7E"
            val textColor = "#FBEAEB"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            videoUrl="FPqXQkyz6RM"
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost29907() {  //v
        val post = Post()
        with(post) {
            postNum = 29907
            postId = 87
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2022/06/13/15/33/leaf-7260246_960_720.jpg"
            postText = arrayListOf(
                " מי שחי בעולם שהטוב מובן מאליו ",
                " חי בעולם שרובו דברים מבאסים. "
            )
            textLocation = arrayListOf(10, -1, 35,10, 0,0, 0, 0)
            postPadding = arrayListOf(0, 5, 0, 5)
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            val backgroundColor = "#FCF6F5"
            val textColor = "#2BAE66"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            videoUrl="iUMQ1NjHsqY"
            videoText = util1.getPostExplanation(postNum, postText)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost29908() {  //v
        val post = Post()
        with(post) {
            postNum = 29908
            postId = 87
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2015/06/28/12/20/happiness-824419_960_720.jpg"
            postText = arrayListOf(
                " המסכנות זה מקצוע",
                " האושר זה תחביב. "
            )
            textLocation = arrayListOf(10, 20, 35,-1, 0,0, 0, 0)
            postPadding = arrayListOf(0, 5, 0, 5)
            postTransparency =0
            postTextSize = arrayListOf(0,16)
            val backgroundColor = "#FCF6F5"
            val textColor = "#2BAE66"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            videoUrl="TJJ3kIL_Erw"
            videoText = util1.getPostExplanation(postNum, postText)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost29909() {  //v
        val post = Post()
        with(post) {
            postNum = 29909
            postId = 87
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2020/06/24/17/24/ruin-5337039_960_720.jpg"
            postText = arrayListOf(
                " אין עצה כנגד הזמן ",
                " אבל יש תבונה בלהסתדר איתו. "
            )
            textLocation = arrayListOf(10, -1, 35,20, 0,0, 0, 0)
            postPadding = arrayListOf(0, 5, 0, 5)
            postTransparency =8
            postTextSize = arrayListOf(0,16)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            videoUrl="YWDAXGokSkM"
            videoText = util1.getPostExplanation(postNum, postText)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost29910() {  //v
        val post = Post()
        with(post) {
            postNum = 29910
            postId = 87
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2020/08/12/13/56/people-5482729_960_720.jpg"
            postText = arrayListOf(
                " אל תיקח את העולם הזה כל כך אישית ",
                " הוא מתנהג ככה לכולם. "
            )
            textLocation = arrayListOf(10, -1, 32,10, 0,0, 0, 0)
            postPadding = arrayListOf(0, 5, 0, 5)
            postTransparency =0
            postTextSize = arrayListOf(0,14)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            videoUrl="tH2w6Oxx0kQ"
            videoText = util1.getPostExplanation(postNum, postText)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
     fun loadPost29911() {  //v
        val post = Post()
        with(post) {
            postNum = 29911
            postId = 87
            lineNum = 2
            imageUri = "https://cdn.pixabay.com/photo/2020/02/17/20/23/create-4857731_960_720.jpg"
            postText = arrayListOf(
                " אתה יוצר את החיים ",
                " שיוצרים אותך. "
            )
            textLocation = arrayListOf(10, -1, 30,10, 0,0, 0, 0)
            postPadding = arrayListOf(0,0, 0, 0)
            postTransparency =10
            postTextSize = arrayListOf(0,16)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            videoUrl="oxHnRfhDmrk"
            videoText = util1.getPostExplanation(postNum, postText)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
}
