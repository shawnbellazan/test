package com.tooensure.poppas.travel.di

import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Before
import org.junit.Rule

@HiltAndroidTest
//@Config(application = HiltTestApplication::class)
class AccountActivityText {

    // Manages the components' state and is used to perform injection on test
    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    // Tell Hilt to populate the @Inject fields
    @Before
    fun init() {

    }
}