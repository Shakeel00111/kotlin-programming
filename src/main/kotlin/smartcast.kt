fun main(){
//Smart cast
val obj1: Any = "hello world!!"
if (obj1 !is String) {
    println("no string ")
} else {
    println("found a string with length of  ${obj1.length}")
}
}
