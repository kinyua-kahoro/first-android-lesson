package com.edwin.edwin.ui.theme.screens.login
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.edwin.edwin.R
import com.edwin.edwin.navigation.ROUTE_REGISTER

@Composable
fun Login_Screen(navController: NavHostController) {
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var password by remember { mutableStateOf(TextFieldValue("")) }
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize().background(Color.White)) {
        Image(painter = painterResource(id = R.drawable.features), contentDescription = "Image resource", modifier = Modifier.fillMaxWidth().height(200.dp))
        Text(text = "Login",
            color = Color.Red,
            fontFamily = FontFamily.Cursive,
            fontSize = 35.sp)
        Spacer(modifier = Modifier.width(40.dp))
        OutlinedTextField(value = email, onValueChange = {email=it}, label = { Text(text = "Enter email") }, modifier = Modifier.width(300.dp).padding(8.dp), shape = RoundedCornerShape(20.dp), leadingIcon = { Icon(Icons.Default.Email, contentDescription = "Email icon") })
        OutlinedTextField(value = password, onValueChange = {password=it}, label = { Text( text = "Enter password") }, modifier = Modifier.width(300.dp).padding(8.dp), shape = RoundedCornerShape(20.dp), leadingIcon = { Icon(Icons.Default.Lock, contentDescription = "Password Icon") })
        Button(onClick = {}, modifier = Modifier.width(200.dp), colors = ButtonDefaults.buttonColors(containerColor = Color.Cyan)) { Text(text = "Login", color = Color.Black)}
        Spacer(modifier = Modifier.height(15.dp))
        Text(text = "Don't have an account, register.", color = Color.Blue, modifier = Modifier.clickable{ navController.navigate(ROUTE_REGISTER)})
    }
}
@Preview
@Composable
private fun Loginprev(){
    Login_Screen(rememberNavController())
}