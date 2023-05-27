package com.example.flykk_components.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.flykk_components.ui.component.FlykkPrimaryTitle
import com.example.flykk_components.ui.component.FlykkSecondaryText
import com.example.flykk_components.ui.component.intro.FlykkIntroButton
import com.example.flykk_components.ui.component.intro.ProgressBarIntro

import com.isignthis.flykkk.R



@Composable
fun IntroSecondScreen() {

    ConstraintLayout(
        Modifier.fillMaxSize()
            .background(color = colorResource(id = R.color.flykk_background))
    ) {
        val (topImage, title, text, progressBar, button) = createRefs()

        Image(
            painter = painterResource(id = R.drawable.intro_second_image),
            contentDescription = null,
            modifier = Modifier
                .background(color = colorResource(id = R.color.flykk_background))
                .fillMaxWidth()
                .height(420.dp)
                .constrainAs(topImage) {
                    top.linkTo(parent.top, margin = 72.dp)
                }
        )

        FlykkPrimaryTitle(title = "Pay anywhere",
            fontSize = 24.sp,
            color = R.color.flykk_primary_screen_title,
            modifier = Modifier.constrainAs(title) {
                top.linkTo(topImage.bottom, margin = 32.dp)
            })

        FlykkSecondaryText(
            text = "flykk's native card give you access\n" +
                    "to payat over 45 million businesses and\n" +
                    "withdraw cash at over 1.2 million global ATM’s.",
            fontSize = 16.sp,
            color = R.color.flykk_field_label,
            modifier = Modifier.constrainAs(text) {
                top.linkTo(title.bottom, margin = 6.dp)
            })


        ProgressBarIntro(screen = 2,
            modifier = Modifier.constrainAs(progressBar) {
                top.linkTo(text.bottom, margin = 44.dp)
            })


        FlykkIntroButton(buttonTitle = "Get Started",
            modifier = Modifier.constrainAs(button) {
                bottom.linkTo(parent.bottom, margin = 18.dp)
        })
    }

}




@Preview
@Composable
fun IntroSecondScreenPreview() {
    IntroSecondScreen()

}