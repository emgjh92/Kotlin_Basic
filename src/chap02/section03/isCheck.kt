package chap02.section03

fun main() {
    //is ==> 변수의 자료형을 알아내는 것
    val num = 256

    if (num is Int) { // num이 Int형 일때
        print(num)
    } else if (num !is Int) { // num이 Int형이 아닐 때, !(num is Int) 와 동일
        print("Not a Int")
    }

    //Any형을 사용하면 자료형을 결정하지 않은채로 변수를 선언 할 수 있다.
    val x: Any
    x = "Hello"
    if(x is String){
        print(x.length)
    } //자료형을 정하지 않은 Any형을 사용한 상태에서 is 를 쓰게 되면 검사한 자료형으로 스마트 캐스트 된다.
//Any ==> 코틀린의 모든 클래스는 Any형 이라는 SuperClass 를 가진다.
}