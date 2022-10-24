package ru.otus.hw_5

enum class ValidationPatterns(
    val message: String,
    private val regex: Regex,
    private val shouldContain: Boolean = true
) {

    TOO_SHORT(
        "Password must contain at least 6 symbols",
        ".{6,}".toRegex()
    ),

    NO_DIGITS_IN_PASSWORD(
        "Password must contain at least one digit",
        "^(?=.*[0-9])".toRegex()
    ),

    NO_CAPITAL_LETTERS(
        "Password must contain at least one capital letter",
        "^(?=.*[A-Z])".toRegex()
    ),

    THREE_IDENTICAL_SYMBOLS(
        "Password must not contain more than two identical symbols in a row",
        "(.)\\1{2}".toRegex(), false
    );

    fun validateInput(inputLine: String): Boolean {
        return if (shouldContain) {
            regex.containsMatchIn(inputLine)
        } else {
            !regex.containsMatchIn(inputLine)
        }
    }
}