package chap02.section02

fun main(){
    var str1: String = "Hello"
    var str2 = "World"
    var str3 = "Hello"

    println("str1===str2:${str1 === str2}")
    println("str1===str3:${str1 === str3}")
/* 결과값 :
str1===str2:false
str1===str3:true
*/
}