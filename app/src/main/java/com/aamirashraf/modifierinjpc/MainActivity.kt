package com.aamirashraf.modifierinjpc

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aamirashraf.modifierinjpc.ui.theme.ModifierInJPCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           //modifiers works in the serial manner
            Column(modifier = Modifier
                .background(
                    color = Color.Green
                )
                .fillMaxHeight(0.5f)
                .fillMaxWidth()
                .padding(top = 50.dp)
//                .width(300.dp)
//                .requiredWidth(200.dp)   //means this munch amount of the width is necessary
//                .offset(50.dp,50.dp)    //similar to padding but in xy plane  it shift 50dp to left and then 50dp.down

            //lets see the border concept here which is very cool features how to use the border property
                .border(5.dp,Color.Black)
                .padding(10.dp)
                .border(5.dp,Color.Cyan)
                .padding(10.dp)
                .border(5.dp,Color.Yellow)
                .padding(10.dp)
            ) {
                Text(text = "hello world",
//                modifier=Modifier.offset(50.dp,50.dp)) //apply offset to the particular column
                modifier = Modifier
                    .offset(20.dp,20.dp)
                    .border(5.dp,Color.Red)
                    .padding(10.dp)
                )
                Spacer(modifier = Modifier.height(50.dp))  //spacer is used to provide the space b/w two fields
                Text(text = "Jetpack Compose",
                modifier = Modifier.clickable {
                    Toast.makeText(this@MainActivity,"jetpack compose",Toast.LENGTH_SHORT).show()
                })
            }
        }
    }
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
    ModifierInJPCTheme {
        Greeting("Android")
    }
}