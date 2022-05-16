package kz.arctan.mtask.common.presentation.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlin.random.Random

data class Circle(val x: Float, val y: Float, val radius: Float)

@Composable
fun BackgroundWithPurpleCircles(n: Int) {
    Canvas(
        modifier = Modifier
            .fillMaxSize()
            .blur(
                radiusX = 12.dp,
                radiusY = 12.dp,
                edgeTreatment = BlurredEdgeTreatment.Unbounded
            ),
    ) {
        val circles = ArrayList<Circle>()
        repeat(n) {
            var circle: Circle
            do {
                val x = Random.nextInt(1000).toFloat()
                val y = Random.nextInt(2000).toFloat()
                val radius = floatArrayOf(200f, 300f, 250f).random()
                circle = Circle(x, y, radius)
            } while (circles.intercept(circle))
            drawPurpleCircle(
                center = Offset(circle.x, circle.y),
                radius = circle.radius,
            )

            circles.add(circle)

        }
    }
}

fun List<Circle>.intercept(circle: Circle): Boolean {
    return any {
        val distSquared =
            (circle.x - it.x) * (circle.x - it.x) + (circle.y - it.y) * (circle.y - it.y)
        val radiusSumSquared = (circle.radius + it.radius) * (circle.radius + it.radius)
        distSquared <= radiusSumSquared
    }
}

fun DrawScope.drawPurpleCircle(center: Offset, radius: Float) {
    drawCircle(
        brush = Brush.radialGradient(
            listOf(
                Color(0xFFB743AB),
                Color(0xFF792ABC)
            ),
            radius = radius,
            tileMode = TileMode.Clamp,
            center = center
        ),
        radius = radius,
        center = center
    )
}

@Preview
@Composable
fun BackgroundWithPurpleCirclesPreview() {
    BackgroundWithPurpleCircles(4)
}