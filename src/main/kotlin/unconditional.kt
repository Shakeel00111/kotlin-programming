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
}