package com.stu71205.ca2_movie_booking_app

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.stu71205.ca2_movie_booking_app.content_parts.PartBottomBar

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
                    Text(
                        text = "MOVIES",
                        fontFamily = FontFamily(Font(R.font.roboto_condensed_regular)),
                        textAlign = TextAlign.Center
                    )
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
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(color = Color.Black)
                .verticalScroll(rememberScrollState())
        ){
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.SpaceBetween,
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

                Spacer(modifier = Modifier.height(20.dp))

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

                Spacer(modifier = Modifier.height(20.dp))

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
}