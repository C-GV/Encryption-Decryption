fun main() {
    val beyondTheWall = readLine()!!.split(", ").map { it }.toMutableList()
    val backToTheWall = readLine()!!.split(", ").map { it }.toMutableList()
    // do not touch the lines above
    // write your code here
    beyondTheWall.sort()
    backToTheWall.sort()
    if (beyondTheWall == backToTheWall) {
        print("true")
    } else print("false")

}