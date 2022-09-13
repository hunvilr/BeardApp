package com.example.beardapp.main

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.beardapp.banner.Banner
import com.example.beardapp.barber.BarberItem
import com.example.beardapp.bottombar.BottomBar
import com.example.beardapp.header.Header
import com.example.beardapp.model.getBarberItems
import com.example.beardapp.model.getBottomBarNavItems
import com.example.beardapp.model.getServiceItems
import com.example.beardapp.service.ServiceItem
import com.example.beardapp.topbar.TopBar

@Composable
fun MainScreen() {
    Scaffold(
        topBar = { TopBar() },
        bottomBar = { BottomBar(bottomBarNavItems = getBottomBarNavItems())},
        content = { padding ->
            // Passing this padding is very important.
            // If the number of items increases, you will not be able to scroll to the
            // last item otherwise
            LazyVerticalGrid(
                modifier = Modifier.padding(padding),
                columns = GridCells.Fixed(2)
            ) {
                item(
                    span = {
                        // Replace "maxCurrentLineSpan" with the number of spans this item should take.
                        // Use "maxCurrentLineSpan" if you want to take full width.
                        GridItemSpan(maxCurrentLineSpan)
                    }
                ) {
                    Banner()
                }
                item(
                    span = {
                        // Replace "maxCurrentLineSpan" with the number of spans this item should take.
                        // Use "maxCurrentLineSpan" if you want to take full width.
                        GridItemSpan(maxCurrentLineSpan)
                    }
                ) {
                    Header("Our Barbers")
                }
                item(
                    span = {
                        GridItemSpan(maxCurrentLineSpan)
                    }
                ) {
                    BarberItem(getBarberItems())
                }
                item(
                    span = {
                        // Replace "maxCurrentLineSpan" with the number of spans this item should take.
                        // Use "maxCurrentLineSpan" if you want to take full width.
                        GridItemSpan(maxCurrentLineSpan)
                    }
                ) {
                    Header("Services")
                }
                items(items = getServiceItems(), itemContent = { item ->
                    ServiceItem(item)
                })
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MainScreen()
}