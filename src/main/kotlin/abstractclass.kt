abstract class mammals( name : String,origin:String, weight : Double ){

    abstract var maxspeed : Int

    abstract fun run()
    abstract fun breath()

}

class human (name: String,origin: String,weight: Double, override var maxspeed : Int) : mammals(name, origin, weight){

    override fun run() {
        println("run on 2 legs")
    }

    override fun breath() {
        println("breth through nose or mouth")
    }
}
fun main(){
    var me = human("shakeel","adam",65.4,10)
    me.run()
    me.breath()
}
