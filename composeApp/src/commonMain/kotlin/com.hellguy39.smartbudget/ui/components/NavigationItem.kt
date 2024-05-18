package com.hellguy39.smartbudget.ui.components

import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.StringResource

data class NavigationItem(
    val route: String,
    val iconRes: DrawableResource,
    val labelRes: StringResource
)
