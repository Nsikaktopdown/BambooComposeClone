package com.nsikakthompson.bamboocompose.tools

import androidx.compose.ui.graphics.Color

class ColorUtils  {
    companion object{
       var blue = Color(0xFF6200EE)

        @JvmStatic
        fun setUpColors(isDarkTheme: Boolean) {
            if (isDarkTheme) {
                blue = Color(0xFF666FF)
            }
        }
    }


}