package com.hellguy39.smartbudget.ui.graph

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.hellguy39.smartbudget.feature.home.HomeRoute
import com.hellguy39.smartbudget.feature.regular_operations.RegularOperationsRoute
import com.hellguy39.smartbudget.feature.wallet.WalletRoute
import com.hellguy39.smartbudget.ui.components.BottomNavigationBar

@Composable
fun MainNavGraph(
    navController: NavHostController = rememberNavController()
) {
    Scaffold(
        bottomBar = {
            BottomNavigationBar(navController)
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = MainNavGraphScreen.Home.route,
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
        ) {
            composable(MainNavGraphScreen.Home.route) {
                HomeRoute()
            }
            composable(MainNavGraphScreen.Wallet.route) {
                WalletRoute()
            }
            composable(MainNavGraphScreen.RegularOperations.route) {
                RegularOperationsRoute()
            }
            composable(MainNavGraphScreen.Settings.route) {

            }
        }
    }
}

sealed class MainNavGraphScreen(val route: String) {

    data object Home: GlobalNavGraphScreen("Home")

    data object Wallet: GlobalNavGraphScreen("Wallet")

    data object RegularOperations: GlobalNavGraphScreen("RegularOperations")

    data object Settings: GlobalNavGraphScreen("Settings")

}
