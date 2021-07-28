package practice_01

private val nums by lazy {
    mutableListOf(23, 65, 42, 11, 203, 72, 89, 91)
}

fun main() {
    println("정렬 전 :$nums")

    quickSort("시작", 0, nums.size-1)

    println("정렬 후 :$nums")
}

private fun quickSort(where: String, start: Int, end: Int) {
    if (start >= end) {
        println("where => $where : start => $start, end => $end")
        return      //기저 사례
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

        println("i => $i, j => $j")

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

    quickSort("왼쪽", start, j-1)
    quickSort("오른쪽", j+1, end)
}
