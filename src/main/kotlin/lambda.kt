fun main(){
// lambda
val sum : (Int,Int) -> Int = {a:Int ,b:Int -> a+b }
var a = 6
var b = 5
println(sum (5,3))

val sum1 = {a:Int ,b:Int -> print(a+b) }
sum1(5,53)
}

