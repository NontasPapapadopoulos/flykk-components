package com.example.flykk_components.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.isignthis.flykkk.R

@Composable
fun FlykkFieldLabel(labelTitle: String, color: Int = R.color.flykk_field_label ) {
    Text(
        text = labelTitle,
        fontSize = 14.sp,
        color = colorResource(id = color),
        modifier = Modifier
            .fillMaxWidth()
            .height(20.dp)
            .background(colorResource(id = R.color.flykk_background)),
        textAlign = TextAlign.Start
    )
}

@Preview
@Composable
private fun FlykkFieldLabelPreview() {
    FlykkFieldLabel("First Name")
}