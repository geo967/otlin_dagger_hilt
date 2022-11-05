package com.example.`daggerhilt_kotlin-new`

import dagger.Module
import dagger.Provides
import dagger.hilt.DefineComponent
import dagger.hilt.InstallIn
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)

object AppModule {
    @ActivityScoped
    @Provides
    @Named("String1")
    fun provideTestString1()="this is a string we will inject"



}

