package com.mieftah.moviecatalogueapp.api

import com.mieftah.moviecatalogueapp.data.source.remote.RemoteDataSource
import com.mieftah.moviecatalogueapp.data.source.remote.response.ListResponse
import com.mieftah.moviecatalogueapp.data.source.remote.response.MovieResponse
import com.mieftah.moviecatalogueapp.data.source.remote.response.TvShowResponse
import com.mieftah.moviecatalogueapp.utils.Constants
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET(Constants.MOVIE_POPULAR)
    @Headers("Autorization: token ${Constants.MOVIE_API}")
    fun getMoviePopular(
        @Query("api_key") apiKey: String
    ) : Call<ListResponse>

    @GET(Constants.MOVIE_DETAIL)
    @Headers("Autorization: token ${Constants.MOVIE_API}")
    fun getDetailMovie(
        @Path("movie_id") movieId: RemoteDataSource.LoadDetailMovieCallback,
        @Query("api_key") apiKey: String
    ) : Call<MovieResponse>

    @GET(Constants.TV_POPULAR)
    @Headers("Autorization: token ${Constants.MOVIE_API}")
    fun getTvShowPopular(
        @Query("api_key") apiKey: String
    ) : Call<ListResponse>

    @GET(Constants.TV_DETAIL)
    @Headers("Autorization: token ${Constants.MOVIE_API}")
    fun getDetailTvShow (
        @Path("tv_id") tvShowId: Int,
        @Query("api_key") apiKey: String
    ) : Call<TvShowResponse>
}