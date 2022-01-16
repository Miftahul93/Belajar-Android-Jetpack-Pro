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
   // @Headers("Authorization: token ${Constants.MOVIE_API}")
    fun getMoviePopular(
        @Query("api_key") apiKey: String = Constants.MOVIE_API //= "aea0e885e4efcadd53839750a603350c"
    ) : Call<ListResponse<MovieResponse>>

    @GET(Constants.MOVIE_DETAIL)
   // @Headers("Autorization: token ${Constants.MOVIE_API}")
    fun getDetailMovie(
        @Path("movie_id") movieId: Int,
        @Query("api_key") apiKey: String = Constants.MOVIE_API //"aea0e885e4efcadd53839750a603350c"
    ) : Call<MovieResponse>

    @GET(Constants.TV_POPULAR)
    //@Headers("Autorization: token ${Constants.MOVIE_API}")
    fun getTvShowPopular(
        @Query("api_key") apiKey: String = Constants.MOVIE_API //"aea0e885e4efcadd53839750a603350c"
    ) : Call<ListResponse<TvShowResponse>>

    @GET(Constants.TV_DETAIL)
    //@Headers("Autorization: token ${Constants.MOVIE_API}")
    fun getDetailTvShow (
        @Path("tv_id") tvShowId: Int,
        @Query("api_key") apiKey: String = Constants.MOVIE_API //"aea0e885e4efcadd53839750a603350c"
    ) : Call<TvShowResponse>

    @GET("genre/movie/list")
    //@Headers("Autorization: token ${Constants.MOVIE_API}")
    fun getGenreMovie (
        @Path("tv_id")
        @Query("api_key") apiKey: String = Constants.MOVIE_API //"aea0e885e4efcadd53839750a603350c"
    ) : Call<GenreResponse>
}