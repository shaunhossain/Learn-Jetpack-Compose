package com.shaunhossain.learnjetpackcompose
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val painter = painterResource(id = R.drawable.dog)
            val contentDescription = "Puppy"
            val title = "Puppy is asking for bone"
            Column() {
                TopAppBar() {
                    Text(text = "Dog")
                }
                Box(modifier = Modifier.fillMaxSize(0.5f)) {
                    ImageCard(painter = painter, title = title, contentDescription = contentDescription)
                }
            }
        }
    }

    @Composable
    fun ImageCard(
        painter: Painter,
        title: String,
        contentDescription: String,
        modifier: Modifier = Modifier
    ){
        Card(
            modifier = Modifier
                .padding(15.dp)
                .fillMaxSize(),
            shape = RoundedCornerShape(15.dp),
            elevation = 5.dp
        ) {
            Box(
                modifier = Modifier
                    .height(200.dp
                    )){
                Image(painter = painter, contentDescription = contentDescription, contentScale = ContentScale.Crop)
            }

            Box(modifier = Modifier
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color.Black
                        ),
                        startY = 300f
                    )
                )
                .fillMaxSize()) {

            }

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(15.dp),
                contentAlignment = Alignment.BottomCenter
            ){
                Text(title, style = TextStyle(color = Color.White, fontSize = 16.sp))
            }
        }
    }

}