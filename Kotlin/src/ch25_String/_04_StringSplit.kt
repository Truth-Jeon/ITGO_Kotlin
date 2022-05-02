package ch25_String

fun main() {
    var src = "Red,Green,Blue" //콤마 기호로 구분
    var colors = src.split(",") //split은 배열(list)형으로 추출하고 싶을 때 사용하며,
    // ()안에는 어떤 것으로 구분할 것인지(매개변수)를 작성한다.
    for (color in colors) {
        println(color)
    }
}