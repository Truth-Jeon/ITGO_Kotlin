package ch16_WhileDo

fun main() {
    //[!] while문을 사용하여 짝수의 합
    var sum = 0

    var i = 1                       //초기식
    while (i <= 100) {              //조건식
        if(i % 2 == 0) {            //필터링(조건처리)
            sum += i                //실행문
        }
        i++                         //증감식
    }

    println("1부터 100까지 짝수의 합 : $sum")
}