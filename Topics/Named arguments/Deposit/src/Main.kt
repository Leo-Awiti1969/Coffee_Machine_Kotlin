import kotlin.math.pow

const val TAKE_AMOUNT = 1000
const val TAKE_PERCENT = 5
const val TAKE_YEARS = 10
const val TAKE_HUNDRED = 100

fun main() {
    when (readln()) {
        "amount" -> {
            val amount = readln().toInt()
            finalAmount(amount, TAKE_PERCENT, TAKE_YEARS)
        }
        "percent" -> {
            val percent = readln().toInt()
            finalAmount(TAKE_AMOUNT, percent, TAKE_YEARS)
        }
        "years" -> {
            val years = readln().toInt()
            finalAmount(TAKE_AMOUNT, TAKE_PERCENT, years)
        }
    }
}

fun finalAmount(amount: Int = TAKE_AMOUNT, percent: Int = TAKE_PERCENT, years: Int = TAKE_YEARS) {
    val finalAmountCal = amount * (1 + percent.toDouble() / TAKE_HUNDRED).pow(years.toDouble())
    println(finalAmountCal.toInt())
}