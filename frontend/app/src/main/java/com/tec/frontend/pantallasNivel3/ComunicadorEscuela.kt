package com.tec.frontend.pantallasNivel3

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tec.frontend.Comunicador
import com.tec.frontend.Orange
import com.tec.frontend.ui.theme.FrontendTheme

class ComunicadorEscuela : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FrontendTheme {
                // A surface container using the full size of the screen
                Surface(modifier = Modifier.fillMaxSize()) {
                    //BackgroundImage()
                    BackButtonComunicadorEsc()
                }
            }
        }
    }
}

@Composable
fun BackButtonComunicadorEsc() {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp),
        verticalAlignment = Alignment.Top) {
        val context = LocalContext.current
        Button( // Regresar a pantalla SeleccionNivel
            shape = RectangleShape,
            onClick = {
                context.startActivity(
                    Intent(
                        context,
                        Comunicador::class.java
                    )
                )
            },
            modifier = Modifier
                .width(116.dp)
                .height(34.dp),
            colors = ButtonDefaults.buttonColors(Orange)
        ){
            Text(
                "ATRAS",
                style = TextStyle(fontSize = 12.sp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview8() {
    FrontendTheme {
        //Greeting("Android")
    }
}