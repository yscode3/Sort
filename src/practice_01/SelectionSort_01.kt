package practice_01

private val nums by lazy {
    mutableListOf(11, 67, 72, 42, 51, 98, 87, 5)
}

fun main() {
    println("정렬 전 : $nums")

    selectionSort()

    println("정렬 후 : $nums")
}

private fun selectionSort() {
    var min: Int
    var temp: Int

    for (i in nums.indices) {
        min = i

        for (j in i + 1 until nums.size) {
            if (nums[j] < nums[min]) {
                min = j
            }
        }

        temp = nums[i]
        nums[i] = nums[min]
        nums[min] = temp
    }
}
