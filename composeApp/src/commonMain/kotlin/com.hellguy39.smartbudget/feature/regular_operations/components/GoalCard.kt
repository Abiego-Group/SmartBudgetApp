package com.hellguy39.smartbudget.feature.regular_operations.components

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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.hellguy39.smartbudget.feature.home.components.randomWalletBackground
import com.hellguy39.smartbudget.ui.theme.actayWideFamily
import com.hellguy39.smartbudget.ui.value.UiSpace
import org.jetbrains.compose.resources.painterResource

@Composable
fun GoalCard(
    title: String,
    description: String,
    onClick: () -> Unit = {}
) {
    Surface(
        modifier = Modifier.size(
            width = 228.dp,
            height = 312.dp
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
                    text = title,
                    fontFamily = actayWideFamily(),
                    color = Color.White,
                    style = MaterialTheme.typography.headlineSmall
                )
                Spacer(Modifier.weight(1f))
                Text(
                    modifier = Modifier,
                    text = description,
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.White
                )
            }
        }
    }
}