package com.example.beardapp.barber

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.beardapp.model.getBarberItems

@Composable
fun BarberItem(items: List<Int>) {
    LazyRow(modifier = Modifier.fillMaxWidth()) {
        items(count = items.size, itemContent = { index ->
            Image(
                painter = painterResource(id = items[index]),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(8.dp)
                    .size(64.dp)
                    .clip(CircleShape)
            )
        })
    }
}

@Preview(showBackground = true)
@Composable
fun BarberItemPreview() {
    BarberItem(getBarberItems())
}