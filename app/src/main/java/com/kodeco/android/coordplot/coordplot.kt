package com.kodeco.android.coordplot

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape

import androidx.compose.material3.Slider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.res.stringResource

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kodeco.android.coordplot.ui.theme.MyApplicationTheme


@Composable
fun PlotSurface() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center


        ){
    var xPercentage: Float by remember { mutableStateOf(0.5f) }
    var yPercentage: Float by remember { mutableStateOf(0.5f) }
            YellowCircleInBox(xPercentage,yPercentage)
            Text(stringResource(R.string.x_axis))
            Slider(value = xPercentage,
                valueRange = 0.1f..1f,
                onValueChange = {newValue -> xPercentage = newValue},

            )
            Text(stringResource(R.string.y_axis))
            Slider(value = yPercentage,
                valueRange = 0.1f..1f,
                onValueChange = {newValue -> yPercentage = newValue},

            )
        }

    }

}

@Preview(showBackground = true)
@Composable
fun PlotSurfacePreview() {
    MyApplicationTheme {
        PlotSurface()
    }
}

@Composable
fun Map(xPercent: Float, yPercent: Float, modifier: Modifier = Modifier) {
}

@Preview(showBackground = true)
@Composable
fun MapPreview() {
    PlotSurface()
    MyApplicationTheme {
        Map(xPercent = 0.5f, yPercent = 0.5f)
    }
}


@Composable
fun YellowCircleInBox(xPercentage:Float,yPercentage:Float) {
        Box(
            modifier = Modifier
                .size(300.dp, 300.dp) // Set the size of the box
                .background(Color.Blue), // Set the background color to yellow
        ) {
        // Create a circle inside the box
            Box(

                   modifier = Modifier
                       .offset((xPercentage * 300 - 10).dp, (yPercentage * 300 - 10).dp)

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


@Composable
fun YAxisNextToBox() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .padding(16.dp),
        horizontalAlignment = Alignment.Start
    ) {
        // Y-axis labels
        for (i in 5 downTo 1) {
            Row(
                modifier = Modifier.padding(4.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "$i",
                    fontSize = 16.sp,
                    color = Color.Black,
                    modifier = Modifier.padding(end = 8.dp)
                )
                Text(stringResource(R.string.y_axis))
            }
        }
    }
}


