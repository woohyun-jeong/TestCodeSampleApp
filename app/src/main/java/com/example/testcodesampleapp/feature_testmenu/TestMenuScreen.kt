package com.example.testcodesampleapp.feature_testmenu

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun TestMenuScreen(
    navController: NavController
) {
    Column {
        Button(
            onClick = {}
        ) {
            Text(text = "Material UI 테스트")
        }
        Button(
            onClick = {}
        ) {
            Text(text = "Navigation 테스트")
        }
        Button(
            onClick = {}
        ) {
            Text(text = "Push 테스트")
        }
        Button(
            onClick = {}
        ) {
            Text(text = "Service 테스트")
        }
        Button(
            onClick = {}
        ) {
            Text(text = "Room DB 테스트")
        }
        Button(
            onClick = {}
        ) {
            Text(text = "BLE 테스트")
        }


    }

}