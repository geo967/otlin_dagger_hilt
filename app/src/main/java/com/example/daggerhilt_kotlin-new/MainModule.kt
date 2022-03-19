package com.example.`daggerhilt_kotlin-new`

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(Singleton::class)
object MainModuleString {
    @Singleton
    @Provides
    @Named("String2")
    fun provideTestString2()="this is string 2"
}