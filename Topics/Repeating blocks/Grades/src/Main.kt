fun main() {
    // put your code here
    val students: Int = readln().toInt()
    var grades: Int = 0
    var a: Int = 0
    var b: Int = 0
    var c: Int = 0
    var d: Int = 0

    repeat(students) {
        grades = readln().toInt()
        if (grades == 5) {
            a++
        } else if (grades == 4) {
            b++
        } else if (grades == 3) {
            c++
        } else if (grades == 2) {
            d++
        }
    }
    print("$d $c $b $a")
}