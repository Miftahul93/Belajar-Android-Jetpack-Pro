package com.mieftah.moviecatalogueapp.ui.home

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
class DataMovieViewModelTest {

    private lateinit var viewModel: DataMovieViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var catalogueRepository: CatalogueRepository

    @Mock
    private lateinit var observer: Observer<List<DataEntity>>

    @Before
    fun setUp() {
        viewModel = DataMovieViewModel(catalogueRepository)
    }

    @Test
    fun getMovie() {

        val dummyMovie = DataDummy.getMovies()
        val movies = MutableLiveData<List<DataEntity>>()
        movies.value = dummyMovie

        `when`(catalogueRepository.getMoviePopular()).thenReturn(movies)

        val movieEntities = viewModel.getMovie().value
        verify(catalogueRepository).getMoviePopular()
        assertNotNull(movieEntities)
        assertEquals(15, movieEntities?.size)

        viewModel.getMovie().observeForever(observer)
        verify(observer).onChanged(dummyMovie)
    }

    @Test
    fun getTvShow() {

        val dummyTvShow = DataDummy.getTvShow()
        val tvShow = MutableLiveData<List<DataEntity>>()
        tvShow.value = dummyTvShow

        `when`(catalogueRepository.getTvShowPopular()).thenReturn(tvShow)

        val tvEntities = viewModel.getTvShow().value
        verify(catalogueRepository).getTvShowPopular()
        assertNotNull(tvEntities)
        assertEquals(15, tvEntities?.size)

        viewModel.getTvShow().observeForever(observer)
        verify(observer).onChanged(dummyTvShow)
    }
}