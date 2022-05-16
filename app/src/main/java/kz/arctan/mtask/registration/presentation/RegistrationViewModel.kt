package kz.arctan.mtask.registration.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class RegistrationViewModel : ViewModel() {
    var registrationUiState by mutableStateOf(RegistrationUiState())
        private set

    fun usernameChange(username: String) {
        registrationUiState = registrationUiState.copy(username = username)
    }

    fun emailChange(email: String) {
        registrationUiState = registrationUiState.copy(email = email)
    }

    fun passwordChange(password: String) {
        registrationUiState = registrationUiState.copy(password = password)
    }

    fun repeatPasswordChange(repeatPassword: String) {
        registrationUiState = registrationUiState.copy(repeatPassword = repeatPassword)
    }

    fun signUp() {

    }

    fun seeTermAndConditions() {

    }
}