// When Expression == Switch Expression
package ch14_When

fun main() {
    var x = 3

    // -> arrow, goes to
    when (x) {
        1 -> println("1입니다.")
        2 -> println("2입니다.")
        else -> {
            println("1과 2가 아닙니다.")
        }
    }
}