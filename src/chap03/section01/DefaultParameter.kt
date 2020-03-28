package chap03.section01

fun main(){
    val name = "홍길동"
    val email = "hong@example.kr"

    add(name)
    add(name,email)
    add("둘리","dooly@example.kr")
    defaultArgs() //100 + 200
    defaultArgs(200) //200 + 200

}

fun add(name:String, email:String = "default"){
    val output = "${name}님의 이메일은 ${email}입니다."
    println(output)
} //email의 기본값 지정

fun defaultArgs(x:Int = 100, y:Int = 200){
    println(x+y)
} //모든 매개변수의 기본값을 지정



/*
홍길동님의 이메일은 default입니다.
홍길동님의 이메일은 hong@example.kr입니다.
둘리님의 이메일은 dooly@example.kr입니다.
300
400
 */