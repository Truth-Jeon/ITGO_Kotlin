// 함수(메서드) 오버로드(Overload; 오버로딩): 다중 정의/여러 번 정의/중복
package ch19_Function

fun main() {
    multi()
    multi("반갑습니다.")
    multi("또 만나요.", 3)
}

fun multi() {
    println("안녕하세요.")
}

fun multi(message: String) {
    println(message)
}

fun multi(message: String, count: Int) {
    for (i in 1..count) {
        println(message)
    }
}

//위의 3 함수는 이름은 같지만 모양(시그니처)가 다르다.