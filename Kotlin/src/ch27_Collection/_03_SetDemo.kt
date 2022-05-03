//중복 제거
package ch27_Collection

fun main() {
    var numbers = setOf(1, 3, 3, 9) //setOf로 배열을 불러올 시, 중복이 제거된다.
    println("개수: ${numbers.size}")
    numbers.forEach{
        println(it) // 1, 3, 9
    }
    
    if(numbers.contains(3)) {
        println("3 포함됨")
    }
}