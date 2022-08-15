package com.sg.alma60a

import android.content.Context
import android.content.res.Resources
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.view.Gravity
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.content.res.ResourcesCompat
import coil.load
import coil.transform.RoundedCornersTransformation

class DrawGeneralPost() {
    val util = Utility()
    fun Int.toPx(): Int = (this * Resources.getSystem().displayMetrics.density).toInt()
    val helper = Helper1()

    var constraintSet = ConstraintSet()

    /* val pref = context.getSharedPreferences(SHARPREF_ALMA, Context.MODE_PRIVATE)
     var movingBackgroundMode = pref.getString(SHARPREF_MOVING_BACKGROUND, TRUE)*/


    fun drawPostFire(context: Context, post: Post, layout: ConstraintLayout) {

        val pref = context.getSharedPreferences(SHARPREF_ALMA, Context.MODE_PRIVATE)
        var movingBackgroundMode = pref.getString(SHARPREF_MOVING_BACKGROUND, FALSE)

//       util.logi("DrawGeneralPost 100      \n     =========>  /n post=$post")
        val textView1 = layout.findViewById<TextView>(R.id.tv1Fire)
        val textView2 = layout.findViewById<TextView>(R.id.tv2Fire)
        val textView3 = layout.findViewById<TextView>(R.id.tv3Fire)
        val textView4 = layout.findViewById<TextView>(R.id.tv4Fire)
        val textView5 = layout.findViewById<TextView>(R.id.tv5Fire)
        val textView6 = layout.findViewById<TextView>(R.id.tv6Fire)
        val textView7 = layout.findViewById<TextView>(R.id.tv7Fire)
        val textView8 = layout.findViewById<TextView>(R.id.tv8Fire)
        val textView9 = layout.findViewById<TextView>(R.id.tv9Fire)
        val textView10 = layout.findViewById<TextView>(R.id.tv10Fire)
        var textView = layout.findViewById<TextView>(R.id.tv10Fire)
        val image = layout.findViewById<ImageView>(R.id.pagerImageFire)
        val ken = layout.findViewById<com.flaviofaria.kenburnsview.KenBurnsView>(R.id.tour_image)

        textView1.text = ""
        textView2.text = ""
        textView3.text = ""
        textView4.text = ""
        textView5.text = ""
        textView6.text = ""
        textView7.text = ""
        textView8.text = ""
        textView9.text = ""
        textView10.text = ""

//        util.logi("DrawGeneralPost 58     postUri=${post.imageUri}")

        //  image.load(post.imageUri)

        if (movingBackgroundMode == TRUE) {
            ken.load(post.imageUri) {
                crossfade(true)
                crossfade(1000)
                transformations(RoundedCornersTransformation(30f))
            }
            ken.resume()
        } else {
            image.load(post.imageUri) {
                crossfade(true)
                crossfade(1000)
                transformations(RoundedCornersTransformation(30f))
            }
            ken.pause()
        }

        constraintSet.clone(layout)

        for (index in 1..post.lineNum) {
            textView = when (index) {
                1 -> textView1
                2 -> textView2
                3 -> textView3
                4 -> textView4
                5 -> textView5
                6 -> textView6
                7 -> textView7
                8 -> textView8
                9 -> textView9
                10 -> textView10
                else -> textView1
            }

            createTextView(index, textView, post, context, layout)
            locateTextView(index, textView, post)

        }

        constraintSet.applyTo(layout)


    }


    fun drawPost(context: Context, post: Post, layout: ConstraintLayout) {

        // util.logi("DrawGeneralPost 100      \n     =========>  /n post=$post")


        val textView1 = layout.findViewById<TextView>(R.id.tv1)
        val textView2 = layout.findViewById<TextView>(R.id.tv2)
        val textView3 = layout.findViewById<TextView>(R.id.tv3)
        val textView4 = layout.findViewById<TextView>(R.id.tv4)
        val textView5 = layout.findViewById<TextView>(R.id.tv5)
        val textView6 = layout.findViewById<TextView>(R.id.tv6)
        val textView7 = layout.findViewById<TextView>(R.id.tv7)
        val textView8 = layout.findViewById<TextView>(R.id.tv8)
        val textView9 = layout.findViewById<TextView>(R.id.tv9)
        val textView10 = layout.findViewById<TextView>(R.id.tv9)
        var textView = layout.findViewById<TextView>(R.id.tv9)
        val imageView = layout.findViewById<ImageView>(R.id.pagerImage)

        textView1.text = ""
        textView2.text = ""
        textView3.text = ""
        textView4.text = ""
        textView5.text = ""
        textView6.text = ""
        textView7.text = ""
        textView8.text = ""
        textView9.text = ""
        textView10.text = ""

        //  util.logi("DrawGeneralPost 101      \n     =========>  /n layout=$layout")

        //  imageView.load(post.imageUri)

        constraintSet.clone(layout)

        for (index in 1..post.lineNum) {
            textView = when (index) {
                1 -> textView1
                2 -> textView2
                3 -> textView3
                4 -> textView4
                5 -> textView5
                6 -> textView6
                7 -> textView7
                8 -> textView8
                9 -> textView9
                10 -> textView10
                else -> textView1
            }

            createTextView(index, textView, post, context, layout)
            locateTextView(index, textView, post)

        }

        constraintSet.applyTo(layout)

    }

    private fun createTextView(
        index: Int, textView: TextView, post: Post, context: Context, layout: ConstraintLayout
    ) {
//        util.logi("Draw GeneralPost 142  ${post.postTextColor.joinToString()}")

        for (index in 1..post.postTextColor.size - 1) {
            /* if (!post.postTextColor[index].contains("#")) {
                 post.postTextColor[index] = "#" + post.postTextColor[index]
             }*/
            var col = post.postTextColor[index]
//            util.logi("Draw GeneralPost 147    col=$col")
            col = col.replace("$", "")
            col = col.replace("#", "")
            col = "#$col"
            post.postTextColor[index] = col

            //  util.logi("Draw GeneralPost 152  ${post.postTextColor.joinToString()}")
        }
        val ind = index - 1
        //   val add=textView.lineHeight
        textView.setLineSpacing(1f, post.lineSpacing)


/*int lineHeight = textView.getLineHeight();
float add = tvSampleText.getLineSpacingExtra();          // API 16+
float mult = tvSampleText.getLineSpacingMultiplier(); */
        /*textView.setLineSpacing(float add, float mult)*/


        textView.text = post.postText[ind]
//  util.logi("Draw GeneralPost 149   ${post.postTextColor.joinToString()}")
        if (post.postTextColor[0] == CONSTANT) {
            textView.setTextColor(Color.parseColor(post.postTextColor[1]))
        } else {
            textView.setTextColor(Color.parseColor(post.postTextColor[1]))
        }
        if (post.postTextSize[0] == 0) {
            textView.textSize = post.postTextSize[1].toFloat()
        } else {
            textView.textSize = post.postTextSize[index].toFloat()
        }
        val tra = helper.getTransfo(post.postTransparency)
        val shape = GradientDrawable()
        shape.cornerRadius = post.postRadiuas.toPx().toFloat()
// util.logi("Draw GeneralPost 164  post.postBackground= ${post.postBackground}")

        post.postBackground = post.postBackground.replace("#", "")
        post.postBackground = post.postBackground.replace("$", "")

        shape.setColor(Color.parseColor("#$tra${post.postBackground}"))
        textView.background = shape
        val fontAddress = helper.getFamilyFont(post.postFontFamily)

        textView.typeface = ResourcesCompat.getFont(context, fontAddress)
//        util.logi("DrawGeneralPost 219   postPadding=${post.postPadding.joinToString()}")
        textView.setPadding(
            post.postPadding[0].toPx(),
            post.postPadding[1].toPx(),
            post.postPadding[2].toPx(),
            post.postPadding[3].toPx()
        )
        textView.gravity = Gravity.CENTER
    }


    private fun locateTextView(
        index: Int,
        textView: TextView,
        post: Post
    ) {
        constraintSet.clear(textView.id, ConstraintSet.TOP)
        constraintSet.clear(textView.id, ConstraintSet.BOTTOM)
        val ind = index - 1
        val num0 = post.textLocation[0]
       /* if (ind == 0) {
          util.logi("DrawGeneral 241 inside locateTextView num0=$num0   postNum=${post.postNum}     padding=${post.postPadding.joinToString()}")
        }*/
        when (num0) {
            100 -> arangeText100(index, textView, post)
           101 -> arangeText101(index, textView, post)
           102 -> arangeText102(index, textView, post)
           10 -> arangeText10(index, textView, post)
            else -> oldFation(index, textView, post)
        }
    }


    private fun arangeText10(index: Int, textView: TextView, post: Post) {

//val arr= arrayListOf(10, NO_TOP,     35,         0,             0,        300,         2,          100)
                                        //top            //dis   //bottom       //line1   //dis1   //line2      //dis2        //locate in the
                      //  10,    NO_TOP,  35,     10,                 0,        60,         1,            -30           //  bottom
                      //  10,          100,             35,  NO_BOTTOM,        0,         0,          0,              0           // top
//         post.textLocation = arrayListOf(10, -1, 35,10, 1, 30, 0,0)
//         post.textLocation = arrayListOf(10, 10, 30,-1, 3, 30, 0,0)
        val line = index - 1
        val ind1 = post.lineNum - line - 1
        var top = post.textLocation[1]
        if (top!= NO_TOP){
            top=top.toPx()
        }
        val dis = post.textLocation[2].toPx()
        var bottom = post.textLocation[3]
        if (bottom!= NO_BOTTOM){
            bottom=bottom.toPx()
        }
        val line1 = post.textLocation[4]                                   // from this line
        val dis1 =  post.textLocation[5].toPx()
        val line2 = post.textLocation[6]                                // from this line
        val dis2 =  post.textLocation[7].toPx()
        var distanceBotton =bottom + dis * ind1
        var distanceTop =top + dis * line

          if (line==0) {
//              util.logi("------------------" )
//            util.logi("DrawGeneral 280 inside  arangeText102 top=$top dis=$dis bottom=$bottom line1=$line1 dis1=$dis1  line2=$line2 dis2=$dis2" )
          }
//       util.logi("DrawGeneral 282 line=$line   ind1=$ind1  distanceTop=$distanceTop      ${textView.text}")

        if (top == NO_TOP) {                                                                            //locate in the bottom
            if (line <= line1) {
                distanceBotton += dis1
            }
            if (line <= line2) {
            //    util.logi("DrawGeneral 290 line=$line   line2=$line2 ")
                distanceBotton += dis2
            }

            constraintSet.connect(
                textView.id,
                ConstraintSet.BOTTOM,
                ConstraintSet.PARENT_ID,
                ConstraintSet.BOTTOM, distanceBotton
            )
        }

        if (bottom == NO_BOTTOM) {                                                                            //locate in the top
//            var distance = (top + (dis * line)).toPx()                                                //10, 0,              35,   NO_BOTTOM,     0,       500,         0,          0
//              util.logi("DrawGeneral 303  line=$line   line1=$line1 ")
            if (line >= line1) {
//                util.logi("DrawGeneral 305  line=$line   line1=$line1 ")
                distanceTop += dis1
            }
            if (line >=line2) {
                distanceTop += dis2
            }
            constraintSet.connect(
                textView.id,
                ConstraintSet.TOP,
                ConstraintSet.PARENT_ID,
                ConstraintSet.TOP, distanceTop
            )
        }
    }







    private fun arangeText102(index: Int, textView: TextView, post: Post) {
     post.textLocation = arrayListOf(102, 10, 35, NO_BOTTOM, 1, 500, 0, 0)
     post.textLocation = arrayListOf(102, NO_TOP, 35, 0, 0, 0, 0, 0)
                    //top     //dis        //bottom     //line1   //dis1   //line2      //dis2        //locate in the
     //  102,  NO_BOTTOM,       35,            10,               0,        60,         1,            -30           //  bottom
     //  102,          10,                  35,        NO_TOP,         0,         0,          0,              0           // top
        val line = index - 1
        val ind1 = post.lineNum - line - 1
        val top = post.textLocation[1]
        val dis = post.textLocation[2]
        val bottom = post.textLocation[3]
        val line1 = post.textLocation[4]                                   // from this line
        val dis1 = dis + post.textLocation[5]
        val line2 = post.textLocation[6]                                   // from this line
        val dis2 = dis + post.textLocation[7]

//          if (line==0) {
//              util.logi("------------------" )
//            util.logi("DrawGeneral 295 inside  arangeText102 top=$top dis=$dis bottom=$bottom line1=$line1 dis1=$dis1  line2=$line2 dis2=$dis2" )
//          }
//       util.logi("DrawGeneral 295 line=$line   ind1=$ind1  distance=$distance      ${textView.text}")

        if (top == -1) {                                                                            //locate in the bottom
            var distance = (bottom + (dis * ind1)).toPx()
            if (line <= line1) {
                distance += dis1
            }
            if (line <= line2 && line>=line1 ) {
                distance += dis2
            }
            constraintSet.connect(
                textView.id,
                ConstraintSet.BOTTOM,
                ConstraintSet.PARENT_ID,
                ConstraintSet.BOTTOM, distance
            )
        }

        if (bottom == -1) {                                                                            //locate in the top
            var distance = (top + (dis * line)).toPx()
            if (line <= line1) {
                distance += dis1
            }
            if (line <= line2 && line>=line1 ) {
                distance += dis2
            }
            constraintSet.connect(
                textView.id,
                ConstraintSet.TOP,
                ConstraintSet.PARENT_ID,
                ConstraintSet.TOP, distance
            )
        }
    }

    private fun arangeText100(index: Int, textView: TextView, post: Post) {
//    post.postPadding = arrayListOf(100, -1, 30, 0)     // locate in the buttom
//    post.postPadding = arrayListOf(100, 58, 30,-1)     // locate in the top
        val line = index - 1
        val ind1 = post.lineNum - line - 1
        val top = post.textLocation[1]
        val dis = post.textLocation[2]
        val bottom = post.textLocation[3]
        if (top == -1) {                                           // locate in the buttom
            constraintSet.connect(
                textView.id,
                ConstraintSet.BOTTOM,
                ConstraintSet.PARENT_ID,
                ConstraintSet.BOTTOM, (bottom + (dis * ind1)).toPx()
            )
        }

        if (bottom == -1) {                                    // locate in the top
            constraintSet.connect(
                textView.id,
                ConstraintSet.TOP,
                ConstraintSet.PARENT_ID,
                ConstraintSet.TOP, (top + dis * line).toPx()
            )
        }
    }

    private fun arangeText101(index: Int, textView: TextView, post: Post) {
        //top     //dis        //bottom     //line1   //dis1
//       post.textLocation = arrayListOf(101, -1,       35,            10,             3,        60)            // locate in the bottom
        //     post.textLocation = arrayListOf(101, 10,       35,            -1,            3,      60)            //locate in the top

        val line = index - 1
        val ind1 = post.lineNum - line - 1
        val top = post.textLocation[1]
        val dis = post.textLocation[2]
        val bottom = post.textLocation[3]
        val line1 = post.textLocation[4]                                   // from this line
        val dis1 = dis + post.textLocation[5]                               //
        /*   if (line == 0) {
               util.logi("DrawGeneral 299  top=$top dis=$dis bottom=$bottom line1=$line1 dis1=$dis1 ")
               util.logi("-------------------")
           }
           util.logi("DrawGeneral 295  line=$line   ind1=$ind1       ${textView.text}")*/

        if (top == -1) {                                                                            // locate in the bottom
            var distance = (bottom + (dis * ind1)).toPx()
            if (line <= line1) {
                distance += dis1
            }
            constraintSet.connect(
                textView.id,
                ConstraintSet.BOTTOM,
                ConstraintSet.PARENT_ID,
                ConstraintSet.BOTTOM, distance
            )
        }
        if (bottom == -1) {                                                                           //locate in the top
            var distance = (top + (dis * ind1)).toPx()
            if (line <= line1) {
                distance += dis1
            }
            constraintSet.connect(
                textView.id,
                ConstraintSet.TOP,
                ConstraintSet.PARENT_ID,
                ConstraintSet.TOP, distance
            )
        }
    }


    private fun oldFation(index: Int, textView: TextView, post: Post) {
        val ind = index - 1
        if (post.postMargin[ind][3] == -1) {
            constraintSet.connect(
                textView.id,
                ConstraintSet.TOP,
                ConstraintSet.PARENT_ID,
                ConstraintSet.TOP, post.postMargin[ind][1].toPx()
            )
        }
        if (post.postMargin[ind][1] == -1) {
            constraintSet.connect(
                textView.id,
                ConstraintSet.BOTTOM,
                ConstraintSet.PARENT_ID,
                ConstraintSet.BOTTOM, post.postMargin[ind][3].toPx()
            )
        }
    }

}


/*    private fun locateTextView(
        index: Int,
        textView: TextView,
        post: Post
    ) {
        constraintSet.clear(textView.id, ConstraintSet.TOP)
        constraintSet.clear(textView.id, ConstraintSet.BOTTOM)
        val ind = index - 1

        if (post.postMargin[ind][3] == -1) {
            constraintSet.connect(
                textView.id,
                ConstraintSet.TOP,
                ConstraintSet.PARENT_ID,
                ConstraintSet.TOP, post.postMargin[ind][1].toPx()
            )
        }
        if (post.postMargin[ind][1] == -1) {
            constraintSet.connect(
                textView.id,
                ConstraintSet.BOTTOM,
                ConstraintSet.PARENT_ID,
                ConstraintSet.BOTTOM, post.postMargin[ind][3].toPx()
            )
        }
    }*/