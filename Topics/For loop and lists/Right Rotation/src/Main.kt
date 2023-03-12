fun main() {
    // write your code here
    val listSize: Int = readln().toInt()
    val list = MutableList(listSize) { readln().toInt() }
    var shift: Int = readln().toInt()
    var holder: Int
    shift = shift % listSize

    for (i in 0..shift - 1) {
        holder = list[listSize - 1]
        for (n in list.lastIndex downTo 1) {
            list[n] = list[n - 1]
        }
        list[0] = holder
    }
    println(list.joinToString(" "))
}