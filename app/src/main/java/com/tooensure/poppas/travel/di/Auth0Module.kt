package com.tooensure.poppas.travel.di

import android.content.Context
import com.auth0.android.Auth0
import com.tooensure.poppas.travel.R
import com.tooensure.poppas.travel.services.AuthService
import com.tooensure.poppas.travel.services.interfaces.IAuthService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object Auth0Module {
    @Singleton
    @Provides
    fun provideAuth0(
        @ApplicationContext context: Context
    ) : Auth0 = Auth0(
       context.getString(R.string.com_auth0_client_id),
       context.getString(R.string.com_auth0_domain),
    )

    @Singleton
    @Provides
    fun provideAuthService(
        @ApplicationContext context: Context,
        auth0: Auth0
    ): IAuthService = AuthService(context, auth0)
}