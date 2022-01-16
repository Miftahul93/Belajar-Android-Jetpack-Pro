package com.mieftah.moviecatalogueapp.di

import android.content.Context
import com.mieftah.moviecatalogueapp.data.source.CatalogueRepository
import com.mieftah.moviecatalogueapp.data.source.remote.RemoteDataSource

object Injection {
    fun providerRepository(context: Context): CatalogueRepository {
        val remoteDataSource = RemoteDataSource.getInstance()
        return CatalogueRepository.getInstance(remoteDataSource)
    }
}