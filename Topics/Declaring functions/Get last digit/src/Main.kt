// write your code here
const val TEN = 10
fun getLastDigit(number: Int): Int {

    if (number % TEN < 0) {
        return number % TEN * -1
    }
    return number % TEN
}

/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}