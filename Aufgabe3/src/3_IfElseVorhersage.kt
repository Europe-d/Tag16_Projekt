/*
    Schreibe hier deine Lösung für die Aufgabe hin:
     println("Heute regnet es!")
     rainy = false

 */

fun main() {
    val sunny = false;
    val cloudy = true
    val rainy = true;

    if (sunny) {
        println("Heute scheint die Sonne!")
    } else {
        if (cloudy) {
            if (rainy) {
                println("Heute regnet es!")
            } else {
                println("Leider scheint heute nicht die Sonne und es ist bewÃ¶lkt.")
            }
        } else {
            println("Es scheint zwar nicht die Sonne aber es ist auch nicht zu wolkig.")
        }
    }
}