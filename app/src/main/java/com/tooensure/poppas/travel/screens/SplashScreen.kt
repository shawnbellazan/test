package com.tooensure.poppas.travel.screens

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tooensure.poppas.travel.R

@Preview(showBackground = true)
@Composable
fun SplashScreen() {
    SplashContent(
        logoId = R.drawable.tns_light_transparent
    )
}

@Composable
fun SplashContent(
    modifier: Modifier = Modifier,
    @DrawableRes logoId: Int,
    logo: Painter = painterResource(id = logoId)
) {
    Surface(
        modifier = modifier.fillMaxWidth()
    ) {
        Icon(
            modifier = Modifier.size(250.dp),
            painter = logo,
            tint = Color.LightGray,
            contentDescription = "App logo"
        )

    }
}