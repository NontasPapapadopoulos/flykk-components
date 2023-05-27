package com.example.flykk_components.ui.component

import android.text.InputType
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.TextFieldDefaults


import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle

import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.isignthis.flykkk.R

@Composable
fun FlykkInputText(labelTitle: String, placeholder: String, inputType: Int, modifier: Modifier) {
    val isFocused = remember { mutableStateOf(false) }

    Column(
        modifier
            .fillMaxWidth()
            .padding(20.dp, 0.dp),
        verticalArrangement = Arrangement.spacedBy(6.dp)
    ) {
        FlykkFieldLabel(labelTitle = labelTitle,
                        color = getTextColor(hasError = false))

        // TODO: set input type
        var inputText by remember { mutableStateOf(TextFieldValue("")) }

        OutlinedTextField(
            value = inputText,
            onValueChange = { newText -> inputText = newText },
            shape = RoundedCornerShape(36.dp),
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .focusRequester(FocusRequester())
                .onFocusChanged { it.isFocused }
                .border(
                    width = if (isFocused.value) 2.dp else 1.dp,
                    color = colorResource(id = getBorderColor(isFocused = isFocused.value, hasError = false)),
                    shape = RoundedCornerShape(36.dp)
                )
                .background(
                    color = colorResource(id = R.color.flykk_background),
                    shape = RoundedCornerShape(36.dp)
                ),

            colors = TextFieldDefaults.outlinedTextFieldColors(
                backgroundColor = colorResource(id = getBackgroundColor(false)),
                cursorColor = colorResource(id = R.color.flykk_text_field),
                //  focusedBorderColor = colorResource(id = R.color.flykk_text_field_focus_border)
            ),
            placeholder = {
                FlykkPlaceholder(placeholder = placeholder,
                                color = getPlaceHolderColor(false) )
            },
            textStyle = TextStyle(
                color = colorResource(id = R.color.flykk_text_field),
                fontSize = 16.sp
                ),
            )
    }
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
fun FlykkInputTextPreview() {
    FlykkInputText("place holder", "label", InputType.TYPE_CLASS_NUMBER, Modifier)
}