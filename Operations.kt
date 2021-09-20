package codingDojoDSA

fun main(){
    fun operatos(num1:Int, num2: Int, ope: String): Int {
        return when(ope){
            "*" -> num1*num2
            "-" -> num1-num2
            "/" -> num1/num2
            else -> num1+num2

        }
        }
        //var sum = 0
        //if (ope == "/"){
          //  if (num2 ==0){
            //    print("Cannot divide by 0")
            //}else {
              //  sum = num1/num2
            
            //return sum




    fun checkNumber(num: String): Int{
        return try {
            num.toInt()
        }catch (e: Exception){
            0
        }
    }

    while(true){
        print("Enter your first number:  ")
        val num1 = checkNumber(readLine()!!)
        print("Enter an operator: ")
        val ope = readLine()
        println("$num1$ope")
        print("Enter your second number:  ")
        val num2 = checkNumber(readLine()!!)
        if (ope == "/"){
            if (num2 ==0){
                println("Cannot divide by 0")
            }

        println("$num1 + $num2 =${operatos(num1,num2,ope)}")

        print("Would you like to add more numbers? (Y/N) >> ")
        val addMore = readLine()
        if(addMore != "Y" && addMore != "y"){
            break
        }
    }
}}






//fun operatos(ope: String) {

//}
