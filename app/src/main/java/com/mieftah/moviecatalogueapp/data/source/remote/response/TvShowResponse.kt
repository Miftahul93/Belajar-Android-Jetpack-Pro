package com.mieftah.moviecatalogueapp.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class TvShowResponse(

	@field:SerializedName("first_air_date")
	val releaseDate: String,

	@field:SerializedName("overview")
	val overview: String,

	@field:SerializedName("genre_ids")
	val genreIds: List<Int>,

	@field:SerializedName("genres")
	val genres: List<GenreResponse>,

	@field:SerializedName("vote_average")
	val rating: Double,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("episode_run_time")
	val duration: List<Int>,

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("poster_path")
	val posterPath: String
)
