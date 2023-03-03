package leetcode.easy

class FirstBadVersion {
    /*
    *   where : LeetCode (https://leetcode.com/problems/first-bad-version/)
    *   difficulty : easy

    *   problem =>

    *   You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.

        Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

        You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.



        Example 1:

        Input: n = 5, bad = 4
        Output: 4
        Explanation:
        call isBadVersion(3) -> false
        call isBadVersion(5) -> true
        call isBadVersion(4) -> true
        Then 4 is the first bad version.


        Example 2:

        Input: n = 1, bad = 1
        Output: 1


        Constraints:

        1 <= bad <= n <= 231 - 1
    *
    * */
    fun firstBadVersion(n: Int): Int {
        var min = 1
        var max = n
        var mid: Int? = null
        if(isBadVersion(min)) return 1

        while(min+1 < max) {
            mid = min + (max-min)/ 2
            if(isBadVersion(mid))
            {
                max = mid
            } else {
                min = mid
            }
        }
        return max
    }

    fun isBadVersion(version: Int) : Boolean {
        return version == 11
    }

    /*
    * 기본적인 바이너리 서치 문제이나 오버플로우를 주의해야한다...

    기본적으로 풀이는,

    * 1. 검색 범위의 맨 앞(min 또는 left) 맨뒤(max 또는 right) 인덱스를 저장하는 변수를 설정하고 각각 1과 n으로 초기화 한다.
    min은 항상 Not bad version,  max 는 항상 bad version 이라고 가정하고 풀었기 때문에
    양 끝값 확인하는 절차로 버전1이 배드버전인지 확인하는 코드를 추가로 넣었다.

    * 2. 그 가운데인덱스를 API호출로 확인 후 가운데가 Bad version 이면 max 인덱스를 mid로 옮기고, Bad version 이 아닌 경우 min을 mid로 옮긴다.
    여기서 중요한것은 중간값을 구할 때 mid = (min + max) / 2 로 구하면 overflow 가 일어날 수 있으므로
    mid = min + (max - min)/2 라고 써줘야한다는 것이다.


    * 두 수식은 사람눈에는 비슷하지만 컴퓨터가 볼 때는... 두 수의 합이 자료형 사이즈를 넘어버리면 완전히 다른 식이 된다.

    3. 이렇게 반복하다가 min 과 max 가 만나면
    첫번째 Bad version 은 max 이므로 max를 리턴해주면 된다.

* 출처 : https://holsui.tistory.com/81
* */
}