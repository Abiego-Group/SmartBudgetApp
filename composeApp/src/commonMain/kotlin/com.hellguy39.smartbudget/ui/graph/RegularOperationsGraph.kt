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
import com.hellguy39.smartbudget.feature.login.LoginRoute
import com.hellguy39.smartbudget.feature.new_goal.NewGoalRoute
import com.hellguy39.smartbudget.feature.regular_operations.RegularOperationsRoute

@Composable
fun RegularOperationsGraph(
    navController: NavHostController = rememberNavController()
) {
    val backStackEntry by navController.currentBackStackEntryAsState()

    Scaffold { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = RegularOperationsGraphScreen.RegularOperations.route,
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            composable(route = RegularOperationsGraphScreen.RegularOperations.route) {
                RegularOperationsRoute(
                    navigateToNewGoal = {
                        navController.navigate(route = RegularOperationsGraphScreen.NewGoal.route)
                    }
                )
            }
            composable(route = RegularOperationsGraphScreen.NewGoal.route) {
                NewGoalRoute(
                )
            }
        }
    }
}

sealed class RegularOperationsGraphScreen(val route: String) {

    data object RegularOperations: RegularOperationsGraphScreen("regularOperations")

    data object NewGoal: RegularOperationsGraphScreen("newGoal")

}