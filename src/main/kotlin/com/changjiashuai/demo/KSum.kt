package com.changjiashuai.demo

/**
 * changjiashuai@gmail.com.
 *
 * Created by CJS on 2019-04-30.
 *
 * K Sum问题就是，给出一个数作为 target，和一个数组作为待查数组，在这个待查数组里找出 K 个数之和等于 target.
 *
 */
class KSum {

    /**
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
     *
     * eg:
     * 给定 nums = [2, 7, 11, 15], target = 9
     *
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     *
     */
    fun twoSum(nums: IntArray, target: Int): IntArray {
        return twoSum2(nums, target)
    }

    @Deprecated("error example")
    private fun twoSum1(nums: IntArray, target: Int): IntArray {
        for (i in 0 until nums.size - 1) {
            //error 这会导致第二个数每次都从头开始计算，会产生重复
            //nums = [2, 5, 5, 11]
            //target = 10
            //return [1, 1] error
            for (j in 1 until nums.size) {
                if (nums[i] + nums[j] == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        throw IllegalArgumentException("No two sum solution")
    }

    /**
     * 暴力法很简单。遍历每个元素 x，并查找是否存在一个值与 target−x 相等的目标元素。
     */
    private fun twoSum2(nums: IntArray, target: Int): IntArray {
        for (i in 0 until nums.size) {
            for (j in i + 1 until nums.size) {
                if (nums[j] == target - nums[i]) {
                    return intArrayOf(i, j)
                }
            }
        }
        throw IllegalArgumentException("No two sum solution")
    }

    private fun twoSum3(nums: IntArray, target: Int): IntArray {
        
        throw IllegalArgumentException("No two sum solution")
    }

    /**
     * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？
     * 找出所有满足条件且不重复的三元组。
     */
    fun threeSum(nums: IntArray): List<List<Int>> {
        nums.sort()
        val list = arrayListOf<List<Int>>()
        for (i in 1..nums.size - 3) {
            var j = i
            if (nums[i] == nums[i - 1]) {
                j++
            }
            var k = nums.size - 1
            if (nums[k - 1] == nums[k]) {
                k--
            }
            var current = nums[i] + nums[i - 1] + nums[k]
            if (current == 0) {
                val temp = listOf<Int>(nums[i - 1], nums[i], nums[k])
                list.add(temp)
            } else if (current < 0) {
                j++
            } else {
                k--
            }
        }
        return list
    }
}