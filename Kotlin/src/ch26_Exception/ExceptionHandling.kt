package ch26_Exception

fun main() {
    var a = 3
    var b = 0
    var r = 0

    try {
        r = a / b
    }
    catch (e: Exception) {
        println("에러 발생: ${e.message}")
    }
    finally {
        println("에러가 발생하던 안하던 실행되는 영역")
    }
    try {
        throw Exception("내가 만든 에러")
    }
    catch (ex: Exception) {
        println("에러 발생: ${ex.message}")
    }
    finally {
        println("마무리") //finally 구문은 예외가 발생하든, 발생하지 않든 항상 마지막에 종료될때 실행된다.
    }
}