package com.mieftah.moviecatalogueapp.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class ListResponse(

	@field:SerializedName("page")
	val page: Int,

	@field:SerializedName("total_pages")
	val totalPages: Int,
// nanti di koba hanya menggunakan rezult
	@field:SerializedName("results")
	val results: List<MovieResponse>,

	@field:SerializedName("total_results")
	val totalResults: Int
)
