package com.mieftah.moviecatalogueapp.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.StringRes
import androidx.viewpager2.widget.ViewPager2
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.mieftah.moviecatalogueapp.R
import com.mieftah.moviecatalogueapp.adapter.ViewPagerAdapter
import com.mieftah.moviecatalogueapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageSlider = binding.imageSlider
        val imageList = ArrayList<SlideModel>()

        imageList.add(
            SlideModel(
                "https://www.themoviedb.org/t/p/original/2maUA8Y4kxJ9UtLHYDhf9FSTd7u.jpg",
                "Spider-Man: No Way Home"
            )
        )
        imageList.add(
            SlideModel(
                "https://www.themoviedb.org/t/p/original/aLBiGL6Nqx8nY27X61g6szKn19Y.jpg",
                "Venom: Biarkan ada Pembantaian"
            )
        )
        imageList.add(
            SlideModel(
                "https://www.themoviedb.org/t/p/original/65MHN2VZ9kwQ0X9pi3QvbJjZGR1.jpg",
                "Shang-Chi dan Legenda Sepuluh Cincin "
            )
        )
        imageList.add(
            SlideModel(
                "https://www.themoviedb.org/t/p/original/h25kBoE6YGMIF09R9FFDFPcvQoH.jpg",
                "Hawkeye"
            )
        )
        imageList.add(
            SlideModel(
                "https://www.themoviedb.org/t/p/original/iF8ai2QLNiHV4anwY1TuSGZXqfN.jpg",
                "Chucky"
            )
        )
        imageList.add(
            SlideModel(
                "https://www.themoviedb.org/t/p/original/mpgDeLhl8HbhI03XLB7iKO6M6JE.jpg",
                "The Wheel of Time"
            )
        )

        imageSlider.setImageList(imageList, ScaleTypes.FIT)

        val pagerAdapter = ViewPagerAdapter(this)
        val viewPager: ViewPager2 = binding.viewpager
        viewPager.adapter = pagerAdapter
        val tabs: TabLayout = binding.tabslayout

        TabLayoutMediator(tabs, viewPager) { tab, position ->
            tab.text = resources.getString(TAB_TITLES[position])
        }.attach()
    }

    companion object {
        @StringRes
        private val TAB_TITLES = intArrayOf(
            R.string.tab_1, R.string.tab_2
        )
    }
}