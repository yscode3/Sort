/**
 * 퀵 정렬(Quick Sort)
 * 수열의 중간 값을 기준으로 왼/오른쪽 부분집합으로 정렬, 작은 수는 외쪽, 큰 수는 오른쪽으로 정렬.
 * n/2 씩 나누어져 정렬되므로 평균 정렬 소요 시간 O(n log2 n)
 */
fun main() {
    var nums = arrayListOf(69, 10, 30, 2, 16, 8, 31, 22)

    //정렬 되기 전
    println("---------------------정렬 되기 전")
    nums.forEach {
        print("${it} ")
    }

    //정렬 후
    println("\n-------------------------정렬 후")
    //퀵 정렬(Quick Sort)
    val quickSort = QuickSort(nums)
    quickSort.sort(0, nums.size-1)
    quickSort.show()
}

private class QuickSort(var data:MutableList<Int>) {
    fun sort(start:Int, end:Int) {
        if (start >= end) { return }
        var pivot = start
        var i = start+1
        var j = end
        var temp = 0

        while (i <= j) {
            while (i <= end && data[i] < data[pivot]) {
                i++
            }
            while (j > start && data[j] >= data[pivot]) {
                j--
            }

            if (i > j) {
                temp = data[j]
                data[j] = data[pivot]
                data[pivot] = temp
            }
            else {
                temp = data[i]
                data[i] = data[j]
                data[j] = temp
            }
        }

        sort(start, j-1)
        sort(j+1, end)
    }

    fun show() {
        data.forEach {
            print("${it} ")
        }
    }
}