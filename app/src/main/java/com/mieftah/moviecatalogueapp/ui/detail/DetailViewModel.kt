package com.mieftah.moviecatalogueapp.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.mieftah.moviecatalogueapp.data.DataEntity
import com.mieftah.moviecatalogueapp.data.source.CatalogueRepository
import com.mieftah.moviecatalogueapp.utils.DataDummy

class DetailViewModel(private val catalogueRepository: CatalogueRepository) : ViewModel() {

    private var idDataMovie: Int = 0

    fun setMovieSelected(id: Int) {
        this.idDataMovie = id
    }

    fun getDetailMovie() : LiveData<List<DataEntity>> = catalogueRepository.getMovieDetail(idDataMovie)

    fun getDetailTvShow() : LiveData<List<DataEntity>> = catalogueRepository.getTvShowDetail(idDataMovie)

/*
    private lateinit var movieShowId: String
    private lateinit var tvShowId: String
    private fun getListMovie(): ArrayList<DataEntity> = DataDummy.getMovies()
    private fun getListTvShow(): ArrayList<DataEntity> = DataDummy.getTvShow()

    fun setMovieId(movieId: String) {
        this.movieShowId = movieId
    }

    fun setTvShowId(tvId: String) {
        this.tvShowId = tvId
    }

    fun getDetailMovie(): DataEntity {
        lateinit var result: DataEntity
        val listMovie = getListMovie()
        for (movie in listMovie) {
            if (movie.id == movieShowId) {
                result = movie
            }
        }
        return result
    }

    fun getDetailTvShow(): DataEntity {
        lateinit var result: DataEntity
        val listTv = getListTvShow()
        for (tvShow in listTv) {
            if (tvShow.id == tvShowId) {
                result = tvShow
            }
        }
        return result
    }*/
}