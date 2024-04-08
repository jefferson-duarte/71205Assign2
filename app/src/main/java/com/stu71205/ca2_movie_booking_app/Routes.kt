package com.stu71205.ca2_movie_booking_app

sealed class Routes (val route: String){
    object HomeScreen : Routes(route = "home_screen")
    object FirstScreen : Routes(route = "first_screen")
    object SecondScreen : Routes(route = "second_screen")
    object ThirdScreen : Routes(route = "third_screen")
    object FourthScreen : Routes(route = "fourth_screen")
    object FiftiethScreen : Routes(route = "fiftieth_screen")
    object SixthScreen : Routes(route = "sixth_screen")
}