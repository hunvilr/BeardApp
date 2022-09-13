package com.example.beardapp.main

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Divider
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.beardapp.bottombar.BottomBar
import com.example.beardapp.model.getBottomBarNavItems
import com.example.beardapp.model.getGridItems
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
                items(4, ) {

                }
                items(items = getGridItems(), itemContent = { item ->
                    ServiceItem(item)
                })
//                items(items = getGridItems(), itemContent = { book ->
//                    BookShelfItem(book)
//                    Divider(modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(8.dp))
//                })
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MainScreen()
}