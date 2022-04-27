//후위(Postfix) 증감 연산자: 우선순위가 낮음
package ch10_AssignmentIncrement

fun main() {
    var i = 3
    var j: Int = i++ //++가 변수 뒤에 붙으면 증가되기 전의 변수 값이 우선 대입됨.
    println(j) //3
    println(i) //4
}