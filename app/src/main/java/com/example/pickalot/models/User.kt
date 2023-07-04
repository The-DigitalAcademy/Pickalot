package com.example.pickalot.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
@Serializable
data class User(
    @PrimaryKey(autoGenerate = true) val userId: Int,
    val name: String,
    val profile: Int? = null,
    val phone: String? = null,
    val email: String? = null,
    val password: String? = null,
    val gender: Int? = 1,
    val token: String? = null,
)