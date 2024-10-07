package `02_Condicionales`

//Dado un número, indica si es positivo, negativo o cero.

fun main (){

    try {
        println("Ingrese un número: ");
        val num = readln().toDouble();

        if ( num > 0){
            println("El número $num es positivo.")

        } else if (num < 0){
            println("El número $num es negativo.");
        }
        else if (num == 0.toDouble()){
            println("El numero es cero.");
        }
    }
    catch (e: NumberFormatException){
        println("No se ingresó un número válido.")
    }

}