package chap02.section2

//자료형에 별명 붙이기
typealias Username = String //String을 Username이라는 별명으로 대체

fun main(){
    val num = 10
    val formatedString = """
        var a = 6
        var b = "Kotlin"
        println(a + num)  //num의 값은 $num
        """
    println(formatedString)

    /*  결과값 :
        var a = 6
        var b = "Kotlin"
        println(a + num)  //num의 값은 10
     */

    //자료형에 별명 붙이기
    val user: Username = "Kildong" // 이제부터 Username은 String 과 같은 표현현

}