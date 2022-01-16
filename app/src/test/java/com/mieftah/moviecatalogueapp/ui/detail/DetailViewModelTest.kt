package com.mieftah.moviecatalogueapp.ui.detail

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.mieftah.moviecatalogueapp.data.source.CatalogueRepository
import com.mieftah.moviecatalogueapp.data.source.local.DataEntity
import com.mieftah.moviecatalogueapp.utils.DataDummy
import com.nhaarman.mockitokotlin2.verify
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class DetailViewModelTest {

    private lateinit var viewModel: DetailViewModel

    private val dummyMovie = DataDummy.getMovies()[0]
    private val dummyTvShow = DataDummy.getTvShow()[0]
    private val movieId = dummyMovie.id
    private val tvId = dummyTvShow.id

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var catalogueRepository: CatalogueRepository

    @Mock
    private lateinit var observer: Observer<DataEntity>

    @Before
    fun setUp() {
        viewModel = DetailViewModel(catalogueRepository)
    }

    @Test
    fun getDetailMovie() {
        val movie = MutableLiveData<DataEntity>()
        movie.value = dummyMovie

        `when`(movieId?.let { catalogueRepository.getMovieDetail(it) }).thenReturn(movie)
        val movieEntity = movieId?.let { viewModel.getDetailMovie(it).value } as DataEntity

        assertNotNull(movieEntity)
        assertEquals(dummyMovie.id, movieEntity.id)
        assertEquals(dummyMovie.title, movieEntity.title)
        assertEquals(dummyMovie.releaseDate, movieEntity.releaseDate)
        assertEquals(dummyMovie.genres, movieEntity.genres)
        assertEquals(dummyMovie.duration, movieEntity.duration)
        assertEquals(dummyMovie.overview, movieEntity.overview)
        assertEquals(dummyMovie.rating, movieEntity.rating)
        assertEquals(dummyMovie.poster, movieEntity.poster)

        viewModel.getDetailMovie(movieId).observeForever(observer)
        verify(observer).onChanged(dummyMovie)
    }

    @Test
    fun getDetailTvShow() {
        val tvShow = MutableLiveData<DataEntity>()
        tvShow.value = dummyTvShow

        `when`(tvId?.let { catalogueRepository.getTvShowDetail(it) }).thenReturn(tvShow)

        val tvEntity = tvId?.let { viewModel.getDetailTvShow(it).value } as DataEntity
        assertNotNull(tvEntity)
        assertEquals(dummyTvShow.id, tvEntity.id)
        assertEquals(dummyTvShow.title, tvEntity.title)
        assertEquals(dummyTvShow.releaseDate, tvEntity.releaseDate)
        assertEquals(dummyTvShow.genres, tvEntity.genres)
        assertEquals(dummyTvShow.duration, dummyTvShow.duration)
        assertEquals(dummyTvShow.overview, tvEntity.overview)
        assertEquals(dummyTvShow.rating, tvEntity.rating)
        assertEquals(dummyTvShow.poster, tvEntity.poster)

        viewModel.getDetailTvShow(tvId).observeForever(observer)
        verify(observer).onChanged(dummyTvShow)
    }
}