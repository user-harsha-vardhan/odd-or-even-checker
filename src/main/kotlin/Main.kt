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

 //even Checker with if statements
    println("enter a number :")
    val input1 = readln()
    val numberInt2 = input.toIntOrNull()
    if (numberInt == null){
        println("enter a valid input")
    } else if (numberInt % 2 == 0){
        println("the number is even")
    } else {
        println("the number is odd")
    }

}



