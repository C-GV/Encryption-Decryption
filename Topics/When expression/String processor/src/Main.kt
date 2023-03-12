fun main() {
    // write your code here
    val string1: String = readln()
    val processor: String = readln()
    val string2: String = readln()

    when (processor) {
        "equals" -> println(string1 == string2)
        "plus" -> println(string1 + string2)
        "endsWith" -> println(string1.endsWith(string2))
        else -> println("Unknown operation")
    }
}