package com.edwin.edwin.navigation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.edwin.edwin.ui.theme.screens.dashboard.PreviewDashboard
import com.edwin.edwin.ui.theme.screens.home.HomeScreen
import com.edwin.edwin.ui.theme.screens.login.Login_Screen
import com.edwin.edwin.ui.theme.screens.register.Register_screen
import com.edwin.edwin.ui.theme.screens.splash.Splash_screen

@Composable
fun AppNavHost(modifier: Modifier = Modifier, navController:NavHostController = rememberNavController(),startDestination: String = ROUTE_HOME) {
    NavHost(navController = navController, modifier = modifier, startDestination = startDestination){
        composable(ROUTE_HOME){ HomeScreen(navController) }
        composable(ROUTE_LOGIN){ Login_Screen(navController) }
        composable(ROUTE_REGISTER){ Register_screen(navController) }
        composable (ROUTE_SPLASH){ Splash_screen(navController) }
        composable (ROUTE_DASHBOARD){ PreviewDashboard() }
    }
}