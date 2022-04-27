package ch12_Bitwise

fun main() {
    var x: Int = 0b1010; // 10
    var y: Int = 0b1100 // 12

    println(x)
    println(y)

    var z: Int = x xor y // 1 xor 0 -> 1, 서로 다르면 1
    println(z) //6
    // 1 xor 1 = 0, 0 xor 1 = 1, 1 xor 0 = 1, 0 xor 0 = 0
    // 따라서 1010 or 1100의 값은 0110 = 6이다.
}