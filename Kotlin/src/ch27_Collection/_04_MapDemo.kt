package ch27_Collection

fun main() {
    // 맵 : 사전 == 키와 값의 쌍
    val map = mapOf(1 to "하나", 2 to "둘", 3 to "셋")
    map.forEach {
        key, value -> println("$key - $value")
    }

    val mutableMap = mutableMapOf("A" to "AA", "B" to "BB")
    //추가
    mutableMap["C"] = "CC"
    mutableMap.forEach {
        k, v -> println("$k - $v")
    }
}