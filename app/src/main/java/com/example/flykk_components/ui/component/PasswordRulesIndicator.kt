package com.example.flykk_components.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.isignthis.flykkk.R

@Composable
fun PasswordRulesIndicator(isRuleFulfilled: Boolean, ruleDescription: String) {
    var imageId: Int = getImageResource(isRuleFulfilled)

    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp, 0.dp)
            .background(color = colorResource(id = R.color.flykk_background))
            ,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = imageId),
            contentDescription = null,
            Modifier
                .weight(0.1f)
                .size(12.dp))

        Text(
            text = ruleDescription,
            fontSize = 12.sp,
            color = colorResource(id = R.color.password_rules),
            modifier = Modifier.weight(0.90f))
    }
}

private fun getImageResource(isRuleFulfilled: Boolean): Int {
    if (isRuleFulfilled)
        return R.drawable.password_correct
    else
        return R.drawable.password_error
}

@Preview
@Composable
fun PasswordRulesIndicatorPreview() {
    Column() {
        PasswordRulesIndicator(false, "Minimum 6 characters")
        PasswordRulesIndicator(true, "Minimum 6 characters")
    }

}