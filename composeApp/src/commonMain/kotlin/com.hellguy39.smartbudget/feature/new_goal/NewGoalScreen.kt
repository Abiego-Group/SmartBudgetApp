package com.hellguy39.smartbudget.feature.new_goal
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
import com.hellguy39.smartbudget.feature.home.HomeUiState
import com.hellguy39.smartbudget.feature.home.components.TransactionCard
import com.hellguy39.smartbudget.feature.home.components.WalletCard
import com.hellguy39.smartbudget.ui.theme.actayWideFamily
import com.hellguy39.smartbudget.ui.theme.interWideFamily
import com.hellguy39.smartbudget.ui.value.UiSpace
import org.jetbrains.compose.resources.painterResource
import smartbudgetapp.composeapp.generated.resources.Res
import smartbudgetapp.composeapp.generated.resources.image_avatar_medium

@Composable
fun NewGoalScreen(
    uiState: NewGoalUiState
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
                    Text(
                        modifier = Modifier.padding(UiSpace.large),
                        text = "Новая цель",
                        fontFamily = actayWideFamily(),
                        style = MaterialTheme.typography.headlineMedium
                    )
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
                            text = "Категория",
                            fontFamily = actayWideFamily(),
                            style = MaterialTheme.typography.headlineMedium,
                            color = Color.Gray
                        )
                        Text(
                            modifier = Modifier.alpha(0.5f),
                            text = "Цель",
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
