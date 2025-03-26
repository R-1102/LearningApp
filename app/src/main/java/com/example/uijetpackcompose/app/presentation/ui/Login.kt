package com.example.uijetpackcompose.app.presentation.ui

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Login(navController: NavHostController) {

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF1B1931))
            .padding(top = 100.dp),
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = stringResource(id = com.example.uijetpackcompose.R.string.Login_h),
                fontSize = 30.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.White,
                textAlign = TextAlign.Start,
                modifier = Modifier.padding(bottom = 8.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))

            var expanded by remember { mutableStateOf(false) }
            Box(
                modifier = Modifier
                    .background(color = Color(0xFF2F2F42), shape = RoundedCornerShape(10.dp))
                    .padding(16.dp)
                    .animateContentSize()
                    .height(if (expanded) 700.dp else 70.dp)
                    .fillMaxWidth()
                    .clickable(
                        interactionSource = remember { MutableInteractionSource() },
                        indication = null
                    ) {
                        expanded = !expanded
                    }
            ){
                Column {
                    Text(
                        stringResource(id = com.example.uijetpackcompose.R.string.email),
                        color = Color.LightGray)
                    TextField(
                        value = email,
                        onValueChange = { email = it },
                        maxLines=1,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(56.dp)
                            .background(Color(0xFF3E3E55)),
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        stringResource(id = com.example.uijetpackcompose.R.string.password),
                        color = Color.LightGray)
                    TextField(
                        value = password,
                        onValueChange = { password = it },
                        maxLines=1,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(56.dp),

                        trailingIcon = {
                            Icon(
                                painter = painterResource(id = com.example.uijetpackcompose.R.drawable.visibility_off_24px),
                                contentDescription = "Password visibility",
                                tint = Color.Gray
                            )
                        },
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        stringResource(id = com.example.uijetpackcompose.R.string.forgot_password),
                        fontSize = 12.sp,
                        color = Color.Gray,
                        modifier = Modifier
                            .padding(start = 8.dp)
                            .align(Alignment.End)
                            .clickable { /* TODO: Navigate to login */ }
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Button(
                        onClick = { /* TODO: Add sign up logic */ },
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.buttonColors(Color(0xFF3D5CFF)),
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                    ) {
                        Text(
                            stringResource(id = com.example.uijetpackcompose.R.string.Login),
                            fontSize = 18.sp, color = Color.White)
                    }


                    Spacer(modifier = Modifier.height(16.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            stringResource(id = com.example.uijetpackcompose.R.string.dont_have_account),
                            fontSize = 12.sp,
                            color = Color.LightGray
                        )
                        Text(
                            stringResource(id = com.example.uijetpackcompose.R.string.Signup),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF3D5CFF),
                            modifier = Modifier.clickable { navController.navigate("Signup") }
                        )
                    }
                    Spacer(modifier = Modifier.height(25.dp))

                    Text(
                        stringResource(id = com.example.uijetpackcompose.R.string.or),
                        fontSize = 12.sp,
                        color = Color.LightGray,
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    )

                    Spacer(modifier = Modifier.height(25.dp))
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 110.dp),
                        horizontalArrangement = Arrangement.spacedBy(40.dp)

                    ) {
                        Image(
                            painter = painterResource(id = com.example.uijetpackcompose.R.drawable.google),
                            contentDescription = "Google",
                            modifier = Modifier
                                .size(40.dp)
                                .clickable(onClick = { /*TODO*/ })
                        )
                        Image(
                            painter = painterResource(id = com.example.uijetpackcompose.R.drawable.facebook),
                            contentDescription = "Facebook",
                            modifier = Modifier
                                .size(40.dp)
                                .clickable(onClick = { /*TODO*/ })

                        )
                    }
                }
            }
        }
    }
}
