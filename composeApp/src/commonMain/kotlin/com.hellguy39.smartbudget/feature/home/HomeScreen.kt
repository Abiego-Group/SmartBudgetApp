package com.hellguy39.smartbudget.feature.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.hellguy39.smartbudget.feature.home.components.TransactionCard
import com.hellguy39.smartbudget.feature.home.components.WalletCard
import com.hellguy39.smartbudget.ui.theme.actayWideFamily
import com.hellguy39.smartbudget.ui.theme.interWideFamily
import com.hellguy39.smartbudget.ui.value.UiSpace
import org.jetbrains.compose.resources.painterResource
import smartbudgetapp.composeapp.generated.resources.Res
import smartbudgetapp.composeapp.generated.resources.image_avatar_medium

@Composable
fun HomeScreen(
    uiState: HomeUiState
) {
    Scaffold { innerPadding ->
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(
                top = innerPadding.calculateTopPadding() + UiSpace.large,
                bottom = innerPadding.calculateBottomPadding() + UiSpace.large
            ),
            verticalArrangement = Arrangement.spacedBy(UiSpace.large)
        ) {
            item {
                Row(
                    modifier = Modifier.fillMaxWidth()
                        .padding(
                            start = UiSpace.large,
                            end = UiSpace.large
                        ),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        modifier = Modifier
                            .size(48.dp)
                            .clip(CircleShape),
                        painter = painterResource(Res.drawable.image_avatar_medium),
                        contentDescription = null
                    )
                    Spacer(Modifier.weight(1f))
                    Text("€ \$ ₽")
                }
            }
            item {
                Row(
                    modifier = Modifier.fillMaxWidth()
                        .padding(
                            start = UiSpace.large,
                            end = UiSpace.large
                        ),
                    horizontalArrangement = Arrangement.spacedBy(UiSpace.large)
                ) {
                    Column {
                        Text(
                            modifier = Modifier.alpha(0.5f),
                            text = "Доходы",
                            fontFamily = interWideFamily(),
                            style = MaterialTheme.typography.titleMedium
                        )
                        Text(
                            text = "126.6k",
                            fontFamily = actayWideFamily(),
                            style = MaterialTheme.typography.headlineMedium
                        )
                    }
                    Column {
                        Text(
                            modifier = Modifier.alpha(0.5f),
                            text = "Расходы",
                            fontFamily = interWideFamily(),
                            style = MaterialTheme.typography.titleMedium
                        )
                        Text(
                            text = "156.6k",
                            fontFamily = actayWideFamily(),
                            style = MaterialTheme.typography.headlineMedium
                        )
                    }
                    Column {
                        Text(
                            modifier = Modifier.alpha(0.5f),
                            text = "Доступно",
                            fontFamily = interWideFamily(),
                            style = MaterialTheme.typography.titleMedium
                        )
                        Text(
                            text = "59.2k",
                            fontFamily = actayWideFamily(),
                            style = MaterialTheme.typography.headlineMedium
                        )
                    }
                }
            }
            item {
                LazyRow(
                    modifier = Modifier,
                    horizontalArrangement = Arrangement.spacedBy(UiSpace.large),
                    contentPadding = PaddingValues(
                        start = UiSpace.large,
                        end = UiSpace.large
                    )
                ) {
                    items(uiState.wallets) { wallet ->
                        WalletCard(wallet)
                    }
                }
            }
            item {
                Surface(
                    modifier = Modifier.fillMaxWidth()
                        .padding(horizontal = UiSpace.large),
                    shape = RoundedCornerShape(24.dp),
                    shadowElevation = 4.dp,
                    color = MaterialTheme.colorScheme.background
                ) {
                    Row(
                        modifier = Modifier.padding(
                            vertical = UiSpace.medium,
                            horizontal = UiSpace.medium
                        ),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Прогноз на июнь",
                            fontFamily = actayWideFamily(),
                            style = MaterialTheme.typography.headlineSmall
                        )
                        Box(
                            modifier = Modifier.background(
                                color = Color(0xFFE7FFE5),
                                shape = RoundedCornerShape(16.dp)
                            )
                        ) {
                            Text(
                                modifier = Modifier.padding(UiSpace.small),
                                text = "+20%",
                                fontFamily = interWideFamily(),
                                style = MaterialTheme.typography.bodyLarge,
                                color = Color(0xFF27D518),
                            )
                        }
                    }
                }
            }
            item {
                Column(
                    modifier = Modifier
                        .padding(
                            start = UiSpace.large,
                            end = UiSpace.large
                        )
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(UiSpace.medium),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Транзакции",
                            fontFamily = actayWideFamily(),
                            style = MaterialTheme.typography.headlineMedium
                        )
                        Text(
                            modifier = Modifier.alpha(0.5f),
                            text = "Сегодня",
                            fontFamily = interWideFamily(),
                            style = MaterialTheme.typography.bodySmall,
                        )
                    }
                    Column(
                        modifier = Modifier.padding(vertical = UiSpace.medium),
                    ) {
                        TransactionCard()
                        TransactionCard()
                        TransactionCard()
                    }
                }
            }
        }
    }
}
