package sort

class QuickSort {



    fun quickSort(arr: IntArray, left: Int, right: Int): IntArray {
        if (left < right) {
            val index = sortIndex(arr, left, right)
            quickSort(arr, left, index - 1)
            quickSort(arr, index + 1, right)
        }
        return arr
    }

   private fun sortIndex(arr: IntArray, left: Int, right: Int): Int {
        val first = left
        var index = first + 1
        for (i in index..right) {
            if (arr[i] < arr[first]) {
                swap(arr, i, index)
                index++
            }
        }
        swap(arr, first, index - 1)
        return index - 1
    }

   private fun swap(arr: IntArray, left: Int, right: Int) {
        val temp = arr[left]
        arr[left] = arr[right]
        arr[right] = temp
    }
}