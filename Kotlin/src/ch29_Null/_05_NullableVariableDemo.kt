package ch29_Null

fun main() {
    var id: Int? = null
    var name: String? = null
    var age: Int = 3

    println("[1] $id - $name - $age")

    var what: String? = null

    var r1 = what?.toUpperCase()
    println("[2] $r1") //null

    var r2 = null ?: "초기값"
    println("[3] $r2") // 초기값

    var r3 = what?.toUpperCase() ?: "Hello"
    println("[4] $r3") // Hello

    what = "World"
    var r4 = what?.toUpperCase() ?: "_____"
    println("[5] $r4") //WORLD
}