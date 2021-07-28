package practice_02

import GetRandomNumbers

fun main() {
    val nums = GetRandomNumbers().getNumbers()
    println(nums)

    println("정렬 전 $nums")

    bubbleSort(nums)

    println("정렬 후 $nums")
}

private fun bubbleSort(nums: MutableList<Int>) {
    var temp = 0
    for (i in nums.indices) {
        for (j in 0 until nums.size-1) {
            if (nums[j] > nums[j+1]) {
                temp = nums[j]
                nums[j] = nums[j+1]
                nums[j+1] = temp
            }
        }
    }
}
