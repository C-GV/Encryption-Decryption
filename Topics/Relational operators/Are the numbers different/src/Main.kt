fun main() {
    // put your code here
    val x: Int = readln().toInt()
    val y: Int = readln().toInt()
    val z: Int = readln().toInt()
    val output: Boolean = x != y && y != z && x != z

    println(output)
}