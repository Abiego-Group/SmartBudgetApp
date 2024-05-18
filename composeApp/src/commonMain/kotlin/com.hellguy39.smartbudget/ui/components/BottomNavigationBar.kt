package com.hellguy39.smartbudget.ui.components

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.compose.currentBackStackEntryAsState
import org.jetbrains.compose.resources.painterResource

@Composable
fun BottomNavigationBar(
    navController: NavController
) {
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = backStackEntry?.destination

    val navItems = rememberMainBottomNavigationItems()

    NavigationBar(
        modifier = Modifier,
    ) {
        navItems.forEach { navItem ->

            val isSelected = currentDestination?.hierarchy
                ?.any { it.route == navItem.route } == true

            NavigationBarItem(
                selected = isSelected,
                colors = NavigationBarItemDefaults.colors().copy(
                    selectedIndicatorColor = Color.Transparent
                ),
                onClick = {
                    navController.navigate(navItem.route)
                },
                icon = {
                    Icon(
                        painter = painterResource(
                            if (isSelected) navItem.selectedIconRes else navItem.unselectedIconRes
                        ),
                        contentDescription = null
                    )
                }
            )
        }
    }
}