package com.example.mobilecomputing.ui.payment

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.google.accompanist.insets.systemBarsPadding
import java.lang.reflect.Modifier

@Composable
fun Payment(
    onBackPress: () -> Unit
){
    Surface{
        Column(
            modifier = androidx.compose.ui.Modifier
                .fillMaxSize()
                .systemBarsPadding()
        ) {
            TopAppBar {
                IconButton(onClick = onBackPress) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = null

                    )

                }
                Text(text = "Payment")

            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top,
                modifier = androidx.compose.ui.Modifier.padding(16.dp)
            ){
                OutlinedTextField(
                    value = "", onValueChange = {},
                    label = {Text("Recipient name")},
                    modifier = androidx.compose.ui.Modifier.fillMaxWidth(),
                    /*keyboardOptions = KeyboardOptions (
                        keyboardType  = KeyboardType.Text
                    )*/
                )
                Spacer(modifier = androidx.compose.ui.Modifier.height(10.dp))
                OutlinedTextField(
                    value = "", onValueChange = {},
                    label = {Text("Recipient account")},
                    modifier = androidx.compose.ui.Modifier.fillMaxWidth(),
                    /*keyboardOptions = KeyboardOptions (
                        keyboardType  = KeyboardType.Text
                    )*/
                )
                Spacer(modifier = androidx.compose.ui.Modifier.height(10.dp))
                Row{
                    OutlinedTextField(
                        value = "", onValueChange = {},
                        label = {Text("Date")},
                        /*keyboardOptions = KeyboardOptions (
                            keyboardType  = KeyboardType.Text
                        )*/
                    )
                    Spacer(modifier = androidx.compose.ui.Modifier.width(10.dp))
                    OutlinedTextField(
                        value = "", onValueChange = {},
                        label = {Text("Amount")},
                        /*keyboardOptions = KeyboardOptions (
                            keyboardType  = KeyboardType.Text
                        )*/
                    )
                    Spacer(modifier = androidx.compose.ui.Modifier.width(10.dp))
                }
                Spacer(modifier = androidx.compose.ui.Modifier.height(10.dp))
                Button(
                    onClick = {/*TODO*/},
                    modifier = androidx.compose.ui.Modifier.fillMaxWidth().size(55.dp)
                ){
                    Text("Save payment")
                }
            }


        }
    }
}