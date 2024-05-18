package com.hellguy39.smartbudget.feature.register

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hellguy39.smartbudget.feature.login.AuthRepositoryImpl
import com.hellguy39.smartbudget.feature.login.LoginParams
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class RegisterViewModel : ViewModel() {

    private val authRepository = AuthRepositoryImpl()

    private val _uiState = MutableStateFlow(RegisterUiState())
    val uiState = _uiState.asStateFlow()

    fun register() {
        if (_uiState.value.isLoading) return
        toggleLoading()

        viewModelScope.launch {
            val params = RegisterParams(
                login = _uiState.value.login,
                password = _uiState.value.password,
            )
            val isAuthenticated = authRepository.register(params)
            _uiState.update { state -> state.copy(isAuthenticated = isAuthenticated) }
            toggleLoading()
        }
    }

    fun editLogin(login: String) {
        _uiState.update { state -> state.copy(login = login) }
    }

    fun editPassword(password: String) {
        _uiState.update { state -> state.copy(password = password) }
    }

    private fun toggleLoading() {
        _uiState.update { state -> state.copy(isLoading = state.isLoading.not()) }
    }
}

data class RegisterUiState(
    val isLoading: Boolean = false,
    val isAuthenticated: Boolean = false,
    val login: String = "",
    val password: String = "",
)

data class RegisterParams(
    val login: String,
    val password: String,
)
