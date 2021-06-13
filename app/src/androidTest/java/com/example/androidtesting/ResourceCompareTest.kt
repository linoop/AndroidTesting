package com.example.androidtesting

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class ResourceCompareTest {
    private lateinit var resourceCompare: ResourceCompare

    @Before
    fun setup() {
        resourceCompare = ResourceCompare()
    }

    @After
    fun teardown(){
        
    }

    @Test
    fun sameStringResourceReturnsTrue() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceCompare.isEqual(context, R.string.app_name, "AndroidTesting")
        assertThat(result).isTrue()
    }

    @Test
    fun differentStringResourceReturnsFalse() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceCompare.isEqual(context, R.string.app_name, "linoop")
        assertThat(result).isFalse()
    }
}