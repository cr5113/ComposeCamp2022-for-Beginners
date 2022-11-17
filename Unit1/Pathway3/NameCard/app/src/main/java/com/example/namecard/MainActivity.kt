package com.example.namecard

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.namecard.ui.theme.NameCardTheme
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NameCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = "Profile Picture",
            //modifier = Modifier.fillMaxWidth()
        )
        Text(
            text = "Ryu HoSeong",
            fontSize = 24.sp
        )
        Text(
            text = "Director"
        )
        Spacer(modifier = Modifier.size(16.dp))
        Row() {
            Image(
                painter = painterResource(id = R.drawable.androidparty),
                contentDescription = "Dog Picture",
                modifier = Modifier.requiredSize(30.dp)
            )
            Text(
                text = "82-2-2047-5227"
            )
        }
    }
}

@Composable
fun CallInfo() {
    Column() {
        //CallDetail(Painter)
    }
}

@Composable
fun CallDetail(painter: Painter, text: Text){
    /*
    Row() {
        Image(
            painter = painter, contentDescription = null
        )
        Text(
            text = text
        )
    }
    */
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NameCardTheme {
        Greeting("Android")
    }
}