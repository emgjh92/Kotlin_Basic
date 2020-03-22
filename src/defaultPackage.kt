import chap02.section01.Person
import java.lang.Math.PI
import java.lang.Math.abs
//import java.lang.Math.*

import com.example.edu.Person as User

fun main(){
    val user1 = User("Kildong",30)
    val user2 = Person("A123", "Kildong")

    println(user1.name)
    println(user1.age)

    val intro: String = "안녕하세요!"
    val num: Int = 20


    println(PI)
    println(abs(-12.6)) //절대값을 출력하는 abs 함수

    println("intro:$intro, num : $num")

    println(user2.id)
    println(user2.name)
}