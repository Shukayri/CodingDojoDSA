package codingDojoDSA

fun main(){


fun checkLetter(str: String){
    if (str[0].isUpperCase()){
        println("The first letter is uppercase $str")
    }else {
        println("The first letter is not uppercase $str")
    }
}
    var myList = listOf("word", "Damacia", "Door", "sda")
    for (word in myList){
        checkLetter(word)
    }

}