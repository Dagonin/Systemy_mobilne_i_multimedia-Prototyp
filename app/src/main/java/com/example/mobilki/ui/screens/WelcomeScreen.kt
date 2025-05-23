
// Necessary imports
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController

// Main Composable function for the Welcome screen
@Composable
fun WelcomeScreen(
    onButtonClicked: () -> Unit
) {
    // Main container with background color
    val navController = rememberNavController()
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFD99A9A)), // Light pink background
        contentAlignment = Alignment.Center
    ) {
        // Column to arrange elements vertically
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Placeholder for the image
            Box(
                modifier = Modifier
                    .size(200.dp)
                    .background(Color(0xFFC4C4C4)) // Light gray color
            )

            // Spacer between image and text
            Spacer(modifier = Modifier.height(16.dp))

            // Text for the title
            Text(
                text = "Veggie wiki",
                fontSize = 24.sp,
                color = Color.Black
            )

            // Spacer between text and button
            Spacer(modifier = Modifier.height(32.dp))

            // Button at the bottom
            Button(
                onClick = { onButtonClicked() },
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFC4C4C4)) // Light gray button
            ) {
                Text(text = "Rozpocznij", color = Color.Black)
            }
        }
    }
}
