package com.hellguy39.smartbudget.feature.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.hellguy39.smartbudget.model.Wallet
import com.hellguy39.smartbudget.ui.theme.actayWideFamily
import com.hellguy39.smartbudget.ui.value.UiSpace
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource
import smartbudgetapp.composeapp.generated.resources.Res
import smartbudgetapp.composeapp.generated.resources.image_beach_rocks
import smartbudgetapp.composeapp.generated.resources.image_bridge

@Composable
fun WalletCard(
    wallet: Wallet,
    onClick: () -> Unit = {}
) {
    Surface(
        modifier = Modifier.size(
            width = 128.dp,
            height = 196.dp
        ),
        shape = RoundedCornerShape(16.dp),
        color = MaterialTheme.colorScheme.secondaryContainer
    ) {
        Image(
            modifier = Modifier.fillMaxSize()
                .blur(4.dp),
            painter = painterResource(randomWalletBackground()),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
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
                    text = wallet.name,
                    fontFamily = actayWideFamily(),
                )
                Spacer(Modifier.weight(1f))
                Text(
                    text = wallet.balance,
                    fontFamily = actayWideFamily(),
                )
                Text(
                    text = wallet.number,
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }
    }
}

fun randomWalletBackground() : DrawableResource {
    return listOf(
        Res.drawable.image_bridge,
        Res.drawable.image_beach_rocks
    ).random()
}
