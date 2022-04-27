package ch08_ReadLine

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`) //Scanner는 자바에서 차용한 개념.
    //실제로는 toIntOrNull이나 toDoubleOrNull을 사용하는 것을 더 권장함.

    println("정수: ")
    val number = scanner.nextInt()

    println("실수: ")
    val real = scanner.nextDouble()

    println("${number}-${real}")
}