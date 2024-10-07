package Variables_y_Tipos_de_Datos
/*
Conversión de String a Int: Lee una cadena y conviértela a un
entero, manejando posibles errores.
*/

fun main() {
    try {
        println("Ingrese un número: ")
        val text = readlnOrNull()
        val num = text?.toInt() ?: throw NumberFormatException("No se ingresó un número válido")
        println("El número ingresado es $num")
    } catch (e: NumberFormatException) {
        println("El número ingresado es incorrecto")
    }
}
