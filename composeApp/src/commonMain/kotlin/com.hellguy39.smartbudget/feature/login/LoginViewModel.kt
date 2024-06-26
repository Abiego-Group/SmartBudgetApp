package com.hellguy39.smartbudget.feature.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hellguy39.smartbudget.di.AppContainer
import com.hellguy39.smartbudget.model.LoginParams
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class LoginViewModel : ViewModel() {

    private val authRepository = AppContainer.authRepository

    private val _uiState = MutableStateFlow(LoginUiState())
    val uiState = _uiState.asStateFlow()

    init {
        viewModelScope.launch {
            val isAuthenticated = authRepository.isAuthenticated()
            _uiState.update { state -> state.copy(isAuthenticated = isAuthenticated) }
        }
    }

    fun login() {

        if (_uiState.value.isLoading) return
        toggleLoading()

        viewModelScope.launch {

            val params = LoginParams(
                phoneNumber = _uiState.value.number,
            )

            val isAuthenticated = authRepository.login(params)

            _uiState.update { state -> state.copy(isAuthenticated = isAuthenticated) }

            toggleLoading()
        }
    }

    fun editNumber(number: String) {
        _uiState.update { state -> state.copy(number = number) }
    }

    fun editPassword(password: String) {
        //_uiState.update { state -> state.copy(password = password) }
    }

    private fun toggleLoading() {
        _uiState.update { state -> state.copy(isLoading = state.isLoading.not()) }
    }

}

data class LoginUiState(
    val isLoading: Boolean = false,
    val isAuthenticated: Boolean = false,
    val number: String = ""
)
