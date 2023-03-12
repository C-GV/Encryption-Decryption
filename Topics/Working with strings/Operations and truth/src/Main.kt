const val ARRAY_SIZE = 3
fun main() {
    // write your code here
    val (a, b, c) = Array(ARRAY_SIZE) { readln() }
    println(a + b == c)

}