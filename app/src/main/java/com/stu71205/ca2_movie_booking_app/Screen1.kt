package com.stu71205.ca2_movie_booking_app

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Screen1(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = topAppBarColors(
                    containerColor = Color.Gray,
                    titleContentColor = Color.White,
                ),
                title = {
                    Text(text = "Copy")
                }
            )
        },
        bottomBar = {
            BottomAppBar (
                containerColor = Color.Gray,
                contentColor = Color.White,
            ){
                Text(
                    modifier = Modifier
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    text = "COPY Screen 1 bottom app bar COPY",
                )
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
//            Movie()
            PartWithImage(
                painter = painterResource(id = R.drawable.movie_kfp4),
            )

            PartWithDescription(
                classifiedImage = painterResource(id = R.drawable.age_free),
                textTitle = "KUNG FU PANDA 4",
                textStarring = "Starring Jack Black, Awkwafina, Viola David, Dustin Hoffman, Bryan Cranston, Mr. Beast\n" +
                            "Run Time 1hr 34mins",
                textDescription = "After Po is tapped to become the Spiritual Leader of the Valley of Peace, he needs to find and train a new Dragon Warrior, while a wicked sorceress plans to re-summon all the master villains whom Po has vanquished to the spirit realm.\n"
            )

            SeatSelection()
            ToHomeButton(onClick = {
                navController.navigate(Routes.HomeScreen.route)
            })
        }
    }
}

