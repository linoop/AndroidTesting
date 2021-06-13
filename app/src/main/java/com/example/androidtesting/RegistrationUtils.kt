package com.example.androidtesting

object RegistrationUtils {

    private val existingUsers = listOf("linoop", "chickoos")

    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmPassword: String
    ): Boolean {
        if (username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            return false
        }
        if (username in existingUsers) {
            return false
        }
        if(password!=confirmPassword){
            return false
        }
        return true
    }
}