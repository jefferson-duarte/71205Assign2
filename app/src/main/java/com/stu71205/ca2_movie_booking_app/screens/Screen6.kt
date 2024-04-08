package com.stu71205.ca2_movie_booking_app.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.stu71205.ca2_movie_booking_app.R
import com.stu71205.ca2_movie_booking_app.content_parts.PartBottomBar
import com.stu71205.ca2_movie_booking_app.content_parts.PartWithDescription
import com.stu71205.ca2_movie_booking_app.content_parts.PartWithImage
import com.stu71205.ca2_movie_booking_app.content_parts.SeatSelection

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Screen6(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = topAppBarColors(
                    containerColor = Color.Gray,
                    titleContentColor = Color.White,
                ),
                title = {
                    Text(text = "THE FIRST OMEN")
                }
            )
        },
        bottomBar = {
            BottomAppBar (
                containerColor = Color.Gray,
                contentColor = Color.White,
            ){
                PartBottomBar(navController)
            }
        },
    ) {innerPadding ->
        Column(
            modifier = Modifier
                .background(color = Color.Black)
                .padding(innerPadding)
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally,
        ){
            PartWithImage(
                painter = painterResource(id = R.drawable.movie_tfo),
            )

            PartWithDescription(
                classifiedImage = painterResource(id = R.drawable.age_16),
                textTitle = "THE FIRST OMEN",
                textStarring = "Bill Nighy, Ralph Ineson, Sônia Braga, Nell Tiger Free, Tawfeek Barhom\n" +
                            "Run Time 1hr 59mins",
                textDescription = "When a young American woman is sent to Rome to begin a life of service to the church, she encounters a darkness that causes her to question her own faith and uncovers a terrifying conspiracy that hopes to bring about the birth of evil incarnate."
            )

            SeatSelection()
        }
    }
}