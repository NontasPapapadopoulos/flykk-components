package com.example.flykk_components.ui.component.intro

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.flykk_components.ui.component.PasswordRulesIndicator
import com.isignthis.flykkk.R


@Composable
fun PasswordRulesContainer(password: String, modifier: Modifier ) {
    
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = modifier.background(color = colorResource(id = R.color.flykk_background))

            ) {
        PasswordRulesIndicator(isRuleFulfilled = hasSixCharacters(password) , ruleDescription = "Minimum 6 characters" )
        Spacer(modifier = Modifier.height(8.dp))

        PasswordRulesIndicator(isRuleFulfilled = hasUppercaseLetter(password) , ruleDescription = "Minimum 1 UPPER CASE letter" )
        Spacer(modifier = Modifier.height(8.dp))

        PasswordRulesIndicator(isRuleFulfilled = hasLowercaseLetter(password) , ruleDescription = "Minimum 1 lower case letter" )
        Spacer(modifier = Modifier.height(8.dp))

        PasswordRulesIndicator(isRuleFulfilled = hasDigit(password) , ruleDescription = "Minimum 1 number 0-9" )
        Spacer(modifier = Modifier.height(8.dp))

        PasswordRulesIndicator(isRuleFulfilled = hasSpecialCharacter(password) , ruleDescription = "Minimum 1 symbol ~!@#\$%^&*()_+-={}[]:;”’<>,.?/|\\" )
        Spacer(modifier = Modifier.height(8.dp))

    }
}

private fun hasSixCharacters(password: String): Boolean {
    return password.length >= 6
}

private fun hasUppercaseLetter(password: String): Boolean {
    val regex = Regex("[A-Z]")
    return regex.containsMatchIn(password)
}

private fun hasLowercaseLetter(password: String): Boolean {
    val regex = Regex("[a-z]")
    return regex.containsMatchIn(password)
}

private fun hasDigit(password: String): Boolean {
    val regex = Regex("\\d")
    return regex.containsMatchIn(password)
}

private fun hasSpecialCharacter(password: String): Boolean {
    val regex = Regex("[~!@#\$%^&*()_+-={}\\[\\]:;\"'<>,.?/|]")
    return regex.containsMatchIn(password)
}
@Preview
@Composable
fun PasswordRulesContainerPreview() {
    PasswordRulesContainer("Nondas!2", Modifier)
}