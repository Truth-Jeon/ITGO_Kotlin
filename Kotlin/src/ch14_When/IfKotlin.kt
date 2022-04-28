package ch14_When

fun main() {
    var first = 3
    var second = 5

    val max = if(first > second) first else second

    println("MAX: $max")

    val maxValue = if (first > second) {
        println("first 선택")
        first
    }
    else {
        println("second 선택")
        second
   }
    println("MaxValue : $maxValue")
}