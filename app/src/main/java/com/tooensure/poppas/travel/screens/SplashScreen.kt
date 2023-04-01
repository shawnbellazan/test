package com.tooensure.poppas.travel.screens

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tooensure.poppas.travel.R

@Preview(showBackground = true)
@Composable
fun SplashScreen() {
    SplashContent()
}

@Preview(showBackground = true)
@Composable
fun SplashContent(
    @DrawableRes logoId: Int = R.drawable.logo_light_transparent,
    logo: Painter = painterResource(id = logoId)
) {
    Surface(
        modifier = Modifier.fillMaxWidth()
    ) {
        Icon(
            painter = logo,
            tint = Color.LightGray,
            contentDescription = "App logo"
        )
    }
}