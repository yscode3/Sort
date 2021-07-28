package practice_02

import GetRandomNumbers

/**
 * 절반으로 나누어 기준 값보다 작은 것은 왼쪽에, 큰 것은 오른쪽에
 */
fun main() {
    var nums = GetRandomNumbers().getNumbers()

    println("정렬 전 $nums")

    quickSort(nums, 0, nums.size - 1)

    println("정렬 후 $nums")
}

private fun quickSort(nums: MutableList<Int>, start: Int, end: Int) {
    if (start >= end) {
        return
    }

    var pivot = start
    var i = start + 1
    var j = end
    var temp = 0

    while (i <= j) {
        while (i <= end && nums[i] < nums[pivot]) {
            i++
        }
        while (j > start && nums[j] >= nums[pivot]) {
            j--
        }

        if (i > j) {
            temp = nums[j]
            nums[j] = nums[pivot]
            nums[pivot] = temp
        }
        else {
            temp = nums[i]
            nums[i] = nums[j]
            nums[j] = temp
        }
    }

    quickSort(nums, start, j-1)
    quickSort(nums, j+1, end)
}
