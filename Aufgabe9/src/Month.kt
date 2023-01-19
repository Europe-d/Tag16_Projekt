fun main() {
    val month: Int = 1

    var jahr= listOf("Januar",
    "Februar",
    "März" ,
    "April" ,
    "Mai",
    "Juni" ,
    "Juli" ,
    "August" ,
    "September",
    "Oktober" ,
    "November",
    "Dezember" )
    println("welche monat wir haben ?")

var antwort = readln().toInt()
    when (antwort){
        in 0..jahr.size-1 -> {
            println("Sie haben für ${jahr[antwort-1]} ")
        }
        else -> {
            println("Das gibt nicht ")
        }
   }

}
