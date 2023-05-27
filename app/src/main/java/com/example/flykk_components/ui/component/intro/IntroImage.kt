package com.example.flykk_components.ui.component.intro


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.isignthis.flykkk.R

@Composable
fun IntroImage() {
    Row(
        horizontalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.intro_first_image),
            contentDescription = null,
            modifier = Modifier
                .background(color = colorResource(id = R.color.flykk_background))
                .size(335.dp, 335.dp)
              //  .padding(0.dp, 50.dp, 0.dp, 0.dp)
        )
    }

}




@Preview
@Composable
fun IntroImagePreview() {
    IntroImage()
}