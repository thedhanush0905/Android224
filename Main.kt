fun main() {
    val celsius = 25
    val fahrenheit = 77

    println("$celsius°C is equal to ${celsiusToFahrenheit(celsius)}°F")
    println("$fahrenheit°F is equal to ${fahrenheitToCelsius(fahrenheit)}°C")
}

fun celsiusToFahrenheit(temperature: Int): Double {
    return (temperature * 9.0 / 5.0) + 32
}

fun fahrenheitToCelsius(temperature: Int): Double {
    return (temperature - 32) * 5.0 / 9.0
}