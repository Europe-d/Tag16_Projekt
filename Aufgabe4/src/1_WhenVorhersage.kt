/*
    Schreibe hier deine Lösung für die Aufgabe hin:
       2011 -> println("Kind ist in Gruppe B") weil 2011 sthet und die nametype ist 2011 b

 */

fun main() {
    val birthyear: Int = 2011

    when (birthyear) {
        2010 -> println("Kind ist in Gruppe A")
        2011 -> println("Kind ist in Gruppe B")
        2012 -> println("Kind ist in Gruppe C")
        2013 -> println("Kind ist in Gruppe D")
        2014 -> println("Kind ist in Gruppe E")
        else -> println("FÃ¼r dieses Geburtsjahr gibt es keine Gruppe")
    }
}