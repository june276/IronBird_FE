package com.example.greetingcard.ui.theme.navigation

sealed class Screen(val route: String) {
    object Splash : Screen(route = "splash_screen")
    object Home: Screen(route = "home")
    object CreatePlan: Screen(route = "create_plan")
}

