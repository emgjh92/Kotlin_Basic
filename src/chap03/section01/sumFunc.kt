package chap03.section01

fun main(){
    val result1 = sum(3, 2)
    val result2 = sum(6, 7)

    println(result1)
    println(result2)

}
fun sum(a:Int, b:Int):Int{
    var sum = a+b
    return sum
}
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
fun sum2(a:Int,b:Int):Int = a+b

fun sum3(a:Int,b:Int) = a+b

//함수 선언은 간략화 시킬 수 있다.
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
