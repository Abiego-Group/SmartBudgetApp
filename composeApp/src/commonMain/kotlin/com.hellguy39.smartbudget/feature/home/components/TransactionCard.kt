package com.hellguy39.smartbudget.feature.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.hellguy39.smartbudget.ui.theme.interWideFamily
import com.hellguy39.smartbudget.ui.value.UiSpace
import org.jetbrains.compose.resources.painterResource
import smartbudgetapp.composeapp.generated.resources.Res
import smartbudgetapp.composeapp.generated.resources.ic_category_filled_24

@Composable
fun TransactionCard() {
    Box(
        modifier = Modifier.clip(RoundedCornerShape(16.dp))
    ) {
        Box(
            modifier = Modifier.clickable(
                onClick = {}
            )
        ) {
            Row(
                modifier = Modifier.padding(vertical = UiSpace.medium),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier.size(48.dp).background(
                        color = Color(0xFFE9E5FF),
                        shape = RoundedCornerShape(16.dp)
                    ),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        modifier = Modifier.size(24.dp),
                        painter = painterResource(Res.drawable.ic_category_filled_24),
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.surfaceVariant
                    )
                }
                Spacer(Modifier.width(UiSpace.large))
                Column {
                    Text(
                        text = "Парикмахерская",
                        fontFamily = interWideFamily()
                    )
                    Text(
                        modifier = Modifier.alpha(0.5f),
                        text = "14:50",
                        fontFamily = interWideFamily()
                    )
                }
                Spacer(Modifier.weight(1f))
                Text(
                    text = "1200 Р.",
                    fontFamily = interWideFamily()
                )
            }
        }
    }
}