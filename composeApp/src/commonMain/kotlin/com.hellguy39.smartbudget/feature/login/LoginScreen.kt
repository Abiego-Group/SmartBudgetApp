package com.hellguy39.smartbudget.feature.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.hellguy39.smartbudget.ui.theme.AppTheme
import com.hellguy39.smartbudget.ui.value.UiSpace
import org.jetbrains.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(
    uiState: LoginUiState = LoginUiState(),
    onLoginClick: () -> Unit = {},
    onRegisterClick: () -> Unit = {},
    onLoginEdited: (text: String) -> Unit = {},
    onPasswordEdited: (text: String) -> Unit = {}
) {
    var isPasswordVisible by remember { mutableStateOf(false) }

    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = innerPadding.calculateTopPadding())
                .padding(horizontal = UiSpace.extraLarge, vertical = UiSpace.extraLarge)
                .imePadding()
                .navigationBarsPadding(),
            verticalArrangement = Arrangement.spacedBy(UiSpace.extraLarge),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.weight(1f))
            Column (
                verticalArrangement = Arrangement.spacedBy(UiSpace.small),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = ""
                )
            }

            Column (
                verticalArrangement = Arrangement.spacedBy(UiSpace.large),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(0.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    OutlinedTextField(
                        modifier = Modifier.fillMaxWidth(),
                        value = uiState.login,
                        onValueChange = onLoginEdited,
                        label = { Text("Логин") },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
                    )
                    OutlinedTextField(
                        modifier = Modifier.fillMaxWidth(),
                        value = uiState.password,
                        onValueChange = onPasswordEdited,
                        label = { Text("Пароль") },
                        visualTransformation = if (isPasswordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                        trailingIcon = {
                            IconButton(onClick = { isPasswordVisible = isPasswordVisible.not() }) {

                            }
                        }
                    )
                }

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Button(
                        modifier = Modifier.fillMaxWidth(),
                        onClick = onLoginClick,
                        enabled = !uiState.isLoading
                    ) {
                        if (uiState.isLoading) {
                            CircularProgressIndicator(
                                modifier = Modifier.size(20.dp)
                            )
                        } else {
                            Text("Вход")
                        }
                    }
                    TextButton(
                        modifier = Modifier.fillMaxWidth(),
                        onClick = onRegisterClick,
                        enabled = !uiState.isLoading
                    ) {
                        Text("Регистрация")
                    }
                }
            }
        }
    }
}


