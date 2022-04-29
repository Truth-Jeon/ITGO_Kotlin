// 아무것도 하지 않는 프로그램
package ch17_BreakContinue

fun main() {
    for (i in 0 until 5) {
        if (i >= 0) {
            break //break는 반복문을 종료하는 기능을 한다.
            println("이 라인이 실행될까요?")
        }
    }
}