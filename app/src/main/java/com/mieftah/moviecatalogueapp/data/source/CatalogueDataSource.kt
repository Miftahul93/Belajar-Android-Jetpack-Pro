package com.mieftah.moviecatalogueapp.data.source

import androidx.lifecycle.LiveData
import com.mieftah.moviecatalogueapp.data.DataEntity

interface CatalogueDataSource {

    fun getMoviePopular() : LiveData<List<DataEntity>>

    fun getMovieDetail() : LiveData<List<DataEntity>>

    fun getTvShowPopular() : LiveData<List<DataEntity>>

    fun getTvShowDetail() : LiveData<List<DataEntity>>
}