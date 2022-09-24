package com.example.dagger2.di

import com.example.dagger2.storage.SharedPreferencesStorage
import com.example.dagger2.storage.Storage
import dagger.Binds
import dagger.Module

// Tells Dagger this is a Dagger module
// Because of @Binds, StorageModule needs to be an abstract class
@Module
abstract class StorageModule {

    // Makes Dagger provide SharedPreferencesStorage when a Storage type is requested
    @Binds
    abstract fun provideStorage(storage: SharedPreferencesStorage) : Storage
}