fun main() {
    val num = 7
    print("Guess a number between 0 and 10: ")
    try {

        var guess = readLine()!!.toInt()

        if(guess == num){
            println("You got it!")
            println("Game Over")

       }else if (guess <= 10){
            println("Please enter numbers between 0 and 10 only")

        }else {
            println("Wrong guess. The answer was $num")
            println("Game Over")
        }
        }catch (e: Exception){
        println("Please enter numbers only")
    }
}