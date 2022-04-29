package ch18_Array

fun main() {
    var kor = IntArray(3)

    kor[0] = 95
    kor[1] = 90
    kor[2] = 80

    var tot = 0
    for (k in kor) {
        tot += k
    }
    var avg: Double = tot / kor.size.toDouble()

    println("총점: ${tot}, 평균: ${String.format("%.2f", avg)}")
}