package com.hellguy39.smartbudget.feature.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.hellguy39.smartbudget.ui.theme.actayWideFamily
import com.hellguy39.smartbudget.ui.value.UiSpace
import org.jetbrains.compose.resources.painterResource
import smartbudgetapp.composeapp.generated.resources.Res
import smartbudgetapp.composeapp.generated.resources.sign_to_number_text_field

@Composable
fun LoginScreen(
    uiState: LoginUiState = LoginUiState(),
    onLoginClick: () -> Unit = {},
    onNumberEdited: (text: String) -> Unit = {},
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = Color.Black
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = innerPadding.calculateTopPadding())
                .padding(horizontal = UiSpace.extraLarge, vertical = UiSpace.extraLarge)
                .imePadding()
                .navigationBarsPadding(),
            verticalArrangement = Arrangement.spacedBy(UiSpace.small),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                modifier = Modifier.weight(1f),
                text = "ДЕЛАЕМ\nФИНАНСЫ\nПРОЗРАЧНЕЕ",
                fontFamily = actayWideFamily(),
                style = MaterialTheme.typography.displaySmall,
                color = Color.White
            )
            Image(
                modifier = Modifier.weight(1f),
                painter = painterResource(Res.drawable.sign_to_number_text_field),
                contentDescription = null
            )
            Column (
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(UiSpace.large),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Column(
                    modifier = Modifier,
                    verticalArrangement = Arrangement.spacedBy(0.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Row(
                        modifier = Modifier.padding(UiSpace.medium),
                        horizontalArrangement = Arrangement.spacedBy(UiSpace.small)
                    ) {
                        TextField(
                            value = uiState.number,
                            onValueChange = { text -> onNumberEdited(text) },
                            prefix = { Text("+7", color = Color.Black) },
                            placeholder = { Text("(999) 999-99-99") },
                            shape = RoundedCornerShape(16.dp),
                            colors = TextFieldDefaults.colors().copy(
                                focusedTextColor = Color.Black,
                                unfocusedTextColor = Color.Black,
                                focusedContainerColor = Color.White,
                                unfocusedContainerColor = Color.White,
                                focusedIndicatorColor = Color.Transparent,
                                unfocusedIndicatorColor = Color.Transparent,
                            ),
                            keyboardOptions = KeyboardOptions()
                                .copy(keyboardType = KeyboardType.Number)
                        )
                    }

                    TextButton(
                        modifier = Modifier,
                        onClick = onLoginClick,
                        enabled = !uiState.isLoading
                    ) {
                        if (uiState.isLoading) {
                            CircularProgressIndicator(
                                modifier = Modifier.size(20.dp)
                            )
                        } else {
                            Text(
                                "Получить код",
                                color = Color.White
                            )
                        }
                    }
                }
            }
        }
    }
}


