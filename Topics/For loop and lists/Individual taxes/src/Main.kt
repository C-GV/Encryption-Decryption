fun main() {
    // write your code here
    val nCompanies: Int = readln().toInt()
    val companyList = MutableList(nCompanies) { readln().toInt() }
    val taxPercentage = MutableList(nCompanies) { readln().toInt() }
    val highestTax = mutableListOf<Int>()

    for (i in companyList.indices) {
        highestTax.add(companyList[i] * taxPercentage[i])
    }

    println(highestTax.indexOf(highestTax.maxOrNull()) + 1)
}