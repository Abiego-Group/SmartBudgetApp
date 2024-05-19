package com.hellguy39.smartbudget.feature.new_goal

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.hellguy39.smartbudget.ui.theme.actayWideFamily
import com.hellguy39.smartbudget.ui.theme.interWideFamily
import com.hellguy39.smartbudget.ui.value.UiSpace
import org.jetbrains.compose.resources.painterResource
import smartbudgetapp.composeapp.generated.resources.Res
import smartbudgetapp.composeapp.generated.resources.ic_mage_goals_fill_24

@Composable
fun NewGoalScreen(
    uiState: NewGoalUiState,
    navigateBack: () -> Unit
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
                Text(
                    modifier = Modifier.padding(
                        horizontal = UiSpace.large
                    ),
                    text = "Новая цель",
                    fontFamily = actayWideFamily(),
                    style = MaterialTheme.typography.headlineMedium
                )
            }
            item {
                Surface(
                    modifier = Modifier.fillMaxWidth()
                        .padding(horizontal = UiSpace.large),
                    shape = RoundedCornerShape(16.dp),
                    shadowElevation = 4.dp,
                    color = Color(0xFFFFE5F5)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Text(
                            modifier = Modifier.padding(UiSpace.medium).alpha(0.5f),
                            text = "Категория",
                            fontFamily = interWideFamily(),
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.SemiBold
                        )
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                modifier = Modifier.size(24.dp),
                                painter = painterResource(Res.drawable.ic_mage_goals_fill_24),
                                contentDescription = null
                            )
                            Text(
                                modifier = Modifier.padding(UiSpace.medium),
                                text = "Цель",
                                fontFamily = interWideFamily(),
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.SemiBold
                            )
                        }
                    }
                }
            }
            item {
                Surface(
                    modifier = Modifier.fillMaxWidth()
                        .padding(horizontal = UiSpace.large),
                    shape = RoundedCornerShape(16.dp),
                    shadowElevation = 4.dp,
                    color = MaterialTheme.colorScheme.background
                ) {
                    Text(
                        modifier = Modifier.padding(UiSpace.medium),
                        text = "Купить велик",
                        fontFamily = interWideFamily(),
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }
            item {
                Row(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Surface(
                        modifier = Modifier.fillMaxWidth()
                            .padding(start = UiSpace.large, end = UiSpace.medium)
                            .weight(1f),
                        shape = RoundedCornerShape(16.dp),
                        shadowElevation = 4.dp,
                        color = MaterialTheme.colorScheme.background
                    ) {
                        Row(
                            modifier = Modifier.padding(UiSpace.medium),
                            horizontalArrangement = Arrangement.spacedBy(UiSpace.small),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                modifier = Modifier.alpha(0.5f),
                                text = "c",
                                fontWeight = FontWeight.Medium,
                                style = MaterialTheme.typography.titleMedium,
                                fontFamily = interWideFamily()
                            )
                            Text(
                                text = "19.09.2024",
                                fontFamily = interWideFamily(),
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.SemiBold
                            )
                        }
                    }
                    Surface(
                        modifier = Modifier.fillMaxWidth()
                            .padding(end = UiSpace.large, start = UiSpace.medium)
                            .weight(1f),
                        shape = RoundedCornerShape(16.dp),
                        shadowElevation = 4.dp,
                        color = MaterialTheme.colorScheme.background
                    ) {
                        Row(
                            modifier = Modifier.padding(UiSpace.medium),
                            horizontalArrangement = Arrangement.spacedBy(UiSpace.small),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                modifier = Modifier.alpha(0.5f),
                                text = "по",
                                fontWeight = FontWeight.Medium,
                                style = MaterialTheme.typography.titleMedium,
                                fontFamily = interWideFamily()
                            )
                            Text(
                                text = "20.11.2024",
                                fontFamily = interWideFamily(),
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.SemiBold
                            )
                        }
                    }
                }
            }
            item {
                Surface(
                    modifier = Modifier.fillMaxWidth()
                        .padding(horizontal = UiSpace.large),
                    shape = RoundedCornerShape(16.dp),
                    shadowElevation = 4.dp,
                    color = MaterialTheme.colorScheme.background
                ) {
                    Row(
                        modifier = Modifier,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            modifier = Modifier.padding(UiSpace.medium)
                                .alpha(0.5f),
                            text = "Пополняемость",
                            fontWeight = FontWeight.Medium,
                            style = MaterialTheme.typography.titleMedium,
                            fontFamily = interWideFamily()
                        )
                        Text(
                            modifier = Modifier.padding(UiSpace.medium),
                            text = "раз месяц",
                            fontFamily = interWideFamily(),
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }
            }
            item {
                Surface(
                    modifier = Modifier.fillMaxWidth()
                        .padding(horizontal = UiSpace.large),
                    shape = RoundedCornerShape(16.dp),
                    shadowElevation = 4.dp,
                    color = MaterialTheme.colorScheme.background
                ) {
                    Row(
                        modifier = Modifier,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            modifier = Modifier.padding(UiSpace.medium)
                                .alpha(0.5f),
                            text = "Цель",
                            fontWeight = FontWeight.Medium,
                            style = MaterialTheme.typography.titleMedium,
                            fontFamily = interWideFamily()
                        )
                        Text(
                            modifier = Modifier.padding(UiSpace.medium),
                            text = "120 000 ₽",
                            fontFamily = interWideFamily(),
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }
            }
            item {
                Surface(
                    modifier = Modifier.fillMaxWidth()
                        .padding(horizontal = UiSpace.large),
                    shape = RoundedCornerShape(16.dp),
                    color = Color.Black
                ) {
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .clickable(onClick = { navigateBack() })
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                modifier = Modifier.padding(UiSpace.medium),
                                text = "Сохранить",
                                color = Color.White,
                                fontFamily = interWideFamily()
                            )
                        }
                    }
                }
            }
        }
    }
}
