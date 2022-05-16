package kz.arctan.mtask.login.presentation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import kz.arctan.mtask.common.presentation.components.Heading
import kz.arctan.mtask.common.presentation.components.RoundedButtonWithGradient
import kz.arctan.mtask.common.presentation.components.TextFieldWithElevation

@Composable
fun LoginScreen(viewModel: LoginViewModel = viewModel()) {
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
        Text(
            "Welcome back!",
            Modifier.padding(vertical = 24.dp),
            style = MaterialTheme.typography.h6
        )
        Spacer(modifier = Modifier.height(32.dp))
        TextFieldWithElevation(
            value = viewModel.loginUiState.login,
            onValueChange = { viewModel.loginChange(it) },
            hint = "Login/Email"
        )
        Spacer(modifier = Modifier.height(12.dp))
        TextFieldWithElevation(
            value = viewModel.loginUiState.password,
            onValueChange = { viewModel.passwordChange(it) },
            hint = "Password"
        )
        Spacer(modifier = Modifier.height(24.dp))
        RoundedButtonWithGradient(
            text = "Sign In",
            onClick = { viewModel.signIn() },
            textAlign = TextAlign.Center,
            endColor = Color(0xFF792ABC),
            startColor = Color(0xFFB743AB),
            modifier = Modifier.fillMaxWidth(0.7f)
        )
        Spacer(modifier = Modifier.height(12.dp))
        RoundedButtonWithGradient(
            text = "Sign Up",
            onClick = { viewModel.signUp() },
            textAlign = TextAlign.Center,
            endColor = Color(0xFFAD95D4),
            startColor = Color(0xFFDDD3ED),
            modifier = Modifier.fillMaxWidth(0.7f)
        )
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = "Forgot password?",
            textDecoration = TextDecoration.Underline,
            color = Color(0xFF6A6A6A),
            modifier = Modifier.clickable { viewModel.forgotPassword() }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}