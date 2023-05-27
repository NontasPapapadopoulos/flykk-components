package com.example.flykk_components.ui.component.intro

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.isignthis.flykkk.R

@Composable
fun FlykkIntroButton(buttonTitle: String, modifier: Modifier) {

    Button(onClick = { /*TODO*/ },
        modifier = modifier
            .fillMaxWidth()
            .height(50.dp)
            .padding(20.dp, 0.dp),
        colors = ButtonDefaults.buttonColors(colorResource(id = R.color.flykk_primary_button)),
        shape = RoundedCornerShape(72.dp)
    ) {
        Text(
            text = buttonTitle,
            color = colorResource(id = R.color.flykk_primary_button_text),
            fontSize = 16.sp,
            modifier = Modifier
                .wrapContentSize()
                .padding(0.dp, 0.dp, 10.dp, 0.dp),
            //fontFamily = FontFamily.
            // TODO: set font family and weight
        )
        Image(painter = painterResource(id = R.drawable.arrow_right),
            contentDescription = null,
            modifier = Modifier
                .size(17.dp, 12.dp))
    }

}

@Preview
@Composable
private fun FlykkPrimaryButtonPreview() {
    FlykkIntroButton("Get Started", modifier = Modifier)
}