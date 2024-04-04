package com.annguyenhoang.unittestandroid

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class ResourceComparerTest {

    private lateinit var resourceComparer: ResourceComparer

    @Before
    fun setup() {
        resourceComparer = ResourceComparer()
    }

    @After
    fun tearDown() {

    }

    @Test
    fun  stringResourceSameAsGivenString_returnsTrue() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(
            context = context,
            resId = R.string.app_name,
            string = "UnitTestAndroid"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun  stringResourceDifferentAsGivenString_returnsFalse() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(
            context = context,
            resId = R.string.app_name,
            string = "Hello"
        )
        assertThat(result).isFalse()
    }

}