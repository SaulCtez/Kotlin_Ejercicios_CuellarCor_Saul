package `02_Condicionales`

//  Pregunta la edad del usuario y muestra si puede votar o no (mayor de 18 años).
 fun main () {
    try {
        println("Hola usuario, ingrese su edad: ");
        val edad = readLine()!!.toInt();
        if ( edad > 17){
            println("Felicidades, tiene edad para votar")
        }else{
            println("Edad insuficiete para votar")
        }

    } catch ( e: NumberFormatException ) {
        println("Formato de edad invalido")

    }
 }