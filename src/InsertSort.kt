import java.util.ArrayList

/**
 * 삽입 정렬(Insert Sort)
 * 정렬 된 부분과, 안된 부분으로 나누어 정렬된 마지막 값과 비교.
 * 끝에서부터 하나씩 비교해 나가며 정렬된 부분+1, 안된 부분-1 의 방식으로 삽입한다.
 * 정렬되어 있는 경우, 하나의 값만 비교하면 되므로 O(n)
 * 정렬되어 있지 않은 경우, 모든 수를 비교하므로 O(n^2)
 */
fun main() {
    var nums = arrayListOf(49, 13, 32, 1, 28)

    //정렬하기 전
    println("---------------- 정렬 전")
    nums.forEach { print("${it} ")}

    println()

    //정렬 후
    println("---------------- 정렬 후")
    insertSort(nums)
    nums.forEach { print("${it} ")}
}

fun insertSort(nums: ArrayList<Int>) {
    var startIdx = 1
    var lastIdx = 0
    var temp = 0

    for (i in startIdx until nums.size) {
        temp = nums[i]
        lastIdx = i

        while ((lastIdx > 0) && (nums[lastIdx-1] > temp)) {
            nums[lastIdx] = nums[lastIdx-1]     //자리를 하나씩 뒤로 미룬다.
            lastIdx--
        }

        nums[lastIdx] = temp        //빈 자리에 값을 삽입한다.
    }
}
