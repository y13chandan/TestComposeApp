package com.example.testcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Scaffold(
                topBar = {
                    TopAppBar(
                        title = {
                            Text(text = "TestComposeApp")
                        },
                    )
                }, content = {
                    listOfItems()
                })
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "TopAppBar")
                },
            )
        }, content = {
            listOfItems()
        })
}

@Composable
fun listOfItems() {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.Start,
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        item {
            rowView("Dialog")
        }
        item {
            rowView("Android")
        }
        item {
            rowView("Android")
        }
    }
}

@Composable
fun rowView(text: String) {
    Surface(
        modifier = Modifier.fillMaxWidth(),
        color = Color.Yellow
    ) {
        Text(
            text = text,
            style = TextStyle(
                textAlign = TextAlign.Start,
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal
            ),
            modifier = Modifier.padding(top = 10.dp, start = 16.dp, bottom = 10.dp)
        )
    }

}