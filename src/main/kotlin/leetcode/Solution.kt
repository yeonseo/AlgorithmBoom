package leetcode

import leetcode.easy.MergeTwoSortedLists
import leetcode.easy.SearchInsertPosition
import leetcode.easy.TwoSum
import leetcode.easy.ValidParentheses


class Solution {
    fun goBooom() {
//        val res: IntArray? = TwoSum().twoSum(intArrayOf(2,7,11,15), 9)
//        println("twoSum  ==>  ${res?.get(0)} ${res?.get(1)}")

//        // isValid
//        val res: Boolean = ValidParentheses().isValid("{}()[)")

//        // mergeTwoLists
//        val res = MergeTwoSortedLists().mergeTwoLists()

        val res = SearchInsertPosition().searchInsert(intArrayOf(2,7,11,15), 7)
        println("😀😀 ============> $res")
    }
}
