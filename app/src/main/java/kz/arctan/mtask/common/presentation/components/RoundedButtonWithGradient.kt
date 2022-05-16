package kz.arctan.mtask.common.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun RoundedButtonWithGradient(
    text: String,
    onClick: () -> Unit,
    textAlign: TextAlign,
    endColor: Color,
    startColor: Color,
    modifier: Modifier
) {
    val shape = RoundedCornerShape(24.dp)
    Box(
        modifier = modifier
            .background(
                brush = Brush.horizontalGradient(
                    colors = listOf(
                        startColor,
                        endColor
                    ),
                ),
                shape = shape
            )
    ) {
        TextButton(
            onClick = onClick,
            shape = shape,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = text,
                textAlign = textAlign,
                color = Color.White
            )
        }
    }
}

@Preview
@Composable
fun MyButtonPreview() {
    RoundedButtonWithGradient(
        text = "Sign In",
        onClick = { },
        textAlign = TextAlign.Center,
        startColor = Color(0xFF792ABC),
        endColor = Color(0xFFB743AB),
        modifier = Modifier.width(100.dp)
    )
}