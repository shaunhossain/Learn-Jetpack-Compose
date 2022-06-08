package com.shaunhossain.learnjetpackcompose
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.shaunhossain.learnjetpackcompose.ui.theme.LearnJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //TestColumn(firstString = "hello", secondString = "word")
            TestRow(firstString = "hello", secondString = "word")
        }
    }
}

@Composable
fun TestColumn(firstString: String, secondString: String) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Green),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween

    ) {
        Text(firstString)
        Text(secondString)
    }
}

@Composable
fun TestRow(firstString: String, secondString: String) {
    Row(
        modifier = Modifier
            //.requiredWidth(200.dp)
            .height(50.dp)
            .padding(16.dp)
            .background(Color.Green)
            .fillMaxWidth(0.5f),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.Top
    ) {
        Text(firstString)
        Text(secondString)
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = name)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LearnJetpackComposeTheme {
        TestRow("Hello", " word")
    }
}