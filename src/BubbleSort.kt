import java.util.ArrayList

/**
 * 버블 정렬
 */
fun main() {
    //정렬이 필요한 배열
    var arrNum = arrayListOf(5, 2, 3, 4, 1)

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
fun sort(arrNum: ArrayList<Int>) {
    var temp = 0
    for (i in arrNum) {
        for (j in 0 until arrNum.size-1) {
            if (arrNum[j] > arrNum[j+1]) {
                temp = arrNum[j]
                arrNum[j] = arrNum[j+1]
                arrNum[j+1] = temp
            }
        }
    }
}
