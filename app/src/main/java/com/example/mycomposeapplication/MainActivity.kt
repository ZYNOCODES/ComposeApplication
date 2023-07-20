package com.example.mycomposeapplication

import android.graphics.drawable.Drawable
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycomposeapplication.ui.theme.MyComposeApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposeApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Greeting() {
    var name = remember {
        mutableStateOf("")
    }
    Column(modifier = Modifier.padding(20.dp),
    verticalArrangement = Arrangement.SpaceAround,
    horizontalAlignment = Alignment.CenterHorizontally) {
        Box() {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(painter = painterResource(id = R.drawable.img)
                    , contentDescription = "BurgerIMG",
                    modifier = Modifier.padding(bottom = 10.dp))
                Text(text = "Hello Nada!",
                    color = colorResource(id = R.color.Gray),
                    fontSize = 25.sp,
                    textDecoration = TextDecoration.Underline,
                    letterSpacing = 3.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 10.dp))
                Text(text = "Best place to write life stories and share your journey experiences",
                    color = colorResource(id = R.color.Gray),
                    fontSize = 15.sp,
                    textDecoration = TextDecoration.Underline,
                    fontWeight = FontWeight.Light,
                    modifier = Modifier.padding(start = 20.dp, end = 20.dp))
            }
        }

        TextField(value = name.value,
            onValueChange = {name.value = it},
            label = {Text(text = "Name")},)
        Box() {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Box(modifier = Modifier
                    .fillMaxWidth(1f)
                    .height(5.dp)
                    .background(color = colorResource(id = R.color.Gray))
                    .padding(bottom = 10.dp)) {
                }
                Button(onClick = { /*TODO*/ },
                    modifier = Modifier
                        .background(
                            color = colorResource(id = R.color.PrimaryColor),
                            shape = CircleShape
                        )
                        .width(200.dp)
                        .height(47.dp)) {
                    Text(text = "LOGIN",
                        color = colorResource(id = R.color.white),
                        fontSize = 15.sp,
                        textDecoration = TextDecoration.Underline,
                        letterSpacing = 2.sp,
                        fontWeight = FontWeight.Bold)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyComposeApplicationTheme {
        Greeting()
    }
}