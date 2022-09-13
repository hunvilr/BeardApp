package com.example.beardapp

import android.os.Bundle
import android.view.Surface
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.beardapp.main.MainScreen
import com.example.beardapp.ui.theme.BeardAppTheme

/**
 * https://dribbble.com/shots/17982313-Good-beard-mobile-app
 *
 * https://foso.github.io/Jetpack-Compose-Playground/foundation/lazyverticalgrid/
 * Colors
 * https://convertingcolors.com/rgb-color-208_226_219.html?search=RGB(208,226,219)
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BeardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                   MainScreen()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BeardAppTheme {
        Greeting("Android")
    }
}