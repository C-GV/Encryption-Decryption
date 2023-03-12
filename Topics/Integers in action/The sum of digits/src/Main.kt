const val TEN = 10
fun main() {
    // put your code here
    val number: Int = readln().toInt()
    val digit1: Int = number / TEN / TEN
    val digit2: Int = number / TEN % TEN
    val digit3: Int = number % TEN
    val sum: Int = digit1 + digit2 + digit3

    print(sum)
}
