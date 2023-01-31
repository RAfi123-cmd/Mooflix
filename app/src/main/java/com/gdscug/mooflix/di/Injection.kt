package com.gdscug.mooflix.di

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore
import com.gdscug.mooflix.data.MovieRepository
import com.gdscug.mooflix.data.remote.response.RemoteDataSource

val Context.datastore: DataStore<Preferences> by preferencesDataStore("movie")

object Injection {

    fun providerRepository(context: Context): MovieRepository {
        val remoteDataSource = RemoteDataSource.getInstance()
        return MovieRepository.getInstance(remoteDataSource, context.datastore)
    }
}