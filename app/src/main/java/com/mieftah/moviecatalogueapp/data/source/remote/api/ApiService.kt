package com.mieftah.moviecatalogueapp.data.source.remote.api

import com.mieftah.moviecatalogueapp.data.source.remote.response.GenreResponse
import com.mieftah.moviecatalogueapp.data.source.remote.response.ListResponse
import com.mieftah.moviecatalogueapp.data.source.remote.response.MovieResponse
import com.mieftah.moviecatalogueapp.data.source.remote.response.TvShowResponse
import com.mieftah.moviecatalogueapp.utils.Constants
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET(Constants.MOVIE_POPULAR)
    fun getMoviePopular(
        @Query("api_key") apiKey: String = Constants.MOVIE_API
    ): Call<ListResponse<MovieResponse>>

    @GET(Constants.MOVIE_DETAIL)
    fun getDetailMovie(
        @Path("movie_id") movieId: Int,
        @Query("api_key") apiKey: String = Constants.MOVIE_API
    ): Call<MovieResponse>

    @GET(Constants.TV_POPULAR)
    fun getTvShowPopular(
        @Query("api_key") apiKey: String = Constants.MOVIE_API
    ): Call<ListResponse<TvShowResponse>>

    @GET(Constants.TV_DETAIL)
    fun getDetailTvShow(
        @Path("tv_id") tvShowId: Int,
        @Query("api_key") apiKey: String = Constants.MOVIE_API
    ): Call<TvShowResponse>
}