package com.example.uijetpackcompose.app.presentation.ui

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.uijetpackcompose.R

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Screen3(navController: NavHostController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF1B1931)),
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.End

        ) {
            Text(
                text = "",
                modifier = Modifier
                    .padding(40.dp)

            )
        }
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                painter = painterResource(id = R.drawable.illustration_3),
                contentDescription = "Third screen illustration",
                modifier = Modifier
                    .fillMaxWidth()
                    .size(260.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = stringResource(id = R.string.S3_header),
                fontWeight = FontWeight.ExtraBold,
                fontFamily = FontFamily.SansSerif,
                textAlign = TextAlign.Center,
                lineHeight = 35.sp,
                color = Color(0xFFF0E0FC),
                fontSize = 25.sp,
            )
            Spacer(modifier = Modifier.height(18.dp))
            Text(
                text = stringResource(id = R.string.S3_body),
                fontFamily = FontFamily.SansSerif,
                color = Color(0xFFF5EAFF),
                fontSize = 15.sp,
                modifier = Modifier.padding(horizontal = 16.dp),
                textAlign = TextAlign.Center

            )
        }
        Spacer(modifier = Modifier.height(50.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.SpaceEvenly

        ) {
            Button(
                onClick = { navController.navigate("Signup") },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF3D5CFF)
                ),
                shape = ButtonDefaults.elevatedShape,
                modifier = Modifier.size(150.dp, 50.dp)
            ) {
                Text(
                    text = stringResource(id = R.string.Signup),
                    color = Color.White,
                )

            }
            Button(
                onClick = { navController.navigate("Login") },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF858597)
                ),
                shape = ButtonDefaults.elevatedShape,
                modifier = Modifier.size(150.dp, 50.dp),


                ) {
                Text(
                    text = stringResource(id = R.string.Login),
                    color = Color.White,

                    )

            }
        }
    }
}
