//[?] continue 문을 사용하여 반복문(for, while, do)에서 다음 반복으로 이동하기
package ch17_BreakContinue

fun main() {
    for (i in 1..5) {
        if (i % 2 == 0) {
            continue
        }
        println("$i")
    }
}