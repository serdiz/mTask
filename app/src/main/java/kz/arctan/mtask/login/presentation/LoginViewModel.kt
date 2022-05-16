package kz.arctan.mtask.login.presentation

import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {
    fun loginChange(login: String) {
        loginUiState = loginUiState.copy(login = login)
    }

    fun passwordChange(password: String) {
        loginUiState = loginUiState.copy(password = password)
    }

    fun signIn() {

    }

    fun signUp() {

    }

    fun forgotPassword() {

    }

    var loginUiState by mutableStateOf(LoginUiState())
        private set
}