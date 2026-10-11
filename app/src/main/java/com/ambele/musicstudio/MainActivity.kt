
package com.ambele.musicstudio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var selected by remember { mutableStateOf("Keyboard") }
            val instruments = listOf("Keyboard", "Guitar", "Bass", "Drums")

            Surface(
                modifier = Modifier.fillMaxSize(),
                color = Color(0xFF101426)
            ) {
                Column(
                    modifier = Modifier.padding(20.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        "AMBELE MUSIC STUDIO",
                        color = Color(0xFF80DEEA),
                        fontSize = 24.sp
                    )
                    Spacer(Modifier.height(24.dp))
                    instruments.forEach { instrument ->
                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 6.dp)
                                .clickable { selected = instrument },
                            colors = CardDefaults.cardColors(
                                containerColor = if (selected == instrument)
                                    Color(0xFF3949AB) else Color(0xFF222940)
                            )
                        ) {
                            Text(
                                instrument,
                                modifier = Modifier.padding(18.dp),
                                color = Color.White,
                                fontSize = 20.sp
                            )
                        }
                    }
                    Spacer(Modifier.height(20.dp))
                    Text(
                        "Selected: $selected",
                        color = Color.White,
                        fontSize = 18.sp
                    )
                    Text(
                        "Play • Record • Create",
                        color = Color(0xFF80DEEA),
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }
        }
    }
}
