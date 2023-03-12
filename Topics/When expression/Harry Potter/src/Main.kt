const val GRYFFINDOR = "gryffindor"
const val HUFFLEPUFF = "hufflepuff"
const val SLYTHERIN = "slytherin"
const val RAVEN_CLAW = "ravenclaw"
const val BRAVERY = "bravery"
const val LOYALTY = "loyalty"
const val CUNNING = "cunning"
const val INTELLECT = "intellect"
const val INVALID_HOUSE = "not a valid house"

fun main() {
    // write your code here
    val house: String = readln()

    when (house) {
        GRYFFINDOR -> print(BRAVERY)
        HUFFLEPUFF -> print(LOYALTY)
        SLYTHERIN -> print(CUNNING)
        RAVEN_CLAW -> print(INTELLECT)
        else -> print(INVALID_HOUSE)
    }
}