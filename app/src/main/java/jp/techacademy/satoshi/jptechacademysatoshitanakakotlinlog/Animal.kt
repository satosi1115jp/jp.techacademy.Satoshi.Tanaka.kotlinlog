package jp.techacademy.satoshi.jptechacademysatoshitanakakotlinlog



open class Animal {
    //プロパティ
    open var name:String
    open var age:Int

    //引数付きコンストラクタ
    constructor(name:String, age: Int){
        this.name=name
        this.age=age
    }
    open fun  say(){

    }
}