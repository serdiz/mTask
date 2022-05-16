package kz.arctan.mtask.board.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kz.arctan.mtask.R
import kz.arctan.mtask.common.domain.entity.Task
import kz.arctan.mtask.common.domain.entity.TaskGroup
import kz.arctan.mtask.common.presentation.components.Point
import java.nio.file.WatchEvent

@Composable
fun TaskGroupCard(
    taskGroup: TaskGroup,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth(),
        shape = RoundedCornerShape(24.dp),
        elevation = 8.dp,
        backgroundColor = Color(200, 200, 200, 0xF1)
    ) {
        Column {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            ) {
                Box(
                    modifier = Modifier
                        .background(
                            color = Color(0.612f, 0.153f, 0.69f, 1.0f),
                            shape = RoundedCornerShape(24.dp)
                        )
                        .width(128.dp)
                        .padding(horizontal = 8.dp, vertical = 4.dp)
                ) {
                    Text(text = taskGroup.title, color = Color.White)
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Card(shape = CircleShape, elevation = 12.dp) {
                        Icon(
                            painterResource(id = R.drawable.baseline_more_horiz_24),
                            contentDescription = "More"
                        )
                    }
                }
            }
            Column(
                modifier = Modifier
                    .padding(horizontal = 24.dp, vertical = 8.dp)
            ) {
                taskGroup.tasks.forEach { task ->
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                    ) {
                        Point(color = if (task.isCompleted) Color.Black else Color.White)
                        Text(text = task.name)
                    }
                }
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun TaskGroupCardPreview() {
    TaskGroupCard(
        taskGroup = TaskGroup(
            title = "Task group 2",
            tasks = listOf(
                Task(
                    name = "An incomplete task",
                    isCompleted = false
                ),
                Task(
                    name = "A completed task",
                    isCompleted = true
                ),
                Task(
                    name = "A completed task",
                    isCompleted = true
                )
            )
        ),
    )
}