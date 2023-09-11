package com.kodeco.android.coordplot

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun StarInBox(xPercentage: Float, yPercentage: Float) {
    Box(
        modifier = Modifier
            .size(300.dp, 300.dp) // Set the size of the box
            .background(Color.Blue), // Set the background color to yellow
    ) {

        // Create a Star inside the box
        Box(
            modifier = Modifier
                .absolutePadding(1.dp)
                .offset((xPercentage * 300 - 30).dp, (yPercentage * 300 - 38).dp)
                .size(60.dp)
                .absolutePadding(1.dp)
        )

        {
            Icon(
                imageVector = Icons.Outlined.Star,
                contentDescription = "Star",
                modifier = Modifier.size(60.dp),
                tint = Color.Red
            )
        }

    }
}
