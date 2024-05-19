package com.hellguy39.smartbudget.feature.regular_operations

import androidx.compose.runtime.Composable

@Composable
fun RegularOperationsRoute(
    navigateToNewGoal: () -> Unit
) {
    RegularOperationsScreen(
        navigateToNewGoal = navigateToNewGoal
    )
}