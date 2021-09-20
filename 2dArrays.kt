package codingDojoDSA

fun main(){
    val countries = arrayListOf(arrayListOf<String>())

    for(i in 0..2){
        var country = ""
        var capital = ""

        print("Enter a country: ")
        country = readLine()!!
        print("Enter the capital: ")
        capital = readLine()!!

        countries.add(arrayListOf(country, capital))
    }

    for(i in countries){
        if(i.isNotEmpty()){
            println("The capital of ${i[0]} is ${i[1]}.")
        }
    }
}