package kz.arctan.mtask.registration.presentation

data class RegistrationUiState(
    val username: String = "",
    val email: String = "",
    val password: String = "",
    val repeatPassword: String = ""
)