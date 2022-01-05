package com.mieftah.moviecatalogueapp.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.mieftah.moviecatalogueapp.R
import com.mieftah.moviecatalogueapp.adapter.DataAdapter
import com.mieftah.moviecatalogueapp.data.DataEntity
import com.mieftah.moviecatalogueapp.databinding.FragmentMoviesBinding
import com.mieftah.moviecatalogueapp.ui.detail.DetailActivity
import com.mieftah.moviecatalogueapp.utils.Constanta.TYPE_MOVIE

class MovieFragment : Fragment(R.layout.fragment_movies), DataAdapter.DataCallback {

    private var _bindding: FragmentMoviesBinding? = null
    private val binding get() = _bindding as FragmentMoviesBinding
    private lateinit var viewModelData: DataMovieViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _bindding = FragmentMoviesBinding.bind(view)

        activity?.let {
            viewModelData = ViewModelProvider(
                it,
                ViewModelProvider.NewInstanceFactory()
            )[DataMovieViewModel::class.java]
        }
        val listMovie = viewModelData.getMovie()
        setListMovie(listMovie)
    }

    private fun setListMovie(data: List<DataEntity>) {
        with(binding) {
            rvMovie.apply {
                layoutManager = LinearLayoutManager(context)
                adapter = DataAdapter(this@MovieFragment)
            }.also {
                it.adapter.let { adapter ->
                    when (adapter) {
                        is DataAdapter -> {
                            adapter.setDataMovies(data)
                        }
                    }
                }
            }
        }
    }


    override fun onItemClicked(dataEntity: DataEntity) {
        startActivity(
            Intent(context, DetailActivity::class.java)
                .putExtra(DetailActivity.EXTRA_DATA, dataEntity.id)
                .putExtra(DetailActivity.EXTRA_TYPE, TYPE_MOVIE)
        )
    }
}