package com.hellguy39.smartbudget.feature.new_goal

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

class NewGoalViewModel: ViewModel() {

    private val walletRepository = AppContainer.walletRepository

    private val _uiState = MutableStateFlow(NewGoalUiState())
    val uiState: StateFlow<NewGoalUiState> = _uiState.asStateFlow()

    init {
        viewModelScope.launch {
            _uiState.update { state ->
                state.copy(

                )
            }
        }
    }

}

data class NewGoalUiState(
    val title: String = ""
)