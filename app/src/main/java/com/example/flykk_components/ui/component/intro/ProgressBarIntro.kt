package com.example.flykk_components.ui.component.intro

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.isignthis.flykkk.R


@Composable
fun ProgressBarIntro(screen: Int, modifier: Modifier) {

    when (screen) {
        1 ->  Row(
            modifier = modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(painter = painterResource(id = R.drawable.progress_rectangle_purple),
                contentDescription = null,
            )
            Spacer(modifier = Modifier.width(10.dp))
            Image(painter = painterResource(id = R.drawable.progress_rectangle_grey),
                contentDescription = null,
            )
            Spacer(modifier = Modifier.width(10.dp))
            Image(painter = painterResource(id = R.drawable.progress_rectangle_grey),
                contentDescription = null,
            )
        }

        2 -> Row(
            modifier = modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(painter = painterResource(id = R.drawable.progress_rectangle_grey),
                contentDescription = null,
            )
            Spacer(modifier = Modifier.width(10.dp))
            Image(painter = painterResource(id = R.drawable.progress_rectangle_purple),
                contentDescription = null,
            )
            Spacer(modifier = Modifier.width(10.dp))
            Image(painter = painterResource(id = R.drawable.progress_rectangle_grey),
                contentDescription = null,
            )
        }

        3 -> Row(
            modifier = modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(painter = painterResource(id = R.drawable.progress_rectangle_grey),
                contentDescription = null,
            )
            Spacer(modifier = Modifier.width(10.dp))
            Image(painter = painterResource(id = R.drawable.progress_rectangle_grey),
                contentDescription = null,
            )
            Spacer(modifier = Modifier.width(10.dp))
            Image(painter = painterResource(id = R.drawable.progress_rectangle_purple),
                contentDescription = null,
            )
        }

    }


}


@Preview
@Composable
fun ProgressBarIntroPreview() {
    Column() {
        ProgressBarIntro(1, modifier = Modifier)
        Spacer(modifier = Modifier.height(10.dp))

        ProgressBarIntro(2, modifier = Modifier)
        Spacer(modifier = Modifier.height(10.dp))

        ProgressBarIntro(3, modifier = Modifier)
    }

}