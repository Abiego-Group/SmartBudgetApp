package com.hellguy39.smartbudget.feature.home

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hellguy39.smartbudget.di.AppContainer
import com.hellguy39.smartbudget.model.Wallet
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class HomeViewModel: ViewModel() {

    private val walletRepository = AppContainer.walletRepository

    private val _uiState = MutableStateFlow(HomeUiState())
    val uiState: StateFlow<HomeUiState> = _uiState.asStateFlow()

    init {
        viewModelScope.launch {
            _uiState.update { state ->
                state.copy(
                    wallets = mutableStateListOf<Wallet>().apply {
                        addAll(walletRepository.getWallets())
                    }
                )
            }
        }
    }

}

data class HomeUiState(
    val title: String = "[MainScreenTitle]",
    val wallets: SnapshotStateList<Wallet> = mutableStateListOf()
)