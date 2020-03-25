package chap02.section03

fun main(){
    //Any형으로 인자를 받는 함수 만들기
    checkArg("Hello") //문자열을 인자로 넣음
    checkArg(5) //숫자를 인자로 넣음
}

fun checkArg(x:Any){ //인자를 Any형으로 받음
    if(x is String){
        println("x is String : $x")
    }
    if(x is Int){
        println("x is Int : $x")
    }

/* 결과값 :
x is String : Hello
x is Int : 5
*/
}