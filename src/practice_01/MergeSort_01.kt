package practice_01

private val nums by lazy {
    mutableListOf(77, 99, 22, 111)
}

fun main() {
    println("정렬 전 : $nums")

    mergeSort(nums, 0, nums.size - 1)

    println("정렬 후 : $nums")
}

private fun mergeSort(nums:MutableList<Int>, start: Int, end: Int) {
    var mid = (start + end) / 2

    merge(separate(nums, start, mid), separate(nums, mid+1, end))
}

private fun separate(nums:MutableList<Int>, start: Int, end: Int) : MutableList<Int> {
    var list = mutableListOf<Int>()
    if (nums.size == 1) {
        return list
    }

    var mid = (start + end) / 2
    for (i in start until mid) {
        list.add(nums[i])
    }
}

private fun merge(separate: MutableList<Int>, separate1: MutableList<Int>) {
    
}
