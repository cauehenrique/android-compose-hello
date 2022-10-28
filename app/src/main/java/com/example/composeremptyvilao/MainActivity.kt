package com.example.composeremptyvilao

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    private val names = arrayOf("Cauê", "Andrey", "Bruno", "Angola", "Mario", "Vinicius", "Gustavo", "Pedro", "Roberto", "Pablo", "Vitor", "Alexsander")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column ( modifier = Modifier.verticalScroll(rememberScrollState())) {
                names.forEach { name ->
                    MessageCard(
                        name,
                        "Lorem ipsum dolor sit amet. This is my cool message! Finally Kotlin doesn't feels like shit!"
                    )
                }

                Button(onClick = {
                    Toast.makeText(null, "Hello World", Toast.LENGTH_SHORT).show()
                }) {
                    Text(text = "Hello World")
                }
            }
        }
    }
}

@Composable
fun MessageCard(name: String, message: String) {
    Column(modifier = Modifier.padding(all = 12.dp)) {
        Text(text = "Hello, $name", fontWeight = FontWeight.Bold)
        Text(text = message)
    }
}

@Preview
@Composable
fun PreviewMessageCard() {
    MessageCard("Cauê", "Lorem ipsum dolor sit amet")
}