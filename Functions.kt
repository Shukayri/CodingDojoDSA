package codingDojoDSA

fun main(){


fun checkLetter(str: String){
    if (str[0].isUpperCase()){
        println("The first letter is uppercase $str")
    }else {
        println("The first letter is not uppercase $str")
    }
}
    checkLetter("Word")
    checkLetter("damacia")
    checkLetter("Lopu")

}