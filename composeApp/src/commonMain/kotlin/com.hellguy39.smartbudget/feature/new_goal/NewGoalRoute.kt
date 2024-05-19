package com.hellguy39.smartbudget.feature.new_goal

import com.hellguy39.smartbudget.feature.home.HomeScreen
import com.hellguy39.smartbudget.feature.home.HomeViewModel
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun NewGoalRoute(
    viewModel: NewGoalViewModel = viewModel { NewGoalViewModel() }
) {
    val uiState by viewModel.uiState.collectAsState()

    NewGoalScreen(
        uiState = uiState
    )
}