package com.example.androidtesting

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilsTest {
    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtils.validateRegistrationInput(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid input returns true`() {
        val result = RegistrationUtils.validateRegistrationInput(
            "philip",
            "123",
            "123"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `username already exists returns false`() {
        val result = RegistrationUtils.validateRegistrationInput(
            "linoop",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `incorrect password returns false`() {
        val result = RegistrationUtils.validateRegistrationInput(
            "carl",
            "123",
            "1234"
        )
        assertThat(result).isFalse()
    }
}