package com.example.uijetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.uijetpackcompose.app.Navigation
import com.example.uijetpackcompose.app.presentation.ui.Login
import com.example.uijetpackcompose.app.presentation.ui.Screen1
import com.example.uijetpackcompose.app.presentation.ui.Screen2
import com.example.uijetpackcompose.app.presentation.ui.Screen3
import com.example.uijetpackcompose.app.presentation.ui.SignUp
import com.example.uijetpackcompose.ui.theme.UIJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController() // Correctly initialized
            Navigation(navController = navController)
        }
    }
}

