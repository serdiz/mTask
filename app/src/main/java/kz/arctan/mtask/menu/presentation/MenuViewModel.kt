package kz.arctan.mtask.menu.presentation

import androidx.compose.foundation.layout.R
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.painterResource
import androidx.lifecycle.ViewModel

class MenuViewModel : ViewModel() {
    var menuUiState by mutableStateOf(MenuUiState())
        private set

    fun createBoard() {

    }
}