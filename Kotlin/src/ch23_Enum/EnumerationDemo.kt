package ch23_Enum

//열거형 생성
enum class Priority {
    High,
    Normal,
    Low
}

enum class Animal {     //관련있는 상수들을 관리
    Mouse, Cow, Tiger, Chicken, Dog, Pig
}

fun main() {
    //열거형 상수는 문자열로 표시
    println("${Priority.High}, ${Priority.Normal}, ${Priority.Low}")
    
    //if문과 함께 사용
    var animal = Animal.Dog
    if (animal == Animal.Tiger) {
        println("호랑이")
    }
    else if (animal == Animal.Dog) {
        println("개")
    }
    else {
        println("다른 동물")
    }

    // when 식과 함께 사용
    var who = Animal.Chicken
    var result = when (who) {
        Animal.Dog -> "개"
        Animal.Cow -> "소"
        Animal.Pig -> "돼지"
        else -> "다른 동물"
    }
    println(result)
}