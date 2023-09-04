package com.kodeco.android.coordplot

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Slider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
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

            YellowCircleInBox()
            Text(stringResource(R.string.x_axis))
            Slider(value = 0.5f,
                valueRange = 0.1f..1f,
                onValueChange = {},

            )
            Text(stringResource(R.string.y_axis))
            Slider(value = 0.5f,
                valueRange = 0.1f..1f,
                onValueChange = {},

            )
        }
        // TODO Build out the plot surface
        //  This should include a Column composable that
        //  includes a Map, and two MapSlider composables
        //  (one slider for each axis).


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
    // TODO fill out the square map here.
    //  Create a Box composable with a size of 300.dp
    //  and then create an inner Box composable
    //  with a clip shape of CircleShape.
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
fun YellowCircleInBox() {
        Box(
            modifier = Modifier
                .size(300.dp, 300.dp) // Set the size of the box
                .background(Color.Blue), // Set the background color to yellow
            contentAlignment = Alignment.Center
        ) {
            // Create a circle inside the box
            Box(
                   modifier = Modifier
//                    .offset((xPercent * 300 - 18).dp, (yPercent * 300 - 18).dp)

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
        modifier = Modifier.fillMaxHeight().padding(16.dp),
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


