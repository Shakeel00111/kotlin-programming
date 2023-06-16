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

    println(sum)   // o/p:30
    println(sum1)  // o/p:51.599999999999994
    println(sum3)  // o/p:60
}

// all extension functions are infix function
// all infix function are extinction function
// infix function is an single parameter function


