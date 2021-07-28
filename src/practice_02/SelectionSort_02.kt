package practice_02

import GetRandomNumbers

/**
 * 가장 작은 값을 찾아 바꾸는 방법
 */
fun main() {
    val data = GetRandomNumbers().getNumbers()

    println("선택 정렬")
    println("정렬 전 $data")

    selectionSort(data)

    println("정렬 후 $data")
}

private fun selectionSort(data: MutableList<Int>) {
    var temp = 0
    var min: Int

    for (i in data.indices) {
        min = i

        for (j in i+1 until data.size) {
            if (data[j] < data[min]) {
                min = j
            }
        }

        temp = data[min]
        data[min] = data[i]
        data[i] = temp
    }
}
