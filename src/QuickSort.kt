/**
 * 퀵 정렬
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

//    quickSort.sortNums(nums, 0, nums.size-1)

    //정렬 후
    println("\n-------------------------정렬 후")
    //퀵 정렬(Quick Sort)
    val quickSort = QuickSort()
    quickSort.sortNums(nums, 0, nums.size-1)
//    quickSort.printSortedNums()
}

private class QuickSort {
//    var nums:ArrayList<Int>
    var i = 0
    var a1 = 0
    var a2 = 0

//    constructor(nums:ArrayList<Int>) {
//        this.nums = nums
//    }

    private fun partition(nums:ArrayList<Int>, start:Int, end:Int): Int {
        var temp:Int
        var left = start
        var right = end
        var pivot = (start + end) / 2   //중간 값

        println("\n[퀵 정렬 ${++i}단계: pivot=${nums[pivot]}")

        while (left < right) {
            print("Left => ")
            while ((nums[left] <= nums[pivot]) && (left <= right)) {
                print("${left} ")
                left++
            }
            println()
            print("Right => ")
            while ((nums[right] > nums[pivot]) && (left <= right)) {
                print("${right} ")
                right--
            }
            println()

            if (left < right) {
                temp = nums[left]
                nums[left] = nums[right]
                nums[right] = temp

                if (left == pivot) {
                    nums.forEach { print("${it} ") }
                    println()

                    return right
                }
            }
        }

        //right가 end보다 커진 경우
        temp = nums[pivot]
        nums[pivot] = nums[right]
        nums[right] = temp
        nums.forEach { print("${it} ") }
        println()

        return right
    }

    fun sortNums(nums:ArrayList<Int>, start:Int, end:Int) {
        if (start < end) {
            var position = partition(nums, start, end)

            println("--------- ${++a1}회차")
            sortNums(nums, start, position-1)
            println("+++++++++ ${++a2}회차")
            sortNums(nums,position+1, end)
        }
    }

    fun printSortedNums() {
//        nums.forEach {
//            print("${it} ")
//        }
    }
}