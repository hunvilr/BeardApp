package com.example.beardapp.service

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.beardapp.model.Service
import com.example.beardapp.model.getGridItems

@Composable
fun ServiceItem(item: Service) {
}

@Preview(showBackground = true)
@Composable
fun ServiceItemPreview() {
    for(i in getGridItems()) {
        ServiceItem(i)
    }
}