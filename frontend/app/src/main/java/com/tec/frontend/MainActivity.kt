package com.tec.frontend

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tec.frontend.ui.theme.FrontendTheme

val Orange = Color(0xFFEE6B11)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FrontendTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    startPage()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview(name = "Landscape Mode", showBackground = true, device = Devices.PIXEL_C, widthDp = 1280)
fun startPage() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF4169CF),
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(0.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Image(
                painter = painterResource(id = R.drawable.ama),
                contentDescription = null,
                modifier = Modifier
                    .width(600.dp),
                contentScale = ContentScale.Fit
            )

            //Spacer(modifier = Modifier.height(0.dp))

            val context1 = LocalContext.current
            Button(
                onClick = {
                    context1.startActivity(Intent(context1, AlumnosPaginaInicio::class.java))
                },
                modifier = Modifier
                    .width(450.dp)
                    .height(175.dp)
                    .padding(top=30.dp),
                shape = RoundedCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(Orange)
            ) {
                Text(
                    "JUGAR!", style = TextStyle(fontSize = 50.sp)
                )
            }
            Spacer(modifier = Modifier.height(20.dp))

            val context = LocalContext.current
            Button(
                onClick = {
                    context.startActivity(Intent(context, InicioSesion::class.java))
                },
                modifier = Modifier.border(2.dp, Orange),
                shape = RoundedCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(Color.Transparent),
            ) {
                Text(
                    "ENTRAR COMO ADMINISTRADOR", color = Orange
                )
            }
        }
    }
}
