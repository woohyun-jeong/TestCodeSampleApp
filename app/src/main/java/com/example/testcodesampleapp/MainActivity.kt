package com.example.testcodesampleapp

import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFontFamilyResolver
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontSynthesis
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testcodesampleapp.ui.theme.TestCodeSampleAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TestCodeSampleAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@RequiresApi(Build.VERSION_CODES.UPSIDE_DOWN_CAKE)
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val resolver = LocalFontFamilyResolver.current

    Column {
        Spacer(modifier = Modifier.height(60.dp))

        Text(
            text = "Hello, World",
            fontSize = 50.sp,
            lineHeight = 10.sp,
            fontWeight = FontWeight(700),
            color = Color.Blue,
            textAlign = TextAlign.Center,
            onTextLayout = { result ->
                val style = result.layoutInput.style

                val typeface = resolver.resolve(
                    fontFamily = style.fontFamily,
                    fontWeight = style.fontWeight ?: FontWeight.Normal,
                    fontStyle = style.fontStyle ?: FontStyle.Normal,
                    fontSynthesis = style.fontSynthesis ?: FontSynthesis.All
                ).value as android.graphics.Typeface

                Log.d("FontDebug", "Resolved Typeface = ${typeface.systemFontFamilyName}")

            }

        )

        Text(
            text = "안녕하세요",
            fontSize = 50.sp,
            lineHeight = 10.sp,
            fontWeight = FontWeight(700),
            fontFamily = FontFamily.SansSerif,
            color = Color.Blue,
            textAlign = TextAlign.Center

        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TestCodeSampleAppTheme {
        Greeting("Android")
    }
}