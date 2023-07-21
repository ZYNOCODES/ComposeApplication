package com.example.mycomposeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val painter = painterResource(id = R.drawable.image)
            val title = "it's algerien sahraa"
            val description = "it's algerien sahraa"
            Box(modifier = Modifier
                .fillMaxWidth(1f)
                .padding(20.dp),
                contentAlignment = Alignment.TopCenter) {
                Column(verticalArrangement = Arrangement.spacedBy(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally) {
                    ImageCard(painter = painter, Description = description, Title = title)
                    ImageCard(painter = painter, Description = description, Title = title)
                    ImageCard(painter = painter, Description = description, Title = title)

                }
                ImageCard(painter = painter, Description = description, Title = title)
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Greeting() {

}
@Composable
fun ImageCard(
    painter: Painter,
    Description :String,
    Title :String,
    modifier: Modifier = Modifier
){
    Card(modifier = Modifier.fillMaxWidth(0.5f),
        shape = RoundedCornerShape(15.dp),
    ) {
        Box(modifier = Modifier.height(200.dp)) {
            Image(
                painter = painter,
                contentDescription = Description ,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop)
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent,
                                colorResource(id = R.color.Lowblack)
                            ),
                            startY = 300f
                        )
                    )) {


            }
            Box(contentAlignment = Alignment.BottomStart,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 10.dp, bottom = 20.dp)) {
                Text(text = Title,
                    style = TextStyle(fontSize = 20.sp,
                    fontFamily = FontFamily.Serif,
                    color = colorResource(id = R.color.white))
                )
            }
        }
    }
}
@Preview(showBackground = true,
    showSystemUi = true)
@Composable
fun GreetingPreview() {
    var painter = painterResource(id = R.drawable.image)
    var title = "it's algerien sahraa"
    var description = "it's algerien sahraa"
    Box(modifier = Modifier
        .fillMaxWidth(1f)
        .padding(20.dp),
        contentAlignment = Alignment.TopCenter) {
        Column(verticalArrangement = Arrangement.spacedBy(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally) {
            ImageCard(painter = painter, Description = description, Title = title)
            ImageCard(painter = painter, Description = description, Title = title)
            ImageCard(painter = painter, Description = description, Title = title)

        }
        ImageCard(painter = painter, Description = description, Title = title)
    }
}