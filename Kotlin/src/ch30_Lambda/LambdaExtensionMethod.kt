package ch30_Lambda

fun main() {
    // 배열(컬렉션, 리스트)
    var numbers = arrayOf(1, 2, 3)

    var sum = numbers.sum()
    println("numbers 배열 요소의 합: $sum")

    var count = numbers.count()
    println("numbers 배열 요소의 건수: $count")

    var average = numbers.average()
    println("numbers 배열 요소의 평균: ${String.format("%.2f", average)}")

    var max = numbers.maxOrNull() //코틀린에서 일반 max()는 안됨. maxOrNull()을 사용해야 함.
    println("numbers 컬렉션의 최댓값: $max")

    var min = numbers.minOrNull() //코틀린에서 일반 min()는 안됨. minOrNull()을 사용해야 함.
    println("numbers 컬렉션의 최솟값: $min")
}