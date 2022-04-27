package ch13_IfElse

fun main() {
    print("첫 번째 수: ")
    val first: Int = ((readLine()) ?: "").toIntOrNull() ?: 0

    print("두 번째 수: ")
    val second: Int = ((readLine()) ?: "").toIntOrNull() ?: 0

    if (first >= second) {
        println("큰 값: $first")
    } else {
        println("큰 값: $second")
    }
}