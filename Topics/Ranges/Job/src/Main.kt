fun main() {
    // write your code here
    val ageRange = 18..59
    val age: Int = readln().toInt()

    print(age in ageRange)
}