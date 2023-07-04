package com.example.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background,

                ) {
                    Artspace()
                }
            }
        }
    }
}



@Composable
fun Artspace(){

    Column(

        modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Card( elevation = 33.dp,
        shape = MaterialTheme.shapes.medium, modifier = Modifier.padding(10.dp),
        border = BorderStroke(3.dp, Color.Black)
            )
         {
            Image(
                painter = painterResource(R.drawable.pb121986), contentDescription = "image",
//                modifier = Modifier
//                    .border(12.dp, Color.Blue, RectangleShape),
                contentScale = ContentScale.FillWidth
            )
        }
        Card( elevation = 33.dp,
            shape = MaterialTheme.shapes.medium, modifier = Modifier.padding(10.dp),
            border = BorderStroke(3.dp, Color.Black)
        )
        {

            Column {
                Text(
                    text = "Los Angeles Street",
                    modifier = Modifier
                        .padding(16.dp)
                )

                Text(text = "Hugh Reyes (2022)",
                modifier = Modifier
                    .padding(16.dp))
            }
        }

        Row() {

            Button(onClick = { /*TODO*/ }, modifier = Modifier.padding(8.dp)) {

                Text("Previous")

            }
            Button(onClick = { /*TODO*/ }, modifier = Modifier.padding(8.dp) ) {

                Text("Next")

            }

        }



    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ArtSpaceTheme {
        Artspace()
    }
}