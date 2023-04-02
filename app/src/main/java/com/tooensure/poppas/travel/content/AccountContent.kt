package com.tooensure.poppas.travel.content

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable


@Composable
fun AccountContent() {
    PrimaryButton(
        text = "Login"
    )
}

@Composable
private fun PrimaryButton(text:String = "text") {
    Button(onClick = { /*TODO: Redirect to auth0 webpage*/ }) {
        Text(text = text)
    }
}