//명명된 매개 변수(Named Parameter)
package ch19_Function

fun main() {
    sum(10, 20)
    sum(first = 10, second = 20)
    sum(second = 20, first = 10) //위치를 바꿔줄 수 있다.
}

fun sum(first:Int, second:Int) {
    println(first + second)
}