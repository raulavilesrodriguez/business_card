package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.ui.text.font.FontWeight


val myColor = Color(0xFFBFD8AF)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = myColor
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier){
    Greeting(
        name = stringResource(R.string.nombre_autor),
        title = stringResource(R.string.title_developer),
        image = painterResource(R.drawable.android_logo)
    )
    InformationCard(
        number = stringResource(R.string.numero_celular),
        social = stringResource(R.string.instagram_social),
        email = stringResource(R.string.correo_gmail)
    )
}

@Composable
private fun Greeting(name: String,
                     title: String,
                     image: Painter,
                     modifier: Modifier = Modifier) {
    val colorImage = Color(0xFF2E4F4F)
    val colorTitle = Color(0xFF416D19)
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .padding(start = 84.dp,
                top = 28.dp,
                end = 84.dp,
                bottom = 384.dp)

    ) {
        Image(painter = image,
            contentDescription = null,
            modifier = Modifier
                .size(width = 60.dp, height = 60.dp)
                .align(Alignment.CenterHorizontally)
                .background(colorImage)
        )
        Text(
            text = name,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = modifier
                .padding(start = 16.dp, end = 0.dp),
            onTextLayout = {}
        )
        Text(
            text = title,
            fontSize = 10.sp,
            textAlign = TextAlign.Center,
            color = colorTitle,
            modifier = Modifier
                .padding(start = 44.dp, end = 0.dp),
            onTextLayout = {}
        )
    }

}

@Composable
private fun InformationCard(
    number: String,
    social: String,
    email: String,
    modifier: Modifier = Modifier
){
    val colorIcon = Color(0xFF9BCF53)
    Column(
        verticalArrangement = Arrangement.Top,
        modifier = modifier
            .padding(
                start = 84.dp,
                top = 600.dp,
                end = 84.dp,
                bottom = 48.dp
            )


    ){
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = modifier
                .padding(
                    start = 40.dp,
                    end = 4.dp,
                    top = 16.dp,
                    bottom = 0.dp
                )
        ){
            Icon(
                Icons.Rounded.Call,
                contentDescription = "Llamar",
                tint = colorIcon
            )
            Text(
                text = number,
                fontSize = 10.sp,
                textAlign = TextAlign.Center,
                color = Color.Black,
                modifier = Modifier
                    .padding(4.dp),
                onTextLayout = {}
            )
        }

        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = modifier
                .padding(
                    start = 40.dp,
                    end = 4.dp,
                    top = 16.dp,
                    bottom = 0.dp
                )
        ){
            Icon(
                Icons.Rounded.Share,
                contentDescription = null,
                tint = colorIcon
            )
            Text(
                text = social,
                fontSize = 10.sp,
                textAlign = TextAlign.Center,
                color = Color.Black,
                modifier = Modifier
                    .padding(4.dp),
                onTextLayout = {}
            )
        }

        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = modifier
                .padding(
                    start = 40.dp,
                    end = 4.dp,
                    top = 16.dp,
                    bottom = 0.dp
                )
        ){
            Icon(
                Icons.Rounded.Email,
                contentDescription = null,
                tint = colorIcon
            )
            Text(
                text = email,
                fontSize = 10.sp,
                textAlign = TextAlign.Center,
                color = Color.Black,
                modifier = Modifier
                    .padding(4.dp),
                onTextLayout = {}
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = myColor
        ) {
            Greeting()
        }
    }
}