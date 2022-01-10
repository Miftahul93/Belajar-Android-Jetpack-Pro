package com.mieftah.moviecatalogueapp.data.source

import androidx.lifecycle.LiveData
import com.mieftah.moviecatalogueapp.data.DataEntity

interface CatalogueDataSource {

    fun getMoviePopular() : LiveData<List<DataEntity>>

    fun getMovieDetail(movieId: Int) : LiveData<List<DataEntity>>

    fun getTvShowPopular() : LiveData<List<DataEntity>>

    fun getTvShowDetail(tvShowId: Int) : LiveData<List<DataEntity>>
}