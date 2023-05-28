package com.example.flykk_components.ui.component

import android.text.InputType
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.isignthis.flykkk.R


@Composable
fun FlykkInputTextWithImage(labelTitle: String,
                            placeholder: String,
                            inputType: Int,
                            modifier: Modifier) {
    val isFocused = remember { mutableStateOf(false) }

    var inputText by remember { mutableStateOf(TextFieldValue("")) }

    Column(
        modifier
            .fillMaxWidth()
            .padding(20.dp, 0.dp),
        verticalArrangement = Arrangement.spacedBy(6.dp)
    ) {
        FlykkFieldLabel(labelTitle = labelTitle, color = getTextColor(false))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable(onClick = { })
                .focusRequester(FocusRequester())
                .onFocusChanged { it.isFocused }
                .border(
                    width = if (isFocused.value) 2.dp else 1.dp,
                    color = colorResource(id = getBorderColor(false, false)),
                    shape = RoundedCornerShape(36.dp)
                )
                .background(
                    color = colorResource(id = getBackgroundColor(false)),
                    shape = RoundedCornerShape(36.dp)
                ),
            verticalAlignment = Alignment.CenterVertically

        ) {

            Image(
                painterResource(id = getImageResource(false)),
                contentDescription = null,
                Modifier
                    .size(15.dp, 11.dp)
                    .weight(0.15f)
            )
            Image(
                painterResource(id = getVerticalLine(false)),
                contentDescription = null,
                Modifier
                    .size(1.dp, 16.dp)
                    .weight(0.005f)

           )

            OutlinedTextField(
                value = inputText,
                onValueChange = { newText ->
                    inputText = newText
                },
                modifier = Modifier
                    .weight(0.8f)
                    .background(
                        color = Color.Transparent,
                        shape = RoundedCornerShape(36.dp)
                    )
                    .border(width = 0.dp, color = Color.Transparent),
                placeholder = {
                    FlykkPlaceholder(
                        placeholder = "yourname@email.com",
                        color = getPlaceHolderColor(false)
                    ) },
                colors = TextFieldDefaults.outlinedTextFieldColors (
                    //backgroundColor = colorResource(id = getBackgroundColor(false)),
                    backgroundColor = Color.Transparent,
                    cursorColor = colorResource(id = R.color.flykk_text_field),
                    unfocusedBorderColor = Color.Transparent
                //  focusedBorderColor = colorResource(id = R.color.flykk_text_field_focus_border)
                )
            )
        }
    }
}




// TODO: erase the white space outside of the border.

private fun getImageResource(hasError: Boolean): Int {
    return if (hasError)
        return R.drawable.mail_red
    else
        R.drawable.mail_grey
}

private fun getVerticalLine(hasError: Boolean): Int {
    return if (hasError)
        return R.drawable.red_vertical_line
    else
        R.drawable.grey_vertical_line
}


private fun getBorderColor(isFocused: Boolean, hasError: Boolean): Int {
    if (hasError)
        return R.color.flykk_text_field_border_error

    return if (isFocused)
        R.color.flykk_text_field_focus_border
    else
        R.color.flykk_text_field_border
}

private fun getTextColor(hasError: Boolean): Int {
    return if (hasError)
        R.color.flykk_error
    else
        R.color.flykk_field_label
}


private fun getBackgroundColor(hasError: Boolean): Int {
    return if (hasError)
        R.color.flykk_background_error
    else
        R.color.flykk_background
}

private fun getPlaceHolderColor(hasError: Boolean): Int {
    return if (hasError)
        R.color.flykk_error
    else
        R.color.flykk_text_field_placeholder
}




@Preview
@Composable
fun FlykkEmailInputPreview() {
    FlykkInputTextWithImage("E-mail", "Select country", InputType.TYPE_CLASS_NUMBER, Modifier)
}
