//[?] &&(AND) 연산자: 둘 다 참일 때에만 참
package ch11_RelationalLogical

fun main() {
    println(true && true) // true, 둘 다 참일때에만 참
    println(true && false) // false , 하나라도 거짓이면 거짓
    println(false && false) // false, 둘 다 거짓이어도 거짓
}