package ch18_Array

fun main() {
    var arr = IntArray(3)
    arr[0] = 11
    arr[1] = 22
    arr[2] = 33
    //arr[3] = 4 //여기까지 하면 범위를 벗어나기 때문에 에러 발생.

    var index = 0
    println(arr[index++])
    println(arr[index++])
    println(arr[index++])
    println()
    println(arr[--index])
    println(arr[--index])
    println(arr[--index])
}