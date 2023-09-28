import java.lang.IllegalArgumentException

fun main() {
    var name = Person("mohammed", "shakeel")

    name.stakehobby("movies")
    var names = Person(Lastname = "fazil")


    var myCar = myCar()
    myCar.owner
    println("my brand is ${myCar.brand}")
    println("owner is ${myCar.owner}")
    myCar.age = 0
    println("my age is ${myCar.age}")
}
class Person(Firstname: String = "mohammed", Lastname: String = "shakeel") {

    var Firstname: String? = null
    var Lastname: String? = null

    init {
        println("my name is $Firstname$Lastname")
    }

    fun stakehobby(hobby: String) {
        print(", hobby is $hobby")
    }

}
       
    class myCar {
        var owner = "Shakeel"
        var brand = "BMW"
            get() {
                return field.toLowerCase()
            }

        var age = 18
            //    get()= field
            set(value) {
                field  = if (age <= 1) value else throw IllegalArgumentException ("age cannot be less than 1")
            }

        init {
            this.owner
        }
    }









