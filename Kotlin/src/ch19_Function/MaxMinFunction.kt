package ch19_Function

fun main() {
    println("큰 값: ${max(3,5)}") // 5
    println("큰 값: ${min(-3,-5)}") // -5
}

// Max 함수
fun max(x: Int, y:Int): Int {
    return if (x > y) x else y // x가 y보다 크면 x를 반환시키고, 그렇지 않으면 y를 반환시켜라.
}

// Min 함수
fun min(x: Int, y: Int): Int {
    if (x < y) {
        return x
    }
    else {
        return y
    }
}