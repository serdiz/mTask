package kz.arctan.mtask.common.presentation.components

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.*
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Heading(
    text: String,
    startColor: Color,
    endColor: Color,
    style: TextStyle
) {
    Text(
        text = text,
        modifier = Modifier.textBrush(
            brush = Brush.horizontalGradient(
                colors = listOf(
                    startColor,
                    endColor
                )
            )
        ),
        style = style.copy(fontWeight = FontWeight.Bold)
    )
}

fun Modifier.textBrush(brush: Brush) = this
    .graphicsLayer(alpha = 0.99f)
    .drawWithCache {
        onDrawWithContent {
            drawContent()
            drawRect(brush, blendMode = BlendMode.SrcAtop)
        }
    }

@Preview
@Composable
fun HeadingPreview() {
    Heading(
        text = "MTask",
        startColor = Color(0xFFB743AB),
        endColor = Color(0xFF7A29BC),
        style = MaterialTheme.typography.h4
    )
}