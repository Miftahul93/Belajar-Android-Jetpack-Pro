package com.mieftah.moviecatalogueapp.ui.detail

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.palette.graphics.Palette
import com.bumptech.glide.Glide
import com.google.android.material.appbar.AppBarLayout
import com.mieftah.moviecatalogueapp.R
import com.mieftah.moviecatalogueapp.data.DataEntity
import com.mieftah.moviecatalogueapp.databinding.ActivityDetailBinding
import com.mieftah.moviecatalogueapp.utils.Helper.TYPE_MOVIE
import com.mieftah.moviecatalogueapp.utils.Helper.TYPE_TV_SHOW
import kotlin.math.abs

class DetailActivity : AppCompatActivity(), AppBarLayout.OnOffsetChangedListener {

    private lateinit var binding: ActivityDetailBinding
    private lateinit var data: DataEntity
    private val percentageToShowImage = 20
    private var mMaxScrollSize = 0
    private var mIsImageHidden = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.toolbar.setNavigationOnClickListener { onBackPressed() }
        binding.appbar.addOnOffsetChangedListener(this)

        val viewModel = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        )[DetailViewModel::class.java]

        val id = intent.getStringExtra(EXTRA_DATA)
        val type = intent.getStringExtra(EXTRA_TYPE)

        if (type.equals(TYPE_MOVIE, ignoreCase = true)) {
            id?.let {
                viewModel.setMovieId(it)
            }
            data = viewModel.getDetailMovie()
        } else if (type.equals(TYPE_TV_SHOW, ignoreCase = true)) {
            id?.let {
                viewModel.setTvShowId(it)
            }
            data = viewModel.getDetailTvShow()
        }
        dataDetail()
    }

    private fun dataDetail() {
        binding.collapsing.title = data.title
        binding.tvTitle.text = data.title
        binding.tvGenre.text = data.genre
        binding.tvRelease.text = data.releaseDate
        binding.tvDuration.text = data.duration
        binding.rating.text = data.userScore.toString()
        binding.ratingBar.rating = data.userScore.div(2)
        binding.tvOverview.text = data.overview
        Glide.with(this)
            .load(data.poster)
            .into(binding.ivPoster)

        binding.ivPoster.tag = data.poster

        setColorByPalette(data.poster)

    }

    private fun setColorByPalette(poster: Int) {
        val bitmap = BitmapFactory.decodeResource(resources, poster)

        Palette.from(bitmap).generate { palette ->
            val defValue = resources.getColor(R.color.dark, theme)
            binding.card1.setCardBackgroundColor(
                palette?.getDarkMutedColor(defValue) ?: defValue
            )
            window.statusBarColor = palette?.getDarkMutedColor(defValue) ?: defValue
        }
    }

    override fun onOffsetChanged(appBarLayout: AppBarLayout?, verticalOffset: Int) {
        if (mMaxScrollSize == 0) if (appBarLayout != null) {
            mMaxScrollSize = appBarLayout.totalScrollRange
        }

        val currentScrollPercentage: Int = (abs(verticalOffset) * 100 / mMaxScrollSize)

        if (currentScrollPercentage >= percentageToShowImage) {
            if (!mIsImageHidden) {
                mIsImageHidden = true
            }
        }
        if (currentScrollPercentage < percentageToShowImage) {
            if (mIsImageHidden) {
                mIsImageHidden = false
            }
        }
    }

    companion object {
        const val EXTRA_DATA = "extra_data"
        const val EXTRA_TYPE = "extra_type"
    }
}