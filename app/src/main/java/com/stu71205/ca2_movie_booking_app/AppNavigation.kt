package com.stu71205.ca2_movie_booking_app

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.stu71205.ca2_movie_booking_app.screens.Screen1
import com.stu71205.ca2_movie_booking_app.screens.Screen2
import com.stu71205.ca2_movie_booking_app.screens.Screen3
import com.stu71205.ca2_movie_booking_app.screens.Screen4
import com.stu71205.ca2_movie_booking_app.screens.Screen5
import com.stu71205.ca2_movie_booking_app.screens.Screen6

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.HomeScreen.route,
    )
    {
        composable(route = Routes.HomeScreen.route)
        {
            Home(navController = navController)
        }

        composable(route = Routes.FirstScreen.route)
        {
            Screen1(navController = navController)
        }

        composable(route = Routes.SecondScreen.route)
        {
            Screen2(navController = navController)
        }
        composable(route = Routes.ThirdScreen.route)
        {
            Screen3(navController = navController)
        }
        composable(route = Routes.FourthScreen.route)
        {
            Screen4(navController = navController)
        }
        composable(route = Routes.FiftiethScreen.route)
        {
            Screen5(navController = navController)
        }
        composable(route = Routes.SixthScreen.route)
        {
            Screen6(navController = navController)
        }
    }
}