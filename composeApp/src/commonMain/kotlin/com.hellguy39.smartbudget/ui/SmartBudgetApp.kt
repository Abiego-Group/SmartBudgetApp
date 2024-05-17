package com.hellguy39.smartbudget.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import com.hellguy39.smartbudget.ui.graph.GlobalNavGraph
import com.hellguy39.smartbudget.ui.theme.AppTheme
import com.hellguy39.smartbudget.ui.value.UiSpace
import getPlatform

@Composable
fun SmartBudgetApp() {
    AppTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            GlobalNavGraph()
        }
        DebugPanel()
    }
}

@Composable
fun DebugPanel() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomEnd
    ) {
        Surface(
            modifier = Modifier.alpha(0.3f),
            color = MaterialTheme.colorScheme.onBackground
        ) {
            Column(
                modifier = Modifier.padding(UiSpace.small),
                verticalArrangement = Arrangement.spacedBy(UiSpace.small)
            ) {
                Text(
                    "DebugPanel",
                    color = Color.White,
                    style = MaterialTheme.typography.bodySmall
                )
                Text(
                    "Platform: ${getPlatform().name}",
                    color = Color.White,
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }
    }
}