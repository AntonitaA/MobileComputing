package com.example.mobilecomputing.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.mobilecomputing.MobileComputingAppState
import com.example.mobilecomputing.rememberMobileComputingAppState
import com.example.mobilecomputing.ui.home.Home
import com.example.mobilecomputing.ui.login.Login
import com.example.mobilecomputing.ui.payment.Payment

// for the NAVIGATION in the app
@Composable
fun MobileComputingApp(
    appState: MobileComputingAppState = rememberMobileComputingAppState()
) {
    NavHost(
        navController = appState.navController,
        startDestination = "Login"
    ){
        composable(route = "Login"){
        Login(navController = appState.navController)
        }
        composable(route = "home"){
            Home()
        }
        composable(route = "payment"){
            Payment(onBackPress = { appState.navigateBack() })
        }
    }

}