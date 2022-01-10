package com.mieftah.moviecatalogueapp.data.source

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.mieftah.moviecatalogueapp.data.DataEntity
import com.mieftah.moviecatalogueapp.data.source.remote.RemoteDataSource
import com.mieftah.moviecatalogueapp.data.source.remote.response.MovieResponse

class CatalogueRepository private constructor(private val remoteDataSource: RemoteDataSource) : CatalogueDataSource {
    override fun getMoviePopular(): LiveData<List<DataEntity>> {
        val movieResult = MutableLiveData<List<DataEntity>>()

        remoteDataSource.getMoviePopular(object : RemoteDataSource.LoadMoviesCallback{
            override fun onMoviesLoaded(movies: List<MovieResponse>?) {
                val movieList = ArrayList<DataEntity>()
                if (movies != null) {
                    for (response in movies) {
                        with(response) {
                            val movie = DataEntity(
                                id,
                                title,
                                releaseDate,
                                genreIds,
                                duration,
                                rating,
                                posterPath)
                            movieList.add(movie)
                        }
                    }
                    movieResult.postValue(movieList)
                }
            }
        })
        return movieResult
    }

    override fun getMovieDetail(): LiveData<List<DataEntity>> {
        val movieDetailResult = MutableLiveData<MovieResponse>()


        remoteDataSource.getMovieDetail(object : RemoteDataSource.LoadDetailMovieCallback{
            override fun onMovieDetailLoaded(movieDetail: MovieResponse?) {
                if (movieDetail != null) {
                    with(movieDetail) {
                        val listGenres = ArrayList<String>()
                        for (genre in genres) {
                            listGenres.add(genre.name)
                        }
                        val detailMovie = DataEntity(
                            id = id,
                            title = title,
                            releaseDate = releaseDate,
                            genre = listGenres,
                            duration = duration,
                            overview = overview,
                            rating = rating,
                            poster = posterPath
                        )
                        movieDetailResult.postValue(detailMovie)
                    }
                }
            }
        }, movieId)
    }

    override fun getTvShowPopular(): LiveData<List<DataEntity>> {
        TODO("Not yet implemented")
    }

    override fun getTvShowDetail(): LiveData<List<DataEntity>> {
        TODO("Not yet implemented")
    }

    companion object {
        @Volatile
        private var instance: CatalogueRepository? = null
        fun getInstance(remoteData: RemoteDataSource): CatalogueRepository = instance ?: synchronized(this) {
            instance ?: CatalogueRepository(remoteData)
        }
    }
}