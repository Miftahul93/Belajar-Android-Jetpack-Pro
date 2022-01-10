package com.mieftah.moviecatalogueapp.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DataEntity(
    val id: Int,
    val title: String,
    val releaseDate: String,
    val genres: List<String>,
    val duration: Int,
    val overview: String,
    val rating: Float,
    val poster: String
) : Parcelable
