package com.mieftah.moviecatalogueapp.api

import com.mieftah.moviecatalogueapp.data.source.remote.response.ListResponse
import com.mieftah.moviecatalogueapp.data.source.remote.response.MovieResponse
import com.mieftah.moviecatalogueapp.data.source.remote.response.TvShowResponse
import com.mieftah.moviecatalogueapp.utils.Constanta
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("movie/popular")
    @Headers("Autorization: token ${Constanta.MOVIE_API}")
    fun getMoviePopular(
        @Query("api_key") apiKey: String
    ) : Call<ListResponse<MovieResponse>>

    @GET("movie/{movie_id}")
    @Headers("Autorization: token ${Constanta.MOVIE_API}")
    fun getDetailMovie(
        @Path("movie_id") movieId: Int,
        @Query("api_key") apiKey: String
    ) : Call<MovieResponse>

    @GET("tv/popular")
    @Headers("Autorization: token ${Constanta.MOVIE_API}")
    fun getTvShowPopular(
        @Query("api_key") apiKey: String
    ) : Call<ListResponse<TvShowResponse>>

    @GET("tv/{tv_id}")
    @Headers("Autorization: token ${Constanta.MOVIE_API}")
    fun getDetailTvshow (
        @Path("tv_id") tvShow: Int,
        @Query("api_key") apiKey: String
    ) : Call<TvShowResponse>
}