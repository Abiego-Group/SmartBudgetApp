package com.hellguy39.smartbudget.feature.main

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun MainRoute(
    viewModel: MainViewModel = viewModel { MainViewModel() }
) {
    val uiState by viewModel.uiState.collectAsState()

    MainScreen(
        uiState = uiState
    )
}