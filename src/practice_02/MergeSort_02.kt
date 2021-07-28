package practice_02

import GetRandomNumbers

fun main() {
    val data = GetRandomNumbers().getNumbers()

    println("병합 정렬")
    println("정렬 전 : $data")

    var sortedData = mergeSort(data)

    println("정렬 후 : $sortedData")
}

private fun mergeSort(data: List<Int>): List<Int> {
    if (data.size <= 1) {
        return data
    }

    var mid = data.size / 2
    var left = data.filterIndexed { index, _ -> index < mid }
    var right = data.filterIndexed { index, _ -> index >= mid }

    return merge(mergeSort(left), mergeSort(right))
}

fun merge(left: List<Int>, right: List<Int>): List<Int> {
    var sorted = mutableListOf<Int>()
    var lp = 0
    var rp = 0

    println("left.size => ${left.size} / right.size => ${right.size}")

    while (left.size > lp && right.size > rp) {
        if (left[lp] < right[rp]) {
            sorted.add(left[lp++])
        }
        else {
            sorted.add(right[rp++])
        }
    }

    while (left.size > lp) {
        sorted.add(left[lp++])
    }

    while (right.size > rp) {
        sorted.add(right[rp++])
    }

    return sorted
}
