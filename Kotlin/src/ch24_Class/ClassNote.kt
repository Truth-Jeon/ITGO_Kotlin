package ch24_Class

class ClassNote {
    fun run() {
        println("ClassNote 클래스의 run 메서드")
    }
}

fun main() {
    var classNote = ClassNote() //왼쪽은 개체이름, 오른쪽은 클래스이름
    println(classNote)
    classNote.run()
}