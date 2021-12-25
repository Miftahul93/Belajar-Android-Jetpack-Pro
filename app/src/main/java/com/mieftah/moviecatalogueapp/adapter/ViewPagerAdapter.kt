package com.mieftah.moviecatalogueapp.adapter

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.mieftah.moviecatalogueapp.ui.home.MovieFragment
import com.mieftah.moviecatalogueapp.ui.home.TvShowFragment

class ViewPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        var fragment: Fragment? = null
        when (position) {
            0 -> fragment = MovieFragment()
            1 -> fragment = TvShowFragment()
        }
        return fragment as Fragment
    }
}