package com.changjiashuai.demo

import org.junit.Before
import org.junit.Test

/**
 * changjiashuai@gmail.com.
 *
 *
 * Created by CJS on 2019-04-30.
 */
class KSumTest {

    private lateinit var kSum: KSum

    @Before
    fun setUp() {
        kSum = KSum()
    }

    @Test
    fun threeSum() {
        val list = kSum.threeSum(intArrayOf(-1, 0, 1, 2, -1, -4))
        println(list)
    }

    @Test
    fun twoSum() {
        val nums = intArrayOf(2, 7, 11, 15)
        val target = 9
        val result = kSum.twoSum(nums, target)
        println("result: ${result.toList()}")
    }
}