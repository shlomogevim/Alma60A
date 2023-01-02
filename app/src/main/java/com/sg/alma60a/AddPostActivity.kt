package com.sg.alma60a

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.sg.alma60a.databinding.ActivityAddPostBinding

class AddPostActivity : AppCompatActivity() {
    lateinit var binding: ActivityAddPostBinding
    lateinit var post1Lines: Post1Lines
    lateinit var post2Lines: Post2Lines
    lateinit var post3Lines: Post3Lines
    lateinit var post4Lines: Post4Lines
    lateinit var post5Lines: Post5Lines
    lateinit var post6Lines: Post6Lines
    lateinit var post7Lines: Post7Lines
    lateinit var post8Lines: Post8Lines
    lateinit var post9Lines: Post9Lines
    lateinit var post10Lines: Post10Lines
    lateinit var post11Lines: Post11Lines
    lateinit var post12Lines: Post12Lines

    lateinit var articlesLines:Articles


    val util = Utility()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAddPostBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val pref = getSharedPreferences(SHARPREF_ALMA, Context.MODE_PRIVATE)
        pref.edit().putString(ARTICAL_MODE, FALSE).apply()
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()


        post1Lines = Post1Lines(this)
        post2Lines = Post2Lines(this)
        post3Lines = Post3Lines(this)
        post4Lines = Post4Lines(this)
        post5Lines = Post5Lines(this)
        post6Lines = Post6Lines(this)
        post7Lines = Post7Lines(this)
        post8Lines = Post8Lines(this)
        post9Lines = Post9Lines(this)
        post10Lines = Post10Lines(this)
        post11Lines = Post11Lines(this)
        post12Lines = Post12Lines(this)

        articlesLines=Articles(this)

   //  -------------------




  // articlesLines.loadArticles10()


//  post1Lines.loadPost100()    //nv
//  post1Lines.loadPost101() //nv
//  post1Lines.loadPost102() //nv
//  post1Lines.loadPost103() //v

//  post2Lines.loadPost29900()  //v
//  post2Lines.loadPost29901()  //v
//  post2Lines.loadPost29902()  //v
//  post2Lines.loadPost29903() //v
//  post2Lines.loadPost29904() //v
//  post2Lines.loadPost29905() //v
//  post2Lines.loadPost29906() //v
//  post2Lines.loadPost29907() //v
//  post2Lines.loadPost29908() //v
//  post2Lines.loadPost29909() //v
//  post2Lines.loadPost29910() //v

//-------

//post3Lines.loadPost3999000() //v
//post3Lines.loadPost3999001() //v
//post3Lines.loadPost3999002() //v
//post3Lines.loadPost3999003() //v
//post3Lines.loadPost3999004() //v
//post3Lines.loadPost3999005() //v
//post3Lines.loadPost3999006() //v
//post3Lines.loadPost3999007() //v
//post3Lines.loadPost3999008() //v
//post3Lines.loadPost3999009() //v
//post3Lines.loadPost3999010() //v

 //-----------

//       post4Lines.loadPost4999000()   //v
//       post4Lines.loadPost4999001()//v
//        post4Lines.loadPost4999002() //v
//        post4Lines.loadPost4999003()  //v
//        post4Lines.loadPost4999004()  //v
//        post4Lines.loadPost4999005()  //v
//        post4Lines.loadPost4999006() //v
//        post4Lines.loadPost4999007() //v
//        post4Lines.loadPost4999008() //v
//        post4Lines.loadPost4999009() //v
//        post4Lines.loadPost4999010() //v
//        post4Lines.loadPost4999011() //v
//        post4Lines.loadPost4999012()
//        post4Lines.loadPost4999013()
//        post4Lines.loadPost4999014()
//       post4Lines.loadPost4999015()
//       post4Lines.loadPost4999016()
//       post4Lines.loadPost4999017()
//       post4Lines.loadPost4999018()
//       post4Lines.loadPost4999019()
//       post4Lines.loadPost4999020()
//       post4Lines.loadPost4999021() //v
//       post4Lines.loadPost4999022()  //v
//       post4Lines.loadPost4999023() //v
//       post4Lines.loadPost4999024() //v
//       post4Lines.loadPost4999025() //v
//       post4Lines.loadPost4999026()  //v
//       post4Lines.loadPost4999027()  //nv
//      post4Lines.loadPost4999028()  //nv
//      post4Lines.loadPost4999029()  //nv
//      post4Lines.loadPost4999030()  //v
//      post4Lines.loadPost4999031()  //v
//      post4Lines.loadPost4999032()  //v
//      post4Lines.loadPost4999033()  //v
//      post4Lines.loadPost4999034()  //v
//      post4Lines.loadPost4999035()  //v
//      post4Lines.loadPost4999036()  //v
//      post4Lines.loadPost4999037()  //v
//      post4Lines.loadPost4999038()  //v
//      post4Lines.loadPost4999039()  //v
//      post4Lines.loadPost4999040()  //v
//      post4Lines.loadPost4999041()  //v
//      post4Lines.loadPost4999042()  //v
//      post4Lines.loadPost4999043()  //v
//      post4Lines.loadPost4999044()  //v
//      post4Lines.loadPost4999045()  //v
//      post4Lines.loadPost4999046()  //v
//      post4Lines.loadPost4999047()  //v
//      post4Lines.loadPost4999048()  //v
//      post4Lines.loadPost4999049()  //v
//      post4Lines.loadPost4999050()  //v
//      post4Lines.loadPost4999051()  //v
//      post4Lines.loadPost4999052()  //v
//      post4Lines.loadPost4999053()  //v
//      post4Lines.loadPost4999054()  //v
//      post4Lines.loadPost4999055()  //v
//      post4Lines.loadPost4999056()  //v
//      post4Lines.loadPost4999057()  //v
//      post4Lines.loadPost4999058()  //v
//      post4Lines.loadPost4999059()  //v
//      post4Lines.loadPost4999060()  //v
//      post4Lines.loadPost4999061()  //v
//      post4Lines.loadPost4999062()  //v
//      post4Lines.loadPost4999063()  //v
//      post4Lines.loadPost4999064()  //v
//      post4Lines.loadPost4999065()  //v

// ---------

// post5Lines.loadPost5999000() //v
// post5Lines.loadPost5999001() //v
// post5Lines.loadPost5999002() //v
// post5Lines.loadPost5999003() //v
// post5Lines.loadPost5999004() //v

// ---------
//    post6Lines.loadPost600()  //v
//    post6Lines.loadPost601() //v
//    post6Lines.loadPost602() //v
//    post6Lines.loadPost603() //v
//    post6Lines.loadPost604() //v
// post6Lines.loadPost605() //v
// post6Lines.loadPost606() //v
// post6Lines.loadPost607() //v
// post6Lines.loadPost608() //v
//   post6Lines.loadPost609()  //v
// post6Lines.loadPost610()  //v
// post6Lines.loadPost611()
// post6Lines.loadPost612()
// post6Lines.loadPost613()
// post6Lines.loadPost614()
// post6Lines.loadPost615()
// post6Lines.loadPost616()
// post6Lines.loadPost617()
// post6Lines.loadPost618()
// post6Lines.loadPost619()
// post6Lines.loadPost620()
// post6Lines.loadPost621()
// post6Lines.loadPost622()
// post6Lines.loadPost623()
// post6Lines.loadPost624()
// post6Lines.loadPost625()
// post6Lines.loadPost626()
// post6Lines.loadPost627()
// post6Lines.loadPost628()
// post6Lines.loadPost629()
// post6Lines.loadPost630()
// post6Lines.loadPost631()
// post6Lines.loadPost632()
// post6Lines.loadPost633()
// post6Lines.loadPost634()
// post6Lines.loadPost635()
// post6Lines.loadPost636()
// post6Lines.loadPost637()
// post6Lines.loadPost638()
// post6Lines.loadPost639()
// post6Lines.loadPost640()
// post6Lines.loadPost641()
// post6Lines.loadPost642()
// post6Lines.loadPost643()
// post6Lines.loadPost644()
// post6Lines.loadPost645() //v
// post6Lines.loadPost646() //v
// post6Lines.loadPost647() //v
// post6Lines.loadPost648() //v

//------------

//     post7Lines.loadPost700()
//     post7Lines.loadPost701()
//     post7Lines.loadPost702()
//     post7Lines.loadPost703()
//     post7Lines.loadPost704()
//     post7Lines.loadPost705()
//     post7Lines.loadPost706()
//     post7Lines.loadPost707()
//     post7Lines.loadPost708()
//     post7Lines.loadPost709()
//     post7Lines.loadPost710()  //v
//     post7Lines.loadPost711()    //v
//     post7Lines.loadPost712()     //v
//     post7Lines.loadPost713()  //v
//     post7Lines.loadPost714()   //v
//     post7Lines.loadPost715()  //v
//     post7Lines.loadPost716()  //v
//     post7Lines.loadPost717()  v
//     post7Lines.loadPost718()   //v
//     post7Lines.loadPost719()   //v

//------------

//     post8Lines.loadPost801()
//     post8Lines.loadPost802()
//     post8Lines.loadPost803()
//     post8Lines.loadPost804()
//     post8Lines.loadPost805()
//   post8Lines.loadPost806()
//     post8Lines.loadPost807()
 //    post8Lines.loadPost808()  //v
//     post8Lines.loadPost809()
//     post8Lines.loadPost810()
//     post8Lines.loadPost811()
//     post8Lines.loadPost812()
//     post8Lines.loadPost813()
//     post8Lines.loadPost814()

//------------

//       post9Lines.loadPost900()
//       post9Lines.loadPost901()  //nv
//       post9Lines.loadPost902()
//       post9Lines.loadPost903()
//       post9Lines.loadPost904()
  //---------------------------------

//      post10Lines.loadPost1000()
//      post10Lines.loadPost1001() //nv
//      post10Lines.loadPost1002()
//      post10Lines.loadPost1003()
//      post10Lines.loadPost1004()
//      post10Lines.loadPost1005()
      post10Lines.loadPost1006()

        //---------------------------------

//     post11Lines.loadPost1100()  //v

//        ----------------

//     post12Lines.loadPost1200()  //v

//  ---------

//         post2Lines.loadPost200()
//           post2Lines.loadPost201()
//        post2Lines.loadPost202()
//       post2Lines.loadPost203()
//        post2Lines.loadPost204()
//          post2Lines.loadPost205()
//        post2Lines.loadPost206()
//          post2Lines.loadPost207()
//         post2Lines.loadPost208()
//         post2Lines.loadPost209()
//       post2Lines.loadPost210()
//         post2Lines.loadPost211()
//            post2Lines.loadPost212()
//         post2Lines.loadPost213()
//         post2Lines.loadPost214()
//           post2Lines.loadPost215()
//     post2Lines.loadPost216()
//    post2Lines.loadPost217()
//          post2Lines.loadPost218()
//        post2Lines.loadPost219()
//         post2Lines.loadPost220()
//         post2Lines.loadPost221()
//        post2Lines.loadPost222()
//        post2Lines.loadPost223()
//        post2Lines.loadPost224()
// post2Lines.loadPost225()
//post2Lines.loadPost226()
//post2Lines.loadPost227()
//post2Lines.loadPost228()
//post2Lines.loadPost229()
//post2Lines.loadPost230()
//post2Lines.loadPost231()
//post2Lines.loadPost232()
//post2Lines.loadPost233()
//post2Lines.loadPost234()
//post2Lines.loadPost235()
//post2Lines.loadPost236()
//post2Lines.loadPost237()
//post2Lines.loadPost238()
//post2Lines.loadPost239()
//post2Lines.loadPost240()
//post2Lines.loadPost241()
//post2Lines.loadPost242()
//post2Lines.loadPost243()
//post2Lines.loadPost244()
//post2Lines.loadPost245()
//post2Lines.loadPost246()
//post2Lines.loadPost247()
//post2Lines.loadPost248()
//post2Lines.loadPost249()
//post2Lines.loadPost250()
//post2Lines.loadPost251()
//post2Lines.loadPost252()
//post2Lines.loadPost253()
//post2Lines.loadPost254()
//post2Lines.loadPost255()
//post2Lines.loadPost256()
//post2Lines.loadPost257()
//post2Lines.loadPost258()
//post2Lines.loadPost259()
//post2Lines.loadPost260()
//post2Lines.loadPost261()
//post2Lines.loadPost262()
//post2Lines.loadPost263()
//post2Lines.loadPost264()
//post2Lines.loadPost265()
//post2Lines.loadPost266()
//post2Lines.loadPost267()
//post2Lines.loadPost268()
//post2Lines.loadPost269()
//post2Lines.loadPost270()
//post2Lines.loadPost271()
//post2Lines.loadPost272()
//post2Lines.loadPost273() //v
//post2Lines.loadPost274()
//  post2Lines.loadPost275()
//  post2Lines.loadPost276()
//  post2Lines.loadPost277()
//  post2Lines.loadPost278()
//  post2Lines.loadPost279()
//  post2Lines.loadPost280()
//  post2Lines.loadPost281()
//  post2Lines.loadPost282()   //v
//  post2Lines.loadPost283()
//  post2Lines.loadPost284()
//  post2Lines.loadPost285()
//  post2Lines.loadPost286()
//  post2Lines.loadPost287()
//  post2Lines.loadPost288()
//  post2Lines.loadPost289()
//  post2Lines.loadPost290()
//  post2Lines.loadPost291()
//  post2Lines.loadPost292()
//  post2Lines.loadPost293()
//  post2Lines.loadPost294()
//  post2Lines.loadPost295()
//  post2Lines.loadPost296()
//  post2Lines.loadPost297()
//  post2Lines.loadPost298()
//  post2Lines.loadPost299()/

  //  post3Lines.loadPost300()
//         post3Lines.loadPost301()
//           post3Lines.loadPost302()
//        post3Lines.loadPost303()
//          post3Lines.loadPost304()
//            post3Lines.loadPost305()
//        post3Lines.loadPost306()
//          post3Lines.loadPost307()
//         post3Lines.loadPost308()
//         post3Lines.loadPost309()
//        post3Lines.loadPost310()
//         post3Lines.loadPost311()
//          post3Lines.loadPost312()
//        post3Lines.loadPost313()
//         post3Lines.loadPost314()
//         post3Lines.loadPost315()
//        post3Lines.loadPost316()
//        post3Lines.loadPost317()
//       post3Lines.loadPost318()
// post3Lines.loadPost319()
//post3Lines.loadPost320()
//post3Lines.loadPost321()
//post3Lines.loadPost322()
//post3Lines.loadPost323()
//post3Lines.loadPost324()
//post3Lines.loadPost325()
//post3Lines.loadPost326()
//post3Lines.loadPost327()
//post3Lines.loadPost328()
//post3Lines.loadPost329()
//post3Lines.loadPost330()
//post3Lines.loadPost331()
//post3Lines.loadPost332()
//post3Lines.loadPost333()
//post3Lines.loadPost334()
//post3Lines.loadPost335()
//post3Lines.loadPost336()
//post3Lines.loadPost337()
//post3Lines.loadPost338()
//post3Lines.loadPost339()
//post3Lines.loadPost340()
//post3Lines.loadPost341()
//post3Lines.loadPost342()
//post3Lines.loadPost343()
//post3Lines.loadPost344()
//post3Lines.loadPost345()
//post3Lines.loadPost346()
//post3Lines.loadPost347()
//post3Lines.loadPost348()
//post3Lines.loadPost349()
//post3Lines.loadPost350()
//post3Lines.loadPost351()
//post3Lines.loadPost352()
//post3Lines.loadPost353()
//post3Lines.loadPost354()
//post3Lines.loadPost355()
//post3Lines.loadPost356()
//post3Lines.loadPost357()
//post3Lines.loadPost358()
//post3Lines.loadPost359()
//post3Lines.loadPost360()
//post3Lines.loadPost361()
//post3Lines.loadPost362()
//post3Lines.loadPost363()
//post3Lines.loadPost364()
//post3Lines.loadPost365()
//post3Lines.loadPost366()
//post3Lines.loadPost367()
//post3Lines.loadPost368()
//post3Lines.loadPost369()
//post3Lines.loadPost370()
//post3Lines.loadPost371()
//post3Lines.loadPost372()
//post3Lines.loadPost373()
//post3Lines.loadPost374()
//post3Lines.loadPost375() //v
//post3Lines.loadPost376()
//post3Lines.loadPost377()
//post3Lines.loadPost378()
//post3Lines.loadPost379()
//        post3Lines.loadPost380()
//post3Lines.loadPost381()
//post3Lines.loadPost382()
//post3Lines.loadPost383()
//post3Lines.loadPost384()
//post3Lines.loadPost385()
//post3Lines.loadPost386()
//post3Lines.loadPost387()
//post3Lines.loadPost388()
//post3Lines.loadPost389()
//post3Lines.loadPost390()
//post3Lines.loadPost3901()  //v
//post3Lines.loadPost3902()  //v
//post3Lines.loadPost3903()     //v
//post3Lines.loadPost3904()    //v
//post3Lines.loadPost3905()  //v
//post3Lines.loadPost3906()       //v
//post3Lines.loadPost3907()  //v
//post3Lines.loadPost3908()     //v
//post3Lines.loadPost3909()     //v
//post3Lines.loadPost3910()   //v
//post3Lines.loadPost3911()  //v
//post3Lines.loadPost3912()        //v
//post3Lines.loadPost3913()   //v
//post3Lines.loadPost3914() //v
//post3Lines.loadPost3915()  //v
//post3Lines.loadPost3916() //v
//post3Lines.loadPost3917()  //v
//post3Lines.loadPost3918()
//post3Lines.loadPost3919()
//post3Lines.loadPost3920()  //v
//post3Lines.loadPost3921()  //v
//post3Lines.loadPost3922() //v
//post3Lines.loadPost3923() //v
//post3Lines.loadPost3924() //v
//post3Lines.loadPost3925()//v
//post3Lines.loadPost3926()//v
//post3Lines.loadPost3927()  //v
//post3Lines.loadPost3928()  //v
//post3Lines.loadPost3929()  //v
//post3Lines.loadPost3930()  //v
//post3Lines.loadPost3931() //v
//post3Lines.loadPost3932() //v
//post3Lines.loadPost3933() //v
//post3Lines.loadPost3934()  //v
//post3Lines.loadPost3935() //v
//post3Lines.loadPost3936() //v
//post3Lines.loadPost3937()  //v
//post3Lines.loadPost3938() //v
//post3Lines.loadPost3939()//v
//post3Lines.loadPost3940()//v
//post3Lines.loadPost3941()//v
//post3Lines.loadPost3942()//v
//post3Lines.loadPost3943()//v
//post3Lines.loadPost3944()//v
//post3Lines.loadPost3945()//v
//post3Lines.loadPost3946()//v
//post3Lines.loadPost3947()//v
//post3Lines.loadPost3948()//v
//post3Lines.loadPost3949()//v
//post3Lines.loadPost3950()//v
//post3Lines.loadPost3951() //v
//post3Lines.loadPost3952()
//post3Lines.loadPost3953()
//post3Lines.loadPost3954() //v
//post3Lines.loadPost3955() //v
//post3Lines.loadPost3956()
//post3Lines.loadPost3957()
//post3Lines.loadPost3958()
//post3Lines.loadPost3959()
//post3Lines.loadPost3960()  //nv
//post3Lines.loadPost3961()
//post3Lines.loadPost3962()
//post3Lines.loadPost3963()
//post3Lines.loadPost3964()   //v  //***** starting util1.getVideoText
//post3Lines.loadPost3965()
//post3Lines.loadPost3966()
//post3Lines.loadPost3967()   //v
//post3Lines.loadPost3968()
//post3Lines.loadPost3969()
//post3Lines.loadPost3970()
//post3Lines.loadPost3971()//v
//post3Lines.loadPost3972() //v
//post3Lines.loadPost3973() //v
//post3Lines.loadPost3974() //v
//post3Lines.loadPost3975() //v
//post3Lines.loadPost3976() //v
//post3Lines.loadPost3977() //v
//post3Lines.loadPost3978() //v
//post3Lines.loadPost3979() //v
//post3Lines.loadPost3980() //v
//post3Lines.loadPost3981() //v
//post3Lines.loadPost3982() //v
//post3Lines.loadPost3983() //v
//post3Lines.loadPost3984() //v
//post3Lines.loadPost3985() //v
//post3Lines.loadPost3986() //v
//post3Lines.loadPost3987() //v
//post3Lines.loadPost3988() //v
//post3Lines.loadPost3989() //v
//post3Lines.loadPost3990() //v
//post3Lines.loadPost3991() //v
//post3Lines.loadPost3992() //v
//post3Lines.loadPost3993() //v
//post3Lines.loadPost3994() //v
//post3Lines.loadPost3995() //v
//post3Lines.loadPost3996() //v
//post3Lines.loadPost3997() //v
//post3Lines.loadPost3998() //v
//post3Lines.loadPost3999() //v

// post4Lines.loadPost400()
//  post4Lines.loadPost401()
//    post4Lines.loadPost402()
//    post4Lines.loadPost403()
//   post4Lines.loadPost404()
//   post4Lines.loadPost405()
//     post4Lines.loadPost406()
//    post4Lines.loadPost407()
//     post4Lines.loadPost408()
//             post4Lines.loadPost409()
//             post4Lines.loadPost410()
//     post4Lines.loadPost411()
//     post4Lines.loadPost412()
//     post4Lines.loadPost413()
//     post4Lines.loadPost414()
//     post4Lines.loadPost415()
//     post4Lines.loadPost416()
//     post4Lines.loadPost417()
//   post4Lines.loadPost418()
//  post4Lines.loadPost419()
//  post4Lines.loadPost420()
//      post4Lines.loadPost421()
// post4Lines.loadPost422()
// post4Lines.loadPost423()
// post4Lines.loadPost424()
// post4Lines.loadPost425()
// post4Lines.loadPost426()
//post4Lines.loadPost427()
//post4Lines.loadPost428()
//post4Lines.loadPost429()
//post4Lines.loadPost430()
//post4Lines.loadPost431()
// post4Lines.loadPost432()
// post4Lines.loadPost433()
// post4Lines.loadPost434()
// post4Lines.loadPost435()
// post4Lines.loadPost436()
//post4Lines.loadPost437()
//  post4Lines.loadPost438()
//  post4Lines.loadPost439()
//  post4Lines.loadPost440()
//  post4Lines.loadPost441()
//  post4Lines.loadPost442()
//  post4Lines.loadPost443()
//  post4Lines.loadPost444()
//  post4Lines.loadPost445()
//  post4Lines.loadPost446()
//  post4Lines.loadPost447()
//  post4Lines.loadPost448()
//  post4Lines.loadPost449()//v
//  post4Lines.loadPost450()
// post4Lines.loadPost451()
// post4Lines.loadPost452()
// post4Lines.loadPost453()
// post4Lines.loadPost454()
// post4Lines.loadPost455()
// post4Lines.loadPost456()
// post4Lines.loadPost457()
// post4Lines.loadPost458()
// post4Lines.loadPost459()
// post4Lines.loadPost460()
// post4Lines.loadPost461()
// post4Lines.loadPost462()
// post4Lines.loadPost463()
// post4Lines.loadPost464()
// post4Lines.loadPost465()
// post4Lines.loadPost466()
// post4Lines.loadPost467()
// post4Lines.loadPost468()
// post4Lines.loadPost469()
// post4Lines.loadPost470()
// post4Lines.loadPost471()
// post4Lines.loadPost472()
// post4Lines.loadPost473()
// post4Lines.loadPost474()
// post4Lines.loadPost475()
// post4Lines.loadPost476()
// post4Lines.loadPost477()
// post4Lines.loadPost478()
// post4Lines.loadPost479()
// post4Lines.loadPost480()
// post4Lines.loadPost481()
// post4Lines.loadPost482()
// post4Lines.loadPost483()
// post4Lines.loadPost484()
// post4Lines.loadPost485()
// post4Lines.loadPost486()
// post4Lines.loadPost487()
// post4Lines.loadPost488()
// post4Lines.loadPost489()
// post4Lines.loadPost490()
//  post4Lines.loadPost4901()
// post4Lines.loadPost4902()
// post4Lines.loadPost4903()
// post4Lines.loadPost4904()
// post4Lines.loadPost4905()
// post4Lines.loadPost4906()
// post4Lines.loadPost4907()
// post4Lines.loadPost4908()
// post4Lines.loadPost4909()
// post4Lines.loadPost4910()
// post4Lines.loadPost4911()
// post4Lines.loadPost4912()
// post4Lines.loadPost4913()
// post4Lines.loadPost4914()
// post4Lines.loadPost4915()
// post4Lines.loadPost4916()
// post4Lines.loadPost4917()
// post4Lines.loadPost4918()
// post4Lines.loadPost4919()
// post4Lines.loadPost4920()
// post4Lines.loadPost4921()
// post4Lines.loadPost4922()
// post4Lines.loadPost4923()
// post4Lines.loadPost4924()
// post4Lines.loadPost4925()
// post4Lines.loadPost4926()
// post4Lines.loadPost4927()
// post4Lines.loadPost4928()
// post4Lines.loadPost4929()
// post4Lines.loadPost4930()
// post4Lines.loadPost4931()
// post4Lines.loadPost4932()
// post4Lines.loadPost4933()
// post4Lines.loadPost4934()
// post4Lines.loadPost4935()
// post4Lines.loadPost4936()
// post4Lines.loadPost4937()
// post4Lines.loadPost4938()
// post4Lines.loadPost4939()
// post4Lines.loadPost4940()
// post4Lines.loadPost4941()
// post4Lines.loadPost4942()
// post4Lines.loadPost4943()
// post4Lines.loadPost4944()
//  post4Lines.loadPost4945()
// post4Lines.loadPost4946()
// post4Lines.loadPost4947()
// post4Lines.loadPost4948()
// post4Lines.loadPost4949()
// post4Lines.loadPost4950()
// post4Lines.loadPost4951()
// post4Lines.loadPost4952()
// post4Lines.loadPost4953()
// post4Lines.loadPost4954()
// post4Lines.loadPost4955()
// post4Lines.loadPost4956()
// post4Lines.loadPost4957()
// post4Lines.loadPost4958()
// post4Lines.loadPost4959()
// post4Lines.loadPost4960()
// post4Lines.loadPost4961()
// post4Lines.loadPost4962()
// post4Lines.loadPost4963()
// post4Lines.loadPost4964()
// post4Lines.loadPost4965()
// post4Lines.loadPost4966()
// post4Lines.loadPost4967()
// post4Lines.loadPost4968()
// post4Lines.loadPost4969()
// post4Lines.loadPost4970()
// post4Lines.loadPost4971()
// post4Lines.loadPost4972()
// post4Lines.loadPost4973()
// post4Lines.loadPost4974()
// post4Lines.loadPost4975()
// post4Lines.loadPost4976()
// post4Lines.loadPost4977()
// post4Lines.loadPost4978()
// post4Lines.loadPost4979()
// post4Lines.loadPost4980()
// post4Lines.loadPost4981()
// post4Lines.loadPost4982()
// post4Lines.loadPost4983()
// post4Lines.loadPost4983()
// post4Lines.loadPost4983()
// post4Lines.loadPost4984()
// post4Lines.loadPost4985()
// post4Lines.loadPost4986()
// post4Lines.loadPost4987()
// post4Lines.loadPost4988()
// post4Lines.loadPost4989()
//        post4Lines.loadPost4990()
//        post4Lines.loadPost4991()
//        post4Lines.loadPost4992()
//        post4Lines.loadPost4993()
//        post4Lines.loadPost4994()
//        post4Lines.loadPost4995()
//        post4Lines.loadPost4996()
//        post4Lines.loadPost4997()
//        post4Lines.loadPost4998()
//        post4Lines.loadPost4999()
//         post5Lines.loadPost500()
//        post5Lines.loadPost501()
//          post5Lines.loadPost502()
//         post5Lines.loadPost503()
//         post5Lines.loadPost504()
//         post5Lines.loadPost505()
//        post5Lines.loadPost506()
//         post5Lines.loadPost507()
//         post5Lines.loadPost508()
//            post5Lines.loadPost509()
//           post5Lines.loadPost510()
//       post5Lines.loadPost511()
//       post5Lines.loadPost512()
//    post5Lines.loadPost513()
//    post5Lines.loadPost514()
//    post5Lines.loadPost515()
//   post5Lines.loadPost516()
//   post5Lines.loadPost517()
//         post5Lines.loadPost518()
//   post5Lines.loadPost519()
//   post5Lines.loadPost520()
//   post5Lines.loadPost521()
//   post5Lines.loadPost522()
//   post5Lines.loadPost523()
//   post5Lines.loadPost524()
//   post5Lines.loadPost525()
//   post5Lines.loadPost526()
//   post5Lines.loadPost527()
//   post5Lines.loadPost528()
//   post5Lines.loadPost529()
//   post5Lines.loadPost530()
//   post5Lines.loadPost531()
//   post5Lines.loadPost532()
//  post5Lines.loadPost533()
//  post5Lines.loadPost534()
//  post5Lines.loadPost535()
//  post5Lines.loadPost536()
//  post5Lines.loadPost537()
//  post5Lines.loadPost538()
//  post5Lines.loadPost539()

//  post5Lines.loadPost540()
//  post5Lines.loadPost541()
//  post5Lines.loadPost542()
//  post5Lines.loadPost543()
//  post5Lines.loadPost544()
//  post5Lines.loadPost545()
//  post5Lines.loadPost546()
//  post5Lines.loadPost547()
//  post5Lines.loadPost548()
//  post5Lines.loadPost549()
//  post5Lines.loadPost550()
//  post5Lines.loadPost551()
//  post5Lines.loadPost552()
//  post5Lines.loadPost553()
//  post5Lines.loadPost554()
//  post5Lines.loadPost555()
//  post5Lines.loadPost556()
//  post5Lines.loadPost557()
//  post5Lines.loadPost558()
//  post5Lines.loadPost559()
//  post5Lines.loadPost560()
//  post5Lines.loadPost561()
//  post5Lines.loadPost562()
//  post5Lines.loadPost563()
// post5Lines.loadPost564()
// post5Lines.loadPost565()
// post5Lines.loadPost566()
// post5Lines.loadPost567()
// post5Lines.loadPost568()
// post5Lines.loadPost569()
// post5Lines.loadPost570()
// post5Lines.loadPost571()
// post5Lines.loadPost572()
// post5Lines.loadPost573()
// post5Lines.loadPost574()
// post5Lines.loadPost575()
// post5Lines.loadPost576()
// post5Lines.loadPost577()
// post5Lines.loadPost578()
// post5Lines.loadPost579()
// post5Lines.loadPost580() //v
// post5Lines.loadPost581() //v
// post5Lines.loadPost582()//v
// post5Lines.loadPost583() //v
// post5Lines.loadPost584() //v
// post5Lines.loadPost585() //v
// post5Lines.loadPost586() //v
// post5Lines.loadPost587() //v
// post5Lines.loadPost588()  //v
// post5Lines.loadPost589()  //v
// post5Lines.loadPost590()  //v
// post5Lines.loadPost591()  //v
// post5Lines.loadPost592() //v
// post5Lines.loadPost593() //v
// post5Lines.loadPost594() //v
// post5Lines.loadPost595() //v
// post5Lines.loadPost596() //v
// post5Lines.loadPost597() //v
// post5Lines.loadPost598() //v
// post5Lines.loadPost599() //v
    }

    /*fun operateVideo(view: View) {
        val intent = Intent(this, VideoActivity1::class.java)
        // intent.putExtra(USER_EXTRA, currentUser)
        startActivity(intent)
    }*/
}
