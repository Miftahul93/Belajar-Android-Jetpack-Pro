package com.mieftah.moviecatalogueapp.data.source

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.mieftah.moviecatalogueapp.data.source.remote.RemoteDataSource
import com.mieftah.moviecatalogueapp.utils.DataDummy
import com.mieftah.moviecatalogueapp.utils.LiveDataTestUtil
import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.doAnswer
import com.nhaarman.mockitokotlin2.eq
import com.nhaarman.mockitokotlin2.verify
import kotlinx.coroutines.runBlocking
import org.junit.Test

import org.junit.Assert.*
import org.junit.Rule
import org.mockito.Mockito

class CatalogueRepositoryTest {

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private val remote = Mockito.mock(RemoteDataSource::class.java)
    private val catalogueRepository = FakeCatalogueRepository(remote)

    private val listMovieResponse = DataDummy.getRemoteMovies()
    private val movieId = listMovieResponse[0].id
    private val listTvShowResponse = DataDummy.getRemoteTvShow()
    private val tvShowId = listTvShowResponse[0].id
    private val movieResponse = DataDummy.getRemoteMovies()[0]
    private val tvShowResponse = DataDummy.getRemoteTvShow()[0]

    @Test
    fun getMoviePopular() {
        runBlocking {
            doAnswer { invocation ->
                (invocation.arguments[0] as RemoteDataSource.LoadMoviesPopularCallback).onMoviesLoaded(listMovieResponse)
                null
            }.`when`(remote).getMoviePopular(any())
        }

        val data = LiveDataTestUtil.getValue(catalogueRepository.getMoviePopular())

        runBlocking {
            verify(remote).getMoviePopular(any())
        }
        assertNotNull(data)
        assertEquals(listMovieResponse.size.toLong(), data.size.toLong())
    }

    @Test
    fun getMovieDetail() {
        runBlocking {
            doAnswer { invocation ->
                (invocation.arguments[1] as RemoteDataSource.LoadDetailMovieCallback).onMovieDetailLoaded(movieResponse)
                null
            }.`when`(remote).getMovieDetail(eq(movieId), any())
        }

        val data = LiveDataTestUtil.getValue(catalogueRepository.getMovieDetail(movieId))

        runBlocking {
            verify(remote).getMovieDetail(eq(movieId), any())
        }
        assertNotNull(data)
        assertEquals(movieResponse.id, data.id)
    }

    @Test
    fun getTvShowPopular() {
        runBlocking {
            doAnswer { invocation ->
                (invocation.arguments[0] as RemoteDataSource.LoadTvPopularCallback).onTvShowLoaded(listTvShowResponse)
                null
            }.`when`(remote).getTvShowPopular(any())
        }

        val data = LiveDataTestUtil.getValue(catalogueRepository.getTvShowPopular())

        runBlocking {
            verify(remote).getTvShowPopular(any())
        }
        assertNotNull(data)
        assertEquals(listTvShowResponse.size.toLong(), data.size.toLong())
    }

    @Test
    fun getTvShowDetail() {
        runBlocking {
            doAnswer { invocation ->
                (invocation.arguments[1] as RemoteDataSource.LoadDetailTvShowCallback).onTvShowDetailLoaded(tvShowResponse)
                null
            }.`when`(remote).getTvShowDetail(eq(tvShowId), any())
        }

        val data = LiveDataTestUtil.getValue(catalogueRepository.getTvShowDetail(tvShowId))

        runBlocking {
            verify(remote).getTvShowDetail(eq(tvShowId), any())
        }
        assertNotNull(data)
        assertEquals(tvShowResponse.id, data.id)
    }
}