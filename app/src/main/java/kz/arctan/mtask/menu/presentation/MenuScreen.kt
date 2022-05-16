package kz.arctan.mtask.menu.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import kz.arctan.mtask.R
import kz.arctan.mtask.menu.presentation.components.BoardCard
import kz.arctan.mtask.menu.presentation.components.NewBoardCard
import java.time.format.DateTimeFormatter


@Composable
fun MenuScreen(
    viewModel: MenuViewModel = viewModel()
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 24.dp, top = 32.dp, end = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(text = "Hey,", style = MaterialTheme.typography.h5)
                Text(
                    text = viewModel.menuUiState.username,
                    fontWeight = FontWeight.Bold,
                    style = MaterialTheme.typography.h5
                )
            }
            Image(
                painter = painterResource(id = R.drawable.ic_profile),
                contentDescription = "Profile icon",
                modifier = Modifier.size(100.dp)
            )
        }
        NewBoardCard(
            createBoard = viewModel::createBoard
        )
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Your board",
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.h5
            )
            Text(text = "See all", textDecoration = TextDecoration.Underline)
        }
        LazyRow(horizontalArrangement = Arrangement.spacedBy(24.dp)) {
            items(items = viewModel.menuUiState.boards) { board ->
                BoardCard(
                    date = "Due ${board.date.format(DateTimeFormatter.ISO_DATE)}",
                    title = board.title,
                    description = board.description
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MenuScreenPreview() {
    MenuScreen()
}