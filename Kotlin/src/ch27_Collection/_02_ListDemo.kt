package ch27_Collection

fun main() {    //Array는 배열, List는 리스트라고 부른다.
    // 리스트 선언
    val techs = listOf("Kotlin", "Android", "Java", "C#")
    println(techs.get(0)) // "Kotlin" <- get() 함수 사용 금지
    println(techs[1]) // 인덱서
    println(techs::class.qualifiedName) // java.util.Arrays.ArrayList

    val subs = techs.subList(1, 3) //첫번째 인덱스가 from index, 두번째 인덱스가 to index 이다.
    subs.forEach {
        println(it)
    }

    // 리스트 선언(뮤터블)
    val sites = mutableListOf("VisualAcademy", "DotNetKorea")
    sites[1] = "닷넷코리아" //DotNetKorea를 닷넷코리아로 변경
    sites.removeAt(0) //0번째 인덱스를 삭제
    sites.forEach{
        println(it)
    }
}

//결국, mutableListOf()는 읽고 쓰기가 가능한 리스트이다.