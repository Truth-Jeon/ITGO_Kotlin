// 1부터 10까지 정수의 합을 구해나갈 때 합이 22 이상이 되면 멈추는 프로그램
package ch17_BreakContinue

fun main() {
    var goal = 22
    var sum = 0

    var i = 1
    while (i <= 10) {
        sum += i

        if (sum >= goal) {
            break // 반복문 탈출
        }
        i++
    }
    println("1부터 ${i}까지의 합은 ${sum}이고, 목표치 ${goal}이상을 달성했습니다.")
}