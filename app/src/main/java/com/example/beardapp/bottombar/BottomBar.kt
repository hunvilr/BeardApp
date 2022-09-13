package com.example.beardapp.bottombar

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.beardapp.model.NavigationItem
import com.example.beardapp.model.getBottomBarNavItems

@Composable
fun BottomBar(bottomBarNavItems: List<NavigationItem>) {
    BottomNavigation(
        backgroundColor = Color.Black,
        contentColor = Color.White
    ) {
        bottomBarNavItems.forEach { item ->
            BottomNavigationItem(
                icon = { Icon(painter = painterResource(id = item.icon), contentDescription = item.iconTitle, tint = Color.White.copy(0.5f)) },
                selected = false,
                selectedContentColor = Color.White,
                unselectedContentColor = Color.Black.copy(0.4f),
                onClick = { /*TODO*/ }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BottomDrawerPreview() {
    BottomBar(getBottomBarNavItems())
}