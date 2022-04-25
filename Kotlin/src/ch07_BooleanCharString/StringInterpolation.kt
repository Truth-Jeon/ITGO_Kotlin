package ch07_BooleanCharString

fun main() {
    //문자열 보간(String Interpolation), 문자열 보간법 //또는 Template String 이라고도 한다.
    var message: String = "String Interpolation"

    println("Message: " + message) //문자열을 묶어서 출력 (전통적인 방식)
    println("Message: ${message}") //변수를 직접 지정하여 출력.
    println("Message: $message") //뒤에 별도의 스트링이 없을 경우 중괄호 생략 가능.
}