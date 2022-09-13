package com.example.beardapp.model

import com.example.beardapp.R

fun getBottomBarNavItems(): List<NavigationItem> {
    return listOf(
        NavigationItem(R.drawable.ic_baseline_dataset_24, "Home"),
        NavigationItem(R.drawable.ic_baseline_bookmark_24, "Save"),
        NavigationItem(R.drawable.ic_baseline_person_24, "Account")
    )
}

data class NavigationItem(
    val icon: Int,
    val iconTitle: String
)