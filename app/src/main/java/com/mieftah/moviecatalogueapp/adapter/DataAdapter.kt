package com.mieftah.moviecatalogueapp.adapter

import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.palette.graphics.Palette
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.mieftah.moviecatalogueapp.R
import com.mieftah.moviecatalogueapp.data.source.local.DataEntity
import com.mieftah.moviecatalogueapp.databinding.ItemMoviesBinding
import com.mieftah.moviecatalogueapp.utils.Constants

class DataAdapter(private val callback: DataCallback) :
    RecyclerView.Adapter<DataAdapter.DataViewHolder>() {

    private val listData = ArrayList<DataEntity>()

    fun setDataMovies(data: List<DataEntity>?) {
        if (data.isNullOrEmpty()) return
        this.listData.clear()
        this.listData.addAll(data)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val itemMoviesBinding =
            ItemMoviesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DataViewHolder(itemMoviesBinding)
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bind(listData[position])
    }

    override fun getItemCount(): Int = listData.size

    inner class DataViewHolder(private val binding: ItemMoviesBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: DataEntity) {
            with(binding) {
                tvTitle.text = data.title
                tvOverview.text = data.overview
                tvRelease.text = data.releaseDate?.let { Constants.convertStringToDate(it) }
                rating.text = "${data.rating}"
                ratingBar.rating = data.rating?.div(2)!!
                Glide.with(itemView.context)
                    .load(Constants.IMAGE_URL + data.poster)
                    .transform(RoundedCorners(30))
                    .into(ivPoster)

                itemView.setOnClickListener {
                    callback.onItemClicked(data)

                     /*val bitmap = BitmapFactory.decodeResource(itemView.context.resources, data.poster)

                     Palette.from(bitmap).generate { palette ->
                         val defValue =
                             itemView.resources.getColor(R.color.dark, itemView.context.theme)
                         cardItem.setCardBackgroundColor(
                             palette?.getDarkMutedColor(defValue) ?: defValue
                         )
                     }*/
                }
            }
        }
    }

    interface DataCallback {
        fun onItemClicked(dataEntity: DataEntity)
    }
}