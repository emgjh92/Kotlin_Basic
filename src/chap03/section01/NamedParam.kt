package chap03.section01

fun main(){
    /*
    매개변수가 너무 많은 함수를 호출하다 보면 가끔 어떤 인자를 어떤 매개변수에 전달했는지
    헷갈릴 수 있다. 그래서 코틀린은 매개변수의 이름과 함께 인자를 전달하는 방법을 제공한다.
    아래의 예제는 매개변수가 3개인 namedParam() 함수를 매개변수의 이름과 함께 호출한 것이다.
     */

    namedParam(x=200, z=100) //x,z의 이름과 함께 함수 호출 (y는 기본값 사용)
    namedParam(z = 150) //z의 이름과 함께 함수 호출(x와 y는 기본 값으로 지정 됨)
    //매개변수 z는 기본값을 지정하지 않았으므로 반드시 인자를 전달해 주어야 한다.
}
fun namedParam(x:Int = 100, y:Int=200, z:Int){
    println(x + y + z)
}

/*
500
450
*/