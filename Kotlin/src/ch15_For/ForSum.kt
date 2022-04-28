package ch15_For

fun main() {
    var n = 100
    var sum = 0

    for (i in 1..n) { //i in 1..n 은 흔히 말하는 i=1;i=n; 이라는 뜻이다.
        sum += i // sum = sum + i 와 동일하다.
    }
    println("1부터 ${n}까지의 합: $sum")
}