package com.example.flykk_components.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.flykk_components.ui.component.intro.FlykkIntroButton
import com.example.flykk_components.ui.component.intro.ProgressBarIntro
import com.isignthis.flykkk.R

@Composable
fun IntroFirstScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.flykk_background))
    ) {
        ConstraintLayout(
            modifier = Modifier.fillMaxSize()
        ) {
            val (image, title, text, progress, button) = createRefs()

            Image(
                painter = painterResource(id = R.drawable.intro_first_image),
                contentDescription = null,
                modifier = Modifier
                    .constrainAs(image) {
                        top.linkTo(parent.top)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    }
                    .height(420.dp)
            )

            FlykkPrimaryTitle(
                title = "Instant Transfers",
                fontSize = 24.sp,
                color = R.color.flykk_primary_screen_title,
                modifier = Modifier.constrainAs(title) {
                    top.linkTo(image.bottom, margin = 32.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
            )

            FlykkSecondaryText(
                text = "flykk is connected to European and UK's Instant banking networks. Meaning you can send money to friends and family in seconds.",
                fontSize = 16.sp,
                color = R.color.flykk_field_label,
                modifier = Modifier.constrainAs(text) {
                    top.linkTo(title.bottom, margin = 6.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
            )

            ProgressBarIntro(
                screen = 1,
                modifier = Modifier.constrainAs(progress) {
                    top.linkTo(text.bottom, margin = 20.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
            )

            FlykkIntroButton(
                buttonTitle = "Get Started",
                modifier = Modifier.constrainAs(button) {
                    top.linkTo(progress.bottom, margin = 40.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
            )
        }
    }
}