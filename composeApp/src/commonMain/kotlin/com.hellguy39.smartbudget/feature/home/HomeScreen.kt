package com.hellguy39.smartbudget.feature.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.hellguy39.smartbudget.feature.home.components.TransactionCard
import com.hellguy39.smartbudget.feature.home.components.WalletCard
import com.hellguy39.smartbudget.ui.value.UiSpace

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    uiState: HomeUiState
    ) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("[HomeScreen]")
                }
            )
        },
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(
                top = innerPadding.calculateTopPadding(),
                bottom = innerPadding.calculateBottomPadding(),
                start = UiSpace.medium,
                end = UiSpace.medium
            ),
            verticalArrangement = Arrangement.spacedBy(UiSpace.medium)
        ) {
            item {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(UiSpace.medium)
                ) {
                    Column {
                        Text(
                            text = "Доходы"
                        )
                        Text(
                            text = "text"
                        )
                    }
                    Column {
                        Text(
                            text = "Расходы"
                        )
                        Text(
                            text = "text"
                        )
                    }
                    Column {
                        Text(
                            text = "Доступно"
                        )
                        Text(
                            text = "text"
                        )
                    }
                }
            }
            item {
                LazyRow(
                    modifier = Modifier,
                    horizontalArrangement = Arrangement.spacedBy(UiSpace.medium)
                ) {
                    items(uiState.wallets) { wallet ->
                        WalletCard(wallet)
                    }
                }
            }
            item {
                Column {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(UiSpace.small),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Транзакции",
                            style = MaterialTheme.typography.titleLarge
                        )
                        Text(
                            text = "Сегодня",
                            style = MaterialTheme.typography.bodySmall
                        )
                    }
                    Column {
                        TransactionCard()
                        TransactionCard()
                        TransactionCard()
                    }
                }
            }
        }
    }
}
