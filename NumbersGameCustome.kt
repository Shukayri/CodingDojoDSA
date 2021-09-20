package codingDojoDSA

import java.lang.Exception
import kotlin.random.Random

fun main(){
    val answer = Random.nextInt(0, 11)
    var num1 = 0
    var num2 = 0

    print("Enter your first number: ")

    try {
        num1 = readLine()!!.toInt()
    }catch (e: Exception){
        println("Please enter numbers only.")
    }

    print("Enter your second number: ")

    try {
        num2 = readLine()!!.toInt()
    }catch (e: Exception){
        println("Please enter numbers only.")
    }

    val solution = num1 * answer + num2
    println("$num1 * X + $num2 = $solution")

    print("What is X? >> ")

    try {
        if(readLine()!!.toInt() == answer){
            println("You got it!")
        }else{
            println("Wrong guess. The correct answer is $answer.")
        }
    }catch (e: Exception){
        println("Please enter numbers only.")
    }
}