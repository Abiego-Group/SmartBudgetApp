package com.hellguy39.smartbudget.feature.regular_operations

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.hellguy39.smartbudget.feature.regular_operations.components.GoalCard
import com.hellguy39.smartbudget.ui.theme.actayWideFamily
import com.hellguy39.smartbudget.ui.theme.interWideFamily
import com.hellguy39.smartbudget.ui.value.UiSpace

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
                    shadowElevation = 12.dp,
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        GoalCategoryItem("Вклады")
                        GoalCategoryItem("Кредиты")
                        GoalCategoryItem("Мои цели")
                        GoalCategoryItem("Инвестиции")
                        GoalCategoryItem("Другие")
                    }
                }
            }
        }
    }
}

@Composable
fun GoalCategoryItem(
    category: String
) {
    Row(
        modifier = Modifier.fillMaxWidth()
            .padding(UiSpace.large)
    ) {
        Text(
            text = category,
            fontFamily = interWideFamily(),
            fontWeight = FontWeight.SemiBold,
            style = MaterialTheme.typography.titleMedium
        )
    }
    HorizontalDivider(
        modifier = Modifier.fillMaxWidth()
            .alpha(0.5f)
            .padding(horizontal = UiSpace.large)
    )
}
