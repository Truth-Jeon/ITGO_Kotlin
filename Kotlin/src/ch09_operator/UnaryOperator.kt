//[?] 단항 연산자(Unary Operator): +, -
package ch09_operator

fun main() {
    var value: Int = 0

    value = 8
    value = +value // '+'연산자는 아무런 의미가 없다.
    println(value)

    value = -8
    value = +value // '+'연산자는 아무런 의미가 없다.
    println(value)

    value = -8
    value = -value // '-'연산자는 기존의 값을 반대로 변환한다.
    println(value)

    value = 8
    value = -value // '-'연산자는 기존의 값을 반대로 변환한다.
    println(value)
}