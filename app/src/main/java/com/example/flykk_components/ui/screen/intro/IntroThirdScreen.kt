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
fun IntroThirdScreen() {

    ConstraintLayout(
        Modifier.fillMaxSize()
            .background(color = colorResource(id = R.color.flykk_background))
    ) {
        val (topImage, title, text, progressBar, button) = createRefs()

        Image(
            painter = painterResource(id = R.drawable.intro_third_image),
            contentDescription = null,
            modifier = Modifier
                .background(color = colorResource(id = R.color.flykk_background))
                .fillMaxWidth()
                .height(420.dp)
                .constrainAs(topImage) {
                    top.linkTo(parent.top, margin = 72.dp)
                }
        )

        FlykkPrimaryTitle(title = "free flykk transfers",
            fontSize = 24.sp,
            color = R.color.flykk_primary_screen_title,
            modifier = Modifier.constrainAs(title) {
                top.linkTo(topImage.bottom, margin = 32.dp)
            })

        FlykkSecondaryText(
            text = "Transferring funds to other flykk\n" +
                    "users is free, simple and instant!\n" +
                    "Welcome to flykk!",
            fontSize = 16.sp,
            color = R.color.flykk_field_label,
            modifier = Modifier.constrainAs(text) {
                top.linkTo(title.bottom, margin = 6.dp)
            })

        ProgressBarIntro(screen = 3,
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
fun IntroThirdScreenPreview() {
    IntroThirdScreen()
    
}