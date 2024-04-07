package com.stu71205.ca2_movie_booking_app

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp

@Composable
fun ToHomeButton(onClick: () -> Unit){
    ElevatedButton(
        onClick = {onClick()},
        modifier = Modifier
    ) {
        Text(
            "HOME"
        )
    }
}

@Composable
fun MovieScree1(onClick: () -> Unit){
    ElevatedButton(
        onClick = {onClick()},
        shape = ShapeDefaults.ExtraSmall,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Gray
        ),
        modifier = Modifier
            .height(270.dp)
            .width(160.dp)

    ) {
        Column {
            Text(
                text = "KUNG FU PANDA 4",
                fontFamily = FontFamily(Font(R.font.roboto_condensed_regular)),
                textAlign = TextAlign.Center,
                textDecoration = TextDecoration.Underline
            )

            Spacer(modifier = Modifier.height(16.dp))

            Image(
                painter = painterResource(id = R.drawable.poster_kf4),
                contentDescription = null,
                modifier = Modifier
                    .requiredSize(200.dp)
            )
        }
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
            .height(270.dp)
            .width(160.dp)

    ) {
        Column {
            Text(
                text = "DUNE: PART TWO",
                fontFamily = FontFamily(Font(R.font.roboto_condensed_regular)),
                textAlign = TextAlign.Center,
                textDecoration = TextDecoration.Underline
            )

            Spacer(modifier = Modifier.height(16.dp))

            Image(
                painter = painterResource(id = R.drawable.poster_dune),
                contentDescription = null,
                modifier = Modifier
                    .requiredSize(200.dp)
            )
        }
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
            .height(270.dp)
            .width(160.dp)

    ) {
        Column {
            Text(
                text = "GODZILLA X KONG: THE NEW EMPIRE",
                fontFamily = FontFamily(Font(R.font.roboto_condensed_regular)),
                textAlign = TextAlign.Center,
                textDecoration = TextDecoration.Underline
            )

            Spacer(modifier = Modifier.height(16.dp))

            Image(
                painter = painterResource(id = R.drawable.poster_gxk),
                contentDescription = null,
                modifier = Modifier
                    .requiredSize(200.dp)
            )
        }
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
            .height(270.dp)
            .width(160.dp)

    ) {
        Column {
            Text(
                text = "GHOSTBUSTERS: FROZEN EMPIRE",
                fontFamily = FontFamily(Font(R.font.roboto_condensed_regular)),
                textAlign = TextAlign.Center,
                textDecoration = TextDecoration.Underline
            )

            Spacer(modifier = Modifier.height(16.dp))

            Image(
                painter = painterResource(id = R.drawable.poster_ghostbusters),
                contentDescription = null,
                modifier = Modifier
                    .requiredSize(200.dp)
            )
        }
    }
}