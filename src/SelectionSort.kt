/**
 * 선택 정렬(Selection Sort)
 *
 */
fun main() {
    val arrNums = arrayListOf(30, 20, 10, 40, 50)

    print("정렬 되기 전 : ")
    arrNums.forEach {
        print("${it} ")
    }

    val selectionSort = SelectionSort(arrNums)
    val sortedArr = selectionSort.sort()

    print("\n정렬 후 : ")
    sortedArr.forEach {
        print("${it} ")
    }
}

private class SelectionSort(var arrNums: ArrayList<Int>) {
    fun sort() : List<Int> {
        var min:Int

        //작은 수를 먼저 찾는다.
        for (i in arrNums.indices) {
            min = i
            for (j in i+1 until arrNums.size) {
                if (arrNums[j] < arrNums[min]) {
                    min = j
                }
            }

            //가장 앞자리 인덱스와, 가장 작은 수의 인덱스를 전달해, 두 값의 위치를 바꾼다.
            changePosition(arrNums, min, i)
        }

        return arrNums
    }

    private fun changePosition(nums: ArrayList<Int>, min: Int, i: Int) {
        var temp:Int
        temp = nums[min]
        nums[min] = nums[i]
        nums[i] = temp
    }
}