fun main() {
    val numbers = MutableList(100){if (it == 0 || it == 9 || it == 99) it + 1 else 0}
    // do not touch the lines below 
    println(numbers.joinToString())
}