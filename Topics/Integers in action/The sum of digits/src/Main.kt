fun main() {
    val threeDigitNumber = readln().toInt()
    val reminderHundredth = threeDigitNumber % "100".toInt()
    println(threeDigitNumber / "100".toInt() + reminderHundredth / "10".toInt() + threeDigitNumber % "10".toInt())
}