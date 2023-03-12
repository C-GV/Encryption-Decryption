
fun main() {
    // write your code here
    val vowels = listOf('a', 'e', 'i', 'o', 'u', 'y')
    val word = readln()
    val charRow: Int = 3
    var vCounter: Int = 0
    var cCounter: Int = 0
    var euCounter: Int = 0

    for (i in word.indices) {

        if (vowels.contains(word[i])) {
            vCounter = 0
            cCounter++
            if (cCounter == charRow) {
                cCounter = 1
                euCounter++
            }
        } else {
            cCounter = 0
            vCounter++
            if (vCounter == charRow) {
                vCounter = 1
                euCounter++
            }
        }

    }
    print(euCounter)
}