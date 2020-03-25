package chap02.section02

fun main(){
    var a = 1
    val str1 = "a = $a"
    val str2 = "a = ${a+2}" //문자열 표현식 사용

    println("str1:\"$str1\", str2: \"$str2\"")

    //str1:"a = 1", str2: "a = 3"
    /*
    val은 value의 약어로 변경이 불가능한 변수를 말한다. 영어로는 immutable이라고 한다. 반대로
    var는 variable의 약어로 변경이 가능한 변수를 말한다. 영어로는 mutable이라고 한다.
    */
}
