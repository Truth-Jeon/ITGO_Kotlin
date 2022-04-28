package ch15_For

fun main() {
    //행 반복
    for (i in 1..5) {
        //열 반복
        for (j in 1..i) {
            print("*")
        }
        println()
    }
}