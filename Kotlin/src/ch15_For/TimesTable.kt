//구구단을 가로로 출력하기
package ch15_For

fun main() {
    for (i in 2..9) {
        print("${String.format("%5s", i)}단")
    }
    println()

    for (i in 1..9) { // 행(세로) 출력
        for (j in 2..9) { // 열(가로)출력
            print("$j*$i=${String.format("%2s", (j * i))} ")
       }
        println()
    }
}

// 타이핑 및 결과확인 그리고 이해하도록 노력.