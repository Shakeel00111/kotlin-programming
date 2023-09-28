fun main(){

    /*
        In java, we used switch case operator, but it
        is replaced by when in Kotlin
     */
    print("Enter the value:")
    var num1 = readLine()?.toInt()
    print("Enter the value:")
    var num2 = readLine()?.toInt()
    print("\n1.Addition\n2.Subtraction\n3.Multiplication\n4.DivisionEnter the option:")
    var option = readLine()?.toInt()
    when(option){

        1 -> println("Sum is ${num1!! +num2!!}")
        2 -> println("Result is ${num1!! - num2!!}")
        3 -> println("Result is ${num1!! * num2!!}")
        4 -> println("Result is ${num1!! / num2!!}")
        else -> println("Invalid Option")
    }

}