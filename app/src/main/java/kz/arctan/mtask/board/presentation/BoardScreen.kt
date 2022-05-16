package kz.arctan.mtask.board.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import kz.arctan.mtask.board.presentation.components.TaskGroupCard
import kz.arctan.mtask.common.presentation.components.BackgroundWithPurpleCircles
import java.time.format.DateTimeFormatter

@Composable
fun BoardScreen(
    viewModel: BoardViewModel = viewModel()
) {
    BackgroundWithPurpleCircles(4)
    Column {
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(bottomEnd = 24.dp, bottomStart = 24.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(12.dp)
            ) {
                Column {
                    Text(
                        text = "Due ${viewModel.uiState.board.date.format(DateTimeFormatter.ISO_LOCAL_DATE)}"
                    )
                    Text(
                        text = viewModel.uiState.board.title,
                        style = MaterialTheme.typography.h5,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Text(
                        text = viewModel.uiState.board.description,
                        style = MaterialTheme.typography.subtitle1
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Outlined.Settings,
                        contentDescription = "Settings",
                        tint = Color.Blue,
                        modifier = Modifier.size(50.dp)
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(52.dp))
        LazyColumn(verticalArrangement = Arrangement.spacedBy(48.dp)) {
            items(items = viewModel.uiState.board.taskGroups) { taskGroup ->
                TaskGroupCard(
                    taskGroup = taskGroup,
                )
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BoardScreenPreview() {
    BoardScreen()
}