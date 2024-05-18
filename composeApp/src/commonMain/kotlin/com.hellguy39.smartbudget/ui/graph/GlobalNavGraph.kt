package com.hellguy39.smartbudget.ui.graph

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

@Composable
fun GlobalNavGraph(
    navController: NavHostController = rememberNavController()
) {
    val backStackEntry by navController.currentBackStackEntryAsState()

    Scaffold { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = GlobalNavGraphScreen.Auth.route,
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            composable(route = GlobalNavGraphScreen.Main.route) {
                MainNavGraph()
            }
            composable(route = GlobalNavGraphScreen.Auth.route) {
                AuthNavGraph(
                    navigateToMain = {
                        navController.navigate(route = GlobalNavGraphScreen.Main.route) {
                            popUpToCurrent(navController)
                        }
                    }
                )
            }
        }
    }
}

sealed class GlobalNavGraphScreen(val route: String) {

    data object Main: GlobalNavGraphScreen("Main")

    data object Auth: GlobalNavGraphScreen("Auth")

}