package com.example.youtubetutorials

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        Card(modifier = Modifier
            .fillMaxWidth()
            .height(120.dp)
            .padding(15.dp),
            elevation = 15.dp,
            shape = RoundedCornerShape(20.dp)) {
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically) {
                CardImage()
                CardContent()

            }

        }
    }
}

@Composable
fun CardContent() {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(10.dp)) {
        Text(text = "This is a very cool Bird", style = MaterialTheme.typography.h5)
    }
}

@Composable
fun CardImage() {
    Card(shape = CircleShape, border = BorderStroke(2.dp, Color.Green)) {
        Image(painter = painterResource(id = R.drawable.sparrow), contentDescription = "cool bird")
    }
}