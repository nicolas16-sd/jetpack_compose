package com.aulascom.composelayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aulascom.composelayout.ui.theme.ComposeLayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeLayoutTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LayoutScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun LayoutScreen (modifier: Modifier = Modifier) {
    Column(modifier = modifier
        .background(Color.Yellow)
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top

    ) {
        Row(modifier = Modifier
            .background(Color.Red)
            .fillMaxWidth()
            .weight(1F),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            Text("Texto 4")
            Text("Texto 5")
            Text("Texto 6")
        }

        Column(modifier = Modifier
            .background(Color.Blue)
            .fillMaxWidth()
            .weight(1F),
            horizontalAlignment = Alignment.End,
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Text("Texto 7")
            Text("Texto 8")
            Text("Texto 9")
        }

    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun LayoutScreenPreview() {
    LayoutScreen()
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeLayoutTheme {
        Greeting("Android")
    }
}