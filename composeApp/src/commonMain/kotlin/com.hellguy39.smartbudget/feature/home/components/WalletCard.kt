package com.hellguy39.smartbudget.feature.home.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.hellguy39.smartbudget.model.Wallet
import com.hellguy39.smartbudget.ui.value.UiSpace

@Composable
fun WalletCard(
    wallet: Wallet,
    onClick: () -> Unit = {}
) {
    Surface(
        modifier = Modifier.sizeIn(
            minWidth = 128.dp,
            minHeight = 180.dp
        ),
        shape = RoundedCornerShape(16.dp),
        color = MaterialTheme.colorScheme.secondaryContainer
    ) {
        Box(
            modifier = Modifier.clickable(
                onClick = onClick
            )
        ) {
            Column(
                modifier = Modifier.padding(UiSpace.medium),
                verticalArrangement = Arrangement.spacedBy(UiSpace.small),
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = wallet.name
                )
                Text(
                    text = wallet.balance
                )
                Text(
                    text = wallet.number
                )
            }
        }
    }
}
