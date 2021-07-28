package practice_01

fun main() {
    val nums = listOf(98, 53, 82, 21, 78)

    println("정렬 전 : $nums")

    insertSort(nums as MutableList<Int>)

    println("정렬 후 : $nums")
}

private fun insertSort(nums: MutableList<Int>) {
    var startIdx = 1
    var lastIdx = 0
    var temp = 0

    for (i in startIdx until nums.size) {
        temp = nums[i]
        lastIdx = i

        while (lastIdx > 0 && nums[lastIdx-1] > temp) {
            nums[lastIdx] = nums[lastIdx-1]
            lastIdx--
        }

        nums[lastIdx] = temp
    }
}