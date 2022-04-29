package ch17_BreakContinue

fun main() {
    var count = 1   // count: 6
    loop@ for (i in 1..100) { //loop@는 레이블이다.
        for (j in 1..100) {
            println("안녕")
            if(count++ >= 5) {  // count: 6
                break@loop
            }
        }
    }
    println()
}