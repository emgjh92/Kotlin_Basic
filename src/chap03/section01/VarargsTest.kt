package chap03.section01

fun main(){
    //가변인자 (Variable Argument)
    //인자의 갯수가 유동적으로 변하게 하는 것 ==> 함수는 하나만 정의해 두고 여러개의 인자를 받으려고
    //함수를 선언할 때 매개변수 왼쪽에 vararg라는 키워드를 붙이면 된다.

    normalVarargs(1,2,3,4) // 4개의 인자 구성
    normalVarargs(4,5,6) // 3개의 인자 구성
}

fun normalVarargs(vararg counts:Int){
    for(num in counts)
    {
        print("$num")
    }
    print("\n")
}
/*
1234
456
 */