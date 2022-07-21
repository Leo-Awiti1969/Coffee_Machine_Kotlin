fun perimeter(x1: Double = 0.0, y1: Double = 0.0, x2: Double, y2: Double = 0.0, x3: Double = 0.0, y3: Double = 0.0, x4: Double = 0.0, y4: Double): Double {
    return Math.hypot(x1 - y1) + Math.hypot(x2 - y2) + Math.hypot(x3 - y3) + Math.hypot(x4 - y4)
}