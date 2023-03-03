package leetcode.easy

import java.util.*


class MergeTwoSortedLists {
    /*
    *   where : LeetCode (https://leetcode.com/problems/merge-two-sorted-lists/)
    *   difficulty : easy

    *   problem =>

    *   You are given the heads of two sorted linked lists list1 and list2.
        Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
        Return the head of the merged linked list.

        Example 1:
        Input: list1 = [1,2,4], list2 = [1,3,4]
        Output: [1,1,2,3,4,4]

        Example 2:
        Input: list1 = [], list2 = []
        Output: []

        Example 3:
        Input: list1 = [], list2 = [0]
        Output: [0]

        Constraints:

        The number of nodes in both lists is in the range [0, 50].
        -100 <= Node.val <= 100
        Both list1 and list2 are sorted in non-decreasing order.
    *
    * */

    // 안됨~!
//    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? = when {
//        list1 == null -> list2
//        list2 == null -> list2
//        list1.`val` < list2.`val` -> list1.apply { next = mergeTwoLists(list1.next, list2) }
//        else -> list2.apply { next = mergeTwoLists(list1, list2.next) }
//    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        var result: ListNode? = ListNode(0)
        var current = result

        var node1 = l1
        var node2 = l2
        while (node1 != null || node2 != null) {
            if (node1 == null) {
                current?.next = node2
                break
            }
            if (node2 == null) {
                current?.next = node1
                break
            }

            if (node1?.`val` < node2?.`val`) {
                current?.next = node1
                node1 = node1?.next
            } else {
                current?.next = node2
                node2 = node2?.next
            }
            current = current?.next
        }
        return result?.next
    }
}