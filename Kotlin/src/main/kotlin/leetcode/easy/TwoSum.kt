package leetcode.easy

import java.util.*


class TwoSum {
    /*
    *   where : LeetCode (https://leetcode.com/problems/two-sum/)
    *   difficulty : easy

    *   problem =>

    *   Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
        You may assume that each input would have exactly one solution, and you may not use the same element twice.
        You can return the answer in any order.


        Example 1:

        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        Example 2:

        Input: nums = [3,2,4], target = 6
        Output: [1,2]
        Example 3:

        Input: nums = [3,3], target = 6
        Output: [0,1]


        Constraints:

        2 <= nums.length <= 104
        -109 <= nums[i] <= 109
        -109 <= target <= 109
        Only one valid answer exists.
    *
    * */
    fun twoSum(nums: IntArray, target: Int): IntArray? {
        //반복구성
        for (i in nums.indices) { // indices: 0..nums의 array의 range
            for (j in i + 1 until nums.size) { // i+1: j와 중복 방지, until: num의 사이즈
                // target == sum(num, num)
                if (nums[j] == target - nums[i]) {
                    return intArrayOf(i, j) // i와 j를 리턴
                }
            }
        }
        throw IllegalArgumentException("No two sum solution") // target을 만들 수 없을 경우
    }


//    object easy1_TwoSum {
//        @JvmStatic
//        fun main(args: Array<String>) {
//            val nums = intArrayOf(2, 7, 11, 15)
//            val target = 9
//            val result = twoSum(nums, target)
//            print(Arrays.toString(result))
//        }
//
//        fun twoSum(nums: IntArray, target: Int): IntArray {
//            val valueMap = HashMap<Int, Int?>()
//            for (i in nums.indices) {
//                val searchValue = target - nums[i]
//                if (valueMap[searchValue] != null) {
//                    return intArrayOf(valueMap[searchValue] as Int, i)
//                } else {
//                    valueMap[nums[i]] = i
//                }
//            }
//            return intArrayOf(1, 2)
//        }
//    }
}