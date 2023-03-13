package com.sg.alma60a.model

import com.google.firebase.Timestamp

data class Article (
    var aricleNum:Int=0,

     var aricleTitle:String="",
     var aricleText:String="",
    var articleBackground:String="",
    var articleTextColor:String="",
    var aricleTextSize:Int=14,
    var articleFontFamily:Int=220,
    var timestamp: Timestamp?=null

)
