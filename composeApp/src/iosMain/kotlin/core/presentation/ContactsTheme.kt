package core.presentation

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import core.presentation.ui.theme.AppTypography
import core.presentation.ui.theme.darkScheme
import core.presentation.ui.theme.lightScheme

@Composable
actual fun ContactsTheme(
    darkTheme: Boolean,
    dynamicColor: Boolean,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        darkTheme -> darkScheme
        else -> lightScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = AppTypography,
        content = content
    )
}