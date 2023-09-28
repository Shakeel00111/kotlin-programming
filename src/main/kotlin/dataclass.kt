data class user (val id : Long= 1 ,var name :String = "shakeel")

fun main(){

    var user1 = user()
    println(user1)

    var user2 = user(name = "Mohammed")
    println(user2)

    user2.name= "shakeel"
    println(user1==user2)

    println ("my details is ${ user1}")

}
