package com.martserra.mydogs.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Dog (
    val id: Int,
    val index: Int,
    val name: String,
    val breed: String,
    val heightFemale: Double,
    val heightMale: Double,
    val imageUrl: String,
    val lifeExpectancy: String,
    val temperament: String,
    val weightFemale: String,
    val weightMale: String
) : Parcelable