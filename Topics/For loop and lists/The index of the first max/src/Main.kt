fun main() {
    // write your code here
    val listSize: Int = readln().toInt()
    val nList = MutableList(listSize) { readln().toInt() }

    print(nList.indexOf(nList.maxOrNull()))

}