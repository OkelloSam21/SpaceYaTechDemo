package com.example.spaceyatechdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
                Column {
                    Text(
                        text = stringResource(id = R.string.upcoming),
                    )
                    Row {
                        MyCard(name = stringResource(id = R.string.dates_dinner))
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
            .size(width = 40.dp, height = 100.dp)

    ) {
        Text(text = name, color = Color.White)
    }
}
