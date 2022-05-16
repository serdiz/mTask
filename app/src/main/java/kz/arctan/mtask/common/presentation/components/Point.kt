package kz.arctan.mtask.common.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Point(color: Color) {
    Box(
        modifier = Modifier
            .background(color = color, shape = CircleShape)
            .size(4.dp)
            .padding(4.dp)
    )
}

@Preview
@Composable
fun PointPreview() {
    Point(color = Color.Black)
}