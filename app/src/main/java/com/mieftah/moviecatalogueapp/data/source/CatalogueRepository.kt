package com.mieftah.moviecatalogueapp.data.source

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.mieftah.moviecatalogueapp.data.DataEntity
import com.mieftah.moviecatalogueapp.data.source.remote.RemoteDataSource
import com.mieftah.moviecatalogueapp.data.source.remote.response.MovieResponse
import com.mieftah.moviecatalogueapp.data.source.remote.response.TvShowResponse

class CatalogueRepository private constructor(private val remoteDataSource: RemoteDataSource) :
    CatalogueDataSource {

    override fun getMoviePopular(): LiveData<List<DataEntity>> {
        val movieResult = MutableLiveData<List<DataEntity>>()

        remoteDataSource.getMoviePopular(object : RemoteDataSource.LoadMoviesCallback {
            override fun onMoviesLoaded(movies: List<MovieResponse>?) {
                val movieList = ArrayList<DataEntity>()
                if (movies != null) {
                    for (response in movies) {
                        with(response) {
                            val movie = DataEntity(
                                id,
                                overview,
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
        return movieResult
    }

    override fun getMovieDetail(movieId: Int): LiveData<List<DataEntity>> {
        val movieDetailResult = MutableLiveData<List<DataEntity>>()

        remoteDataSource.getMovieDetail(movieId, object : RemoteDataSource.LoadDetailMovieCallback {
            override fun onMovieDetailLoaded(movieDetail: MovieResponse?) {
                if (movieDetail != null) {
                    with(movieDetail) {
                        val listGenres = ArrayList<String>()
                        for (genre in genresDetail) {
                            listGenres.add(genre.name)
                        }

                        val detailMovie = DataEntity(
                            id = id,
                            title = title,
                            releaseDate = releaseDate,
                            genres = listGenres,
                            duration = duration,
                            overview = overview,
                            rating = rating,
                            poster = poster
                        )
                        movieDetailResult.postValue(listOf(detailMovie))
                    }
                }
            }
        })
        return movieDetailResult
    }

    override fun getTvShowPopular(): LiveData<List<DataEntity>> {
        val tvShowResult = MutableLiveData<List<DataEntity>>()

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
                                duration,
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
        return tvShowResult
    }

    override fun getTvShowDetail(tvShowId: Int): LiveData<List<DataEntity>> {
        val tvShowDetailResult = MutableLiveData<List<DataEntity>>()

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
                                duration,
                                overview,
                                rating,
                                poster
                            )
                            tvShowDetailResult.postValue(listOf(detailTvShow))
                        }
                    }
                }
            })
        return tvShowDetailResult
    }

    companion object {
        @Volatile
        private var instance: CatalogueRepository? = null

        fun getInstance(remoteData: RemoteDataSource): CatalogueRepository =
            instance ?: synchronized(this) {
                instance ?: CatalogueRepository(remoteData)
            }
    }
}