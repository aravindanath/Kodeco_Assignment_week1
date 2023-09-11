package com.kodeco.android.coordplot

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun YellowCircleInBox(xPercentage: Float, yPercentage: Float) {
    Box(
        modifier = Modifier
            .size(300.dp, 300.dp) // Set the size of the box
            .background(Color.Blue), // Set the background color to yellow
    ) {
        // Create a circle inside the box
        Box(

            modifier = Modifier
                .offset((xPercentage * 300 - 10).dp, (yPercentage * 300 - 10).dp, )
                .size(20.dp) // Set the size of the circle
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(
                            Color(0xFFFFD700), // Yellow color
                            Color(0xFFFFA500)  // Orange color (optional)
                        )
                    ),
                    shape = CircleShape


                )
        )
    }
}
