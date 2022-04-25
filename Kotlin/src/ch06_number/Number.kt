package ch06_number

fun main() {
    var min: Int = -2147483648; //정수형이 가질 수 있는 가장 작은 값
    var max: Int = +2147483647; //정수형이 가질 수 있는 가장 큰 값

    println("Int 변수의 최솟값: ${min}");
    println("Int 변수의 최댓값: ${max}");

    var PI: Double = 3.141592; //배정밀도 부동 소수점(실수형) 변수를 선언하고 값을 할당
    println("PI: ${PI}");

    var i: Int = 1_000; //정수
    var b: Byte = 127; //작은 정수
    var s: Short = 1234; //정수
    var l: Long = 1234L; //큰 정수
    var f: Float = 3.14F; //32비트 실수
    var d: Double = 3.14; //64비트 실수

    //숫자 구분자
    var lValue = 2_147_483_647;

    //형식 변환
    var ii: Int = 1234;
    var ll: Long = ii.toLong();

    val dbl = 12.34
    //val iii : Int = dbl //실수형 데이터를 정수형 변수에 넣으니 오류가 뜸.
    val iii : Int = dbl.toInt() //그래서 .toInt()를 사용해서 정수형으로 변경해줌.
    println(iii)
}