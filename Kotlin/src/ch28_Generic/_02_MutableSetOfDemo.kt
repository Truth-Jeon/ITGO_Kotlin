package ch28_Generic

fun main() {
    val numbers = mutableSetOf<Int>()
    numbers.add(1234)
    numbers.add(2345)
    //numbers.add("문자열") <- 에러 발생
    for (num in numbers) {
        println(num)
    }
}