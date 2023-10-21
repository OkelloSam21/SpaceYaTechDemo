package com.example.spaceyatechdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.spaceyatechdemo.ui.theme.SpaceYaTechDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SpaceYaTechDemoTheme {
                // A surface container using the 'background' color from the theme
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                ) {
                    Text(
                        text = stringResource(id = R.string.upcoming),
                        style = MaterialTheme.typography.titleLarge,
                    )
                    Spacer(modifier = Modifier.height(25.dp))
                    Row {
                        MyCard(name = stringResource(id = R.string.dates_dinner))
                        Spacer(modifier = Modifier.width(16.dp))
                        MyCard(name = stringResource(id = R.string.beach_sand))
                    }
                }
            }
        }
    }
}

@Composable
fun MyCard(
    name: String,
) {
    Card(
        colors = CardDefaults.cardColors(Color.Black),
        modifier = Modifier
            .size(width = 100.dp, height = 100.dp),

    ) {
        Text(
            text = name,
            color = Color.White,
            style = MaterialTheme.typography.bodyMedium,
        )
    }
}
