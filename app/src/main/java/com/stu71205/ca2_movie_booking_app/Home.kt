package com.stu71205.ca2_movie_booking_app

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Gray,
                    titleContentColor = Color.White
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
            Row (
                verticalAlignment = Alignment.CenterVertically,
            ){
                MovieScree1(onClick = {
                    navController.navigate(Routes.FirstScreen.route)
                })

                Spacer(modifier = Modifier.width(40.dp))

                MovieScree2(onClick = {
                    navController.navigate(Routes.SecondScreen.route)
                })
            }
            
            Row (
                verticalAlignment = Alignment.CenterVertically,
            ){
                MovieScree3(onClick = {
                    navController.navigate(Routes.ThirdScreen.route)
                })

                Spacer(modifier = Modifier.width(40.dp))

                MovieScree4(onClick = {
                    navController.navigate(Routes.FourthScreen.route)
                })
            }
        }
    }
}