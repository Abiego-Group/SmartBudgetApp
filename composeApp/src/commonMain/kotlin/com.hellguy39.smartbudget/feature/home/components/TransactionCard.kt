package com.hellguy39.smartbudget.feature.home.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun TransactionCard() {
    Box(
        modifier = Modifier.clickable(
            onClick = {}
        )
    ) {
        Row {
            Column {
                Text(
                    text = "text"
                )
                Text(
                    text = "text"
                )
            }
            Text(
                text = "text"
            )
        }
    }
}