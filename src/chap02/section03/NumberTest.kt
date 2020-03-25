package chap02.section03

fun main() {
    //스마트 캐스트 : 자료형을 알아서 배정하게 하는 것

    var test: Number = 12.2 // 12.2에 의해 test는 Float형으로 스마트 캐스트
    println("$test")

    test = 12  // Int형으로 스마트 캐스트
    println("$test")

    test = 120L // Long형으로 스마트 캐스트
    println("$test")

    test += 12.0f  // Float형으로 스마트 캐스트
    println("$test")
}