class GetRandomNumbers {
    fun getNumbers(): MutableList<Int> {
        var list = mutableListOf<Int>()
        while (list.size < 10) {
            var num = (1..100).random()
            if(!list.contains(num)) {
                list.add(num)
            }
        }

        return list
    }
}