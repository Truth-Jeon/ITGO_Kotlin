package ch09_operator

fun main() {
    var days = 29

    println("2월달은 " + days + "일 입니다.") //암시적(Implicit), 여기서 days는 정수형이다.
    println("2월달은 " + days.toString() + "일 입니다.") //명시적(Explicit), 여기서 days는 문자형이다.
    println("2월달은 ${days}일 입니다.") //템플릿 문자열, 문자열 보간법, 불러온 days는 정수형이다. 가장 좋은 코틀린 코딩 방법.
}