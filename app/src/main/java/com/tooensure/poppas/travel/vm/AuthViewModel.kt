package com.tooensure.poppas.travel.vm

import androidx.lifecycle.ViewModel
import com.tooensure.poppas.travel.services.AuthService
import javax.inject.Inject

class AuthViewModel @Inject constructor(
    private val service: AuthService
): ViewModel() {
    fun login() = service.login()
}