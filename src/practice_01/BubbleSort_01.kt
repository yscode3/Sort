package practice_01

fun main() {
    val nums = listOf<Int>(53, 23, 33, 41, 15)

    println("정렬 전")
    nums.forEach {
        print("${it} ")
    }

    println("\n정렬 후")
    bubbleSort(nums as MutableList<Int>)
    nums.forEach {
        print("${it} ")
    }
}

private fun bubbleSort(nums: MutableList<Int>) {
    var temp = 0

    for (i in 0 until nums.size) {
        for (j in 0 until nums.size-1) {
            if (nums[j] > nums[j+1]){
                temp = nums[j]
                nums[j] = nums[j+1]
                nums[j+1] = temp
            }
        }
    }
}
