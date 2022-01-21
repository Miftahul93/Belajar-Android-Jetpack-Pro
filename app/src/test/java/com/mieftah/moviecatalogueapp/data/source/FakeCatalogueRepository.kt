package com.mieftah.moviecatalogueapp.data.source

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.mieftah.moviecatalogueapp.data.source.local.DataEntity
import com.mieftah.moviecatalogueapp.data.source.remote.RemoteDataSource
import com.mieftah.moviecatalogueapp.data.source.remote.response.MovieResponse
import com.mieftah.moviecatalogueapp.data.source.remote.response.TvShowResponse
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class FakeCatalogueRepository (private val remoteDataSource: RemoteDataSource) :
    CatalogueDataSource {

    override fun getMoviePopular(): LiveData<List<DataEntity>> {
        val movieResult = MutableLiveData<List<DataEntity>>()

        CoroutineScope(Dispatchers.IO).launch {
            remoteDataSource.getMoviePopular(object : RemoteDataSource.LoadMoviesPopularCallback {
                override fun onMoviesLoaded(movies: List<MovieResponse>?) {
                    val movieList = ArrayList<DataEntity>()
                       if (movies != null) {
                           for (response in movies) {
                               with(response) {
                                   val movie = DataEntity(
                                       id,
                                       title,
                                       releaseDate,
                                       genres,
                                       duration,
                                       overview,
                                       rating,
                                       poster
                                   )
                                   movieList.add(movie)
                               }
                           }
                           movieResult.postValue(movieList)
                       }
                }
            })
        }
        return movieResult
    }

    override fun getMovieDetail(movieId: Int): LiveData<DataEntity> {
        val movieDetailResult = MutableLiveData<DataEntity>()

        CoroutineScope(Dispatchers.IO).launch {
            remoteDataSource.getMovieDetail(
                movieId,
                object : RemoteDataSource.LoadDetailMovieCallback {
                    override fun onMovieDetailLoaded(movieDetail: MovieResponse?) {
                        if (movieDetail != null) {
                            with(movieDetail) {
                                val listGenres = ArrayList<String>()
                                for (genre in genresDetail) {
                                    listGenres.add(genre.name)
                                }

                                val detailMovie = DataEntity(
                                    id,
                                    title,
                                    releaseDate,
                                    genres = listGenres,
                                    duration,
                                    overview,
                                    rating,
                                    poster
                                )
                                movieDetailResult.postValue(detailMovie)
                            }
                        }
                    }
                })
        }

        return movieDetailResult
    }

    override fun getTvShowPopular(): LiveData<List<DataEntity>> {
        val tvShowResult = MutableLiveData<List<DataEntity>>()

        CoroutineScope(Dispatchers.IO).launch {
            remoteDataSource.getTvShowPopular(object : RemoteDataSource.LoadTvPopularCallback {
                override fun onTvShowLoaded(tvShowPopular: List<TvShowResponse>?) {
                    val listTvShow = ArrayList<DataEntity>()
                    if (tvShowPopular != null) {
                        for (response in tvShowPopular) {
                            with(response) {
                                val tvShow = DataEntity(
                                    id,
                                    title,
                                    releaseDate,
                                    genres,
                                    duration?.get(0),
                                    overview,
                                    rating,
                                    poster
                                )
                                listTvShow.add(tvShow)
                            }
                        }
                        tvShowResult.postValue(listTvShow)
                    }
                }
            })
        }
        return tvShowResult
    }

    override fun getTvShowDetail(tvShowId: Int): LiveData<DataEntity> {
        val tvShowDetailResult = MutableLiveData<DataEntity>()

        CoroutineScope(Dispatchers.IO).launch {
            remoteDataSource.getTvShowDetail(
                tvShowId,
                object : RemoteDataSource.LoadDetailTvShowCallback {
                    override fun onTvShowDetailLoaded(tvShowDetail: TvShowResponse?) {
                        if (tvShowDetail != null) {
                            with(tvShowDetail) {
                                val listGenres = ArrayList<String>()
                                for (genre in genresDetail) {
                                    listGenres.add(genre.name)
                                }

                                val detailTvShow = DataEntity(
                                    id,
                                    title,
                                    releaseDate,
                                    genres = listGenres,
                                    duration?.get(0),
                                    overview,
                                    rating,
                                    poster
                                )
                                tvShowDetailResult.postValue(detailTvShow)
                            }
                        }
                    }
                })
        }
        return tvShowDetailResult
    }
}