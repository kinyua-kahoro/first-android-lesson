package com.edwin.edwin.ui.theme.screens.home
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.edwin.edwin.R


@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Cyan),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Welcome to Edwin's app.",
            fontSize = 30.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.Gray,
            fontStyle = FontStyle.Italic
        )
        Image(painter = painterResource(id = R.drawable.altfeatures),
            contentDescription = "testimonial",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp))
        Text(text = "Edwin is an upcoming app developer who is dedicated to creating aesthetic apps upon completion of his course.",
            fontSize = 15.sp,
            fontFamily = FontFamily.Serif,
            color = Color.Black,
            fontStyle = FontStyle.Italic
        )
        Button(onClick = {}, modifier = Modifier.width(150.dp))
            { Text(text = "Login", color = Color.White, fontSize = 20.sp, fontFamily = FontFamily.Cursive)}
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {}, modifier = Modifier.width(150.dp))
            { Text(text = "Register", color = Color.White, fontSize = 20.sp, fontFamily = FontFamily.Cursive) }
    }
}

@Preview(showBackground = true)
@Composable
private fun HomePrev() {
    HomeScreen()
}