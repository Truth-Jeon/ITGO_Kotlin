// 메서드(함수) 오버로드(다중 정의, 여러 번 정의)
package ch19_Function

fun main() {
    getNumber(1234) //정수형을 넣어주면 정수형 getNumber 함수가 호출됨.
    getNumber(123L) //롱형을 넣어주면 롱형 getNumber 함수가 호출됨.
}

fun getNumber(number: Int) {
    println("Int: $number")
}

fun getNumber(number: Long) {
    println("Int: $number")
}

//똑같은 이름의 함수를 (매개변수를 다르게 해서) ㄴ여러번 정의하는 것 = 오버로드, 오버로딩