package kz.arctan.mtask.registration.presentation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import kz.arctan.mtask.common.presentation.components.Heading
import kz.arctan.mtask.common.presentation.components.TextFieldWithElevation
import androidx.lifecycle.viewmodel.compose.viewModel
import kz.arctan.mtask.common.presentation.components.RoundedButtonWithGradient

@Composable
fun RegistrationScreen(viewModel: RegistrationViewModel = viewModel()) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Heading(
            text = "MTask", startColor = Color(0xFFB743AB),
            endColor = Color(0xFF7A29BC),
            style = MaterialTheme.typography.h2
        )
        Text(text = "Create your account", style = MaterialTheme.typography.h5)
        Spacer(modifier = Modifier.height(20.dp))
        TextFieldWithElevation(
            value = viewModel.registrationUiState.username,
            onValueChange = viewModel::usernameChange,
            hint = "Create a username"
        )
        Spacer(modifier = Modifier.height(10.dp))
        TextFieldWithElevation(
            value = viewModel.registrationUiState.email,
            onValueChange = viewModel::emailChange,
            hint = "Enter your E-Mail"
        )
        Spacer(modifier = Modifier.height(10.dp))
        TextFieldWithElevation(
            value = viewModel.registrationUiState.password,
            onValueChange = viewModel::passwordChange,
            hint = "Create password"
        )
        Spacer(modifier = Modifier.height(10.dp))
        TextFieldWithElevation(
            value = viewModel.registrationUiState.repeatPassword,
            onValueChange = viewModel::repeatPasswordChange,
            hint = "Repeat password"
        )
        Spacer(modifier = Modifier.height(20.dp))
        RoundedButtonWithGradient(
            text = "Sign Up",
            onClick = viewModel::signUp,
            textAlign = TextAlign.Center,
            endColor = Color(0xFF792ABC),
            startColor = Color(0xFFB743AB),
            modifier = Modifier.fillMaxWidth(0.7f)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Terms & Conditions",
            textDecoration = TextDecoration.Underline,
            color = Color(0xFF6A6A6A),
            modifier = Modifier.clickable { viewModel.seeTermAndConditions() }
        )
    }
}