package chap03.section03

fun main() {
    //변수에 할당하는 람다식 함수 작성하기
    var result: Int
    val multi = { x: Int, y: Int -> x * y } //일반 변수에 람다식 할당
    result = multi(10, 20)//람다식이 할당된 변수는 함수처럼 사용 가능
    println(result)
}


