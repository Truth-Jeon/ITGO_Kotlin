package ch13_IfElse

fun main() {
    var score = 0
    var grade = 'F'

    println("당신의 점수는 ? ")
    score = (readLine() ?: "").toIntOrNull() ?:0

    if (score >= 90) {
        grade = 'A'
    }
    else if (score >= 80) {
        grade = 'B'
    }
    else if (score >= 70) {
        grade = 'C'
    }
    else if (score >= 60) {
        grade = 'D'
    }
    else {
        grade = 'F'
    }

    println("점수: ${score}점")
    println("학점: ${grade}학점")
}