package ch18_Array

fun main() {
    //문자열 == 문자의 배열
    var arr = "Kotlin"

    println(arr[0]) // K
    println(arr[1]) // o
    println(arr.get(2)) //t => Kotlin에서는 arr[2] 이런식으로 쓰는 것을 권장한다.
}