package com.tooensure.poppas.travel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.tooensure.poppas.travel.screens.AuthScreen
import com.tooensure.poppas.travel.screens.SplashScreen
import com.tooensure.poppas.travel.ui.theme.TravelTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen {
                Text(text = "Hello")
            }
        }
    }
}

@Composable
fun MainScreen(content: @Composable () -> Unit) {
    TravelTheme {
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {
                content()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainSplashScreenPreview() {
    MainScreen {
        SplashScreen()
    }
}