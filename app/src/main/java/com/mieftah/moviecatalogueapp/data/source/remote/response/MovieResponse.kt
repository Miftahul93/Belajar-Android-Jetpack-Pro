package com.mieftah.moviecatalogueapp.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class MovieResponse(

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("overview")
	val overview: String,

	@field:SerializedName("release_date")
	val releaseDate: String,

	@field:SerializedName("vote_average")
	val rating: Double,

	@field:SerializedName("title")
	val title: String,

	@field:SerializedName("genre_ids")
	val genreIds: List<Int>,

	@field:SerializedName("genres")
	val genres: List<GenreResponse>,

	@field:SerializedName("poster_path")
	val posterPath: String,

	@field:SerializedName("runtime")
	val duration: Int
)
