import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.hellguy39.smartbudget.App

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "SmartBudgetApp",
    ) {
        App()
    }
}