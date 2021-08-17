package com.nsikakthompson.bamboocompose.ui.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Chip(text: String, color: Color) {

    Surface(
        Modifier.padding(5.dp),
        shape = RoundedCornerShape(4.dp),
        color = color.copy(alpha = 0.5f)
    )

    {
        Row(
            modifier = Modifier.padding(start = 10.dp, top = 6.dp, end = 10.dp, bottom = 6.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(16.dp, 16.dp)
                    .background(color = color)
            )
            Spacer(Modifier.width(4.dp))
            Text(text = text, style = MaterialTheme.typography.body2)
        }
    }
}
