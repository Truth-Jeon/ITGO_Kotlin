package ch26_Exception

fun main() {
    throw Exception("에러가 발생했습니다.")
    // throw Exception()을 사용하면 무조건 에러가 발생하며, 메세지를 줄 수 있다. 강제적으로 에러를 발생시킬 때 사용.
}