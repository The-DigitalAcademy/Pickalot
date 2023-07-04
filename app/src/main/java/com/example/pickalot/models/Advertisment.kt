package com.example.pickalot.models

@Entity
data class Advertisment(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val image: Int,
    val advertisedId: Int,
    val type: Int = 0, ) {
    val advertisementType: AdvertisementType
        get() = when (type) {
            0 -> AdvertisementType.Product
            else -> AdvertisementType.Store
        }
}
