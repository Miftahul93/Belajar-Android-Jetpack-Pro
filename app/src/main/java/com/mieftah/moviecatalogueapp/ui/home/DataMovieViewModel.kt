package com.mieftah.moviecatalogueapp.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.mieftah.moviecatalogueapp.data.source.local.DataEntity
import com.mieftah.moviecatalogueapp.data.source.CatalogueRepository

class DataMovieViewModel(private val catalogueRepository: CatalogueRepository) : ViewModel() {

    fun getMovie(): LiveData<List<DataEntity>> = catalogueRepository.getMoviePopular()

    fun getTvShow(): LiveData<List<DataEntity>> = catalogueRepository.getTvShowPopular()
}