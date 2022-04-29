//식 본문
package ch19_Function

fun main() {
    println(sumAll1(3, 5)) //8
    println(sumAll2(3, 5)) //8
}

fun sumAll1(first: Int, second: Int) = first + second

fun sumAll2(first: Int, second: Int): Int {
    return first + second
}