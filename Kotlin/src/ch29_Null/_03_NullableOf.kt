package ch29_Null

fun main() {
    var bln: Boolean? = null
    if (bln != null) {
        println(bln)
    }
    else {
        println("Null 입니다.")
    }
}