package practice_01

import GetRandomNumbers

fun main() {
    var nums = GetRandomNumbers().getNumbers() as MutableList<Int>
    println("정렬 전 : $nums")

    var data = mergeSort(nums)

    println("정렬 후 : $data")
}

private fun mergeSort(nums: MutableList<Int>): List<Int> {
    return separate(nums)
}

private fun separate(nums: List<Int>): List<Int> {
    if (nums.size <= 1) {
        return nums
    }

    var mid = nums.size / 2

    var left = nums.filterIndexed { index, _ ->
        index < mid
    }
    var right = nums.filterIndexed { index, _ ->
        index >= mid
    }

    return merge(separate(left), separate(right))
}

private fun merge(left: List<Int>, right: List<Int>): List<Int> {
    var lIdx = 0
    var rIdx = 0
    var list = mutableListOf<Int>()

    // case1, left와 right 의 값이 아직 남아 있을 때,
    while (left.size > lIdx && right.size > rIdx) {
        if (left[lIdx] > right[rIdx]) {
            list.add(right[rIdx])
            rIdx++
        }
        else {
            list.add(left[lIdx])
            lIdx++
        }
    }

    // case2, left 만 남아있을 때,
    while (left.size > lIdx) {
        list.add(left[lIdx])
        lIdx++
    }

    // case3, right 만 남아있을 때,
    while (right.size > rIdx) {
        list.add(right[rIdx])
        rIdx++
    }

    return list
}
