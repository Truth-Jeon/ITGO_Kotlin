package ch12_Bitwise

fun main() {
    var number = 2 //0b_0000_0010
    println(number shl 1) //shl = shift left, 즉 shl1은 왼쪽으로 한 칸 이동하라는 뜻. 결과는 4 / 0010을 왼쪽으로 한 칸 이동하면 0100이 되므로 4가 된다.
    println(number shr 1) //shr = shift right, 즉 shr 1은 오른족으로 한 칸 이동하라는 뜻. 결과는 1 / 0010을 오른쪽으로 한 칸 이동하면 0001이 되므로 1이 된다.
}