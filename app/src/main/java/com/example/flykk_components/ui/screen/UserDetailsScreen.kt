package com.example.flykk_components.ui.screen

import android.text.InputType
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.flykk_components.ui.component.BackButton
import com.example.flykk_components.ui.component.FlykkDropdown
import com.example.flykk_components.ui.component.FlykkInputText
import com.example.flykk_components.ui.component.FlykkInputTextWithImage
import com.example.flykk_components.ui.component.FlykkPrimaryButton
import com.example.flykk_components.ui.component.FlykkPrimaryTitle
import com.example.flykk_components.ui.component.FlykkSecondaryButton
import com.example.flykk_components.ui.component.FlykkSecondaryText
import com.isignthis.flykkk.R


@Composable
fun UserDetailsScreen() {

    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.flykk_background))
    ) {
        val (backButton,
            title,
            text,
            firstNameField,
            countryField,
            emailField,
            mobile,
            continueButton,
            cancelButton) = createRefs()


        BackButton(modifier = Modifier.constrainAs(backButton) {
            top.linkTo(parent.top, margin = 30.dp)
             start.linkTo(parent.start, margin = 21.dp)
        })
        
        FlykkPrimaryTitle(title = "Let`s get started!",
            fontSize = 24.sp,
            color = R.color.flykk_primary_screen_title,
            modifier = Modifier.constrainAs(title) {
                top.linkTo(backButton.bottom, margin = 20.dp)
            } )

        FlykkSecondaryText(text = "Opening an account with flykk is quick\n" +
                "and easy, first we need to know how to contact you.",
                fontSize = 16.sp,
                color = R.color.flykk_secondary_text,
                modifier = Modifier.constrainAs(text) {
                    top.linkTo(title.bottom, margin = 4.dp)
                } )

        FlykkInputText(labelTitle = "Full Name",
                       placeholder = "Name Surname",
                       inputType = InputType.TYPE_CLASS_TEXT,
                       modifier = Modifier. constrainAs(firstNameField) {
                           top.linkTo(text.bottom, margin = 46.dp)
                       })

        FlykkDropdown(labelTitle = "Country of residence",
            hint = "Select country",
            modifier = Modifier.constrainAs(countryField) {
                top.linkTo(firstNameField.bottom, margin = 10.dp)
            })

        FlykkInputTextWithImage(labelTitle = "E-mail",
            placeholder = "Enter your email address",
            inputType = InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS,
            modifier = Modifier. constrainAs(emailField) {
                top.linkTo(countryField.bottom, margin = 10.dp)
            })

        FlykkInputTextWithImage(
            labelTitle = "Mobile phone number",
            placeholder = "+44 XXXXXXXXXXXX",
            inputType = InputType.TYPE_CLASS_PHONE,
            modifier = Modifier. constrainAs(mobile) {
                top.linkTo(emailField.bottom, margin = 10.dp)
            })

        FlykkPrimaryButton(buttonTitle = "Continue",
        modifier = Modifier.constrainAs(continueButton) {
            bottom.linkTo(cancelButton.top, margin = 10.dp)
        })


        FlykkSecondaryButton(buttonTitle = "Cancel",
            modifier = Modifier.constrainAs(cancelButton) {
                bottom.linkTo(parent.bottom, margin = 20.dp)
            })
    }
}


@Preview
@Composable
fun UserDetailsScreenPreview() {
    UserDetailsScreen()
}