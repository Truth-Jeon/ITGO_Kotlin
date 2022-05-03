package ch28_Generic

fun main() {
    //Int List 생성
    var numbers = listOf<Int>(1,2,3) //리스트는 타입에 맞는 값들만 저장할 수 있다.
    println(numbers[0]) //1
    numbers.forEach {
        //forEach는 for문처럼 리스트, 배열을 한번 쭉 돌리는 역할을 한다.
        println(it) //1,2,3
    }

    //listOf는 Immutable이라서 값이 변하지 않는다. (즉, 중간에 값 추가가 안된다.)
    var colors = listOf<String>("red", "green", "blue")
    //colors.add("black")
    colors.forEach {
        println(it)
    }

    //mutableListOf는 값 변경이 가능하다. (즉, 중간에 값 추가가 가능하다.)
    var favorites = mutableListOf<String>("Kotlin", "C#")
    favorites.add("Java") //Java 추가
    favorites.removeAt(0) // Kotlin 삭제
    favorites.forEach{
        println(it) // C#, Java
    }

    var techs = mutableListOf<Any>("Kotlin", 1.4) // <Any> 매개변수를 사용하면 모든 타입의 값을 다 저장할 수 있다.
    techs.forEach{
        println(it)
    }
}