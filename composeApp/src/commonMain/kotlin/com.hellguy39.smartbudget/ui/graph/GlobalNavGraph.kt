package com.hellguy39.smartbudget.ui.graph

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.hellguy39.smartbudget.feature.main.MainRoute

@Composable
fun GlobalNavGraph(
    navController: NavHostController = rememberNavController()
) {
    val backStackEntry by navController.currentBackStackEntryAsState()

    Scaffold { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = GlobalNavGraphScreen.Main.route,
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            composable(route = GlobalNavGraphScreen.Main.route) {
                MainRoute()
            }
        }
    }
}

sealed class GlobalNavGraphScreen(val route: String) {

    data object Main: GlobalNavGraphScreen("Main")

}