package com.mieftah.moviecatalogueapp.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class ListResponse<T>(

	@field:SerializedName("page")
	val page: Int,

	@field:SerializedName("total_pages")
	val totalPages: Int,

	@field:SerializedName("results")
	val results: List<T>,

	@field:SerializedName("total_results")
	val totalResults: Int
)
