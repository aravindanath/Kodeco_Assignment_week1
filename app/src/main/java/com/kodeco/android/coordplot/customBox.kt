import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size

@Composable
fun CustomBox() {
    Box(
        modifier = Modifier
            .size(300.dp, 300.dp)
            .background(Color.Blue) // You can set any background color you want
    ) {
        // You can add content inside the box here
    }
}


@Composable
fun CustomBoxPreview( ) {
    CustomBox()
}

class BackgroundColorProvider {

}
