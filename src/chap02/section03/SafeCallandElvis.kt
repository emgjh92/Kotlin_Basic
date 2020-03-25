package chap02.section03

fun main(){
    var str1:String? = "Hello Kotlin"
    str1 = null
    println("str1:$str1 length:${str1?.length ?: -1}")
    //세이프콜과 엘비스 연산자 활용
    //if(str1 != null) str1.length else -1 과 같은 의미의 코드

}