fun main() {
    var num1 = 100
    var num2 = 200
    var num3 = 300

    if (num1 >= 0) {

        println("$num1 is +ve")

    } else{

        println("$num1 is -ve")

    }
   // o/p: 100 is +ve

    if(num1 > num2 && num1> num3){
        println("$num1 is the greater")
    } else if(num2 > num1 && num2 > num3){
        println("$num2 is the greater")
    }else{

        println("$num3 is the greater")
    }
    // o/p: 300 is the greater

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


        var result = callme(343.3243,234.3434)
        print(result)



        var name : String ="shakeel"
        var name1 : String? ="shakeel"

        if (name1 != null) {
            name = name1?.length.toString()
        }
        else{
            print(null)
        }


        var get =  "kadachuruchu"

        print("$get")
    }


    fun callme(a:Double,b:Double) : Double {
        return (a+b)/2
    }


    // o/p: 300 is the greatest







