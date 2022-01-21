package com.mieftah.moviecatalogueapp.data.source.local

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

data class DataEntity(
    val id: Int? = 0,
    val title: String?,
    val releaseDate: String?,
    val genres: List<String>?,
    val duration: Int?,
    val overview: String?,
    val rating: Float?,
    val poster: String?,
)
