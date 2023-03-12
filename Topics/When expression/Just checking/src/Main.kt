const val JAVA = 1
const val KOTLIN = 2
const val SCALA = 3
const val PYTHON = 4
fun main() {
    // write your code here
    val num: Int = readln().toInt()

    when (num) {
        JAVA, SCALA, PYTHON ->
            println("No!")
        KOTLIN ->
            println("Yes!")
        else -> println("Unknown number")
    }
}