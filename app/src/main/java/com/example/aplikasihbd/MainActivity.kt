package com.example.aplikasihbd

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.aplikasihbd.ui.theme.AplikasiHBDTheme
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.text.TextStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AplikasiHBDTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                    ) {
                    GreetingText(message = "Happy Birthday Sam!", from = "From Emma")
                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,  // Center horizontally
        verticalArrangement = Arrangement.Center  // Center vertically
    ) {
        Text(
            text = message,
            fontSize = 90.sp,  // Large font size for message
            lineHeight = 116.sp,
            textAlign = TextAlign.Center,  // Center the text
            color = Color.Black,
            style = TextStyle(
                fontWeight = FontWeight.Bold,  // Make the text bold
                fontFamily = FontFamily.Serif,
                shadow = androidx.compose.ui.graphics.Shadow(
                    color = Color.DarkGray,
                    blurRadius = 10f
                )
            )
        )
        Text(
            text = from,
            fontSize = 36.sp,   // Smaller font size for sender
            textAlign = TextAlign.Center,  // Center the text
            modifier = Modifier.padding(top = 16.dp),  // spacing between texts
            color = Color.Black,
            style = TextStyle(
                fontWeight = FontWeight.Bold,  // Make the text bold
                fontFamily = FontFamily.Monospace,
                shadow = androidx.compose.ui.graphics.Shadow(
                    color = Color.LightGray,
                    blurRadius = 10f
                )
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AplikasiHBDTheme {
        GreetingText(message = "Happy Birthday Sam!", from = "From Emma")
    }
}