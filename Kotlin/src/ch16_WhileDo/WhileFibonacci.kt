//피보나치 수열 : 0 1 1 2 3 5 6 13 21 ...
package ch16_WhileDo

fun main() {
    //[?] 1부터 20까지 범위 내에 있는 피보나치 수열을 출력
    var first = 0
    var second = 1

    while (second <= 20) {
        print("$second \t")
        var temp = first + second
        first = second
        second = temp
    }
    println()
}