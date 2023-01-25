package com.gdscug.mooflix.di

import com.gdscug.mooflix.data.MovieRepository
import com.gdscug.mooflix.data.remote.response.RemoteDataSource

object Injection {

    fun providerRepository(): MovieRepository {
        val remoteDataSource = RemoteDataSource.getInstance()
        return MovieRepository.getInstance(remoteDataSource)
    }
}