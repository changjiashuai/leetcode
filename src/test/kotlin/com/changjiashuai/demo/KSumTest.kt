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
        val list = kSum.threeSum(intArrayOf(-1, 2, -1))
        println("result: $list")
    }

    @Test
    fun twoSum() {
        val nums = intArrayOf(2, 7, 11, 15)
        val target = 9
        val result = kSum.twoSum(nums, target)
        println("result: ${result.toList()}")
    }

    @Test
    fun twoSumForRepeat() {
        val nums = intArrayOf(3, 3)
        val target = 6
        val result = kSum.twoSum(nums, target)
        println("result: ${result.toList()}")
    }

    @Test
    fun fourSum() {
        val list = kSum.fourSum(intArrayOf(1, 0, -1, 0, -2, 2), 0)
        println("result: $list")
    }
}