package com.mieftah.moviecatalogueapp.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class TvShowResponse(

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("first_air_date")
	val releaseDate: String,

	@field:SerializedName("overview")
	val overview: String,

	@field:SerializedName("genre_ids")
	val genres: List<String>,

	@field:SerializedName("genres")
	val genresDetail: List<GenreResponse>,

	@field:SerializedName("vote_average")
	val rating: Float,

	@field:SerializedName("name")
	val title: String,

	@field:SerializedName("episode_run_time")
	val duration: Int,

	@field:SerializedName("poster_path")
	val poster: String
)
