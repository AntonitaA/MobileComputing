package com.example.mobilecomputing

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

class MobileComputingAppState (
    val navController: NavHostController
){
// back button
    fun navigateBack(){
        navController.popBackStack()
    }
}

@Composable
fun rememberMobileComputingAppState(
    navController: NavHostController = rememberNavController()
) = remember(navController){
    MobileComputingAppState(navController)
}