package com.example.uijetpackcompose.app

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.uijetpackcompose.app.presentation.ui.Login
import com.example.uijetpackcompose.app.presentation.ui.Screen1
import com.example.uijetpackcompose.app.presentation.ui.Screen2
import com.example.uijetpackcompose.app.presentation.ui.Screen3
import com.example.uijetpackcompose.app.presentation.ui.SignUp

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "screen1",
    ) {
        composable(
            "screen1",
            exitTransition = {
                slideOutOfContainer(
                    AnimatedContentTransitionScope.SlideDirection.Left,
                    animationSpec = tween(700)

                ) + fadeOut()
            },
            popEnterTransition = {
                slideIntoContainer(
                    AnimatedContentTransitionScope.SlideDirection.Right,
                    animationSpec = tween(700)
                ) + fadeIn()
            }

        )
         { Screen1(navController) }

        composable(
            "screen2",
            exitTransition = {
                slideOutOfContainer(
                    AnimatedContentTransitionScope.SlideDirection.Left,
                    animationSpec = tween(700)

                ) + fadeOut()
            },
            popEnterTransition = {
                slideIntoContainer(
                    AnimatedContentTransitionScope.SlideDirection.Right,
                    animationSpec = tween(700)
                ) + fadeIn()
            }

        ) { Screen2(navController) }

        composable("screen3") { Screen3(navController) }
        composable("SignUp") { SignUp(navController) }
        composable("Login") { Login(navController) }
    }
}
