const val ARRAY_SIZE = 3
fun main() {
    // write your code here
    val (a, b, c) = Array(ARRAY_SIZE) { readln().toInt() }

    if (a + b > c && b + c > a && a + c > b) {
        print("YES")
    } else print("NO")

}