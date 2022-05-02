package ch25_String

fun main() {
    //많은 문자열을 더하고, 빼는 기능이 필요할 때 StringBuilder()가 빛을 발한다.
    var sb = StringBuilder()
    sb.append("January\n")//append()는 괄호 안의 문자를 하나의 문자열로 묶어주는 역할을 한다.
    sb.append("February\n")
    sb.append("March\n")

    println(sb.toString())
}