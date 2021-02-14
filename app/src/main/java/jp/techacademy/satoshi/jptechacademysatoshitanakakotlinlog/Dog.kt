package jp.techacademy.satoshi.jptechacademysatoshitanakakotlinlog

open class Dog : Animal {
    //プロパティ
    override var name: String
    override var age: Int

    //引数付きコンストラクタ
    constructor(name: String, age: Int) : super(name, age) {
        this.name = name
        this.age = age
    }
    /* //メソッド
     open fun say(){
         Log.d("kotlintest",this.name+"("+this.age+"歳）"+"「ワンワン」")
     }*/
    //Movableインターフェイスのメソッドをオーバーライド
    /*override fun move(){
        Log.d("kotlintest",this.name+"("+this.age+"歳）"+"は全力で走った。")
    }*/
}