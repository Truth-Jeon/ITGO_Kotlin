package ch21_API

import java.lang.Math.pow
import kotlin.math.*

fun main() {
    //[1] 수학 관련 상수
    println("자연 로그: $E")
    println("원주율(PI): $PI")

    //[2] 절댓값
    println("-10의 절댓값: ${abs(-10)}")

    //[3] 최댓값, 최솟값
    println(max(3,5))
    println(min(3,5))

    //[4] 거듭제곱
    println("거듭제곱: 2의 10승: ${2.0.pow(10)}")

    //[5] 반올림
    println(round(1.5))
    println("%.3f".format(3.1415))
}