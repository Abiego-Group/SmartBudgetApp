package com.hellguy39.smartbudget.feature.login

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun LoginRoute(
    loginViewModel: LoginViewModel = viewModel { LoginViewModel() },
    navigateToMain: () -> Unit
) {
    val uiState by loginViewModel.uiState.collectAsState()

    LaunchedEffect(key1 = uiState.isAuthenticated) {
        if (uiState.isAuthenticated) {
            navigateToMain()
        }
    }

    LoginScreen(
        uiState = uiState,
        onLoginClick = { loginViewModel.login() },
        onNumberEdited = { text -> loginViewModel.editNumber(text) }
    )
}