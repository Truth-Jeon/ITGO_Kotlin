package ch27_Collection

fun main() {
    var people = HashMap<Int, String>()

    people.put(1, "홍길동")
    people.put(2, "백두산")
    people.put(3, "임꺽정")

    for ((key, value) in people) {
        println("$key - $value")
    }
}