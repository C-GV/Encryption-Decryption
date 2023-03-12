fun main() {
    // write your code here
    val range1 = readln().toInt()..readln().toInt()
    val range2 = readln().toInt()..readln().toInt()
    val n = readln().toInt()

    print(n in range1 || n in range2)

}