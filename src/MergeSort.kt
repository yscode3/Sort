/**
 * 병합 정렬(Merge Sort)
 *
 */
fun main() {
    val data = arrayListOf(10, 1, 9, 3, 2, 5, 4, 8, 7, 6)
    val mergeSort = MergeSort(data)
    mergeSort.sort(0, data.size-1)
    mergeSort.show()
}

private class MergeSort(var data:MutableList<Int>) {
    var temp = arrayListOf<Int>()

    fun sort(start:Int, end:Int) {
        if (start < end) {
            var mid = (start + end) / 2
            sort(start, mid)
            sort(mid+1, end)

            var p = start
            var q = mid + 1
            var idx = p

            while (p <= mid || q <= end) {
                if (q > end || (p <= mid && data[p] <= data[q])) {
                    temp[idx++] = data[p++]
                }
                else {
                    temp[idx++] = data[q++]
                }
            }
        }
    }

    fun show() {
        temp.forEach {
            print("$it ")
        }
    }
}