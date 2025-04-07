//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val ip = "192.1.1.0"
    val result = isValidIPv4(ip)
    println("Is IP valid? $result")
}
fun isValidIPv4(ip: String): Boolean {
    val parts = ip.split(".")

    if (parts.size != 4) return false

    for (part in parts) {
        if (part.isEmpty())
            return false

        if (!part.all { it.isDigit() })
            return false

        val num = part.toIntOrNull() ?:
        return false
        if (num !in 0..255)
            return false

        if (part.length > 1 && part.startsWith("0"))
            return false
    }
    return true
}
