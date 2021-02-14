package jp.techacademy.satoshi.jptechacademysatoshitanakakotlinlog

import android.util.Log

class BigDog:Dog {

    //superで親クラスのコンストラクタを呼ぶ
    constructor(name:String,age:Int):super(name, age){

    }
    override fun say(){
        super.say()
        Log.d("kotlinstest","大きな犬です。")
    }
}
