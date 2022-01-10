package com.mieftah.moviecatalogueapp.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.mieftah.moviecatalogueapp.data.DataEntity
import com.mieftah.moviecatalogueapp.data.source.CatalogueRepository
import com.mieftah.moviecatalogueapp.utils.DataDummy

class DataMovieViewModel (private val catalogueRepository: CatalogueRepository) : ViewModel() {
    fun getMovie(): LiveData<List<DataEntity>> = catalogueRepository.getMoviePopular()//DataDummy.getMovies()

    fun getTvShow(): LiveData<List<DataEntity>> = catalogueRepository.getTvShowPopular()//DataDummy.getTvShow()
}