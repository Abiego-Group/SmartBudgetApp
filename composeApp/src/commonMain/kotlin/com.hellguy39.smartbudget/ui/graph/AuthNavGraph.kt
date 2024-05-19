package com.hellguy39.smartbudget.ui.graph

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.NavOptionsBuilder
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.hellguy39.smartbudget.feature.home.SettingsRoute
import com.hellguy39.smartbudget.feature.login.LoginRoute

@Composable
fun AuthNavGraph(
    navController: NavHostController = rememberNavController(),
    navigateToMain: () -> Unit,
    ) {
    val backStackEntry by navController.currentBackStackEntryAsState()

    Scaffold { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = AuthNavGraphScreen.Login.route,
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            composable(route = AuthNavGraphScreen.Login.route) {
                LoginRoute(
                    navigateToMain = navigateToMain,
                )
            }
        }
    }
}

fun NavOptionsBuilder.popUpToCurrent(navController: NavController) {
    val route = navController.currentBackStackEntry?.destination?.route ?: return
    popUpTo(route) {
        inclusive =  true
    }
}

sealed class AuthNavGraphScreen(val route: String) {

    data object Login: AuthNavGraphScreen("login")

    data object Exit: AuthNavGraphScreen("Exit")

}

