import java.util.ArrayList

/**
 * 버블 정렬(Bubble Sort)
 * 정렬되는 모습이 거품과 비슷해서 붙여진 이름.
 * 인접한 두 수를 비교해서 자리를 교환.
 * 정렬시간 : O(n^2)
 */
fun main() {
    //정렬이 필요한 배열
    val arrNum = arrayListOf(5, 2, 3, 4, 1)

    print("정렬되기 전 상태 :")
    for (beforeSort in arrNum) {
        print("${beforeSort}")
    }

    //정렬
    sort(arrNum)

    print("\n정렬된 상태 : ")
    for (afterSort in arrNum) {
        print("${afterSort}")
    }
}

//오름차순으로 정렬
private fun sort(arrNum: ArrayList<Int>) {
    var temp = 0
    for (i in arrNum) {     //배열 크기 만큼 반복
        for (j in 0 until arrNum.size-1) {
            if (arrNum[j] > arrNum[j+1]) {      //0>1, 1>2, 2>3, 3>4 를 비교.
                temp = arrNum[j]                //자리바꿈
                arrNum[j] = arrNum[j+1]
                arrNum[j+1] = temp
            }
        }
    }
}
