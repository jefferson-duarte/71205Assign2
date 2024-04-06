package com.stu71205.ca2_movie_booking_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.stu71205.ca2_movie_booking_app.ui.theme.CA2_Movie_Booking_AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CA2_Movie_Booking_AppTheme {
                AppNavigation()
            }
        }
    }
}
