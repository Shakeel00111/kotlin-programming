fun main() {
    var mycar = Car("car","bmw")
    var mycar1 = electriccar("scar","tesla",78.3)

    mycar.distance(250.3)
    mycar1.distance(245.6)
    print(mycar1.range)


}


open class Car(name: String, brand: String) {


    open  var range = 0.0
    fun extendrange(amount: Double) {
        if (amount>0)
            range += amount
    }

    fun distance(distance: Double) {
        println("the distance is $distance")

    }

}


class electriccar(name: String, brand: String, batterylife: Double) : Car(name, brand) {
    override var range: Double = batterylife * 6
}


