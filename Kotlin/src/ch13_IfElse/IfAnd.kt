package ch13_IfElse

fun main() {
    var number = 1_234

    // [A] 2개의 조건이 모두 만족하면
    if(number == 1234 && number >= 1_000) {
        println("맞습니다.")
    }

    // [B] 2개의 조건 중 하나라도 만족하면
    if(number == 1234 || number <= 1_000) {
        println("하나라도 참이면 참")
    }
}