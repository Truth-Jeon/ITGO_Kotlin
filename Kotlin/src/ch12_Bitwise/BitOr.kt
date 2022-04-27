package ch12_Bitwise

fun main() {
    var x: Int = 0b1010; // 10
    var y: Int = 0b1100 // 12

    println(x)
    println(y)

    var z: Int = x or y // 1 or 0 -> 1
    println(z) //14
    // 1 or 1 = 1, 0 or 1 = 1, 1 or 0 = 1, 0 or 0 = 0
    // 따라서 1010 or 1100의 값은 1110 = 14이다.
}