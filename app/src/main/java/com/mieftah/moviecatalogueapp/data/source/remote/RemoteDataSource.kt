package com.mieftah.moviecatalogueapp.data.source.remote

import android.content.ContentValues
import android.util.Log
import com.mieftah.moviecatalogueapp.data.source.remote.api.ApiClient
import com.mieftah.moviecatalogueapp.data.source.remote.response.ListResponse
import com.mieftah.moviecatalogueapp.data.source.remote.response.MovieResponse
import com.mieftah.moviecatalogueapp.data.source.remote.response.TvShowResponse
import com.mieftah.moviecatalogueapp.utils.EspressoIdlingResource
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class RemoteDataSource() {

    fun getMoviePopular(callback: LoadMoviesCallback) {
        EspressoIdlingResource.increment()
        val client = ApiClient.getApiService().getMoviePopular()
        client.enqueue(object : Callback<ListResponse<MovieResponse>> {
            override fun onResponse(call: Call<ListResponse<MovieResponse>>, response: Response<ListResponse<MovieResponse>>) {
                callback.onMoviesLoaded(response.body()?.results)
                EspressoIdlingResource.decrement()
            }

            override fun onFailure(call: Call<ListResponse<MovieResponse>>, t: Throwable) {
                Log.e(ContentValues.TAG, "onFailure :${t.message.toString()}")
                EspressoIdlingResource.decrement()
            }
        })
    }

    fun getMovieDetail(movieId: Int, callback: LoadDetailMovieCallback){
        EspressoIdlingResource.increment()
        val client = ApiClient.getApiService().getDetailMovie(movieId)
        client.enqueue(object : Callback<MovieResponse>{
            override fun onResponse(call: Call<MovieResponse>, response: Response<MovieResponse>) {
                callback.onMovieDetailLoaded(response.body())
                EspressoIdlingResource.decrement()
            }

            override fun onFailure(call: Call<MovieResponse>, t: Throwable) {
                Log.e(ContentValues.TAG, "onFailure : ${t.message.toString()}")
                EspressoIdlingResource.decrement()
            }
        })
    }

    fun getTvShowPopular (callback: LoadTvPopularCallback) {
        EspressoIdlingResource.increment()
        val client = ApiClient.getApiService().getTvShowPopular()
        client.enqueue(object : Callback<ListResponse<TvShowResponse>>{
            override fun onResponse(call: Call<ListResponse<TvShowResponse>>, response: Response<ListResponse<TvShowResponse>>) {
                callback.onTvShowLoaded(response.body()?.results)
                EspressoIdlingResource.decrement()
            }

            override fun onFailure(call: Call<ListResponse<TvShowResponse>>, t: Throwable) {
                Log.e(ContentValues.TAG, "onFailure : ${t.message.toString()}")
                EspressoIdlingResource.decrement()
            }
        })
    }

    fun getTvShowDetail(tvShowId: Int, callback: LoadDetailTvShowCallback) {
        EspressoIdlingResource.increment()
        val client = ApiClient.getApiService().getDetailTvShow(tvShowId)
        client.enqueue(object : Callback<TvShowResponse>{
            override fun onResponse(
                call: Call<TvShowResponse>,
                response: Response<TvShowResponse>
            ) {
                callback.onTvShowDetailLoaded(response.body())
                EspressoIdlingResource.decrement()
            }

            override fun onFailure(call: Call<TvShowResponse>, t: Throwable) {
                Log.e(ContentValues.TAG, "onFailure : ${t.message.toString()}")
                EspressoIdlingResource.decrement()
            }
        })
    }

    interface LoadDetailTvShowCallback {
        fun onTvShowDetailLoaded(tvShowDetail : TvShowResponse?)
    }

    interface LoadTvPopularCallback {
        fun onTvShowLoaded(tvShowPopular: List<TvShowResponse>?)
    }

    interface LoadDetailMovieCallback {
        fun onMovieDetailLoaded(movieDetail: MovieResponse?)
    }

    interface LoadMoviesCallback {
        fun onMoviesLoaded(movies: List<MovieResponse>?)
    }

    companion object {
        @Volatile
        private var instance: RemoteDataSource? = null

        fun getInstance() : RemoteDataSource = instance ?: synchronized(this) {
            instance ?: RemoteDataSource()
        }
    }
}