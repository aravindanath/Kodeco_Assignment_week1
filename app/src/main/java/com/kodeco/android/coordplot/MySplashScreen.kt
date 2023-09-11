package com.kodeco.android.coordplot

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationSearching
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    navigateToMain: () -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(imageVector = Icons.Filled.LocationSearching, contentDescription = "image", modifier = Modifier.size(300.dp,300.dp) )
    }
    LaunchedEffect(key1 = true) {
        delay(3000) // Delay for 3 seconds (adjust as needed)
        navigateToMain() // Navigate to the main content when done
    }
}
