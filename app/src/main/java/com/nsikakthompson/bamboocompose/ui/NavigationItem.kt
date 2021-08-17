package com.nsikakthompson.bamboocompose.ui

import com.nsikakthompson.bamboocompose.R

sealed class NavigationItem(var route: String, var icon: Int, var title: String){
    object Home : NavigationItem("home", R.drawable.ic_home, "Home")
    object WatchList : NavigationItem("watchlist", R.drawable.ic_favorite, "Watch")
    object Learn : NavigationItem("learn", R.drawable.ic_learn, "Learn")
    object Help : NavigationItem("help", R.drawable.ic_help, "Help")
    object Profile : NavigationItem("profile", R.drawable.ic_profile, "Profile")
}
