package com.mieftah.moviecatalogueapp.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.mieftah.moviecatalogueapp.data.source.local.DataEntity
import com.mieftah.moviecatalogueapp.data.source.CatalogueRepository

class DetailViewModel(private val catalogueRepository: CatalogueRepository) : ViewModel() {

    fun getDetailMovie(movieId: Int): LiveData<DataEntity> =
        catalogueRepository.getMovieDetail(movieId)

    fun getDetailTvShow(tvShowId: Int): LiveData<DataEntity> =
        catalogueRepository.getTvShowDetail(tvShowId)
}