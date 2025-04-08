package com.edwin.edwin.ui.theme.screens.home
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.edwin.edwin.R
import com.edwin.edwin.navigation.ROUTE_DASHBOARD
import com.edwin.edwin.navigation.ROUTE_LOGIN
import com.edwin.edwin.navigation.ROUTE_REGISTER


@Composable
fun HomeScreen(navController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Cyan),
        horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Image(painter = painterResource(id = R.drawable.altfeatures),
            contentDescription = "testimonial",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp))
        Text(text = "Welcome to Edwin’s App! \uD83D\uDE80",
            fontSize = 27.sp,
            fontFamily = FontFamily.Default,
            color = Color.Black,
            fontStyle = FontStyle.Normal
        )
        Text(text = "Discover a smarter way to develop mobile applications. Designed with simplicity and efficiency in mind, Edwin’s App helps you build apps skillfully.\n" +
                "\uD83D\uDD39 User-Friendly & Intuitive – Navigate effortlessly with a sleek and modern interface.\n" +
                "\uD83D\uDD39 Powerful Features – AI-powered insights, seamless integration.\n" +
                "\uD83D\uDD39 Available Anywhere – Use it on web and mobile for a seamless experience.\n"+
                "Get started now and make your life easier with Edwin’s App!",
            fontSize = 15.sp,
            fontFamily = FontFamily.Default,
            color = Color.Black,
            fontStyle = FontStyle.Normal
        )
        Button(onClick = { navController.navigate(ROUTE_LOGIN) }, modifier = Modifier.width(150.dp))
            { Text(text = "Login", color = Color.White, fontSize = 20.sp, fontFamily = FontFamily.Cursive)}
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = { navController.navigate(ROUTE_REGISTER) }, modifier = Modifier.width(150.dp))
            { Text(text = "Register", color = Color.White, fontSize = 20.sp, fontFamily = FontFamily.Cursive) }
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {navController.navigate(ROUTE_DASHBOARD)}, modifier = Modifier.width(150.dp))
            { Text(text = "Dashboard", color = Color.White, fontSize = 20.sp, fontFamily = FontFamily.Cursive)}
    }
}

@Preview(showBackground = true)
@Composable
private fun HomePrev() {
    HomeScreen(rememberNavController())
}