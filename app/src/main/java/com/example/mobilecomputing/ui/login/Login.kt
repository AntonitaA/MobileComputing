package com.example.mobilecomputing.ui.login

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.google.accompanist.insets.systemBarsPadding

@Composable
fun Login(
  navController: NavController
){  // user interface -  design of the login screen
    Surface(modifier = Modifier.fillMaxSize()){
        val username = rememberSaveable{ mutableStateOf("")}
        val password = rememberSaveable {mutableStateOf("")}

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .systemBarsPadding(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            // icon at the login, it could also be a picture
            Icon(
                imageVector = Icons.Default.AccountCircle,
                contentDescription = null,
                modifier = Modifier.size(200.dp)
            )

            // space between icon and textbox of username
            Spacer(modifier = Modifier.height(10.dp))

            // TextBox for the username
            OutlinedTextField(
                value = username.value, onValueChange = {data -> username.value = data},
                label = {Text("Username")},
                modifier = Modifier.fillMaxWidth(),
                keyboardOptions = KeyboardOptions (
                    keyboardType  = KeyboardType.Text
                        )
            )
            Spacer(modifier = Modifier.height(10.dp))

            // TextBox for the password
            OutlinedTextField(
                value = password.value, onValueChange = {data -> password.value = data},
                label = {Text("Password")},
                modifier = Modifier.fillMaxWidth(),
                keyboardOptions = KeyboardOptions (
                    keyboardType  = KeyboardType.Password
                ),
                visualTransformation = PasswordVisualTransformation()
            )

            Spacer(modifier = Modifier.height(10.dp))

            Button(
                onClick = { navController.navigate("home") },
                enabled = true,
                modifier = Modifier.fillMaxWidth(),
                shape = MaterialTheme.shapes.small,
            ){
                Text(text = "Login")
            }
        }

    }
}

//s