package com.stu71205.ca2_movie_booking_app

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlin.random.Random

@Composable
fun SeatSelection() {
    var selectedSeats by remember { mutableIntStateOf(0) }
    val totalSeats = Random.nextInt(0, 16)

    if (totalSeats < 3){
        selectedSeats = totalSeats
    }

    MaterialTheme {
        Column(
            modifier = Modifier
                .background(color = Color.Black),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Row {
                Text(
                    color = Color.White,
                    text = "Select Seats ",
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                )

                Spacer(modifier = Modifier.width(8.dp))

                TextButton(
                    modifier = Modifier
                        .background(
                            shape = ShapeDefaults.Large,
                            color = Color.LightGray
                        )
                        .size(35.dp)
                        .align(Alignment.CenterVertically),
                    enabled = selectedSeats > 0,
                    onClick = {
                        if (selectedSeats > 0) {
                            selectedSeats--
                        }
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.White),

                    ){
                    Text(
                        text = "-",
                        color = Color.Black,
                    )
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    color = Color.White,
                    text="$selectedSeats",
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                )

                Spacer(modifier = Modifier.width(8.dp))

                TextButton(
                    modifier = Modifier
                        .background(
                            shape = ShapeDefaults.Large,
                            color = Color.LightGray
                        )
                        .size(35.dp)
                        .align(Alignment.CenterVertically),
                    enabled = selectedSeats < totalSeats,
                    onClick = {
                        if (selectedSeats < totalSeats) {
                            selectedSeats++
                        }
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.White),

                    ) {
                    Text(
                        text = "+",
                        color = Color.Black,
                    )
                }

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    color = Color.White,
                    text ="${totalSeats - selectedSeats} seats remaining",
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                )
            }
        }
    }
}

