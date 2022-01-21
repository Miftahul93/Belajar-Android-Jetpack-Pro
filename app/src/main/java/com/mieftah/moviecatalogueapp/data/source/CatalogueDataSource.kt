package com.mieftah.moviecatalogueapp.data.source

import androidx.lifecycle.LiveData
import com.mieftah.moviecatalogueapp.data.source.local.DataEntity

interface CatalogueDataSource {

    fun getMoviePopular(): LiveData<List<DataEntity>>

    fun getMovieDetail(movieId: Int): LiveData<DataEntity>

    fun getTvShowPopular(): LiveData<List<DataEntity>>

    fun getTvShowDetail(tvShowId: Int): LiveData<DataEntity>
}