package ch05_variable

fun main() { //() 안에는 args: Array<String>이 생략되어 있음.
    //변수
    var number: Int = 1_234 //코틀린은 Int형(정수형)을 3자리마다 _를 이용해서 구분지어줄 수 있다.
    //그래도 출력값은 동일하게 1234로 출력됨.

    var message: String = "Hello"

    //상수
    val PI = 3.14

    println(number)
    println(message)
    println(PI)
}