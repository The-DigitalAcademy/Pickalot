package com.example.pickalot.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "reviews")
data class Review(
    @PrimaryKey(autoGenerate = true)
    val reviewId: Int? = null,
    val productId: Int,
    val userId: Int? = null,
    val userName: String,
    val profile: String,
    val rate: Double,
    val review: String
)

