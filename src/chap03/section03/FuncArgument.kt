package chap03.section03.funcargs

fun main() {
//인자에 일반함수 사용해 보기
    val res1 = sum(3, 2)  // 일반 인자
    val res2 = mul(sum(3, 3), 3) // 인자에 함수를 사용

    println("res1: $res1, res2: $res2")
}

fun sum(a: Int, b: Int) = a + b

fun mul(a: Int, b: Int) = a * b