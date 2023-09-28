fun main(){


    val numbers = setOf(3, 2, 4, 1, 6, 5, 7, 8)
    println(numbers)
    println(numbers.toSortedSet())

    val numbers1 = numbers.toMutableList()
    numbers1.add(8, 0)
    println(numbers1)
}