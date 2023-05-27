package com.example.flykk_components.ui.component

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.isignthis.flykkk.R


@Composable
fun FlykkPlaceholder(placeholder: String, color: Int = R.color.flykk_text_field_placeholder) {
    Text(
        text = placeholder,
        color = colorResource(id = color),
        fontSize = 16.sp,
        )
}


@Preview
@Composable
fun FlykkPlaceholderPreview() {
    FlykkPlaceholder("place holder")
}