// 관계형 연산자(비교 연산자; Relational Operator. Comparative Operator)
// 관계형 연산자 : < 작음, <= 작거나 같음, > 큼, >= 크거나 같음, == 같음, != 다름
package ch11_RelationalLogical

fun main() {
    var x = 3
    var y = 5

    println(x == y) //false
    println(x != y) //true
    println(x > y) //false
    println(x >= y) //false
    println(x < y) //true
    println(x <= y) //true
}