package com.hellguy39.smartbudget.feature.settings

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hellguy39.smartbudget.di.AppContainer
import com.hellguy39.smartbudget.di.AppContainer.authRepository
import com.hellguy39.smartbudget.model.Wallet
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class SettingsViewModel: ViewModel() {

    private val _uiState = MutableStateFlow(SettingsUiState())
    val uiState: StateFlow<SettingsUiState> = _uiState.asStateFlow()

    init {
        viewModelScope.launch {
            _uiState.update { state ->
                state.copy(
                )
            }
        }
    }
    fun logout() {
        viewModelScope.launch {
            authRepository.logout()
        }
    }
}

data class SettingsUiState(
    val title: String = "",
)