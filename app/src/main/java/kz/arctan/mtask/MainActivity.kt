package kz.arctan.mtask

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import kz.arctan.mtask.board.presentation.BoardScreen
import kz.arctan.mtask.board.presentation.components.TaskGroupCard
import kz.arctan.mtask.common.domain.entity.Task
import kz.arctan.mtask.common.domain.entity.TaskGroup
import kz.arctan.mtask.menu.presentation.MenuScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BoardScreen()
        }
    }
}
