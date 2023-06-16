

fun main() {

    //Creating a list.
    val numbers = listOf(1, 6, 7, 3, 6, 7)

    //print whole list
    println(numbers)
    // o/p : [1, 6, 7, 3, 6, 7]

    //Indexing
    println(numbers[2])
    // o/p : 7

//-------------------------------------------------------------
    //Iterating
    //Method 1
    for (i in numbers){
        println(i)

    }
    // o/p: 1
    //      6
    //      7
    //      3
    //      6
    //      7

    //Method  2
    numbers.forEach{
        println(it)
    }
    // o/p: 1
    //      6
    //      7
    //      3
    //      6
    //      7

//----------------------------------------------------------------

//Sorting

//Ascending
println(numbers.sorted())

// o/p : [1, 3, 6, 6, 7, 7]

//Descending
println(numbers.sortedDescending())

// o/p : [7, 7, 6, 6, 3, 1]

//--------------------------------------------------------------

//Contains and Contains all
println(numbers.contains(6))//-> it will check if a single element is present or not
// o/p : true

println(numbers.containsAll(listOf(5,6,7)))// -> it will check multiple elements.
// o/p : false

//--------------------------------------------------------------

//At Default, list are immutable so,
//they cannot be modified.

//Creating a mutable list

var numbers1 = mutableListOf(1,2,3,4,5,6)

//Adding a element
numbers1.add(2)
numbers1.addAll(listOf(7,8,9,10))

//Removing an element
numbers1.remove(10)
numbers1.removeAt(8)

println(numbers1)
// o/p : [1, 2, 3, 4, 5, 6, 2, 7, 9]
}

