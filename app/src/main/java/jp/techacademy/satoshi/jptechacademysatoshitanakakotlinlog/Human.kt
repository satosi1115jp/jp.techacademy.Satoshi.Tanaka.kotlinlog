package jp.techacademy.satoshi.jptechacademysatoshitanakakotlinlog

import android.util.Log


 class Human : Animal, Thinkable {
    var hobby: String
    override var name: String
    override var age: Int

    constructor(name: String, age: Int, hobby: String) : super(name, age) {
        this.name = name
        this.age = age
        this.hobby = hobby

    }

    override fun say() {
        Log.d("kotlintest","私の名前は"+this.name+"です。"+"年は"+this.age+"歳です。")
    }

    override fun think() {
        Log.d("kotlintest", "私は" + this.hobby + "について考える")
    }


}