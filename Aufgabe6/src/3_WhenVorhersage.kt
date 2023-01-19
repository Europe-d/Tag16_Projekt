/*
    Schreibe hier deine Lösung für die Aufgabe hin:


    wenn wir 1 bis 4 schreiben komm die Bestanden
    deswegen hier ist 5 komm nicht bestanden

 */

fun main() {
    val note: Int = 5
    when (note)  {
        1 -> println("Bestanden!")
        2 -> println("Bestanden!")
        3 -> println("Bestanden!")
        4 -> println("Bestanden!")
        else -> println("Nicht bestanden!")
    }
}