package com.example.flykk_components.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.isignthis.flykkk.R


@Composable
fun FlykkPrimaryTitle(title: String,
                       fontSize: TextUnit,
                       color: Int,
                       modifier: Modifier) {
    Text(
        text = title,
        fontSize = fontSize,
        textAlign = TextAlign.Center,
        color = colorResource(id = color),
        modifier = modifier
            .fillMaxWidth()
            .padding(20.dp, 0.dp)
            .background(colorResource(id = R.color.flykk_background)),

        )

}



@Preview
@Composable
private fun FlykkPrimaryTitlePreview() {
    FlykkPrimaryTitle(title = "Test title!!", fontSize = 17.sp, color = R.color.flykk_primary_button, modifier = Modifier)
}