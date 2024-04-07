package com.stu71205.ca2_movie_booking_app

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ShapeDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun MovieScree1(onClick: () -> Unit){
    ElevatedButton(
        onClick = {onClick()},
        shape = ShapeDefaults.ExtraSmall,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Gray
        ),
        modifier = Modifier
            .height(200.dp)
            .width(125.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.poster_kf4),
            contentDescription = null,
            modifier = Modifier
                .requiredSize(200.dp)
        )
    }
}

@Composable
fun MovieScree2(onClick: () -> Unit){
    ElevatedButton(
        onClick = {onClick()},
        shape = ShapeDefaults.ExtraSmall,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Gray
        ),
        modifier = Modifier
            .height(200.dp)
            .width(125.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.poster_dune),
            contentDescription = null,
            modifier = Modifier
                .requiredSize(200.dp)
        )
    }
}

@Composable
fun MovieScree3(onClick: () -> Unit){
    ElevatedButton(
        onClick = {onClick()},
        shape = ShapeDefaults.ExtraSmall,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Gray
        ),
        modifier = Modifier
            .height(200.dp)
            .width(125.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.poster_gxk),
            contentDescription = null,
            modifier = Modifier
                .requiredSize(200.dp)
        )
    }
}

@Composable
fun MovieScree4(onClick: () -> Unit){
    ElevatedButton(
        onClick = {onClick()},
        shape = ShapeDefaults.ExtraSmall,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Gray
        ),
        modifier = Modifier
            .height(200.dp)
            .width(125.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.poster_ghostbusters),
            contentDescription = null,
            modifier = Modifier
                .requiredSize(200.dp)
        )
    }
}