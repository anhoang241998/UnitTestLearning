package com.annguyenhoang.unittestandroid

import com.google.common.truth.Truth.assertThat
import org.junit.Test
import kotlin.random.Random

class HomeTest {

    @Test
    fun `fib of 0 or 1 will return 0 or 1`() {
        val input = Random.nextInt(0, 2)
        val expectedResult = input
        val actualResult = Homework.fib(input)
        assertThat(actualResult).isEqualTo(expectedResult)
    }

    // fib(5) = 1 + 1 + 2 + 3 + 5
    // fib(n) = fib(n-2) + fib(n-1)

    @Test
    fun `fib of any number will return number before plus number after`() {
        val fibNum = 20
        val expectedResult = 6765
        val actualResult = Homework.fib(fibNum)
        assertThat(actualResult).isEqualTo(expectedResult)
    }

    @Test
    fun `string had valid braces will return true`() {
        val input = "(a+b)"
        val actualResult = Homework.checkBraces(input)
        assertThat(actualResult).isTrue()
    }

    @Test
    fun `string had invalid braces '))' will return false`() {
        val input = "(a+b))"
        val actualResult = Homework.checkBraces(input)
        assertThat(actualResult).isFalse()
    }

    @Test
    fun `string had invalid braces '((()))' will return false`() {
        val input = "(((a+b)))"
        val actualResult = Homework.checkBraces(input)
        assertThat(actualResult).isFalse()
    }

    @Test
    fun `string without braces will return false`() {
        val input = "a+b"
        val actualResult = Homework.checkBraces(input)
        assertThat(actualResult).isFalse()
    }

    @Test
    fun `string has only open brace will return false`() {
        val input = "(a+b"
        val actualResult = Homework.checkBraces(input)
        assertThat(actualResult).isFalse()
    }

    @Test
    fun `string contains open or close brace in random position will return false`() {
        val input = "(a+)b"
        val actualResult = Homework.checkBraces(input)
        assertThat(actualResult).isFalse()
    }

    @Test
    fun `empty string will return false`() {
        val input = ""
        val actualResult = Homework.checkBraces(input)
        assertThat(actualResult).isFalse()
    }
}