package com.example.uijetpackcompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.compose.rememberNavController
import com.example.uijetpackcompose.app.Navigation
import com.google.firebase.Firebase
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.analytics
import com.google.firebase.messaging.FirebaseMessaging
import com.google.firebase.messaging.FirebaseMessagingService
class MainActivity : ComponentActivity() {
    private lateinit var firebaseAnalytics: FirebaseAnalytics

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        firebaseAnalytics = Firebase.analytics
        firebaseAnalytics.logEvent(FirebaseAnalytics.Event.APP_OPEN, null)

        val bundle = Bundle().apply {
            putString("screen_name", "MainScreen")
        }
        firebaseAnalytics.logEvent("screen_view", bundle)

        // Check if app opened from notification
        val fromNotification = intent.extras?.getBoolean("from_notification", false) ?: false
        if (fromNotification) {
            firebaseAnalytics.logEvent("notification_opened", null)
        }

        firebasePushNotification()
        trackButtonClick()

        setContent {
            enableEdgeToEdge()
            val navController = rememberNavController()
            Navigation(navController = navController)

        }
    }

    private fun trackButtonClick() {
        val bundle = Bundle().apply {
            putString("button_name", "Signup")
        }
        firebaseAnalytics.logEvent("button_click", bundle)
    }

    private fun firebasePushNotification() {
        FirebaseMessaging.getInstance().token.addOnCompleteListener { task ->
            if (task.isSuccessful) {
                val token = task.result
                println("FCM Token: $token")
            } else {
                println("FCM: Failed to fetch token ${task.exception}")
            }
        }
    }
}
