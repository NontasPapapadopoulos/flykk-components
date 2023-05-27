package com.example.flykk_components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.isignthis.flykkk.R


@Composable
fun FlykkIntroScreen() {

    Box(Modifier.fillMaxSize()) {
        Image(painter = painterResource(id = R.drawable.flykk_intro),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds)
    }

}


@Preview
@Composable
fun FlykkIntroScreenPreview() {
    FlykkIntroScreen()
}