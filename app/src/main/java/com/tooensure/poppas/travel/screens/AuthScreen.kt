package com.tooensure.poppas.travel.screens

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.tooensure.poppas.travel.vm.AuthViewModel

@Preview(showBackground = true)
@Composable
fun AuthScreen() {
    Text(text = "Auth Screen")
//    Button(onClick = { vm.login() }) {
//        Text(text = "Login")
//    }
}