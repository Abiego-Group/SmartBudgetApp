package com.hellguy39.smartbudget.feature.regular_operations

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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
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
import com.hellguy39.smartbudget.feature.regular_operations.components.GoalCard
import com.hellguy39.smartbudget.ui.theme.actayWideFamily
import com.hellguy39.smartbudget.ui.theme.interWideFamily
import com.hellguy39.smartbudget.ui.value.UiSpace
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource
import smartbudgetapp.composeapp.generated.resources.Res
import smartbudgetapp.composeapp.generated.resources.ic_arrow_forward_24
import smartbudgetapp.composeapp.generated.resources.ic_credit_card_24
import smartbudgetapp.composeapp.generated.resources.ic_mage_goals_fill_24
import smartbudgetapp.composeapp.generated.resources.ic_mingcute_stock_fill_24
import smartbudgetapp.composeapp.generated.resources.ic_other_24
import smartbudgetapp.composeapp.generated.resources.ic_solar_wad_24

@Composable
fun RegularOperationsScreen() {
    Scaffold {
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(
                bottom = UiSpace.large
            )
        ) {
            item {
                Text(
                    modifier = Modifier.padding(UiSpace.large),
                    text = "Подборка целей",
                    fontFamily = actayWideFamily(),
                    style = MaterialTheme.typography.headlineMedium
                )
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
                    item {
                        GoalCard(
                            title = "Отпуск",
                            description = "Предлагаем вам рассмотреть удивительное путешествие на берега Норвегии, в поисках себя",
                            onClick = {}
                        )
                    }
                    item {
                        GoalCard(
                            title = "Mercedes Benz",
                            description = "Mercedes Benz премиум класса, чувствуйте себя королем на дороге, роскошь ваше второе имя",
                            onClick = {}
                        )
                    }
                    item {
                        GoalCard(
                            title = "Отпуск",
                            description = "Предлагаем вам рассмотреть удивительное путешествие на берега Норвегии, в поисках себя",
                            onClick = {}
                        )
                    }
                }
            }
            item {
                Text(
                    modifier = Modifier.padding(UiSpace.large),
                    text = "Категории",
                    fontFamily = actayWideFamily(),
                    style = MaterialTheme.typography.headlineMedium
                )
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
                            category = "Вклады",
                            iconRes = Res.drawable.ic_solar_wad_24,
                            color = Color(0xFFE9E5FF)
                        )
                        GoalCategoryItem(
                            category = "Кредиты",
                            iconRes = Res.drawable.ic_credit_card_24,
                            color = Color(0xFFE5F6FF)
                        )
                        GoalCategoryItem(
                            category = "Мои цели",
                            iconRes = Res.drawable.ic_mage_goals_fill_24,
                            color = Color(0xFFFFE5F5)
                        )
                        GoalCategoryItem(
                            category = "Инвестиции",
                            iconRes = Res.drawable.ic_mingcute_stock_fill_24,
                            color = Color(0xFFE7FFE5)
                        )
                        GoalCategoryItem(
                            category = "Другие",
                            iconRes = Res.drawable.ic_other_24,
                            color = Color(0xFFE7FFE5)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun GoalCategoryItem(
    category: String,
    iconRes: DrawableResource,
    color: Color
) {
    Row(
        modifier = Modifier.fillMaxWidth()
            .padding(UiSpace.large),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(Modifier.background(color, CircleShape)) {
            Icon(
                modifier = Modifier.padding(UiSpace.small),
                painter = painterResource(iconRes),
                contentDescription = null
            )
        }
        Spacer(Modifier.width(16.dp))
        Text(
            text = category,
            fontFamily = interWideFamily(),
            fontWeight = FontWeight.SemiBold,
            style = MaterialTheme.typography.titleMedium
        )
        Spacer(Modifier.weight(1f))
        Icon(
            modifier = Modifier.size(20.dp),
            painter = painterResource(Res.drawable.ic_arrow_forward_24),
            contentDescription = null
        )
    }
    HorizontalDivider(
        modifier = Modifier.fillMaxWidth()
            .alpha(0.5f)
            .padding(horizontal = UiSpace.large)
    )
}
