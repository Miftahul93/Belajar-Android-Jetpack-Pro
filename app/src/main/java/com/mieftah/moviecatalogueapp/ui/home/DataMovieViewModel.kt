package com.mieftah.moviecatalogueapp.ui.home

import androidx.lifecycle.ViewModel
import com.mieftah.moviecatalogueapp.data.DataEntity
import com.mieftah.moviecatalogueapp.utils.DataDummy

class DataMovieViewModel: ViewModel() {
    fun getMovie(): List<DataEntity> = DataDummy.getMovies()

    fun getTvShow(): List<DataEntity> = DataDummy.getTvShow()
}