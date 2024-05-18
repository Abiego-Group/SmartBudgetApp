package com.hellguy39.smartbudget.ui.components

import androidx.compose.runtime.Composable
import com.hellguy39.smartbudget.ui.graph.MainNavGraphScreen
import smartbudgetapp.composeapp.generated.resources.Res
import smartbudgetapp.composeapp.generated.resources.ic_category_outline_24
import smartbudgetapp.composeapp.generated.resources.ic_home_outline_24
import smartbudgetapp.composeapp.generated.resources.ic_settings_outline_24
import smartbudgetapp.composeapp.generated.resources.ic_wallet_outline_24
import smartbudgetapp.composeapp.generated.resources.label_home
import smartbudgetapp.composeapp.generated.resources.label_regular
import smartbudgetapp.composeapp.generated.resources.label_settings
import smartbudgetapp.composeapp.generated.resources.label_wallet

@Composable
fun rememberMainBottomNavigationItems() : List<NavigationItem> {
    return listOf(
        NavigationItem(
            route = MainNavGraphScreen.Home.route,
            iconRes = Res.drawable.ic_home_outline_24,
            labelRes = Res.string.label_home
        ),
        NavigationItem(
            route = MainNavGraphScreen.Wallet.route,
            iconRes = Res.drawable.ic_wallet_outline_24,
            labelRes = Res.string.label_wallet
        ),
        NavigationItem(
            route = MainNavGraphScreen.RegularOperations.route,
            iconRes = Res.drawable.ic_category_outline_24,
            labelRes = Res.string.label_regular
        ),
        NavigationItem(
            route = MainNavGraphScreen.Settings.route,
            iconRes = Res.drawable.ic_settings_outline_24,
            labelRes = Res.string.label_settings
        )
    )
}