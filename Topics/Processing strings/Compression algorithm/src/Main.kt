fun main() {
    // write your code here
    val str = readln()
    var counter: Int = 1
    for (i in str.indices) {
        if (i != str.length - 1) {
            if (str[i] != str[i + 1]) {
                print("${str[i]}$counter")
                counter = 1
            } else {
                counter++
            }
        } else {
            print("${str[i]}$counter")
        }
    }
}