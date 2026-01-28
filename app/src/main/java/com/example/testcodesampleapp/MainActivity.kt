package com.example.testcodesampleapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.testcodesampleapp.nav.graph.testMenuNavGraph
import com.example.testcodesampleapp.nav.router.RouteTestMenu
import com.example.testcodesampleapp.ui.theme.TestCodeSampleAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TestCodeSampleAppTheme {
                val navigationController = rememberNavController()
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ApplicationScreen(
                        navigationController = navigationController,
                        innerPadding = innerPadding
                    )
                }
            }
        }
    }
}

@Composable
fun ApplicationScreen(
    navigationController: NavHostController,
    innerPadding: PaddingValues
) {
    NavHost(
        navController = navigationController,
        startDestination = RouteTestMenu,
        enterTransition = { EnterTransition.None },
        exitTransition = { ExitTransition.None },
        popEnterTransition = { EnterTransition.None },
        popExitTransition = { ExitTransition.None },
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
    ) {
        testMenuNavGraph(
            navigationController
        )

    }
}