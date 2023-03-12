fun main() {
    // put your code here
    val a: Int = readln().toInt()
    val b: Int = readln().toInt()
    val c: Int = readln().toInt()
    var possitive: Int = 0

    if(a > 0 ) possitive++
    if(b > 0 ) possitive++
    if(c > 0 ) possitive++
    
    if (possitive == 1) {
        print("true")
    } else {
        print("false")
    }
}
