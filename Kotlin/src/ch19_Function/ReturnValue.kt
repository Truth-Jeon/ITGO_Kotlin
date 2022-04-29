package ch19_Function

fun main() {
    var returnValue = getString()
    println(returnValue)
}

fun getString(): String {
    return "반환값(Return Value)"
}