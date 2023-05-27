package com.example.flykk_components.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.isignthis.flykkk.R

@Composable
fun BackButton(modifier: Modifier) {
    Box(
        modifier = modifier
    ) {
        Image(
            painter = painterResource(id = R.drawable.back_button),
            contentDescription = null,
            modifier = Modifier.size(17.dp, 12.dp)
                .clickable {
                println("Button Clicked!")
            }

               // .padding(20.dp, 30.dp)
        )
    }
}

@Preview
@Composable
fun BackButtonPreview() {
    BackButton(Modifier)
}