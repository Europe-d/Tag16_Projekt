/*
    Schreibe hier deine Lösung für die Aufgabe hin:
    normal muss japanese komm aber ich habe german geschrieben deswegen komm das erste raus

    bei die next aufgaben mit "canadian"  dann komm bei else weil adere nationalität ist

 */

fun main() {
    val nationality: String = "german"

    when (nationality) {
        "german" -> println("NationalitÃ¤t: Deutsch")
        "italian" -> println("NationalitÃ¤t: Italienisch")
        "japanese" -> println("NationalitÃ¤t: Japanisch")
        "namibian" -> println("NationalitÃ¤t: Namibisch")
        "brazilian" -> println("NationalitÃ¤t: Brasilianisch")
        else -> println("NationalitÃ¤t nicht in Datenbank")
    }
}