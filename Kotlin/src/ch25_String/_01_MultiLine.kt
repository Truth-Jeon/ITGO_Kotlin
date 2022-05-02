package ch25_String

fun main() {
    println("""
        
        안녕하세요.
        반갑습니다.
        또 만나요.
        
    """.trimIndent()) //.trimIndent()를 제거해줄수도 있는데, 이것을 제거하면 들여쓰기까지 다 포함돼서 그대로 출력된다.
}