package com.mieftah.moviecatalogueapp.ui.detail

import android.app.VoiceInteractor
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.palette.graphics.Palette
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.google.android.material.appbar.AppBarLayout
import com.mieftah.moviecatalogueapp.R
import com.mieftah.moviecatalogueapp.data.source.local.DataEntity
import com.mieftah.moviecatalogueapp.databinding.ActivityDetailBinding
import com.mieftah.moviecatalogueapp.ui.home.MovieFragment
import com.mieftah.moviecatalogueapp.ui.home.TvShowFragment
import com.mieftah.moviecatalogueapp.utils.Constants
import com.mieftah.moviecatalogueapp.viewmodel.ViewModelFactory
import kotlin.math.abs

class DetailActivity : AppCompatActivity(), AppBarLayout.OnOffsetChangedListener {

    private lateinit var binding: ActivityDetailBinding
    private lateinit var viewModel: DetailViewModel
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

        showLoading(true)
        val factory = ViewModelFactory.getInstance(applicationContext)
        viewModel = ViewModelProvider(this, factory)[DetailViewModel::class.java]

        val id = intent.getIntExtra(EXTRA_DATA, 0)
        val type = intent.getStringExtra(EXTRA_TYPE)

        if (type.equals(MovieFragment.TYPE_MOVIE, ignoreCase = true)) {
            viewModel.getDetailMovie(id).observe(this, {
                showLoading(false)
                dataDetail(it)
            })
        } else if (type.equals(TvShowFragment.TYPE_TV_SHOW, ignoreCase = true)) {
            viewModel.getDetailTvShow(id).observe(this, {
                showLoading(false)
                dataDetail(it)
            })
        }

    }

    private fun dataDetail(data: DataEntity) {
        binding.collapsing.title = data.title
        binding.tvTitle.text = data.title
        binding.tvGenre.text = data.genres?.joinToString(", ")
        binding.tvRelease.text = data.releaseDate?.let { Constants.convertStringToDate(it) }
        binding.tvDuration.text = data.duration?.let { Constants.convertMinuteToDuration(it) }
        binding.rating.text = data.rating.toString()
        binding.ratingBar.rating = data.rating?.div(2)!!
        binding.tvOverview.text = data.overview
        Glide.with(this)
            .load(Constants.IMAGE_URL + data.poster)
            .into(binding.ivPoster)

        binding.ivPoster.tag = data.poster

        binding.fabFavorite.setOnClickListener {
            Toast.makeText(this, R.string.favorite, Toast.LENGTH_SHORT).show()
        }

        binding.btShare.setOnClickListener {
            Toast.makeText(this, R.string.share, Toast.LENGTH_SHORT).show()
        }
    }

    private fun showLoading(state: Boolean) {
        if (state) {
            binding.progressBar.visibility = View.VISIBLE
        } else {
            binding.progressBar.visibility = View.GONE
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