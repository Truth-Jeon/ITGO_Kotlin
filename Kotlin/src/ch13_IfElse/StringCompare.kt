package ch13_IfElse

fun main() {
    var s1 = "Hello."
    var s2 = "Hello."

    if(s1 == s2) {
        println("Same.")
    }

    if(s1.equals(s2)) {
        println("Same.")
    }

    //코틀린에서는 아래처럼 equals()를 사용하는 것보단, ==을 사용하는 것을 더 선호한다.
}