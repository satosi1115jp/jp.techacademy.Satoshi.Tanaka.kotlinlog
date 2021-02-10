package jp.techacademy.satoshi.jptechacademysatoshitanakakotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.lang.Exception
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


       /*Log.d("kotlintest","ログへの出力テスト")
        //整数型の変数をnumという名前で作成して、10を代入する。
        var num=10
        Log.d("kotlintest",Integer.toString(num))

        /*numに50を代入する
        変数や定数に.toString()と記述する方法もある
         */
        num=50
        Log.d("kotlintest",num.toString())*/

        /*
        val num1=10+5-2*4/2
        Log.d("kotlintest","10+5-2*4/2="+num1)

        val flag1=true
        val flag2=false
        Log.d("kotlintest","flag1&&flag2="+(flag1&&flag2))
        Log.d("kotlintest","flag1||flag2="+(flag1||flag2))

        val num2=10
        val num3=20
        Log.d("kotlintest","num2<num3="+(num2<num3))

        num=100
        if(num>=90){
            Log.d("kotlintest","優")
        }else if(num>=75){
            Log.d("kotlintest","良")
        }else if(num>=60){
            Log.d("kotlintest","可")
        }else{
            Log.d("kotlintest","不可")
        }

        val drink=1

        when(drink){
            0->{
                Log.d("kotlintest","コーヒーを注文しました。")
            }
            1->Log.d("kotlintest","紅茶を注文しました。")
            2->Log.d("kotlintest","ミルクを注文しました。")
            else->Log.d("kotlintest","オーダーミスです。")
        }*/
        //繰り返し処理
        for (i in 1 until 6){
            Log.d("kotlintest","for文の"+i+"回目")
        }

        var num=1//前のvar numは削除する（エラーが発生するため）
        while (num<6){
            Log.d("kotlintest","while文の"+num+"回目")
            num++
        }
        //1-3まで（3を含む）
        for (i in 1..3){
            Log.d("kotlintest","...演算子の"+i+"の回")
        }
        //6-0（２飛ばしずつ）
        for (i in 6 downTo 0 step 2){
            Log.d("kotlintest","downTo関数の"+i+"の回")
        }
        //Array<Int>型の配列が作成される
        val points= arrayOf(10,6,15,23,17)
        for (i in points){
            Log.d("kotlintest",i.toString())
        }

        //例外処理
        val numA=100
        val numB=0
        var ans=0

        try {
        ans=numA/numB
        }catch (e:Exception){
            Log.d("kotlintest","0で割ろうとしました。")
            //例外情報からメッセージを表示
            Log.d("kotlintest",e.message.toString())
        }finally {
            Log.d("kotlintest","ans="+ans.toString())
        }
        // 引数に50と1000を指定してtotal関数を呼び出す
        //total(50, 1000)　// コメントにする

        // 引数の値を変えることで処理内容を簡単に変更できる
        //total(1, 1111)　// コメントにする
        val t=total(50,1000)//totalからsumを返してもらう
        Log.d("kotlintest",t.toString())
    }
    //firstとlast２つの引数と戻り値の型(int）を指定した因数に修正
    private fun total(first:Int,last:Int):Int{
        var sum=0
        for (i in first..last){
            sum+=1
        }
        return sum
    }
}