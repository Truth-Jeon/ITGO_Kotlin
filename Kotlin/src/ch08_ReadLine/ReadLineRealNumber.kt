package ch08_ReadLine

fun main() {
    print("몸무게를 입력하세요. ")
    val input = readLine() ?: ""
    val weight: Double = input.toDoubleOrNull() ?: 0.0 //String(문자형)으로 받아온 것을 정수형으로 변환. 앞의 것이 null이면 0으로 초기화(변환)해라.
    println("당신의 몸무게는 ${weight}입니다.")
}