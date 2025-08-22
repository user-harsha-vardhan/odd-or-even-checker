fun main() {
    println("enter a number :")
    val input = readln()
    val numberInt = input.toIntOrNull()
    if (numberInt != null) {
        val output = when {
            numberInt % 2 == 0 -> "the number is even"
            else -> "the number is odd"
        }
        println(output)
    } else {
        println("enter a valid input")
    }
}




