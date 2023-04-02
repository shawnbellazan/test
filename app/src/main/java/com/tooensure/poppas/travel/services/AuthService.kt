package com.tooensure.poppas.travel.services

import android.content.ContentValues
import android.content.Context
import android.util.Log
import com.auth0.android.Auth0
import com.auth0.android.authentication.AuthenticationException
import com.auth0.android.callback.Callback
import com.auth0.android.provider.WebAuthProvider
import com.auth0.android.result.Credentials
import com.tooensure.poppas.travel.R
import com.tooensure.poppas.travel.services.interfaces.IAuthService
import javax.inject.Inject

class AuthService @Inject constructor(
    private val _context: Context,
    private val _auth: Auth0
): IAuthService {
    override fun login() {
        WebAuthProvider
            .login(_auth)
            .withScheme(_context.getString(R.string.com_auth0_scheme))
            .start(_context, object: Callback<Credentials, AuthenticationException> {
                override fun onFailure(error: AuthenticationException) {
                    // The user either pressed the “Cancel” button
                    // on the Universal Login screen or something
                    // unusual happened.
                    Log.e(ContentValues.TAG, "Error occurred in login(): $error")
                }

                override fun onSuccess(result: Credentials) {
                    Log.e(ContentValues.TAG, "Error occurred in login(): $result")
                }

            })
    }
}