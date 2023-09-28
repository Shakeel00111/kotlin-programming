fun main() {

       // break statement exit the loop.

    for (i in 1 .. 5 ) {

        if (i == 4) {
            break
        }
        println(i)
    }
    // o/p: 1
    //      2
    //      3



      //  continue statement brings the control oof the program to the beginning of the loop

    for (i in 1..5){

        if(i == 4){
            continue
        }
        println(i)

    }
    // o/p: 1
    //       2
    //       3
    //       5

        val name = readLine().toString()
        println(name)

        for (i in 1..10)
            println(i)


        var q=5
        do
        {
            println(q)
            q++
            continue
        }
        while(q in 1..10)


        var i = 0
        do
        {
            i++
            if(i == 4) {
                continue
            }
            println(i)

        }
        while(i in 1..10)



        for (i in 1 downTo(10)) {
            println(i)
        }
        for (i in 1 until 10+1) {
            println(i)
        }

}