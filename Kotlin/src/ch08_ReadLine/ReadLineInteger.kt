package ch08_ReadLine

fun main() {
    print("나이를 입력하세요. ")
    val tempInt = readLine() ?: ""
    val intAge: Int = tempInt.toIntOrNull() ?: 0 //String(문자형)으로 받아온 것을 정수형으로 변환. 앞의 것이 null이면 0으로 초기화(변환)해라.
    println("당신의 나이는 ${intAge}입니다.")
}