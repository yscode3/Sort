/**
 * 선택 정렬(Selection Sort)
 * 수열에서 가장 작은 요소를 선택, 매 회 가장 앞으로 자리 교환.
 * 정렬시간 : O(n^2)
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
            changePosition(min, i)
        }

        return arrNums
    }

    private fun changePosition(min: Int, i: Int) {
        var temp:Int
        temp = arrNums[min]
        arrNums[min] = arrNums[i]
        arrNums[i] = temp
    }
}