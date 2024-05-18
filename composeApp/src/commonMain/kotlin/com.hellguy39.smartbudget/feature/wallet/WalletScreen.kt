package com.hellguy39.smartbudget.feature.wallet

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import com.hellguy39.smartbudget.feature.home.components.TransactionCard
import com.hellguy39.smartbudget.ui.theme.interWideFamily
import com.hellguy39.smartbudget.ui.value.UiSpace

@Composable
fun WalletScreen() {
    Scaffold {
        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {
            item {
                Column(
                    modifier = Modifier.padding(vertical = UiSpace.medium)
                        .padding(
                            start = UiSpace.large,
                            end = UiSpace.large
                        ),
                ) {
                    Text(
                        modifier = Modifier.alpha(0.5f),
                        text = "29 мая, пн",
                        fontFamily = interWideFamily(),
                    )
                    TransactionCard()
                    TransactionCard()
                    TransactionCard()
                }
            }
        }
    }
}