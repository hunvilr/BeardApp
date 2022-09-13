package com.example.beardapp.topbar

import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.beardapp.R

@Composable
fun TopBar() {
    TopAppBar(
        title = { Text(text = "")},
        navigationIcon = {
            Icon(
                painterResource(id = R.drawable.ic_baseline_table_rows_24),
                tint = Color.Black.copy(alpha = 0.8f),
                contentDescription = "My Profile"
            )
        },
        actions = {
            Icon(
                painterResource(id = R.drawable.ic_baseline_search_24),
                tint = Color.Black.copy(alpha = 0.8f),
                contentDescription = "Search"
            )
        },
        backgroundColor = Color.White
    )
}

@Preview(showBackground = true)
@Composable
fun TopAppBarPreview() {
    TopBar()
}