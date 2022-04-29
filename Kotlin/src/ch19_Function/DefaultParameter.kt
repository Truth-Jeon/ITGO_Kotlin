package ch19_Function

fun main() {
    log("디버그") // [A] 두 번째 매개 변수 생략
    log("에러", 4) // [B] 전체 매개 변수 사용
}

//[1] 기본 매개 변수(선택적 매개 변수): 매개 변수 선언과 동시에 초기화
fun log(message: String, level: Byte = 1) {
    println("$message, $level")
}