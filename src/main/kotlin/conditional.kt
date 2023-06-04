fun main() {
    var num1 = 100
    var num2 = 200
    var num3 = 300

    if (num1 >= 0) {

        println("$num1 is +")

    } else{

        println("$num1 is -")

    }


    if(num1 > num2 && num1> num3){
        println("$num1 is the greater")
    } else if(num2 > num1 && num2 > num3){
        println("$num2 is the greater")
    }else{

        println("$num3 is the greater")
    }

    //Nested if else
    if(num1>num2){

        if(num1>num3){
            println("$num1 is the greatest")
        }else{

            println("$num3 is the greatest")

        }

    } else if(num2>num1){

        if(num2>num3){

            println("$num2 is the greatest")

        }else{

            println("$num3 is the greatest")

        }

    }
    else{

        println("$num3 is the greatest")

    }

}


