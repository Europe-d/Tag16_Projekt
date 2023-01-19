fun main() {




   userIstNotOk(false,false,false)
    userIstNotOk(true,true,false)


}



fun userIstNotOk(userAccepted: Boolean, passwordOk : Boolean,connectionSecure : Boolean) {

     if (userAccepted) {

         if (passwordOk) {
             if (connectionSecure) {
                 println("ok")
             } else {

                 println("unsafe connection")
             }
         }else {
             println("false passwort")
         }


     } else {
         println("user denied.")
     }


}


