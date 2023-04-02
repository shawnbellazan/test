package com.tooensure.poppas.travel.network

import com.tooensure.poppas.travel.models.Account

interface IAccountRepository {
    fun currentUser(): Account?
}