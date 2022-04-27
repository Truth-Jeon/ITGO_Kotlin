package ch11_RelationalLogical

fun main() {
    var i = 3
    var j = 5
    var r = false

    r = (i == 3) && (j != 3) // r = true && true => true
    println(r)

    r = (i != 3) || (j == 3) // r = false || false => false
    println(r)

    r = (i >= 5) // r = false
    println(!r) // r = true
}