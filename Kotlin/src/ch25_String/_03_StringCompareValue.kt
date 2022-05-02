package ch25_String

fun main() {
    var s1 = "VisualAcademy"
    var s2 = "visualacademy"

    if (s1 == s2) { //s1은 대소문자가 모두 있지만, s2는 소문자만 있기 때문에 같다고 할 수 없다.
        // (대소문자가 다르면 같은 단어라도 다른 단어로 인식한다.)
        println("[1] 같다.")
    }
    if (s1.equals(s2)) {//s1은 대소문자가 모두 있지만, s2는 소문자만 있기 때문에 같다고 할 수 없다.
        // (대소문자가 다르면 같은 단어라도 다른 단어로 인식한다.)
        println("[2] 같다.")
    }
    if (s1.toLowerCase() == s2.toLowerCase()) {//s1은 대소문자가 모두 있지만, s2는 소문자만 있기 때문에 같다고 할 수 없다.
        // 따라서 두개의 문자를 구별하기 위해서는 모두 대문자로 변경하던지, 모두 소문자로 변경 후에 비교해야한다.
            // 여기서는 모두 소문자로 변경 후 구분하였다.
        println("[3] 같다.")
    }
    if (s1.equals(s2, true)) { //[ignoreCase: true]는 대소문자 구분을 무시할 것인지를 묻는 것이다.
        println("[4] 같다.")
    }
}