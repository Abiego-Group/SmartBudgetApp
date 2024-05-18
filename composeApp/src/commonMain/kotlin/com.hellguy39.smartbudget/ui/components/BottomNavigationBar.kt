package com.hellguy39.smartbudget.ui.components

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.compose.currentBackStackEntryAsState
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource

@Composable
fun BottomNavigationBar(
    navController: NavController
) {
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = backStackEntry?.destination

    val navItems = rememberMainBottomNavigationItems()

    NavigationBar(
        modifier = Modifier
    ) {
        navItems.forEach { navItem ->

            val isSelected = currentDestination?.hierarchy
                ?.any { it.route == navItem.route } == true

            NavigationBarItem(
                selected = isSelected,
                onClick = {
                    navController.navigate(navItem.route)
                },
                label = {
                    Text(text = stringResource(navItem.labelRes))
                },
                icon = {
                    Icon(
                        painter = painterResource(navItem.iconRes),
                        contentDescription = null
                    )
                }
            )
        }
    }
}