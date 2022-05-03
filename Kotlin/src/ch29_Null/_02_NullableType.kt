// Nullable Type(널 가능 형식)
package ch29_Null

fun main(args: Array<String>) {
    var hi: String = "안녕하세요.";
    println(hi);

    //모든 데이터 타입은 데이터타입옆에 ? 를 붙여주지 않으면 null 값을 넣을 수 없다.
    //null 값이 가능하게 하려면 이처럼 ? 를 붙여줌으로써 Nullable Type으로 선언해줘야 한다.
    var hello: String? = null;
    println(hello);

    var number: Int? = null;
    println(number);
}