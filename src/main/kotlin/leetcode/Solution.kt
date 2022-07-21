package leetcode

import leetcode.easy.TwoSum


class Solution {
    fun goBooom() {
        val res: IntArray? = TwoSum().twoSum(intArrayOf(2,7,11,15), 9)
        println("twoSum  ==>  ${res?.get(0)} ${res?.get(1)}")
    }
}
