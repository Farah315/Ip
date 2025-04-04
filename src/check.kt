fun main() {
    check(
        "Valid IP: Normal case",
        isValidIPv4("192.168.1.1"),
        correctResult = true    )


    check("Invalid IP: Extra segment",
        isValidIPv4("192.168.1.1.1"),
        correctResult = false
    )
    check(
        "Invalid IP: Missing segment",
        isValidIPv4("192.168.1"),
        correctResult = false)
    check(
        "Invalid IP: Non-numeric character",
        isValidIPv4("192.168.abc.1"),
        correctResult = false
    )
    check(
        "Invalid IP: Segment out of range",
        isValidIPv4("300.168.1.1"),
        correctResult = false
    )
    check(
        "Invalid IP: Leading zeros",
        isValidIPv4("192.168.01.1"),
        correctResult = false
    )
    check(
        "Invalid IP: Empty string",
        isValidIPv4(""),
        correctResult = false
    )
    check(
        "Invalid IP: Spaces",
        isValidIPv4(" 192.168.1.1 "),
        correctResult = false
    )
    check(
        "Valid IP: Edge case (0.0.0.0)",
        isValidIPv4("0.0.0.0"),
        correctResult = true
    )
    check(
        "Valid IP: Edge case (255.255.255.255)",
        isValidIPv4("255.255.255.255"),
        correctResult = true
    )
}

fun check(value: String, result: Boolean, correctResult: Boolean) {
    if(result == correctResult) {
        println("Success - $result")
    } else {
        println("Failed - $result")
    }
}
