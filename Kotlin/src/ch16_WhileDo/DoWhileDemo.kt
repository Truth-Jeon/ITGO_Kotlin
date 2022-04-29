package ch16_WhileDo

fun main() {
    //1부터 100까지의 정수 중 3의 배수이면서 4의 배수인 정수의 합
    var sum: Int = 0
    var i = 1
    do {
        if ((i % 3 == 0) and (i % 4 == 0)) {
            sum += i
        }
        i++
    } while (i <= 100)

    println(sum)
}