//매개 변수(Parameter)가 있는 함수 만들고 호출하기
package ch19_Function

fun main() {
    showMessage("매개 변수")
    showMessage("Parameter")
}

fun showMessage(message: String) {
    println(message)
}