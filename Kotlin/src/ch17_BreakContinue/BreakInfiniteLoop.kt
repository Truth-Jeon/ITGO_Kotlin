package ch17_BreakContinue

fun main() {
    var number = 0
    
    //무한루프
    while (true) {
        println("${++number}")
        
        if (number >= 5) {
            break //break문으로 무한 루프 빠져 나오기
        }
    }
}