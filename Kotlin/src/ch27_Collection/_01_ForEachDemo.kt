//컬렉션: 배열, 리스트, 맵
package ch27_Collection

fun main() {
    //arrayOf()는 기본적으로 Any 형식을 사용 (Any 형식은 모든 데이터 형식을 넣을 수 있음.)
    var colors = arrayOf("red", "green", "blue", 1, 2, 3, 4L, true, 3.14)

    println(colors.size) // 9

    //배열 출력
    for (c in colors) {
        print("[1] $c\t")
    }
    println()

    colors.forEach {
        print("[2] $it\t")  //코틀린에서도 forEach문을 제공한다.
    }
    println()

    // Goes to 연산자(화살표 연산자)
    colors.forEach {
        it -> print("[3] $it\t") // 굳이 it이 아니어도 다른 이름으로도 사용 가능하다.
    }
    println()

    // 반복 시 index를 포함해서 반복시켜줄 수 있다.
    colors.forEachIndexed{ index, c ->
        println("${index + 1} - $c")
    }
}