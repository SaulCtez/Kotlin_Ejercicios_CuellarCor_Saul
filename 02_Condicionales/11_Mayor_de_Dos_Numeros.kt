package `02_Condicionales`

//Solicita dos números y muestra el mayor de ellos.


fun main(){
    try {
        println("Ingrese un número: ");
        val num = readln().toDouble();

        println("Ingrese un segundo número: ");
        val num2 = readln().toDouble();

        if (num > num2) {
            println("El número $num es mayor.")
        } else {
            println("El número $num2 es mayor.")
        }
    } catch (e: NumberFormatException) {
        println("No se ingresó un número válido.")
    }

}