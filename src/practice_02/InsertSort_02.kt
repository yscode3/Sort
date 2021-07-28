package practice_02

import GetRandomNumbers

fun main() {
    var nums = GetRandomNumbers().getNumbers()

    println("정렬 전 $nums")

    insertSort(nums)

    println("정렬 후 $nums")
}

private fun insertSort(nums: MutableList<Int>) {
    var start = 1
    var lastIdx = 0
    var temp = 0

    for (i in start until nums.size) {
        temp = nums[i]
        lastIdx = i

        while (lastIdx > 0 && temp < nums[lastIdx-1]) {
            nums[lastIdx] = nums[lastIdx-1]
            lastIdx--
        }

        nums[lastIdx] = temp
    }
}
