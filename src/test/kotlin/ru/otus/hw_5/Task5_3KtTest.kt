package ru.otus.hw_5

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Task5_3KtTest {

    @Test
    fun passwordIsValid() {
        val passwordToCheck = "345ERTYdfg987"
        val result = validatePassword(passwordToCheck)

        assertEquals(0, result.size)
    }

    //    TOO_SHORT
    @Test
    fun validatePasswordIsTooShort() {
        val passwordToCheck = "123aA"
        val result = validatePassword(passwordToCheck)

        assertEquals(1, result.size)
        assertEquals(result[0], ValidationPatterns.TOO_SHORT)
    }

    //    NO_DIGITS_IN_PASSWORD
    @Test
    fun validatePasswordContainsNoDigits() {
        val passwordToCheck = "wwWWww"
        val result = validatePassword(passwordToCheck)

        assertEquals(1, result.size)
        assertEquals(result[0], ValidationPatterns.NO_DIGITS_IN_PASSWORD)
    }

    //    NO_CAPITAL_LETTERS
    @Test
    fun validatePasswordContainsNoUpperCaseSymbols() {
        val passwordToCheck = "ww170ww"
        val result = validatePassword(passwordToCheck)

        assertEquals(1, result.size)
        assertEquals(result[0], ValidationPatterns.NO_CAPITAL_LETTERS)
    }

    //    THREE_IDENTICAL_SYMBOLS
    @Test
    fun validatePasswordRepeatedLowerCaseSymbolsInTheMiddle() {
        val passwordToCheck = "123aaaA"
        val result = validatePassword(passwordToCheck)

        assertEquals(1, result.size)
        assertEquals(result[0], ValidationPatterns.THREE_IDENTICAL_SYMBOLS)
    }

    @Test
    fun validatePasswordRepeatedLowerCaseSymbolsInTheBeginning() {
        val passwordToCheck = "aaa123WQe"
        val result = validatePassword(passwordToCheck)

        assertEquals(1, result.size)
        assertEquals(result[0], ValidationPatterns.THREE_IDENTICAL_SYMBOLS)
    }

    @Test
    fun validatePasswordRepeatedLowerCaseSymbolsInTheEnd() {
        val passwordToCheck = "qWe121rrr"
        val result = validatePassword(passwordToCheck)

        assertEquals(1, result.size)
        assertEquals(result[0], ValidationPatterns.THREE_IDENTICAL_SYMBOLS)
    }

    @Test
    fun validatePasswordRepeatedUpperCaseSymbolsInTheMiddle() {
        val passwordToCheck = "123AAAA"
        val result = validatePassword(passwordToCheck)

        assertEquals(1, result.size)
        assertEquals(result[0], ValidationPatterns.THREE_IDENTICAL_SYMBOLS)
    }

    @Test
    fun validatePasswordRepeatedUpperCaseSymbolsInTheBeginning() {
        val passwordToCheck = "AAA123WQe"
        val result = validatePassword(passwordToCheck)

        assertEquals(1, result.size)
        assertEquals(result[0], ValidationPatterns.THREE_IDENTICAL_SYMBOLS)
    }

    @Test
    fun validatePasswordRepeatedUpperCaseSymbolsInTheEnd() {
        val passwordToCheck = "qWe112RRR"
        val result = validatePassword(passwordToCheck)

        assertEquals(1, result.size)
        assertEquals(result[0], ValidationPatterns.THREE_IDENTICAL_SYMBOLS)
    }

    @Test
    fun validatePasswordRepeatedDigitsInTheMiddle() {
        val passwordToCheck = "123444rAA"
        val result = validatePassword(passwordToCheck)

        assertEquals(1, result.size)
        assertEquals(result[0], ValidationPatterns.THREE_IDENTICAL_SYMBOLS)
    }

    @Test
    fun validatePasswordRepeatedDigitsInTheBeginning() {
        val passwordToCheck = "444123WQe"
        val result = validatePassword(passwordToCheck)

        assertEquals(1, result.size)
        assertEquals(result[0], ValidationPatterns.THREE_IDENTICAL_SYMBOLS)
    }

    @Test
    fun validatePasswordRepeatedDigitsInTheEnd() {
        val passwordToCheck = "qWe112555"
        val result = validatePassword(passwordToCheck)

        assertEquals(1, result.size)
        assertEquals(result[0], ValidationPatterns.THREE_IDENTICAL_SYMBOLS)
    }
}