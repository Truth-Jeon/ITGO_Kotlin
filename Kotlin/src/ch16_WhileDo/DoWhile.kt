//do while 반복문으로 최소 한 번은 실행하기
package ch16_WhileDo

fun main() {
    var count = 0                   // 초기식
    do {
        println("안녕하세요.")        // 실행문
        count++                     // 증감식
    } while (count < 3)             // 조건식
}