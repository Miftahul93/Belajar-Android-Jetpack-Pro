package com.mieftah.moviecatalogueapp.adapter

import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.palette.graphics.Palette
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.mieftah.moviecatalogueapp.R
import com.mieftah.moviecatalogueapp.data.DataEntity
import com.mieftah.moviecatalogueapp.databinding.ItemMoviesBinding

class DataAdapter(private val callback: DataCallback) :
    RecyclerView.Adapter<DataAdapter.DataViewHolder>() {

    private val list = ArrayList<DataEntity>()

    fun setDataMovies(data: List<DataEntity>?) {
        if (data.isNullOrEmpty()) return
        this.list.clear()
        this.list.addAll(data)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val itemMoviesBinding =
            ItemMoviesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DataViewHolder(itemMoviesBinding)
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size

    inner class DataViewHolder(private val binding: ItemMoviesBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: DataEntity) {
            with(binding) {
                tvTitle.text = data.title
                tvGenre.text = data.genre
                tvRelease.text = data.releaseDate
                tvDuration.text = data.duration
                ratingBar.rating = data.rating.div(2)
                Glide.with(itemView.context)
                    .load(data.poster)
                    .transform(RoundedCorners(30))
                    .into(ivPoster)
                itemView.setOnClickListener {
                    callback.onItemClicked(data)

                    val bitmap =
                        BitmapFactory.decodeResource(itemView.context.resources, data.poster)

                    Palette.from(bitmap).generate { palette ->
                        val defValue =
                            itemView.resources.getColor(R.color.dark, itemView.context.theme)
                        cardItem.setCardBackgroundColor(
                            palette?.getDarkMutedColor(defValue) ?: defValue
                        )
                    }
                }
            }
        }
    }

    interface DataCallback {
        fun onItemClicked(dataEntity: DataEntity)
    }
}