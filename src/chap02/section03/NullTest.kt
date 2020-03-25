package chap02.section03

fun main(){
    //null처리하기
    var str1: String? = "Hello Kotlin"
    //변수에 NULL을 할당하기 위해선 자료형 뒤에 ? 을 붙여야 한다
    str1 = null
    println("str1:$str1 length:${str1?.length}")
    //세이프콜 추가 ==> 호출할 변수 이름 뒤에 ? 를 붙인다.
    //세이프콜 : null이 할당되어 있을 가능성이 있는 변수를 검사하여 안전하게 호출하도록 도와주는 기법
   // println("str1:$str1 length:${str1!!.length}") //단정기호(!!) 사용 ==> NPE 강제 발생

    val len = if(str1 !=null) str1.length else -1 //조건문을 이용해 null 을 검사
    println("str1:$str1 length: ${len}")
}