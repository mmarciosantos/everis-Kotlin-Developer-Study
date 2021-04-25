import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("Type the first number: ")
    val num1 = scanner.nextFloat()
    println("Type meth operation (+, -, *, /): ")
    val operation = readLine()
    println("Type the second number: ")
    val num2 = scanner.nextFloat()

    val result = when (operation) {
        "+" -> sum(num1, num2)
        "-" -> sub(num1, num2)
        "*" -> mult(num1, num2)
        "/" -> div(num1, num2)
        else -> "Invalid operation"
    }
    print("Result: $result")
}

fun sum(num1: Float, num2: Float) = num1 + num2
fun sub(num1: Float, num2: Float) = num1 - num2
fun mult(num1: Float, num2: Float) = num1 * num2
fun div(num1: Float, num2: Float) = num1 / num2