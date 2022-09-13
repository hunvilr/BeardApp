package com.example.beardapp.model

import com.example.beardapp.R

fun getServiceItems(): List<Service> {
    return listOf(
        Service(R.drawable.ic_baseline_person_24, "Classic shaving"),
        Service(R.drawable.ic_baseline_person_24, "Hair care"),
        Service(R.drawable.ic_baseline_person_24, "Beard trimming"),
        Service(R.drawable.ic_baseline_person_24, "Classic haircut")
    )
}

data class Service(
    val icon: Int,
    val iconTitle: String
)