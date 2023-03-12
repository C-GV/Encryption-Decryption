fun main() {
    // write your code here
    val size: Int = readln().toInt()
    val N = MutableList(size) { readln().toInt() }
    N.sort()
    val min = N[0]
    print(min)
}