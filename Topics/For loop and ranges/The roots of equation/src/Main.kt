fun main() {
    // put your code here
    val n = MutableList(4){ readln().toInt() }
    var sum = 0
    for (x in 0..1000) {
        sum = n[0] * (x * x * x) + n[1] * (x * x) + n[2] * x + n[3]
        if (sum == 0) {
            println(x)
        }
    }
}