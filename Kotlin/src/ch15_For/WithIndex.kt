package ch15_For

fun main() {
    for((index, value) in "Hello".withIndex()) { //프로그래밍에서 index 단어는 0부터 시작한다. 따라서 withIndex() 역시 동일하다.
        println("${index + 1} - ${value}")
    }
    //withIndex()는 배열에서 문자열을 1개씩 읽어오는 역할을 한다.
}