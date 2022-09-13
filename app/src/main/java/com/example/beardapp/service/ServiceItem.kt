package com.example.beardapp.service

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.beardapp.R
import com.example.beardapp.model.Service
import com.example.beardapp.model.getServiceItems

@Composable
fun ServiceItem(item: Service) {
    Card(
        backgroundColor = Color.LightGray,
        modifier = Modifier
            .aspectRatio(1f)
            .padding(8.dp)
            .clip(RoundedCornerShape(20.dp)),
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            IconButton(
                onClick = { },
                modifier = Modifier
                    .background(Color.White, shape = CircleShape)
            ) {
                Icon(
                    painter = painterResource(id = item.icon),
                    contentDescription = item.iconTitle,
                    tint = Color.Black,
                )
            }
            Spacer(modifier = Modifier.padding(4.dp))
            Text(
                text = item.iconTitle,
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp,
                color = Color.Black,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ServiceItemPreview() {
    for(i in getServiceItems()) {
        ServiceItem(i)
    }
}