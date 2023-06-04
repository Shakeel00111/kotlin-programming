fun main() {
    var num1 = 100
    var num2 = 200
    var num3 = 300

    if (num1 >= 0) {

        println("$num1 is +")

    } else{

        println("$num1 is -")

    }


    if(num1 > num2 && num1> num3){
        println("$num1 is the greater")
    } else if(num2 > num1 && num2 > num3){
        println("$num2 is the greater")
    }else{

        println("$num3 is the greater")
    }

    //Nested if else
    if(num1>num2){

        if(num1>num3){
            println("$num1 is the greatest")
        }else{

            println("$num3 is the greatest")

        }

    } else if(num2>num1){

        if(num2>num3){

            println("$num2 is the greatest")

        }else{

            println("$num3 is the greatest")

        }

    }
    else{

        println("$num3 is the greatest")

    }

}


fun Int.add(num:Int):Int{
    return this + num
}
fun Double.add(num1:Double):Double {
    return this + num1
}
fun Int.sub(num3:Int):Int{
    return this - num3
}

fun main(){
    var sum = 10.add(20)
    var sum1 = 23.4.add(28.2)
    var sum3 = 80.sub(20)

    println(sum)
    println(sum1)
    println(sum3)
}

// all extension functions are infix function
// all infix function are extinction function
// infix function is an single parameter function




fun main(){
    //Types Of Variable
    //Var -> Variable
    //Val -> Constant ex: pi =3.14
    var age = 10
    val pi = 3.14
    println("Age:$age\nPi\n$pi")
    /*
    Var -> can be reassigned
    Val -> cannot be reassigned
     */

    //Data Types
    var num:Int = 1034
    var radius:Double = 2.45
    var fruit:String = "Apple"
    var character:Char = 'A'
    //Use single quotes instead of double
    //In kotlin, Characters are enclosed by single quotes
    //And string are enclosed by Double Quotes.
    var success:Boolean = true
    println("\nData Types\n$num\n$radius\n$fruit\n$character")

    //Type Conversion
    var Longnum = num.toLong()//converting int to Long
    var string1 = character.toString() // Converting character to string
    var code = 65
    var char1 = code.toChar()
    println("\nTypes Conversion\n$Longnum\n$string1\n$char1")

    //Input Statements
    var num1 = readLine()?.toInt()
    var num2 = readLine()?.toInt()

    /*In kotlin, We use readLine() function get input from the user.

     */

    if (num1 != null) {
        println("Sum:${num1 + num2!!}")
    }//This block of code will be explained later
    //It just prints the sum of two inputs only if they are not null.

    //Output Statements
    /*
    For output, we use println(),print() in Kotlin.
     */

    //Variables Initialization using expression
    var a = 100
    var b = 200
    var c = 400
    var max = if(a>b && a>c) a else if(b>a && b>c) b else c
    println("Max:$max")

}