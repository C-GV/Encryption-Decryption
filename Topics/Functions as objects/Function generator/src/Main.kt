// TODO: provide three functions here
fun identity(args: Int) = args

fun half(args: Int) = args.toInt() / 2

fun zero(args: Int) = 0

fun generate(functionName: String): (Int) -> Int {
    // TODO: provide implementation here
    when (functionName) {
        "identity" -> return ::identity
        "half" -> return ::half
        "zero" -> return ::zero
        else -> return ::zero
    }

}