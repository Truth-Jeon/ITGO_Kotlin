package ch14_When

fun main() {
    println("가장 좋아하는 프로그래밍 언어는?")
    print("1. C\t")
    print("2. C++\t")
    print("3. C#\t")
    print("4. Java\t")
    print("5. Kotlin\t")

    val choice = (readLine() ?: "").toIntOrNull() ?: 0

    when (choice) {
        1, 2 -> println("C/C++ 선택")
        in 3..4 -> println("C# 또는 Java 선택") //3에서 4 사이에 있는 것을 선택.
        else -> println("Kotlin이 좋아요.")
    }
}