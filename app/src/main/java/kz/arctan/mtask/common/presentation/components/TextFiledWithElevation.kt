package kz.arctan.mtask.common.presentation.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TextFieldWithElevation(value: String, onValueChange: (String) -> Unit, hint: String) {
    val shape = RoundedCornerShape(24.dp)
    TextField(
        value = value,
        onValueChange = onValueChange,
        placeholder = { Text(hint) },
        singleLine = true,
        shape = shape,
        modifier = Modifier.shadow(4.dp, shape = shape),
        colors = TextFieldDefaults.textFieldColors(
            placeholderColor = Color.Gray,
            backgroundColor = Color.White,
            disabledIndicatorColor = Color.Transparent,
            errorIndicatorColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        )
    )
}

@Preview(showBackground = true)
@Composable
fun TextFieldWithElevationPreview() {
    Box(modifier = Modifier.height(500.dp), contentAlignment = Alignment.Center) {
        TextFieldWithElevation(value = "", onValueChange = {}, hint = "Hello")
    }
}