package com.mieftah.moviecatalogueapp.ui.home

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DataMovieViewModelTest {

    private lateinit var viewModel: DataMovieViewModel

    @Before
    fun setUp() {
        viewModel = DataMovieViewModel()
    }

    @Test
    fun getMovie() {

        val movieEntities = viewModel.getMovie()
        assertNotNull(movieEntities)
        assertEquals(15, movieEntities.size)
    }

    @Test
    fun getTvShow() {
        val tvEntities = viewModel.getTvShow()
        assertNotNull(tvEntities)
        assertEquals(15, tvEntities.size)
    }
}