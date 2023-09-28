interface car{
    var initspeed:Int
    var carname:String
    var speed:Int

    fun start()
    fun stop()
    fun accelerate()


}

class Tata:car{

    override var carname: String = "Tata"
    override var speed: Int = 200
    override var initspeed:Int = 0

    override fun start() {
        println("$carname is starting..")
    }

    override fun stop(){

        println("$carname is stopped...")

    }

    override fun accelerate(){

        println("Initial Speed is increasing..")
        initspeed += 20

    }
}

fun main() {

    val tata = Tata()
    tata.start()
    tata.accelerate()
    tata.stop()

}