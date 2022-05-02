package ch25_String

fun main() {
    var message = "hello, World!"

    println(message.length) // 길이
    println(message.toUpperCase()) // 대문자
    println(message.toLowerCase()) // 소문자

    //메서드 체이닝
    println(message
        .replace("hello", "안녕하세요.")
        .replace("World", "세계"))

    println("안녕".plus("").plus("하세요."))
}