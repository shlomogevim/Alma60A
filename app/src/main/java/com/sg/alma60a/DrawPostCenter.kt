package com.sg.alma60a

import android.app.Activity
import android.content.Context
import android.content.res.Resources
import androidx.constraintlayout.widget.ConstraintLayout
import com.sg.alma60a.DrawGeneralPost
import com.sg.alma60a.Post
import com.sg.alma60a.Utility


class DrawPostCenter(val context: Context) {

    val util = Utility()

    val draw1Line = DrawGeneralPost()
    val draw2Line = DrawGeneralPost()
    val draw3Line = DrawGeneralPost()
    val draw4Line = DrawGeneralPost()
    val draw5Line = DrawGeneralPost()
    val draw6Line = DrawGeneralPost()
    val draw7Line = DrawGeneralPost()
    val draw8Line =DrawGeneralPost()
    val draw9Line = DrawGeneralPost()
    val draw10Line = DrawGeneralPost()
    fun Int.toPx(): Int = (this * Resources.getSystem().displayMetrics.density).toInt()


    fun drawPost(post: Post, layout: ConstraintLayout) {
 //util.logi("DrawPostCenter     =========>  /n post=$post")
        when (post.lineNum) {

            1 -> draw1Line.drawPost(context, post, layout)
            2 -> draw2Line.drawPost(context, post, layout)
            3 -> draw3Line.drawPost(context, post, layout)
            4 -> draw4Line.drawPost(context, post, layout)
            5 -> draw5Line.drawPost(context, post, layout)
            6 -> draw6Line.drawPost(context, post, layout)
            7 -> draw7Line.drawPost(context, post, layout)
            8 -> draw8Line.drawPost(context, post, layout)
            9 -> draw9Line.drawPost(context, post, layout)
            10 -> draw10Line.drawPost(context, post, layout)
        }
    }
    fun drawPostFire(post: Post, layout: ConstraintLayout) {
 //    util.logi("DrawPostCenter 105     =========>       post.lineNum=${post.lineNum}")

        when (post.lineNum) {

            1 -> draw1Line.drawPostFire(context, post, layout)
            2 -> draw2Line.drawPostFire(context, post, layout)
            3 -> draw3Line.drawPostFire(context, post, layout)
            4 -> draw4Line.drawPostFire(context, post, layout)
            5 -> draw5Line.drawPostFire(context, post, layout)
            6 -> draw6Line.drawPostFire(context, post, layout)
            7 -> draw7Line.drawPostFire(context, post, layout)
            8 -> draw8Line.drawPostFire(context, post, layout)
            9 -> draw9Line.drawPostFire(context, post, layout)
            10 -> draw10Line.drawPostFire(context, post, layout)
        }
    }
}
