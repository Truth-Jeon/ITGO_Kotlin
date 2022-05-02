package ch22_DateTime

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {
    //[1] 현재 시간 출력
    var current = LocalDateTime.now()
    println("현재 시간: $current")

    //[2] 년, 월, 일, 시, 분, 초 출력
    var formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH:mm:ss.SSS") //기본은 yyyy-MM-dd 임.
    println("현재 시간: ${current.format(formatter)}")

    //[3] 날짜
    println("날짜: ${LocalDate.now()}")

    //[4] 더하기 또는 빼기
    println("3일 뒤: ${current.plusDays(3)}")
    println("3달 전: ${current.minusMonths(3)}")
    println("100일 뒤: ${LocalDate.now().plusDays(100)}")
}