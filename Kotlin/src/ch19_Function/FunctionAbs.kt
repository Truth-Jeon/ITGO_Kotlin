package ch19_Function

//[?] 절댓값을 구하는 함수 만들기
fun abs(num: Int): Int {
    return if (num < 0) -num else num
}

fun main() {
    var num = -21
    var absNumber = abs(num)
    println("${num}의 절댓값: ${absNumber}")
}