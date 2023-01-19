fun main() {

//
//    val isMotorRunning = true
//
//    val doorsAreClosed = true
//
//
//    if (doorsAreClosed) {
//        start()
//
//    } else if (isMotorRunning)
//        closeDoors()

   software(true,false)


}
fun software(isMotorRunning : Boolean,doorsAreClosed : Boolean) {

    if (isMotorRunning) {
        if(doorsAreClosed){
            start()
        }else {
            closeDoors()
        }
    }


}

// Die Funktionen start() und closeDoors() sind vorgegeben.


fun start() {
    println("software gestartet.")

}


fun closeDoors() {
    println("Bitte alle Türen schließen.")
}