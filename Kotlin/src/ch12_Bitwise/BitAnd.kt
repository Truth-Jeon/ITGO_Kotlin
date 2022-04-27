package ch12_Bitwise


fun main() {
    var x: Int = 0b1010; // 10
    var y: Int = 0b1100 // 12

    println(x)
    println(y)

    var z: Int = x and y
    println(z) // 8
    //and는 Bitwise에서 &&와 동일하게, 1 and 1 = 1 로 사용된다. 즉, 앞 뒤의 비교값이 동일할때만 동일한 값이 나온다.
    //위에서 1010 and 1100이므로 동일한 위치에 1이 들어갔을 경우엔 값이 1이고, 그렇지 않을 경우에 값이 0이다.
    //따라서 1010 and 1100은 1000이 되므로, 값은 8이 나온다.
}