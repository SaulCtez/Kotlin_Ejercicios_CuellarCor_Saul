package Variables_y_Tipos_de_Datos

//Lee un número y determina si es par o impar.
fun main() {
    println("Ingrese un número: ");

    try {
        val num = readln().toInt();
        if (num % 2 == 0) {
            println("El número $num es par.")
        } else {
            println("El número $num es impar.")
        }
    } catch (e: NumberFormatException) {
        println("No se ingresó un número válido.")
    }
}