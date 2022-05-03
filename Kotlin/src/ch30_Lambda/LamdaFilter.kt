package ch30_Lambda

fun main() {
    var numbers = arrayOf(1, 2, 3, 4, 5)

    // Filter
    var newNumbers1 = numbers.filter {number -> number > 3}
    for (n in newNumbers1) {
        println(n) // 4, 5
    }

    var newNumbers2 = numbers.filter {n -> n % 2 == 0}
    for (n in newNumbers2) {
        println(n)
    }

    var oddCount = numbers.filter {it -> it % 2 == 1}.count()
    println("홀수 개수: $oddCount")

    //오름차순
    var asc = numbers.sortedArray() //정렬된 배열. -> 오름차순으로 정렬함.
    for(n in asc) {
        println(n)
    }

    //내림차순
    var dsc = numbers.sortedArrayDescending() // 내림차순으로 정렬함.
    for(n in dsc) {
        println(n)
    }

    //홀수 값만 골라서 내림차순
    var dsc2 = numbers.filter { it -> it % 2 != 0 }.sortedDescending()
    for (n in dsc2) {
        println(n)
    }
}