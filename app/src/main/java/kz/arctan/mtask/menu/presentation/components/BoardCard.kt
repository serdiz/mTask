package kz.arctan.mtask.menu.presentation.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kz.arctan.mtask.common.presentation.components.BackgroundWithPurpleCircles

@Composable
fun BoardCard(date: String, title: String, description: String) {
    Card(
        modifier = Modifier
            .width(250.dp)
            .height(210.dp),
        shape = RoundedCornerShape(24.dp)
    ) {
        BackgroundWithPurpleCircles(3)
        Box(
            contentAlignment = Alignment.BottomStart,
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp)
        ) {
            Column {
                Text(text = date, maxLines = 1)
                Text(
                    text = title,
                    maxLines = 1,
                    fontWeight = FontWeight.Bold,
                    style = MaterialTheme.typography.h5
                )
                Text(text = description, overflow = TextOverflow.Ellipsis, maxLines = 1)
            }
        }
    }
}

@Preview
@Composable
fun BoardCardPreview() {
    BoardCard(
        date = "Due Sep. 1, 2022",
        title = "Board name",
        description = "Very and very long description made by me"
    )
}