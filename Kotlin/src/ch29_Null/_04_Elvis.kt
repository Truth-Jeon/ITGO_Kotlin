package ch29_Null

fun main() {
    val a = null
    val number = a?.toString() ?: 1234
    // ?.엘비스 연산자 : 앞의 변수가 null이 아니면 toString()을 출력하고, null이라면 null이다.
    // ?: 엘비스 연산자 : 앞에 있는 값이 null이라면 1234 값을 저장하라.
    println(number) //1234로 초기화.

    // b라는 변수를 선언.
    val b: String? = "a"
    println(b!!.toUpperCase()) //!!. : 반드시 null이 아니어야함을 강조, null 일 시에 에러 발생.
    //반드시 null이 아닐 경우, a를 toUpperCase() (대문자로 변환) 하라.
}