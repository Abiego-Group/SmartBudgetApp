package com.hellguy39.smartbudget.feature.register

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun RegisterRoute(
    registerViewModel: RegisterViewModel = viewModel { RegisterViewModel() },
    navigateToMain: () -> Unit,
    navigateBack: () -> Unit
) {
    val uiState by registerViewModel.uiState.collectAsState()

    LaunchedEffect(key1 = uiState.isAuthenticated) {
        if (uiState.isAuthenticated) {
            navigateToMain()
        }
    }

    RegisterScreen(
        uiState = uiState,
        onNavigationClick = { navigateBack() },
        onRegisterClick = { registerViewModel.register() },
        onLoginEdited = { text -> registerViewModel.editLogin(text) },
        onPasswordEdited = { text -> registerViewModel.editPassword(text)}
    )
}