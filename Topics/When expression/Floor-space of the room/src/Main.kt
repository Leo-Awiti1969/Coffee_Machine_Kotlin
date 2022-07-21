import kotlin.math.sqrt

const val PI = 3.14

fun main() {
    val roomShape = readln()
    when (roomShape) {
        "triangle" -> {
            val sideA = readln().toDouble()
            val sideB = readln().toDouble()
            val sideC = readln().toDouble()
            val halfSumSides = (sideA + sideB + sideC) / 2
            val sidesToAverSide = (halfSumSides - sideA) * (halfSumSides - sideB) * (halfSumSides - sideC)
            println(sqrt(halfSumSides * sidesToAverSide))
        }
        "rectangle" -> {
            val sideA = readln().toDouble()
            val sideB = readln().toDouble()
            println(sideA * sideB)
        }
        "circle" -> {
            val radius = readln().toDouble()
            println(radius * radius * PI)
        }
        else -> print("Unknown operator")
    }
}