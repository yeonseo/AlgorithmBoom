//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int {
        val n = gas.size
        var sum = 0
        for (i in 0 until n) {
            sum += gas[i]-cost[i]
        }
        if (sum < 0) return -1
        var start = 0
        var restGas = 0

        for (i in 0 until n) {
            var temp = gas[i]-cost[i]

            if (restGas+temp < 0) {
                start = i+1
                restGas = 0
            } else {
                restGas += temp
            }
        }
        return start
    }
}
//leetcode submit region end(Prohibit modification and deletion)
