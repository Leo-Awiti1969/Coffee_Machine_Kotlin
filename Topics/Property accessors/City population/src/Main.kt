const val MAXNUMBER = 50_000_000
data class City(val name: String) {
    var population: Int = 0
        set(value) {
            field = if (value < 0) {
                polulationMin
            } else if (value > MAXNUMBER) {
                polulationMax
            } else {
                value
            }
        }
    val polulationMin = 0
    val polulationMax = MAXNUMBER
}
//fun main() {
//    val smartOne = Smartphone("Ericsong")
//    smartOne.price = -24
//    println(smartOne.price) // 32
//    val smartTwo = Smartphone("iNokhe")
//    println(smartTwo.price) // 11
//    println(smartTwo.price - smartOne.price)
//}
//
//class Smartphone(val name: String) {
//    var price: Int = -5
//        get() = name.length - field
//}