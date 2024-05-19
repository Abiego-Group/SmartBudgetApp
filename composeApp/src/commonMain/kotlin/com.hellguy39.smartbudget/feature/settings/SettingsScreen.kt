package com.hellguy39.smartbudget.feature.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.hellguy39.smartbudget.feature.regular_operations.GoalCategoryItem
import com.hellguy39.smartbudget.feature.settings.SettingsUiState
import com.hellguy39.smartbudget.ui.theme.actayWideFamily
import com.hellguy39.smartbudget.ui.value.UiSpace
import org.jetbrains.compose.resources.painterResource
import smartbudgetapp.composeapp.generated.resources.Res
import smartbudgetapp.composeapp.generated.resources.ic_credit_card_24
import smartbudgetapp.composeapp.generated.resources.ic_exit_fill_24
import smartbudgetapp.composeapp.generated.resources.ic_mage_goals_fill_24
import smartbudgetapp.composeapp.generated.resources.ic_main_settings_24
import smartbudgetapp.composeapp.generated.resources.ic_mingcute_stock_fill_24
import smartbudgetapp.composeapp.generated.resources.ic_security_24
import smartbudgetapp.composeapp.generated.resources.ic_settings_notif_24
import smartbudgetapp.composeapp.generated.resources.ic_user_settings
import smartbudgetapp.composeapp.generated.resources.image_avatar_medium

@Composable
fun SettingsScreen(
    uiState: SettingsUiState,
    onLogout: () -> Unit = {}
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
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        modifier = Modifier
                            .size(150.dp)
                            .clip(CircleShape),
                        painter = painterResource(Res.drawable.image_avatar_medium),
                        contentDescription = null
                    )
                }
            }
            item {
                Row(
                    modifier = Modifier.fillMaxWidth()
                        .padding(
                            start = UiSpace.large,
                            end = UiSpace.large
                        ),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        modifier = Modifier.padding(UiSpace.large),
                        text = "Александр Стихин",
                        fontFamily = actayWideFamily(),
                        style = MaterialTheme.typography.headlineMedium
                    )
                }

            }
            item {
                Surface(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(32.dp),
                    shadowElevation = 4.dp,
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        GoalCategoryItem(
                            category = "Личная информация",
                            iconRes = Res.drawable.ic_user_settings,
                            color = Color(0xFFE9E5FF)
                        )
                        GoalCategoryItem(
                            category = "Уведомления",
                            iconRes = Res.drawable.ic_settings_notif_24,
                            color = Color(0xFFE5F6FF)
                        )
                        GoalCategoryItem(
                            category = "Основные",
                            iconRes = Res.drawable.ic_main_settings_24,
                            color = Color(0xFFFFE5F5)
                        )
                        GoalCategoryItem(
                            category = "Конфиденциальность",
                            iconRes = Res.drawable.ic_security_24,
                            color = Color(0xFFE7FFE5)
                        )
                        TextButton(
                            modifier = Modifier.align(Alignment.CenterHorizontally)
                                .padding(UiSpace.medium),
                            onClick = { onLogout() },
                        ) {
                            Text(
                                modifier = Modifier.padding(),
                                text = "Выйти",
                                color = Color.Red
                            )
                            Spacer(Modifier.size(ButtonDefaults.IconSpacing))
                            Icon(
                                modifier = Modifier.size(
                                    ButtonDefaults.IconSize
                                ),
                                painter = painterResource(Res.drawable.ic_exit_fill_24),
                                contentDescription = "Anal",
                                tint = Color.Red
                            )
                        }
                    }
                }
            }
        }
    }
}
