fun tip(bill: Int, percentage: Int = 10): Int {
    return if (percentage == "10".toInt()) {
        bill * percentage / "100".toInt()
    } else {
        bill * percentage / "100".toInt()
    }
}