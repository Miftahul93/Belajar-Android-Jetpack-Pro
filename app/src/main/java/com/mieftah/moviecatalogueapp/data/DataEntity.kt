package com.mieftah.moviecatalogueapp.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DataEntity(
    val id: String,
    val title: String,
    val releaseDate: String,
    val genre: String,
    val duration: String,
    val overview: String,
    val userScore: Float,
    val poster: Int
) : Parcelable
