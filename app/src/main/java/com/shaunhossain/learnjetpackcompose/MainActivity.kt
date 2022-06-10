package com.shaunhossain.learnjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.shaunhossain.learnjetpackcompose.ui.theme.LearnJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestColumn(firstString = "Click", secondString = "word")
            //TestRow(firstString = "hello", secondString = "word")
        }
    }
}

@Composable
fun TestColumn(firstString: String, secondString: String){
    Column(
        modifier = Modifier
            .background(Color.Blue)
            .fillMaxSize()
            .border(width = 5.dp, Color.White)
            .padding(horizontal = 10.dp, vertical = 10.dp)
            .border(width = 5.dp, Color.White)
            .border(width = 2.dp, color = Color.Red)
            .padding(horizontal = 10.dp, vertical = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(firstString, modifier = Modifier
            .background(Color.Cyan)
            .padding(10.dp)
            .clickable {

        })
        Spacer(modifier = Modifier.height(50.dp))
        Text(secondString)
    }
}

@Composable
fun TestRow(firstString: String, secondString: String){
    Row() {
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
        TestRow("Hello"," word")
    }
}