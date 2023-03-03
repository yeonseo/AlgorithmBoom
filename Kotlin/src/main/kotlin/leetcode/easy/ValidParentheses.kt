package leetcode.easy

import java.util.*


class ValidParentheses {
    /*
    *   where : LeetCode (https://leetcode.com/problems/valid-parentheses/)
    *   difficulty : easy

    *   problem =>

    *   Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

        An input string is valid if:

        Open brackets must be closed by the same type of brackets.
        Open brackets must be closed in the correct order.


        Example 1:

        Input: s = "()"
        Output: true
        Example 2:

        Input: s = "()[]{}"
        Output: true
        Example 3:

        Input: s = "(]"
        Output: false


        Constraints:

        1 <= s.length <= 104
        s consists of parentheses only '()[]{}'.
    *
    * */
    fun isValid(s: String): Boolean {
        // ( : 40, ) : 41
        // 이 외에는 모두 2개 차이 :-)

        val stack = Stack<Char>()
        val range = (1..2) // 괄호의 아스키 코드가 모두 1-2차이
        s.forEach { c ->
            when {
                stack.empty() -> stack.push(c) // 문자를 Stack으로 쌓음
                (c - stack.peek()) in range -> stack.pop() // peek: 스택의 top을 삭제없이 보여줌, pop: 괄호 쌍을 찾았을 경우, 문자 제거
                else -> stack.push(c)  // 문자를 Stack으로 쌓음
            }
        }
        return stack.empty()
    }


    // 공식정답 (https://leetcode.com/problems/valid-parentheses/solution/)
//    // Hash table that takes care of the mappings.
//    private var mappings: HashMap<Char, Char>? = null
//
//    // Initialize hash map with mappings. This simply makes the code easier to read.
//    fun Solution() {
//        mappings = HashMap()
//        mappings!![')'] = '('
//        mappings!!['}'] = '{'
//        mappings!![']'] = '['
//    }
//
//    fun isValid(s: String): Boolean {
//
//        // Initialize a stack to be used in the algorithm.
//        val stack = Stack<Char>()
//        for (i in 0 until s.length) {
//            val c = s[i]
//
//            // If the current character is a closing bracket.
//            if (mappings!!.containsKey(c)) {
//
//                // Get the top element of the stack. If the stack is empty, set a dummy value of '#'
//                val topElement = if (stack.empty()) '#' else stack.pop()
//
//                // If the mapping for this bracket doesn't match the stack's top element, return false.
//                if (topElement != mappings!![c]) {
//                    return false
//                }
//            } else {
//                // If it was an opening bracket, push to the stack.
//                stack.push(c)
//            }
//        }
//
//        // If the stack still contains elements, then it is an invalid expression.
//        return stack.isEmpty()
//    }
}