package com.example.uijetpackcompose.app.presentation.ui


import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.navigation.NavController
import com.example.uijetpackcompose.R

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Screen2(navController: NavController) {
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
                text = stringResource(id = R.string.skip),
                textAlign = TextAlign.End,
                color = Color(0xFFF5EAFF),
                fontFamily = FontFamily.SansSerif,
                modifier = Modifier
                    .padding(40.dp)
                    .clickable(onClick = { navController.navigate("Screen3") })
            )
        }
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                painter = painterResource(id = R.drawable.illustration_2),
                contentDescription = "Second screen illustration",
                modifier = Modifier
                    .fillMaxWidth()
                    .size(260.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = stringResource(id = R.string.S2_header),
                fontWeight = FontWeight.ExtraBold,
                fontFamily = FontFamily.SansSerif,
                textAlign = TextAlign.Center,
                lineHeight = 35.sp,
                color = Color(0xFFF0E0FC),
                fontSize = 25.sp,
            )
            Spacer(modifier = Modifier.height(18.dp))
            Text(
                text = stringResource(id = R.string.S2_body),
                fontFamily = FontFamily.SansSerif,
                color = Color(0xFFF5EAFF),
                fontSize = 15.sp,
                modifier = Modifier.padding(horizontal = 16.dp),
                textAlign = TextAlign.Center

            )
            Spacer(modifier = Modifier.height(90.dp))

            Button(
                onClick = { navController.navigate("Screen3") },
                shape = RoundedCornerShape(30.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFFF0E0FC)),
                modifier = Modifier
                    .size(width = 75.dp, height = 60.dp)

            ) {
                Text(
                    text = stringResource(id = R.string.next),
                    fontSize = 12.sp,
                    color = Color(0xFF261D33)
                )
            }
        }
    }
}
