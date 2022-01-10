package com.mieftah.moviecatalogueapp.ui.detail

import com.mieftah.moviecatalogueapp.utils.DataDummy
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DetailViewModelTest {

    private lateinit var viewModel: DetailViewModel

    private val dummyMovie = DataDummy.getMovies()[0]
    private val dummyTvShow = DataDummy.getTvShow()[0]
    private val movieId = dummyMovie.id
    private val tvId = dummyTvShow.id

    @Before
    fun setUp() {
        viewModel = DetailViewModel()
        viewModel.setMovieId(movieId)
        viewModel.setTvShowId(tvId)
    }

    @Test
    fun getDetailMovie() {
        viewModel.setMovieId(dummyMovie.id)
        val movieEntity = viewModel.getDetailMovie()
        assertNotNull(movieEntity)
        assertEquals(dummyMovie.id, movieEntity.id)
        assertEquals(dummyMovie.title, movieEntity.title)
        assertEquals(dummyMovie.releaseDate, movieEntity.releaseDate)
        assertEquals(dummyMovie.genre, movieEntity.genre)
        assertEquals(dummyMovie.duration, movieEntity.duration)
        assertEquals(dummyMovie.overview, movieEntity.overview)
        assertEquals(dummyMovie.rating, movieEntity.rating)
        assertEquals(dummyMovie.poster, movieEntity.poster)
    }

    @Test
    fun getDetailTvShow() {
        viewModel.setTvShowId(dummyTvShow.id)
        val tvEntity = viewModel.getDetailTvShow()
        assertNotNull(tvEntity)
        assertEquals(dummyTvShow.id, tvEntity.id)
        assertEquals(dummyTvShow.title, tvEntity.title)
        assertEquals(dummyTvShow.releaseDate, tvEntity.releaseDate)
        assertEquals(dummyTvShow.genre, tvEntity.genre)
        assertEquals(dummyTvShow.duration, dummyTvShow.duration)
        assertEquals(dummyTvShow.overview, tvEntity.overview)
        assertEquals(dummyTvShow.rating, tvEntity.rating)
        assertEquals(dummyTvShow.poster, tvEntity.poster)
    }
}