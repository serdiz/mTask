package kz.arctan.mtask.menu.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kz.arctan.mtask.R
import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.sqrt

@Composable
fun NewBoardCard(createBoard: () -> Unit) {
    Card(
        shape = RoundedCornerShape(24.dp),
        modifier = Modifier.fillMaxWidth(0.9f)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .gradientBackground(
                    listOf(
                        Color(0xFFE153FF),
                        Color(0xFFAF0CFF)
                    ),
                    angle = 0f
                )
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(24.dp),
                verticalAlignment = Alignment.Top
            ) {
                Column {
                    Text(
                        text = "New board",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        style = MaterialTheme.typography.h5
                    )
                    Text(text = "Create with your friends", color = Color.White)
                    Button(
                        onClick = createBoard,
                        shape = RoundedCornerShape(12.dp),
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color(0xFF941EAD),
                            contentColor = Color.White
                        ),
                    ) {
                        Text(text = "Create board")
                    }
                }
                Image(
                    painter = painterResource(id = R.drawable.forum),
                    contentDescription = "New Board Icon"
                )
            }
        }
    }
}

private fun Modifier.gradientBackground(colors: List<Color>, angle: Float) = this.then(
    Modifier.drawBehind {

        // Setting the angle in radians
        val angleRad = angle / 180f * PI

        // Fractional x
        val x = kotlin.math.cos(angleRad).toFloat()

        // Fractional y
        val y = kotlin.math.sin(angleRad).toFloat()

        // Set the Radius and offset as shown below
        val radius = sqrt(size.width.pow(2) + size.height.pow(2)) / 2f
        val offset = center + Offset(x * radius, y * radius)

        // Setting the exact offset
        val exactOffset = Offset(
            x = kotlin.math.min(offset.x.coerceAtLeast(0f), size.width),
            y = size.height - kotlin.math.min(offset.y.coerceAtLeast(0f), size.height)
        )

        // Draw a rectangle with the above values
        drawRect(
            brush = Brush.linearGradient(
                colors = colors,
                start = Offset(size.width, size.height) - exactOffset,
                end = exactOffset
            ),
            size = size
        )
    }
)


@Preview
@Composable
fun NewBoardCardPreview() {
    NewBoardCard {

    }
}