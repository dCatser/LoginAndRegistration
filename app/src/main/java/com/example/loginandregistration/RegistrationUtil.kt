package com.example.loginandregistration

// object keyword makes it so all the functions are
// static functions
object RegistrationUtil {
    // use this in the test class for the is username taken test
    // make another similar list for some taken emails
    var existingUsers = listOf("cosmicF", "cosmicY", "bob", "alice")
//    you can use listOf<type>() instead of making the list & adding individually
//    List<String> blah = new ArrayList<String>();
//    blah.add("hi")
//    blah.add("hello")
//
    var existingPasswords = listOf<String>("hi", "password")
    var existingEmails = listOf("help@me.plz")

    // isn't empty
    // already taken
    // minimum number of characters is 3
    fun validateUsername(username: String) : Boolean {
        if (username.length < 3) {
            return false
        }
        if (existingUsers.contains(username)) {
            return false
        }
        return true
    }

    // make sure meets security requirements (deprecated ones that are still used everywhere)
    // min length 8 chars
    // at least one digit
    // at least one capital letter
    // both passwords match
    // not empty
    fun validatePassword(password : String, confirmPassword: String) : Boolean {
        if (password.length < 8) {
            return false
        }
        if (!password.contains(Regex("[0-9]"))) {
            return false
        }
        if (!password.contains(Regex("[A-Z]"))) {
            return false
        }
        if (password != confirmPassword) {
            return false
        }
        return true
    }

    // isn't empty
    fun validateName(name: String) : Boolean {
        if (name == "") {
            return false
        }
        return true
    }

    // isn't empty
    // make sure the email isn't used
    // make sure it's in the proper email format user@domain.tld
    fun validateEmail(email: String) : Boolean {
        if (email == "") {
            return false
        }
        if (existingEmails.contains(email)) {
            return false
        }
        if (!email.contains("@")) {
            return false
        }
        if (!email.contains(".")) {
            return false
        }
        return true
    }
}