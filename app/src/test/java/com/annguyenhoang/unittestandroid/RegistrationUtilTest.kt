package com.annguyenhoang.unittestandroid

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "",
            password = "123",
            confirmedPassword = "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password return true`() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Philipp",
            password = "123",
            confirmedPassword = "123"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `username already exists returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Carl",
            password = "123",
            confirmedPassword = "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Carl",
            password = "",
            confirmedPassword = ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password and repeated password was not repeated returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Carl",
            password = "1234",
            confirmedPassword = "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password contains less than 2 digits returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Carl",
            password = "abcdefg5",
            confirmedPassword = "abcdefg5"
        )
        assertThat(result).isFalse()
    }

}