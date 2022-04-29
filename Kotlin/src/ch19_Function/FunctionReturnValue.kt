package ch19_Function

fun main() {
    var r = squareFunction(2)
    println(r)
}

fun squareFunction(x: Int): Int {
    var r = x * x
    return r
    // 위의 두 줄은 간단하게 return x * x 로 줄여서 사용할 수 있다.
}