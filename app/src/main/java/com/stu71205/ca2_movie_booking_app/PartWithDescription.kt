package com.stu71205.ca2_movie_booking_app

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun PartWithDescription(
    textTitle: String,
    textDescription: String,
    textStarring: String,
    classifiedImage: Painter,
){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp)
            .background(color = Color.Black)
    ){
        Column {
            Row {
                Text(
                    fontSize = 20.sp,
                    color = Color.White,
                    text = textTitle,
                )

                Image(
                    painter = classifiedImage,
                    contentDescription = null,
                    modifier = Modifier
                        .height(20.dp)
                        .width(20.dp)
                        .padding(start = 5.dp)
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            Row {
                Text(
                    fontSize = 12.sp,
                    color = Color.White,
                    text = textStarring
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            Row {
                Text(
                    fontSize = 14.sp,
                    color = Color.White,
                    text = textDescription
                )
            }
        }
    }
}
