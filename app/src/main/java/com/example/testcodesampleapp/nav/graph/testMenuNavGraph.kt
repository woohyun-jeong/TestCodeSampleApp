package com.example.testcodesampleapp.nav.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.testcodesampleapp.feature_testmenu.TestMenuScreen
import com.example.testcodesampleapp.nav.router.RouteTestMenu

fun NavGraphBuilder.testMenuNavGraph(
    navController: NavHostController
) {
    composable<RouteTestMenu> {
        TestMenuScreen(
            navController = navController
        )
    }
}