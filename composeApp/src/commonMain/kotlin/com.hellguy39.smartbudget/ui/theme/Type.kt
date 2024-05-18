package com.hellguy39.smartbudget.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import org.jetbrains.compose.resources.Font
import smartbudgetapp.composeapp.generated.resources.Res
import smartbudgetapp.composeapp.generated.resources.actay_wide_bold
import smartbudgetapp.composeapp.generated.resources.inter_extra_bold
import smartbudgetapp.composeapp.generated.resources.inter_medium

val Typography = Typography()

@Composable
fun actayWideFamily() = FontFamily(
//    Font(R.font.firasans_light, FontWeight.Light),
//    Font(R.font.firasans_regular, FontWeight.Normal),
//    Font(R.font.firasans_italic, FontWeight.Normal, FontStyle.Italic),
//    Font(R.font.firasans_medium, FontWeight.Medium),
    Font(Res.font.actay_wide_bold, FontWeight.Bold)
)

@Composable
fun interWideFamily() = FontFamily(
//    Font(R.font.firasans_light, FontWeight.Light),
//    Font(R.font.firasans_regular, FontWeight.Normal),
//    Font(R.font.firasans_italic, FontWeight.Normal, FontStyle.Italic),
//    Font(R.font.firasans_medium, FontWeight.Medium),
    Font(Res.font.inter_medium, FontWeight.Medium),
    Font(Res.font.inter_extra_bold, FontWeight.ExtraBold),
)
