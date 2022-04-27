package ch13_IfElse

fun main() {
    println("점수: ")
    var score : Int = (readLine() ?: "").toIntOrNull() ?: 0
    var grade = ""
    
    if (score >= 90) {
        grade = "금메달"
    }
    else {
        if (score >= 80) {
            grade = "은메달"
        }
        else {
            if (score >= 70) {
                grade = "동메달"
            }
            else {
                grade = "노메달"
            }
        }
    }

    println("${grade}를 수상하였습니다.")
}