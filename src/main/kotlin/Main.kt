import sort.QuickSort

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    val sampleArray = intArrayOf(3, 5, 7, 1, 22, 6, 11, 8, 10, 4)

    val quickSort = QuickSort()
    println("before sort: ${sampleArray.joinToString()}")
    quickSort.quickSort(sampleArray,0,sampleArray.size - 1)
    println("after sort: ${sampleArray.joinToString()}")
}