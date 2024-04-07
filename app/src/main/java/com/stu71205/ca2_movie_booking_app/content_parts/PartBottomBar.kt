package com.stu71205.ca2_movie_booking_app.content_parts

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.stu71205.ca2_movie_booking_app.Routes

@Composable
fun PartBottomBar(navController: NavController){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        IconButton(onClick = { navController.navigate(Routes.HomeScreen.route) }) {
            Icon(Icons.Default.Home, contentDescription = "Home")
        }
        IconButton(onClick = {}) {
            Icon(Icons.Default.Search, contentDescription = "Search")
        }
        IconButton(onClick = {}) {
            Icon(Icons.Default.Settings, contentDescription = "Settings")
        }
    }
}