package com.mieftah.moviecatalogueapp.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.mieftah.moviecatalogueapp.R
import com.mieftah.moviecatalogueapp.adapter.DataAdapter
import com.mieftah.moviecatalogueapp.data.source.local.DataEntity
import com.mieftah.moviecatalogueapp.databinding.FragmentMoviesBinding
import com.mieftah.moviecatalogueapp.ui.detail.DetailActivity
import com.mieftah.moviecatalogueapp.viewmodel.ViewModelFactory

class MovieFragment : Fragment(R.layout.fragment_movies), DataAdapter.DataCallback {

    private var _binding: FragmentMoviesBinding? = null
    private val binding get() = _binding as FragmentMoviesBinding
    private lateinit var viewModel: DataMovieViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentMoviesBinding.bind(view)

        if (activity != null) {
            showLoading(true)
            val factory = ViewModelFactory.getInstance(requireActivity())
            viewModel = ViewModelProvider(this, factory)[DataMovieViewModel::class.java]

            val movieAdapter = DataAdapter(this)
            viewModel.getMovie().observe(viewLifecycleOwner, { listMovie ->
                showLoading(false)
                movieAdapter.setDataMovies(listMovie)
            })
            with(binding.rvMovie) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = movieAdapter
            }
        }
    }

    private fun showLoading(state: Boolean) {
        if (state) {
            binding.progressBar.visibility = View.VISIBLE
        } else {
            binding.progressBar.visibility = View.GONE
        }
    }

    override fun onItemClicked(dataEntity: DataEntity) {
        startActivity(
            Intent(context, DetailActivity::class.java)
                .putExtra(DetailActivity.EXTRA_DATA, dataEntity.id)
                .putExtra(DetailActivity.EXTRA_TYPE, TYPE_MOVIE)
        )
    }

    companion object {
        const val TYPE_MOVIE = "type_movie"
    }
}