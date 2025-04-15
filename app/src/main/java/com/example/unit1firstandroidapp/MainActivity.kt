package com.example.unit1firstandroidapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.unit1firstandroidapp.ui.theme.Unit1FirstAndroidAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Unit1FirstAndroidAppTheme {
                Scaffold(modifier = Modifier.padding(100.dp)) { innerPadding ->
                    val names = listOf("Farischa", "Fadhilah", "Nurul")
                    for (name in names) {
                        Greeting(name = name, modifier = Modifier.padding(innerPadding))
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface(color = MaterialTheme.colorScheme.primary,
        modifier = modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp)) {
            Text(
                text = "Hello my name is $name!"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Unit1FirstAndroidAppTheme {
        Column {
            val names = listOf("Farischa", "Fadhilah", "Nurul")
            for (name in names) {
                Greeting(name = name)
            }
        }
    }
}