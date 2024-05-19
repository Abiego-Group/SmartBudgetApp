package com.hellguy39.smartbudget.feature.home

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import com.hellguy39.smartbudget.feature.settings.SettingsViewModel

@Composable
fun SettingsRoute(
    settingsViewModel: SettingsViewModel = viewModel { SettingsViewModel() },
    navigateToLogin: () -> Unit,
    ) {
    val uiState by settingsViewModel.uiState.collectAsState()

    SettingsScreen(
        uiState = uiState,
        onLogout = {
            settingsViewModel.logout()
            navigateToLogin()
        }
    )
}