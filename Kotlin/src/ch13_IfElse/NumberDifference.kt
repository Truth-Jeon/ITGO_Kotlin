//[?] 두 수의 차이를 양의 정수로 구하기
package ch13_IfElse

fun main() {
    var first = 3
    var second = 5
    var diff = 0

    if(first > second) {
        diff = first - second
    } else {
        diff = second - first
    }

    println("${first}와 ${second}의 차이: $diff")
}