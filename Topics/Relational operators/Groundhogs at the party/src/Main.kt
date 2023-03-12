fun main() {
    // write your code here
    val reeses: Int = readln().toInt()
    val weekend: Boolean = readln().toBoolean()

    if (!weekend && reeses in 10..20 || weekend && reeses in 15..25)
        println("true")
    else println("false")

}
