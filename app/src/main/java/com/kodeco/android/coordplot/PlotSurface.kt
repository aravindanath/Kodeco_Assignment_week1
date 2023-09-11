package com.kodeco.android.coordplot

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
        ) {
            var xPercentage: Float by remember { mutableStateOf(0.01f) }
            var yPercentage: Float by remember { mutableStateOf(0.01f) }
            //   YellowCircleInBox(xPercentage,yPercentage)
            StarInBox(xPercentage, yPercentage)
            Row {

                Column {
                    Spacer(modifier = Modifier.padding(5.dp))
                    Row {
                        Text(
                            stringResource(R.string.x_axis), textAlign = TextAlign.Center,
                            modifier = Modifier.padding(start = 16.dp)
                        )
                        Text(text = ": "+(xPercentage*100).toInt()+" %")
                    }

                }

                Slider(
                    value = xPercentage,
                    valueRange = 0.01f..1f,
                    onValueChange = { newValue -> xPercentage = newValue },
                    modifier = Modifier.weight(1f)
                    )
                Spacer(modifier = Modifier.padding(15.dp))
            }

            Row {
                Column {
                    Spacer(modifier = Modifier.padding(5.dp))
                    Row {
                        Text(
                            stringResource(R.string.y_axis),
                            textAlign = TextAlign.Center,
                            modifier = Modifier.padding(start = 16.dp)
                        )
                        Text(text = ": " + (yPercentage*100).toInt()+" %")
                    }
                }


                Slider(
                    value = yPercentage,
                    valueRange = 0.01f..1f,
                    onValueChange = { newValue -> yPercentage = newValue },
                    modifier = Modifier.weight(1f)

                    )
                Spacer(modifier = Modifier.padding(15.dp))

            }
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
        Map(xPercent = 0.1f, yPercent = 0.1f)
    }
}







