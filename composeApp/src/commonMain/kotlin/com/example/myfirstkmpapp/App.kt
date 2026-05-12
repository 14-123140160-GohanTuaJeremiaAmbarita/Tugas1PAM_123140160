package com.example.myfirstkmpapp

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun App() {
    MaterialTheme {

        var showContent by remember { mutableStateOf(false) }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Text(
                text = "Tugas Praktikum 1",
                style = MaterialTheme.typography.headlineMedium
            )

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = { showContent = !showContent }
            ) {
                Text("Tampilkan Data")
            }

            Spacer(modifier = Modifier.height(20.dp))

            if (showContent) {
                Text(
                    text = greet(
                        name = "GOHAN AMBARITA",  // Ganti dengan nama kamu
                        nim = "1234567890"        // Ganti dengan NIM kamu
                    )
                )
            }
        }
    }
}