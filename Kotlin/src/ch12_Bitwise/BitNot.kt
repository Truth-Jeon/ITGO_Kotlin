package ch12_Bitwise

fun main() {
    var x: Int = 0b1010; // 10
//    var y: Int = 0b1100 // 12

    println(x)
//    println(y)

    var z: Int = x.inv() // 0000_1010 -> 1111_0101(<-음수의 이진수) (bit값을 반대로 변환)
    println(z)
}