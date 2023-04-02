package com.tooensure.poppas.travel.models

import java.util.UUID

data class Account(
    val id: UUID = UUID.randomUUID(),
    val email: String? = null
)
