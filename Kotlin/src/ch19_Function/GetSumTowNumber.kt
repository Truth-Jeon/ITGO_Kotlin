package ch19_Function

fun main() {
    println(getSum(3.0,5.0)) //8.0
    println(getSum(3.5,3.4)) //6.9
}

fun getSum(x: Double, y: Double): Double {
    return x + y
}