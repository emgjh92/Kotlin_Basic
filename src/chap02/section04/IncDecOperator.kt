package chap02.section04

fun main() {
    var num1 = 10
    var num2 = 10
    val result1 = ++num1 // num 값 증가 후 대입
    val result2 = num2++ // 먼저 num 값 대입 후 증가

    println("result1: $result1")
    println("result2: $result2")
    println("num1: $num1")
    println("num2: $num2")
/*
    result1: 11
    result2: 10
    num1: 11
    num2: 11
*/
}