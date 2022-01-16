package com.mieftah.moviecatalogueapp.utils

import android.annotation.SuppressLint
import com.mieftah.moviecatalogueapp.BuildConfig
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

object Constants {
    const val BASE_URL = "https://api.themoviedb.org/3/"
    const val IMAGE_URL = "https://image.tmdb.org/t/p/w185"
    const val MOVIE_API = BuildConfig.THE_MOVIE_API
    const val MOVIE_POPULAR = "movie/popular"
    const val MOVIE_DETAIL = "movie/{movie_id}"
    const val TV_POPULAR = "tv/popular"
    const val TV_DETAIL = "tv/{tv_id}"
    const val TIMES = 3000

    @SuppressLint("SimpleDateFormat")
    fun convertStringToDate(value: String): String {
        try {
            val sDate: String = value

            val dateFormat = SimpleDateFormat("yyyy-MM-dd")
            val objDate: Date = dateFormat.parse(sDate)

            val dateFormat2 = SimpleDateFormat("EEEE, dd MM yyyy")
            return dateFormat2.format(objDate)
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return ""
    }

    fun convertMinuteToDuration(duration: Int) : String {
        val hour = duration/60
        val minute = duration%60

        return if (hour>0) {
            "$hour h $minute m"
        } else {
            "$minute m"
        }
    }

    @SuppressLint("newApi")
    fun changeStringDateToYear(date: String): Int {
        val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("yyy-MM-dd")
        val localDate: LocalDate = LocalDate.parse(date, formatter)

        return localDate.year
    }
}