package com.shaunhossain.learnjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
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
fun TestColumn(firstString: String, secondString: String){
    Column() {
        Text(firstString)
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