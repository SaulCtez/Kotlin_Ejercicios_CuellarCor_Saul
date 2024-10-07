package Variables_y_Tipos_de_Datos

//Pide un número y muestra su doble y su mitad.

fun main() {
    println("Ingrese un número: ")

    try{
        val n1 = readln().toDouble();
        val doble = n1 *2;
        val mitad = n1 / 2;
        println(" El doble de $n1 es $doble, y la mitad es $mitad ");

    } catch ( e:NumberFormatException){
        println("No se ingreso un número")
    }

}