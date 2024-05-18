package com.hellguy39.smartbudget.feature.wallet

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.hellguy39.smartbudget.feature.home.components.TransactionCard
import com.hellguy39.smartbudget.ui.theme.actayWideFamily
import com.hellguy39.smartbudget.ui.theme.interWideFamily
import com.hellguy39.smartbudget.ui.value.UiSpace
import org.jetbrains.compose.resources.painterResource
import smartbudgetapp.composeapp.generated.resources.Res
import smartbudgetapp.composeapp.generated.resources.fake_graphic
import smartbudgetapp.composeapp.generated.resources.ic_arrow_back_24
import smartbudgetapp.composeapp.generated.resources.ic_arrow_forward_24
import smartbudgetapp.composeapp.generated.resources.ic_keyboard_arrow_down_24

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
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "Cчёт 1",
                            fontFamily = actayWideFamily(),
                            style = MaterialTheme.typography.titleMedium
                        )
                        Icon(
                            modifier = Modifier.align(Alignment.CenterVertically),
                            painter = painterResource(Res.drawable.ic_keyboard_arrow_down_24),
                            contentDescription = null
                        )
                    }
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            modifier = Modifier.align(Alignment.CenterVertically),
                            painter = painterResource(Res.drawable.ic_arrow_back_24),
                            contentDescription = null
                        )
                        Image(
                            modifier = Modifier
                                .padding(UiSpace.large)
                                .size(250.dp),
                            painter = painterResource(Res.drawable.fake_graphic),
                            contentDescription = null
                        )
                        Icon(
                            modifier = Modifier.align(Alignment.CenterVertically),
                            painter = painterResource(Res.drawable.ic_arrow_forward_24),
                            contentDescription = null
                        )
                    }
                    Text(
                        modifier = Modifier.alpha(0.5f),
                        text = "29 мая, пн",
                        fontFamily = interWideFamily(),
                    )
                    TransactionCard(
                        iconBackTint = Color(0xFFEBFF00),
                        iconTint = Color.Black
                    )
                    TransactionCard(
                        iconBackTint = Color(0xFF49BDE2),
                        iconTint = Color.White
                    )
                    TransactionCard(
                        iconBackTint = Color(0xFFEBFF00),
                        iconTint = Color.Black
                    )
                    TransactionCard(
                        iconBackTint = Color(0xFF49BDE2),
                        iconTint = Color.White
                    )
                    TransactionCard(
                        iconBackTint = Color(0xFFEBFF00),
                        iconTint = Color.Black
                    )
                    TransactionCard(
                        iconBackTint = Color(0xFF49BDE2),
                        iconTint = Color.White
                    )
                    TransactionCard(
                        iconBackTint = Color(0xFFEBFF00),
                        iconTint = Color.Black
                    )
                    TransactionCard(
                        iconBackTint = Color(0xFF49BDE2),
                        iconTint = Color.White
                    )
                }
            }
        }
    }
}